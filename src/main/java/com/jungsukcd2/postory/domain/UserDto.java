package com.jungsukcd2.postory.domain;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    /* USER_ID */
    private String userId;

    /* Host */
    private Object host;

    /* EID */
    private String eid;

    /* User */
    private Object user;

    /* PWD */
    private String pwd;

    /* Select_priv */
    private Object selectPriv;

    /* NIC */
    private String nic;

    /* Insert_priv */
    private Object insertPriv;

    /* USER_INTRO */
    private String userIntro;

    /* Update_priv */
    private Object updatePriv;

    /* USER_IMG_PATH */
    private String userImgPath;

    /* Delete_priv */
    private Object deletePriv;

    /* Create_priv */
    private Object createPriv;

    /* SIGUP_DTM */
    private String sigupDtm;

    /* Drop_priv */
    private Object dropPriv;

    /* HOLD_PNT */
    private Integer holdPnt;

    /* MSG_ALOW_YN */
    private Object msgAlowYn;

    /* Reload_priv */
    private Object reloadPriv;

    /* Shutdown_priv */
    private Object shutdownPriv;

    /* Process_priv */
    private Object processPriv;

    /* File_priv */
    private Object filePriv;

    /* Grant_priv */
    private Object grantPriv;

    /* References_priv */
    private Object referencesPriv;

    /* Index_priv */
    private Object indexPriv;

    /* Alter_priv */
    private Object alterPriv;

    /* Show_db_priv */
    private Object showDbPriv;

    /* Super_priv */
    private Object superPriv;

    /* Create_tmp_table_priv */
    private Object createTmpTablePriv;

    /* Lock_tables_priv */
    private Object lockTablesPriv;

    /* Execute_priv */
    private Object executePriv;

    /* Repl_slave_priv */
    private Object replSlavePriv;

    /* Repl_client_priv */
    private Object replClientPriv;

    /* Create_view_priv */
    private Object createViewPriv;

    /* Show_view_priv */
    private Object showViewPriv;

    /* Create_routine_priv */
    private Object createRoutinePriv;

    /* Alter_routine_priv */
    private Object alterRoutinePriv;

    /* Create_user_priv */
    private Object createUserPriv;

    /* Event_priv */
    private Object eventPriv;

    /* Trigger_priv */
    private Object triggerPriv;

    /* Create_tablespace_priv */
    private Object createTablespacePriv;

    /* ssl_type */
    private Object sslType;

    /* ssl_cipher */
    private Object sslCipher;

    /* x509_issuer */
    private Object x509Issuer;

    /* x509_subject */
    private Object x509Subject;

    /* max_questions */
    private Integer maxQuestions;

    /* max_updates */
    private Integer maxUpdates;

    /* max_connections */
    private Integer maxConnections;

    /* max_user_connections */
    private Integer maxUserConnections;

    /* plugin */
    private Object plugin;

    /* authentication_string */
    private String authenticationString;

    /* password_expired */
    private Object passwordExpired;

    /* password_last_changed */
    private Object passwordLastChanged;

    /* password_lifetime */
    private Integer passwordLifetime;

    /* account_locked */
    private Object accountLocked;

    /* Create_role_priv */
    private Object createRolePriv;

    /* Drop_role_priv */
    private Object dropRolePriv;

    /* Password_reuse_history */
    private Integer passwordReuseHistory;

    /* Password_reuse_time */
    private Integer passwordReuseTime;

    /* Password_require_current */
    private Object passwordRequireCurrent;

    /* User_attributes */
    private Object userAttributes;


}
