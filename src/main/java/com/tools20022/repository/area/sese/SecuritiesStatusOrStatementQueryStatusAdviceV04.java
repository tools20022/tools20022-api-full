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
import com.tools20022.repository.area.SecuritiesSettlementLatestVersion;
import com.tools20022.repository.choice.ProcessingStatus55Choice;
import com.tools20022.repository.choice.StatusOrStatement7Choice;
import com.tools20022.repository.msg.DocumentIdentification30;
import com.tools20022.repository.msg.PartyIdentification98;
import com.tools20022.repository.msg.SecuritiesAccount19;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.SettlementAndReconciliationISOLatestversion;
import com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017;
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
 * <br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent,<br>
 * - provide a third party with a copy of a message for information,<br>
 * - re-send to a third party a copy of a message for information<br>
 * using the relevant elements in the Business Application Header.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementLatestVersion
 * SecuritiesSettlementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISOLatestversion
 * SettlementAndReconciliationISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017
 * SettlementandReconciliationMaintenance20162017}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04#mmQueryDetails
 * SecuritiesStatusOrStatementQueryStatusAdviceV04.mmQueryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04#mmAccountOwner
 * SecuritiesStatusOrStatementQueryStatusAdviceV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04#mmSafekeepingAccount
 * SecuritiesStatusOrStatementQueryStatusAdviceV04.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04#mmStatusOrStatementRequested
 * SecuritiesStatusOrStatementQueryStatusAdviceV04.mmStatusOrStatementRequested}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04#mmProcessingStatus
 * SecuritiesStatusOrStatementQueryStatusAdviceV04.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04#mmSupplementaryData
 * SecuritiesStatusOrStatementQueryStatusAdviceV04.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.022.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesStatusOrStatementQueryStatusAdviceV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends a SecuritiesStatusOrStatementQueryStatusAdvice to an account owner to advise the status of a status query or statement query previously sent by the account owner.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03
 * SecuritiesStatusOrStatementQueryStatusAdviceV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesStatusOrStatementQueryStatusAdviceV04", propOrder = {"queryDetails", "accountOwner", "safekeepingAccount", "statusOrStatementRequested", "processingStatus", "supplementaryData"})
public class SecuritiesStatusOrStatementQueryStatusAdviceV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected DocumentIdentification30 queryDetails;
	/**
	 * Unambiguous identification of the query as per the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification30
	 * DocumentIdentification30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the query as per the account owner."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03#mmQueryDetails
	 * SecuritiesStatusOrStatementQueryStatusAdviceV03.mmQueryDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQueryDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "QryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryDetails";
			definition = "Unambiguous identification of the query as per the account owner.";
			previousVersion_lazy = () -> SecuritiesStatusOrStatementQueryStatusAdviceV03.mmQueryDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification30.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesStatusOrStatementQueryStatusAdviceV04.class.getMethod("getQueryDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification98 accountOwner;
	/**
	 * Party that legally owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification98
	 * PartyIdentification98}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03#mmAccountOwner
	 * SecuritiesStatusOrStatementQueryStatusAdviceV03.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountOwner = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			previousVersion_lazy = () -> SecuritiesStatusOrStatementQueryStatusAdviceV03.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification98.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesStatusOrStatementQueryStatusAdviceV04.class.getMethod("getAccountOwner", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesAccount19 safekeepingAccount;
	/**
	 * Account to or from which a securities entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03#mmSafekeepingAccount
	 * SecuritiesStatusOrStatementQueryStatusAdviceV03.mmSafekeepingAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSafekeepingAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			previousVersion_lazy = () -> SecuritiesStatusOrStatementQueryStatusAdviceV03.mmSafekeepingAccount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesAccount19.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesStatusOrStatementQueryStatusAdviceV04.class.getMethod("getSafekeepingAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected StatusOrStatement7Choice statusOrStatementRequested;
	/**
	 * Details of the request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatusOrStatement7Choice
	 * StatusOrStatement7Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03#mmStatusOrStatementRequested
	 * SecuritiesStatusOrStatementQueryStatusAdviceV03.
	 * mmStatusOrStatementRequested}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStatusOrStatementRequested = new MMMessageBuildingBlock() {
		{
			xmlTag = "StsOrStmtReqd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusOrStatementRequested";
			definition = "Details of the request.";
			previousVersion_lazy = () -> SecuritiesStatusOrStatementQueryStatusAdviceV03.mmStatusOrStatementRequested;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatusOrStatement7Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesStatusOrStatementQueryStatusAdviceV04.class.getMethod("getStatusOrStatementRequested", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ProcessingStatus55Choice processingStatus;
	/**
	 * Provides details on the processing status of the request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus55Choice
	 * ProcessingStatus55Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03#mmProcessingStatus
	 * SecuritiesStatusOrStatementQueryStatusAdviceV03.mmProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmProcessingStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides details on the processing status of the request.";
			previousVersion_lazy = () -> SecuritiesStatusOrStatementQueryStatusAdviceV03.mmProcessingStatus;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ProcessingStatus55Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesStatusOrStatementQueryStatusAdviceV04.class.getMethod("getProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03#mmSupplementaryData
	 * SecuritiesStatusOrStatementQueryStatusAdviceV03.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> SecuritiesStatusOrStatementQueryStatusAdviceV03.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesStatusOrStatementQueryStatusAdviceV04.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesStatusOrStatementQueryStatusAdviceV04";
				definition = "Scope\r\nAn account servicer sends a SecuritiesStatusOrStatementQueryStatusAdvice to an account owner to advise the status of a status query or statement query previously sent by the account owner.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header.";
				previousVersion_lazy = () -> SecuritiesStatusOrStatementQueryStatusAdviceV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(SettlementAndReconciliationISOLatestversion.mmObject(), SettlementandReconciliationMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesStsOrStmtQryStsAdvc";
				businessArea_lazy = () -> SecuritiesSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04.mmQueryDetails,
						com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04.mmAccountOwner, com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04.mmSafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04.mmStatusOrStatementRequested,
						com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04.mmProcessingStatus, com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "022";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesStatusOrStatementQueryStatusAdviceV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "QryDtls", required = true)
	public DocumentIdentification30 getQueryDetails() {
		return queryDetails;
	}

	public void setQueryDetails(DocumentIdentification30 queryDetails) {
		this.queryDetails = queryDetails;
	}

	@XmlElement(name = "AcctOwnr")
	public PartyIdentification98 getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(PartyIdentification98 accountOwner) {
		this.accountOwner = accountOwner;
	}

	@XmlElement(name = "SfkpgAcct")
	public SecuritiesAccount19 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount19 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
	}

	@XmlElement(name = "StsOrStmtReqd")
	public StatusOrStatement7Choice getStatusOrStatementRequested() {
		return statusOrStatementRequested;
	}

	public void setStatusOrStatementRequested(StatusOrStatement7Choice statusOrStatementRequested) {
		this.statusOrStatementRequested = statusOrStatementRequested;
	}

	@XmlElement(name = "PrcgSts", required = true)
	public ProcessingStatus55Choice getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(ProcessingStatus55Choice processingStatus) {
		this.processingStatus = processingStatus;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.022.04.04")
	static public class Document {
		@XmlElement(name = "SctiesStsOrStmtQryStsAdvc", required = true)
		public SecuritiesStatusOrStatementQueryStatusAdviceV04 messageBody;
	}
}