/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.choice.PartyIdentification10Choice;
import com.tools20022.repository.choice.PartyIdentification13Choice;
import com.tools20022.repository.choice.ProcessingStatus4Choice;
import com.tools20022.repository.choice.StatusOrStatement1Choice;
import com.tools20022.repository.msg.DocumentIdentification11;
import com.tools20022.repository.msg.Extension2;
import com.tools20022.repository.msg.Identification1;
import com.tools20022.repository.msg.SecuritiesAccount13;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends a SecuritiesStatusOrStatementQueryStatusAdvice to
 * an account owner to advise the status of a status query or statement query
 * previously sent by the account owner.<br>
 * The account servicer/owner relationship may be:<br>
 * - a central securities depository or another settlement market infrastructure
 * acting on behalf of their participants<br>
 * - an agent (sub-custodian) acting on behalf of their global custodian
 * customer, or<br>
 * - a custodian acting on behalf of an investment management institution or a
 * broker/dealer.<br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent (the sub-function of the message is
 * Duplicate),<br>
 * - provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy),<br>
 * - re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate). ISO 15022 - 20022 Coexistence
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards
 * will coexist for a certain number of years. Until this coexistence period
 * ends, the usage of certain data types is restricted to ensure
 * interoperability between ISO 15022 and 20022 users. Compliance to these rules
 * is mandatory in a coexistence environment. The coexistence restrictions are
 * described in a Textual Rule linked to the Message Items they concern. These
 * coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesStsOrStmtQryStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#mmIdentification
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#mmQueryReference
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.mmQueryReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#mmAccountOwner
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#mmSafekeepingAccount
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#mmStatusOrStatementRequested
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.mmStatusOrStatementRequested}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#mmProcessingStatus
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#mmMessageOriginator
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#mmMessageRecipient
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#mmExtension
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.022.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesStatusOrStatementQueryStatusAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends a SecuritiesStatusOrStatementQueryStatusAdvice to an account owner to advise the status of a status query or statement query previously sent by the account owner.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV02
 * SecuritiesStatusOrStatementQueryStatusAdviceV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesStatusOrStatementQueryStatusAdviceV01", propOrder = {"identification", "queryReference", "accountOwner", "safekeepingAccount", "statusOrStatementRequested", "processingStatus", "messageOriginator",
		"messageRecipient", "extension"})
public class SecuritiesStatusOrStatementQueryStatusAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected DocumentIdentification11 identification;
	/**
	 * Information that unambiguously identifies a
	 * SecuritiesStatusOrStatementQueryStatusAdvice message as know by the
	 * account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11
	 * DocumentIdentification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that unambiguously identifies a SecuritiesStatusOrStatementQueryStatusAdvice message as know by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Information that unambiguously identifies a SecuritiesStatusOrStatementQueryStatusAdvice message as know by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification11.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesStatusOrStatementQueryStatusAdviceV01.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Identification1 queryReference;
	/**
	 * Unambiguous identification of the query as per the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Identification1
	 * Identification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the query as per the account owner."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQueryReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "QryRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryReference";
			definition = "Unambiguous identification of the query as per the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Identification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesStatusOrStatementQueryStatusAdviceV01.class.getMethod("getQueryReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification13Choice accountOwner;
	/**
	 * Party that legally owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification13Choice
	 * PartyIdentification13Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountOwner = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification13Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesStatusOrStatementQueryStatusAdviceV01.class.getMethod("getAccountOwner", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesAccount13 safekeepingAccount;
	/**
	 * Account to or from which a securities entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSafekeepingAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesAccount13.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesStatusOrStatementQueryStatusAdviceV01.class.getMethod("getSafekeepingAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected StatusOrStatement1Choice statusOrStatementRequested;
	/**
	 * Details of the request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatusOrStatement1Choice
	 * StatusOrStatement1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsOrStmtReqd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusOrStatementRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStatusOrStatementRequested = new MMMessageBuildingBlock() {
		{
			xmlTag = "StsOrStmtReqd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusOrStatementRequested";
			definition = "Details of the request.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatusOrStatement1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesStatusOrStatementQueryStatusAdviceV01.class.getMethod("getStatusOrStatementRequested", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ProcessingStatus4Choice processingStatus;
	/**
	 * Provides details on the processing status of the request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus4Choice
	 * ProcessingStatus4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the processing status of the request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmProcessingStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides details on the processing status of the request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ProcessingStatus4Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesStatusOrStatementQueryStatusAdviceV01.class.getMethod("getProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification10Choice messageOriginator;
	/**
	 * Party that originated the message, if other than the sender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgOrgtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that originated the message, if other than the sender."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageOriginator = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the message, if other than the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesStatusOrStatementQueryStatusAdviceV01.class.getMethod("getMessageOriginator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification10Choice messageRecipient;
	/**
	 * Party that is the final destination of the message, if other than the
	 * receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgRcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageRecipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is the final destination of the message, if other than the receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageRecipient = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgRcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageRecipient";
			definition = "Party that is the final destination of the message, if other than the receiver.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesStatusOrStatementQueryStatusAdviceV01.class.getMethod("getMessageRecipient", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Extension2> extension;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension2
	 * Extension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesStatusOrStatementQueryStatusAdviceV01.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesStatusOrStatementQueryStatusAdviceV01";
				definition = "Scope\r\nAn account servicer sends a SecuritiesStatusOrStatementQueryStatusAdvice to an account owner to advise the status of a status query or statement query previously sent by the account owner.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesStatusOrStatementQueryStatusAdviceV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesStsOrStmtQryStsAdvc";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01.mmIdentification,
						com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01.mmQueryReference, com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01.mmAccountOwner,
						com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01.mmSafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01.mmStatusOrStatementRequested,
						com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01.mmProcessingStatus, com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01.mmMessageOriginator,
						com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01.mmMessageRecipient, com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "022";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesStatusOrStatementQueryStatusAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public DocumentIdentification11 getIdentification() {
		return identification;
	}

	public void setIdentification(DocumentIdentification11 identification) {
		this.identification = identification;
	}

	@XmlElement(name = "QryRef", required = true)
	public Identification1 getQueryReference() {
		return queryReference;
	}

	public void setQueryReference(Identification1 queryReference) {
		this.queryReference = queryReference;
	}

	@XmlElement(name = "AcctOwnr")
	public PartyIdentification13Choice getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(PartyIdentification13Choice accountOwner) {
		this.accountOwner = accountOwner;
	}

	@XmlElement(name = "SfkpgAcct")
	public SecuritiesAccount13 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount13 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
	}

	@XmlElement(name = "StsOrStmtReqd")
	public StatusOrStatement1Choice getStatusOrStatementRequested() {
		return statusOrStatementRequested;
	}

	public void setStatusOrStatementRequested(StatusOrStatement1Choice statusOrStatementRequested) {
		this.statusOrStatementRequested = statusOrStatementRequested;
	}

	@XmlElement(name = "PrcgSts", required = true)
	public ProcessingStatus4Choice getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(ProcessingStatus4Choice processingStatus) {
		this.processingStatus = processingStatus;
	}

	@XmlElement(name = "MsgOrgtr")
	public PartyIdentification10Choice getMessageOriginator() {
		return messageOriginator;
	}

	public void setMessageOriginator(PartyIdentification10Choice messageOriginator) {
		this.messageOriginator = messageOriginator;
	}

	@XmlElement(name = "MsgRcpt")
	public PartyIdentification10Choice getMessageRecipient() {
		return messageRecipient;
	}

	public void setMessageRecipient(PartyIdentification10Choice messageRecipient) {
		this.messageRecipient = messageRecipient;
	}

	@XmlElement(name = "Xtnsn")
	public List<Extension2> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension2> extension) {
		this.extension = extension;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.022.01.01")
	static public class Document {
		@XmlElement(name = "SctiesStsOrStmtQryStsAdvc", required = true)
		public SecuritiesStatusOrStatementQueryStatusAdviceV01 messageBody;
	}
}