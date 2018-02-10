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

package com.tools20022.repository.area.acmt;

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AccountManagementLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.AccountSwitching;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The AccountSwitchBalanceTransferAcknowledgement message is sent by the
 * previous account servicer to the new account servicer in response to the
 * AccountSwitchRequestBalanceTransfer message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchBalanceTransferAcknowledgementV01#mmMessageIdentification
 * AccountSwitchBalanceTransferAcknowledgementV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchBalanceTransferAcknowledgementV01#mmAccountSwitchDetails
 * AccountSwitchBalanceTransferAcknowledgementV01.mmAccountSwitchDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchBalanceTransferAcknowledgementV01#mmOldAccount
 * AccountSwitchBalanceTransferAcknowledgementV01.mmOldAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchBalanceTransferAcknowledgementV01#mmOldAccountBalance
 * AccountSwitchBalanceTransferAcknowledgementV01.mmOldAccountBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchBalanceTransferAcknowledgementV01#mmBalanceTransfer
 * AccountSwitchBalanceTransferAcknowledgementV01.mmBalanceTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchBalanceTransferAcknowledgementV01#mmSupplementaryData
 * AccountSwitchBalanceTransferAcknowledgementV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.AccountSwitching
 * AccountSwitching}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctSwtchBalTrfAck"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementLatestVersion
 * AccountManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.032.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=prefix, prefix=DRAFT3</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountSwitchBalanceTransferAcknowledgementV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AccountSwitchBalanceTransferAcknowledgement message is sent by the previous account servicer to the new account servicer in response to the AccountSwitchRequestBalanceTransfer message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountSwitchBalanceTransferAcknowledgementV01", propOrder = {"messageIdentification", "accountSwitchDetails", "oldAccount", "oldAccountBalance", "balanceTransfer", "supplementaryData"})
public class AccountSwitchBalanceTransferAcknowledgementV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification for the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Unique identification for the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountSwitchBalanceTransferAcknowledgementV01.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AcctSwtchDtls", required = true)
	protected AccountSwitchDetails1 accountSwitchDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountSwitchDetails1
	 * AccountSwitchDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSwtchDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSwitchDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains information about the details of the account switch."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountSwitchDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctSwtchDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSwitchDetails";
			definition = "Contains information about the details of the account switch.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountSwitchDetails1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountSwitchBalanceTransferAcknowledgementV01.class.getMethod("getAccountSwitchDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OdAcct", required = true)
	protected CashAccount36 oldAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashAccount36
	 * CashAccount36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OdAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OldAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account held at the old Account Servicer being switched to the new Account Servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOldAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "OdAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OldAccount";
			definition = "Account held at the old Account Servicer being switched to the new Account Servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CashAccount36.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountSwitchBalanceTransferAcknowledgementV01.class.getMethod("getOldAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OdAcctBal", required = true)
	protected AmountAndDirection5 oldAccountBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection5
	 * AmountAndDirection5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OdAcctBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OldAccountBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of the old account."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOldAccountBalance = new MMMessageBuildingBlock() {
		{
			xmlTag = "OdAcctBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OldAccountBalance";
			definition = "Balance of the old account.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountAndDirection5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountSwitchBalanceTransferAcknowledgementV01.class.getMethod("getOldAccountBalance", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "BalTrf")
	protected List<BalanceTransfer1> balanceTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BalanceTransfer1
	 * BalanceTransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTrf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that enables the receiving account servicer to reconcile the payment with the request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBalanceTransfer = new MMMessageBuildingBlock() {
		{
			xmlTag = "BalTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTransfer";
			definition = "Information that enables the receiving account servicer to reconcile the payment with the request.";
			minOccurs = 0;
			complexType_lazy = () -> BalanceTransfer1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountSwitchBalanceTransferAcknowledgementV01.class.getMethod("getBalanceTransfer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountSwitchBalanceTransferAcknowledgementV01.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "prefix", new String[]{"prefix", "DRAFT3"}));
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountSwitchBalanceTransferAcknowledgementV01";
				definition = "The AccountSwitchBalanceTransferAcknowledgement message is sent by the previous account servicer to the new account servicer in response to the AccountSwitchRequestBalanceTransfer message.";
				messageSet_lazy = () -> Arrays.asList(AccountSwitching.mmObject());
				rootElement = "Document";
				xmlTag = "AcctSwtchBalTrfAck";
				businessArea_lazy = () -> AccountManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountSwitchBalanceTransferAcknowledgementV01.mmMessageIdentification,
						com.tools20022.repository.area.acmt.AccountSwitchBalanceTransferAcknowledgementV01.mmAccountSwitchDetails, com.tools20022.repository.area.acmt.AccountSwitchBalanceTransferAcknowledgementV01.mmOldAccount,
						com.tools20022.repository.area.acmt.AccountSwitchBalanceTransferAcknowledgementV01.mmOldAccountBalance, com.tools20022.repository.area.acmt.AccountSwitchBalanceTransferAcknowledgementV01.mmBalanceTransfer,
						com.tools20022.repository.area.acmt.AccountSwitchBalanceTransferAcknowledgementV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "032";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountSwitchBalanceTransferAcknowledgementV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public AccountSwitchBalanceTransferAcknowledgementV01 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public AccountSwitchDetails1 getAccountSwitchDetails() {
		return accountSwitchDetails;
	}

	public AccountSwitchBalanceTransferAcknowledgementV01 setAccountSwitchDetails(AccountSwitchDetails1 accountSwitchDetails) {
		this.accountSwitchDetails = Objects.requireNonNull(accountSwitchDetails);
		return this;
	}

	public CashAccount36 getOldAccount() {
		return oldAccount;
	}

	public AccountSwitchBalanceTransferAcknowledgementV01 setOldAccount(CashAccount36 oldAccount) {
		this.oldAccount = Objects.requireNonNull(oldAccount);
		return this;
	}

	public AmountAndDirection5 getOldAccountBalance() {
		return oldAccountBalance;
	}

	public AccountSwitchBalanceTransferAcknowledgementV01 setOldAccountBalance(AmountAndDirection5 oldAccountBalance) {
		this.oldAccountBalance = Objects.requireNonNull(oldAccountBalance);
		return this;
	}

	public List<BalanceTransfer1> getBalanceTransfer() {
		return balanceTransfer == null ? balanceTransfer = new ArrayList<>() : balanceTransfer;
	}

	public AccountSwitchBalanceTransferAcknowledgementV01 setBalanceTransfer(List<BalanceTransfer1> balanceTransfer) {
		this.balanceTransfer = Objects.requireNonNull(balanceTransfer);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public AccountSwitchBalanceTransferAcknowledgementV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.032.001.01")
	static public class Document {
		@XmlElement(name = "AcctSwtchBalTrfAck", required = true)
		public AccountSwitchBalanceTransferAcknowledgementV01 messageBody;
	}
}