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

package com.tools20022.repository.area.secl;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesClearingLatestVersion;
import com.tools20022.repository.choice.PartyIdentification35Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CentralCounterPartyCCPSecuritiesClearingISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The TradeLegNotification message is sent by the central counterparty (CCP) to
 * a clearing member to report the trade that has been executed by the trading
 * platform.<br>
 * <br>
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * The CCP reports both sides of the trade from the clearing member perspective.
 * The CCP sends a message to the global clearing member of the seller and a
 * message to the global clearing member of the buyer. Note: An individual
 * clearing member only clear its own trades.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesClearingLatestVersion
 * SecuritiesClearingLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CentralCounterPartyCCPSecuritiesClearingISOLatestversion
 * CentralCounterPartyCCPSecuritiesClearingISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "TradLegNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationV03#mmClearingMember
 * TradeLegNotificationV03.mmClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationV03#mmClearingAccount
 * TradeLegNotificationV03.mmClearingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationV03#mmDeliveryAccount
 * TradeLegNotificationV03.mmDeliveryAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationV03#mmNonClearingMember
 * TradeLegNotificationV03.mmNonClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationV03#mmClearingDetails
 * TradeLegNotificationV03.mmClearingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationV03#mmTradeLegDetails
 * TradeLegNotificationV03.mmTradeLegDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationV03#mmSettlementDetails
 * TradeLegNotificationV03.mmSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationV03#mmSupplementaryData
 * TradeLegNotificationV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code secl.001.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeLegNotificationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe TradeLegNotification message is sent by the central counterparty (CCP) to a clearing member to report the trade that has been executed by the trading platform.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe CCP reports both sides of the trade from the clearing member perspective. The CCP sends a message to the global clearing member of the seller and a message to the global clearing member of the buyer. Note: An individual clearing member only clear its own trades."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TradeLegNotificationV03", propOrder = {"clearingMember", "clearingAccount", "deliveryAccount", "nonClearingMember", "clearingDetails", "tradeLegDetails", "settlementDetails", "supplementaryData"})
public class TradeLegNotificationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification35Choice clearingMember;
	/**
	 * Provides the identification of the clearing member (individual clearing
	 * member or general clearing member).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice
	 * PartyIdentification35Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrMmb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the identification of the clearing member (individual clearing member or general clearing member)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmClearingMember = new MMMessageBuildingBlock() {
		{
			xmlTag = "ClrMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingMember";
			definition = "Provides the identification of the clearing member (individual clearing member or general clearing member).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification35Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeLegNotificationV03.class.getMethod("getClearingMember", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesAccount18 clearingAccount;
	/**
	 * Identifies the clearing member account at the CCP through which the trade
	 * must be cleared (sometimes called position account).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount18
	 * SecuritiesAccount18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the clearing member account at the CCP through which the trade must be cleared (sometimes called position account)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmClearingAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "ClrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingAccount";
			definition = "Identifies the clearing member account at the CCP through which the trade must be cleared (sometimes called position account).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount18.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeLegNotificationV03.class.getMethod("getClearingAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesAccount19 deliveryAccount;
	/**
	 * An account opened by the central counterparty in the name of the clearing
	 * member or its settlement agent within the account structure, for
	 * settlement purposes (gives information about the clearing member/its
	 * settlement agent account at the central securities depository).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An account opened by the central counterparty in the name of the clearing member or its settlement agent within the account structure, for settlement purposes (gives information about the clearing member/its settlement agent account at the central securities depository)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDeliveryAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "DlvryAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryAccount";
			definition = "An account opened by the central counterparty in the name of the clearing member or its settlement agent within the account structure, for settlement purposes (gives information about the clearing member/its settlement agent account at the central securities depository).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesAccount19.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeLegNotificationV03.class.getMethod("getDeliveryAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentificationAndAccount31 nonClearingMember;
	/**
	 * Provides details about the non clearing member identification and
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31
	 * PartyIdentificationAndAccount31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonClrMmb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the non clearing member identification and account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNonClearingMember = new MMMessageBuildingBlock() {
		{
			xmlTag = "NonClrMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonClearingMember";
			definition = "Provides details about the non clearing member identification and account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentificationAndAccount31.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeLegNotificationV03.class.getMethod("getNonClearingMember", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Clearing4 clearingDetails;
	/**
	 * Provides clearing details such as the settlement netting (or not)
	 * eligibility code or the clearing segment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Clearing4
	 * Clearing4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides clearing details such as the settlement netting (or not) eligibility code or the clearing segment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmClearingDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "ClrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingDetails";
			definition = "Provides clearing details such as the settlement netting (or not) eligibility code or the clearing segment.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Clearing4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeLegNotificationV03.class.getMethod("getClearingDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradeLeg8 tradeLegDetails;
	/**
	 * Provides details about the trade leg such as the trade date, the
	 * settlement date or the trading currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradLegDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeLegDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the trade leg such as the trade date, the settlement date or the trading currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeLegDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradLegDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeLegDetails";
			definition = "Provides details about the trade leg such as the trade date, the settlement date or the trading currency.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeLeg8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeLegNotificationV03.class.getMethod("getTradeLegDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Settlement1 settlementDetails;
	/**
	 * Provides details about the settlement details of the trade leg such the
	 * settlement amount or the place of settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Settlement1
	 * Settlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the settlement details of the trade leg such the settlement amount or the place of settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetails";
			definition = "Provides details about the settlement details of the trade leg such the settlement amount or the place of settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Settlement1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeLegNotificationV03.class.getMethod("getSettlementDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
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
	 * "Additional information that can not be captured in the structured fields and/or any other specific block. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block. ";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeLegNotificationV03.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeLegNotificationV03";
				definition = "Scope\r\nThe TradeLegNotification message is sent by the central counterparty (CCP) to a clearing member to report the trade that has been executed by the trading platform.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe CCP reports both sides of the trade from the clearing member perspective. The CCP sends a message to the global clearing member of the seller and a message to the global clearing member of the buyer. Note: An individual clearing member only clear its own trades.";
				messageSet_lazy = () -> Arrays.asList(CentralCounterPartyCCPSecuritiesClearingISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "TradLegNtfctn";
				businessArea_lazy = () -> SecuritiesClearingLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.secl.TradeLegNotificationV03.mmClearingMember, com.tools20022.repository.area.secl.TradeLegNotificationV03.mmClearingAccount,
						com.tools20022.repository.area.secl.TradeLegNotificationV03.mmDeliveryAccount, com.tools20022.repository.area.secl.TradeLegNotificationV03.mmNonClearingMember,
						com.tools20022.repository.area.secl.TradeLegNotificationV03.mmClearingDetails, com.tools20022.repository.area.secl.TradeLegNotificationV03.mmTradeLegDetails,
						com.tools20022.repository.area.secl.TradeLegNotificationV03.mmSettlementDetails, com.tools20022.repository.area.secl.TradeLegNotificationV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "secl";
						messageFunctionality = "001";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return TradeLegNotificationV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ClrMmb", required = true)
	public PartyIdentification35Choice getClearingMember() {
		return clearingMember;
	}

	public void setClearingMember(PartyIdentification35Choice clearingMember) {
		this.clearingMember = clearingMember;
	}

	@XmlElement(name = "ClrAcct", required = true)
	public SecuritiesAccount18 getClearingAccount() {
		return clearingAccount;
	}

	public void setClearingAccount(SecuritiesAccount18 clearingAccount) {
		this.clearingAccount = clearingAccount;
	}

	@XmlElement(name = "DlvryAcct")
	public SecuritiesAccount19 getDeliveryAccount() {
		return deliveryAccount;
	}

	public void setDeliveryAccount(SecuritiesAccount19 deliveryAccount) {
		this.deliveryAccount = deliveryAccount;
	}

	@XmlElement(name = "NonClrMmb")
	public PartyIdentificationAndAccount31 getNonClearingMember() {
		return nonClearingMember;
	}

	public void setNonClearingMember(PartyIdentificationAndAccount31 nonClearingMember) {
		this.nonClearingMember = nonClearingMember;
	}

	@XmlElement(name = "ClrDtls")
	public Clearing4 getClearingDetails() {
		return clearingDetails;
	}

	public void setClearingDetails(Clearing4 clearingDetails) {
		this.clearingDetails = clearingDetails;
	}

	@XmlElement(name = "TradLegDtls", required = true)
	public TradeLeg8 getTradeLegDetails() {
		return tradeLegDetails;
	}

	public void setTradeLegDetails(TradeLeg8 tradeLegDetails) {
		this.tradeLegDetails = tradeLegDetails;
	}

	@XmlElement(name = "SttlmDtls", required = true)
	public Settlement1 getSettlementDetails() {
		return settlementDetails;
	}

	public void setSettlementDetails(Settlement1 settlementDetails) {
		this.settlementDetails = settlementDetails;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:secl.001.03.03")
	static public class Document {
		@XmlElement(name = "TradLegNtfctn", required = true)
		public TradeLegNotificationV03 messageBody;
	}
}