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

package com.tools20022.repository.area.semt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesManagementLatestversionsubsetvariant;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.SettlementAndReconciliationISO15022VariantsISOLatestversion;
import com.tools20022.repository.msgset.SettlementAndReconciliationISO15022VariantsISOPreviousversion;
import com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017ISO15022Variants;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by the Market Infrastructure to the CSD to advise of the
 * history of all the statuses, modifications, replacement and cancellation of a
 * specific transaction during its whole life cycle when the instructing party
 * is a direct participant to the Settlement Infrastructure.<br>
 * <br>
 * <b>Usage</b><br>
 * The message may also be used to: <br>
 * - re-send a message sent by the market infrastructure to the direct
 * participant,<br>
 * - provide a third party with a copy of a message being sent by the market
 * infrastructure for information,<br>
 * - re-send to a third party a copy of a message being sent by the market
 * infrastructure for information<br>
 * using the relevant elements in the Business Application Header.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03#mmPagination
 * SecuritiesSettlementTransactionAuditTrailReport002V03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03#mmQueryReference
 * SecuritiesSettlementTransactionAuditTrailReport002V03.mmQueryReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03#mmTransactionIdentification
 * SecuritiesSettlementTransactionAuditTrailReport002V03.
 * mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03#mmSafekeepingAccount
 * SecuritiesSettlementTransactionAuditTrailReport002V03.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03#mmAccountOwner
 * SecuritiesSettlementTransactionAuditTrailReport002V03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03#mmStatusTrail
 * SecuritiesSettlementTransactionAuditTrailReport002V03.mmStatusTrail}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISO15022VariantsISOLatestversion
 * SettlementAndReconciliationISO15022VariantsISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017ISO15022Variants
 * SettlementandReconciliationMaintenance20162017ISO15022Variants}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISO15022VariantsISOPreviousversion
 * SettlementAndReconciliationISO15022VariantsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesSttlmTxAudtTrlRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementLatestversionsubsetvariant
 * SecuritiesManagementLatestversionsubsetvariant}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.022.002.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionAuditTrailReport002V03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by the Market Infrastructure to the CSD to advise of the history of all the statuses, modifications, replacement and cancellation of a specific transaction during its whole life cycle when the instructing party is a direct participant to the Settlement Infrastructure.\r\n\r\nUsage\r\nThe message may also be used to: \r\n- re-send a message sent by the market infrastructure to the direct participant,\r\n- provide a third party with a copy of a message being sent by the market infrastructure for information,\r\n- re-send to a third party a copy of a message being sent by the market infrastructure for information\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesSettlementTransactionAuditTrailReport002V03", propOrder = {"pagination", "queryReference", "transactionIdentification", "safekeepingAccount", "accountOwner", "statusTrail"})
public class SecuritiesSettlementTransactionAuditTrailReport002V03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pgntn", required = true)
	protected Pagination pagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message (within a statement) and continuation indicator to indicate that the statement is to continue or that the message is the last page of the statement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message (within a statement) and continuation indicator to indicate that the statement is to continue or that the message is the last page of the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionAuditTrailReport002V03.class.getMethod("getPagination", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "QryRef")
	protected Identification16 queryReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.Identification16
	 * Identification16}</li>
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
	 * "Identification of the SecuritiesStatusQuery message sent to request this report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQueryReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "QryRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryReference";
			definition = "Identification of the SecuritiesStatusQuery message sent to request this report.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Identification16.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionAuditTrailReport002V03.class.getMethod("getQueryReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TxId")
	protected TransactionIdentifications34 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications34
	 * TransactionIdentifications34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides unambiguous transaction identification information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Provides unambiguous transaction identification information.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransactionIdentifications34.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionAuditTrailReport002V03.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SfkpgAcct", required = true)
	protected SecuritiesAccount27 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount27
	 * SecuritiesAccount27}</li>
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
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount27.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionAuditTrailReport002V03.class.getMethod("getSafekeepingAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification109 accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification109
	 * PartyIdentification109}</li>
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
			complexType_lazy = () -> PartyIdentification109.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionAuditTrailReport002V03.class.getMethod("getAccountOwner", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "StsTrl")
	protected List<StatusTrail7> statusTrail;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.StatusTrail7
	 * StatusTrail7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsTrl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusTrail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * " Provides the history of status and reasons for a pending, posted or cancelled transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStatusTrail = new MMMessageBuildingBlock() {
		{
			xmlTag = "StsTrl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusTrail";
			definition = " Provides the history of status and reasons for a pending, posted or cancelled transaction.";
			minOccurs = 0;
			complexType_lazy = () -> StatusTrail7.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionAuditTrailReport002V03.class.getMethod("getStatusTrail", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionAuditTrailReport002V03";
				definition = "Scope\r\nThis message is sent by the Market Infrastructure to the CSD to advise of the history of all the statuses, modifications, replacement and cancellation of a specific transaction during its whole life cycle when the instructing party is a direct participant to the Settlement Infrastructure.\r\n\r\nUsage\r\nThe message may also be used to: \r\n- re-send a message sent by the market infrastructure to the direct participant,\r\n- provide a third party with a copy of a message being sent by the market infrastructure for information,\r\n- re-send to a third party a copy of a message being sent by the market infrastructure for information\r\nusing the relevant elements in the Business Application Header.";
				messageSet_lazy = () -> Arrays.asList(SettlementAndReconciliationISO15022VariantsISOLatestversion.mmObject(), SettlementandReconciliationMaintenance20162017ISO15022Variants.mmObject(),
						SettlementAndReconciliationISO15022VariantsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesSttlmTxAudtTrlRpt";
				businessArea_lazy = () -> SecuritiesManagementLatestversionsubsetvariant.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03.mmPagination,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03.mmQueryReference,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03.mmTransactionIdentification,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03.mmSafekeepingAccount,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03.mmAccountOwner, com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03.mmStatusTrail);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "022";
						version = "03";
						flavour = "002";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementTransactionAuditTrailReport002V03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Pagination getPagination() {
		return pagination;
	}

	public SecuritiesSettlementTransactionAuditTrailReport002V03 setPagination(Pagination pagination) {
		this.pagination = Objects.requireNonNull(pagination);
		return this;
	}

	public Optional<Identification16> getQueryReference() {
		return queryReference == null ? Optional.empty() : Optional.of(queryReference);
	}

	public SecuritiesSettlementTransactionAuditTrailReport002V03 setQueryReference(Identification16 queryReference) {
		this.queryReference = queryReference;
		return this;
	}

	public Optional<TransactionIdentifications34> getTransactionIdentification() {
		return transactionIdentification == null ? Optional.empty() : Optional.of(transactionIdentification);
	}

	public SecuritiesSettlementTransactionAuditTrailReport002V03 setTransactionIdentification(TransactionIdentifications34 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
		return this;
	}

	public SecuritiesAccount27 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public SecuritiesSettlementTransactionAuditTrailReport002V03 setSafekeepingAccount(SecuritiesAccount27 safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public Optional<PartyIdentification109> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public SecuritiesSettlementTransactionAuditTrailReport002V03 setAccountOwner(PartyIdentification109 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public List<StatusTrail7> getStatusTrail() {
		return statusTrail == null ? statusTrail = new ArrayList<>() : statusTrail;
	}

	public SecuritiesSettlementTransactionAuditTrailReport002V03 setStatusTrail(List<StatusTrail7> statusTrail) {
		this.statusTrail = Objects.requireNonNull(statusTrail);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.022.002.03")
	static public class Document {
		@XmlElement(name = "SctiesSttlmTxAudtTrlRpt", required = true)
		public SecuritiesSettlementTransactionAuditTrailReport002V03 messageBody;
	}
}