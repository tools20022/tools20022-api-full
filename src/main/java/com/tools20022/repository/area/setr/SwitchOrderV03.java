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

package com.tools20022.repository.area.setr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesTradePreviousVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An instructing party, for example, an investment manager or its authorised
 * representative, sends the SwitchOrder message to the executing party, for
 * example, a transfer agent, to instruct a switch transaction from a financial
 * instrument or multiple financial instruments to a different specified
 * financial instrument or instruments for a specified amount/quantity.<br>
 * <b>Usage</b><br>
 * The SwitchOrder message is used to either:<br>
 * - instruct one switch transaction comprising one or more redemption legs and
 * one or more subscription legs, that is, a single switch transaction that can
 * be a one to one, many to one, many to many or one to many switch transaction,
 * or,<br>
 * - instruct one or many switch transactions each comprising one redemption leg
 * and one subscription leg, that is, multiple simple switch transactions.<br>
 * The SwitchOrder message may be used to either:<br>
 * - instruct a switch transaction for one investment account, or,<br>
 * - instruct a switch transaction for separate accounts at the redemption and
 * subscription leg levels. The message caters for a switch from one financial
 * instrument to another financial instrument (within the same fund family),
 * many to one, many to many and one to many. The message caters for switch
 * transactions that result in an additional cash payment from the investor or a
 * transaction that results in a net payment to the investor. Not all
 * institutions or funds permit this type of switch and acceptance is therefore
 * not automatic. There is no limitation on the number of switch legs in a
 * switch message. The number allowed is defined by the fund prospectus or by
 * the service level agreement (SLA) in place between the two parties. However,
 * if the SwitchOrderDetails sequence is present more than once, then the
 * RedemptionLegDetails and SubscriptionLegDetails sequences may only be present
 * once. If SwitchOrderDetails\InvestmentAccount is used, then the
 * InvestmentAccountDetails sequences in SubscriptionLegDetails and
 * RedemptionLegDetails are not allowed. This functionality is to be used by
 * institutions that set up two accounts per investor, rather than one
 * investment account. There is no switch driver type in the message to indicate
 * whether the switch is buy or sell driven. A driver is not needed since it is
 * possible to indicate the total subscription amount or the total redemption
 * amount. Only one of these two amounts should be used. The subscription
 * quantity can be expressed in one of the following ways: - Amount: the
 * monetary value (either GROSS or NET) of the financial instrument to be
 * subscribed to, eg, the subscription of EUR 1,000 of financial instrument ISIN
 * LU1234567890 or - Unit: the number of units of the financial instrument to be
 * subscribed to, eg, the subscription of 10 units of financial instrument ISIN
 * LU1234567890 or - Percentage of the total redemption amount: when the switch
 * transaction is redemption driven, it is the part of the redemption amount
 * that must be switched to a specific financial instrument, for example, the
 * subscription quantity of financial instrument ISIN LU1234567890 represents
 * 50% of the redemption amount of the financial instrument ISIN LU4444444444.
 * The redemption quantity can be expressed in one of the following ways: -
 * Amount: the monetary value (either GROSS or NET) of the financial instrument
 * to be redeemed, eg, the redemption of EUR 1,000 of financial instrument ISIN
 * LU1234567890, or - Unit: the number of units of financial instrument to be
 * redeemed, eg, the redemption of 10 units of financial instrument ISIN
 * LU1234567890, or - Rate: the part of the portfolio to be redeemed, eg, the
 * redemption of 10% of the holdings in financial instrument ISIN LU1234567890,
 * or - Percentage of the total subscription amount: when the switch transaction
 * is subscription driven, it is the part of the subscription amount that must
 * be the result of the redemption of a specific financial instrument, for
 * example, the redemption quantity in financial instrument ABC represents 50%
 * of the subscription amount of the financial instrument ISIN LU4444444444 .
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmMessageIdentification
 * SwitchOrderV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmPoolReference
 * SwitchOrderV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmPreviousReference
 * SwitchOrderV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmMessagePagination
 * SwitchOrderV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmSwitchOrderDetails
 * SwitchOrderV03.mmSwitchOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmCopyDetails
 * SwitchOrderV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmExtension
 * SwitchOrderV03.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SwtchOrdrV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradePreviousVersion
 * SecuritiesTradePreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.013.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forSwitchOrderV03
 * ConstraintAccountIdentificationRule.forSwitchOrderV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility4Rule#forSwitchOrderV03
 * ConstraintOrderOriginatorEligibility4Rule.forSwitchOrderV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMultipleSwitchOrderRule#forSwitchOrderV03
 * ConstraintMultipleSwitchOrderRule.forSwitchOrderV03}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SwitchOrderV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn instructing party, for example, an investment manager or its authorised representative, sends the SwitchOrder message to the executing party, for example, a transfer agent, to instruct a switch transaction from a financial instrument or multiple financial instruments to a different specified financial instrument or instruments for a specified amount/quantity.\r\nUsage\r\nThe SwitchOrder message is used to either:\r\n- instruct one switch transaction comprising one or more redemption legs and one or more subscription legs, that is, a single switch transaction that can be a one to one, many to one, many to many or one to many switch transaction, or,\r\n- instruct one or many switch transactions each comprising one redemption leg and one subscription leg, that is, multiple simple switch transactions.\r\nThe SwitchOrder message may be used to either:\r\n- instruct a switch transaction for one investment account, or,\r\n- instruct a switch transaction for separate accounts at the redemption and subscription leg levels.\nThe message caters for a switch from one financial instrument to another financial instrument (within the same fund family), many to one, many to many and one to many.\nThe message caters for switch transactions that result in an additional cash payment from the investor or a transaction that results in a net payment to the investor. Not all institutions or funds permit this type of switch and acceptance is therefore not automatic. \nThere is no limitation on the number of switch legs in a switch message. The number allowed is defined by the fund prospectus or by the service level agreement (SLA) in place between the two parties. However, if the SwitchOrderDetails sequence is present more than once, then the RedemptionLegDetails and SubscriptionLegDetails sequences may only be present once.\nIf SwitchOrderDetails\\InvestmentAccount is used, then the InvestmentAccountDetails sequences in SubscriptionLegDetails and RedemptionLegDetails are not allowed. This functionality is to be used by institutions that set up two accounts per investor, rather than one investment account.\nThere is no switch driver type in the message to indicate whether the switch is buy or sell driven. A driver is not needed since it is possible to indicate the total subscription amount or the total redemption amount. Only one of these two amounts should be used. \nThe subscription quantity can be expressed in one of the following ways:\n- Amount: the monetary value (either GROSS or NET) of the financial instrument to be subscribed to, eg, the subscription of EUR 1,000 of financial instrument ISIN LU1234567890 or \n- Unit: the number of units of the financial instrument to be subscribed to, eg, the subscription of 10 units of financial instrument ISIN LU1234567890 or \n- Percentage of the total redemption amount: when the switch transaction is redemption driven, it is the part of the redemption amount that must be switched to a specific financial instrument, for example, the subscription quantity of financial instrument ISIN LU1234567890 represents 50% of the redemption amount of the financial instrument ISIN LU4444444444.\nThe redemption quantity can be expressed in one of the following ways:\n- Amount: the monetary value (either GROSS or NET) of the financial instrument to be redeemed, eg, the redemption of EUR 1,000 of financial instrument ISIN LU1234567890, or \n- Unit: the number of units of financial instrument to be redeemed, eg, the redemption of 10 units of financial instrument ISIN LU1234567890, or\n- Rate: the part of the portfolio to be redeemed, eg, the redemption of 10% of the holdings in financial instrument ISIN LU1234567890, or\n- Percentage of the total subscription amount: when the switch transaction is subscription driven, it is the part of the subscription amount that must be the result of the redemption of a specific financial instrument, for example, the redemption quantity in financial instrument ABC represents 50% of the subscription amount of the financial instrument ISIN LU4444444444\n."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.setr.SwitchOrderV04
 * SwitchOrderV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV02
 * SwitchOrderV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SwitchOrderV03", propOrder = {"messageIdentification", "poolReference", "previousReference", "messagePagination", "switchOrderDetails", "copyDetails", "extension"})
public class SwitchOrderV03 {

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
	 * definition} =
	 * "Reference that uniquely identifies a message from a business application standpoint."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmMessageIdentification
	 * SwitchOrderV04.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderV04.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrderV03.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PoolRef")
	protected AdditionalReference3 poolReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmPoolReference
	 * SwitchOrderV04.mmPoolReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPoolReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderV04.mmPoolReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrderV03.class.getMethod("getPoolReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PrvsRef")
	protected List<AdditionalReference3> previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmPreviousReference
	 * SwitchOrderV04.mmPreviousReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderV04.mmPreviousReference);
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrderV03.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "MsgPgntn")
	protected Pagination messagePagination;
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
	 * xmlTag} = "MsgPgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessagePagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pagination of the message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmMessagePagination
	 * SwitchOrderV04.mmMessagePagination}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessagePagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Pagination of the message.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderV04.mmMessagePagination);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Pagination.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrderV03.class.getMethod("getMessagePagination", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SwtchOrdrDtls", required = true)
	protected List<SwitchOrder4> switchOrderDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.SwitchOrder4
	 * SwitchOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SwtchOrdrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchOrderDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the switch order."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmSwitchOrderDetails
	 * SwitchOrderV04.mmSwitchOrderDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSwitchOrderDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "SwtchOrdrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchOrderDetails";
			definition = "Information related to the switch order.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderV04.mmSwitchOrderDetails);
			minOccurs = 1;
			complexType_lazy = () -> SwitchOrder4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrderV03.class.getMethod("getSwitchOrderDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CpyDtls")
	protected CopyInformation2 copyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation2
	 * CopyInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information provided when the message is a copy of a previous message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmCopyDetails
	 * SwitchOrderV04.mmCopyDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCopyDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CpyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDetails";
			definition = "Information provided when the message is a copy of a previous message.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderV04.mmCopyDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrderV03.class.getMethod("getCopyDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmExtension
	 * SwitchOrderV04.mmExtension}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderV04.mmExtension);
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrderV03.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forSwitchOrderV03,
						com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility4Rule.forSwitchOrderV03, com.tools20022.repository.constraints.ConstraintMultipleSwitchOrderRule.forSwitchOrderV03);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SwitchOrderV03";
				definition = "Scope\r\nAn instructing party, for example, an investment manager or its authorised representative, sends the SwitchOrder message to the executing party, for example, a transfer agent, to instruct a switch transaction from a financial instrument or multiple financial instruments to a different specified financial instrument or instruments for a specified amount/quantity.\r\nUsage\r\nThe SwitchOrder message is used to either:\r\n- instruct one switch transaction comprising one or more redemption legs and one or more subscription legs, that is, a single switch transaction that can be a one to one, many to one, many to many or one to many switch transaction, or,\r\n- instruct one or many switch transactions each comprising one redemption leg and one subscription leg, that is, multiple simple switch transactions.\r\nThe SwitchOrder message may be used to either:\r\n- instruct a switch transaction for one investment account, or,\r\n- instruct a switch transaction for separate accounts at the redemption and subscription leg levels.\nThe message caters for a switch from one financial instrument to another financial instrument (within the same fund family), many to one, many to many and one to many.\nThe message caters for switch transactions that result in an additional cash payment from the investor or a transaction that results in a net payment to the investor. Not all institutions or funds permit this type of switch and acceptance is therefore not automatic. \nThere is no limitation on the number of switch legs in a switch message. The number allowed is defined by the fund prospectus or by the service level agreement (SLA) in place between the two parties. However, if the SwitchOrderDetails sequence is present more than once, then the RedemptionLegDetails and SubscriptionLegDetails sequences may only be present once.\nIf SwitchOrderDetails\\InvestmentAccount is used, then the InvestmentAccountDetails sequences in SubscriptionLegDetails and RedemptionLegDetails are not allowed. This functionality is to be used by institutions that set up two accounts per investor, rather than one investment account.\nThere is no switch driver type in the message to indicate whether the switch is buy or sell driven. A driver is not needed since it is possible to indicate the total subscription amount or the total redemption amount. Only one of these two amounts should be used. \nThe subscription quantity can be expressed in one of the following ways:\n- Amount: the monetary value (either GROSS or NET) of the financial instrument to be subscribed to, eg, the subscription of EUR 1,000 of financial instrument ISIN LU1234567890 or \n- Unit: the number of units of the financial instrument to be subscribed to, eg, the subscription of 10 units of financial instrument ISIN LU1234567890 or \n- Percentage of the total redemption amount: when the switch transaction is redemption driven, it is the part of the redemption amount that must be switched to a specific financial instrument, for example, the subscription quantity of financial instrument ISIN LU1234567890 represents 50% of the redemption amount of the financial instrument ISIN LU4444444444.\nThe redemption quantity can be expressed in one of the following ways:\n- Amount: the monetary value (either GROSS or NET) of the financial instrument to be redeemed, eg, the redemption of EUR 1,000 of financial instrument ISIN LU1234567890, or \n- Unit: the number of units of financial instrument to be redeemed, eg, the redemption of 10 units of financial instrument ISIN LU1234567890, or\n- Rate: the part of the portfolio to be redeemed, eg, the redemption of 10% of the holdings in financial instrument ISIN LU1234567890, or\n- Percentage of the total subscription amount: when the switch transaction is subscription driven, it is the part of the subscription amount that must be the result of the redemption of a specific financial instrument, for example, the redemption quantity in financial instrument ABC represents 50% of the subscription amount of the financial instrument ISIN LU4444444444\n.";
				nextVersions_lazy = () -> Arrays.asList(SwitchOrderV04.mmObject());
				previousVersion_lazy = () -> SwitchOrderV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "SwtchOrdrV03";
				businessArea_lazy = () -> SecuritiesTradePreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SwitchOrderV03.mmMessageIdentification, com.tools20022.repository.area.setr.SwitchOrderV03.mmPoolReference,
						com.tools20022.repository.area.setr.SwitchOrderV03.mmPreviousReference, com.tools20022.repository.area.setr.SwitchOrderV03.mmMessagePagination,
						com.tools20022.repository.area.setr.SwitchOrderV03.mmSwitchOrderDetails, com.tools20022.repository.area.setr.SwitchOrderV03.mmCopyDetails, com.tools20022.repository.area.setr.SwitchOrderV03.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "013";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SwitchOrderV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public SwitchOrderV03 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public SwitchOrderV03 setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public List<AdditionalReference3> getPreviousReference() {
		return previousReference == null ? previousReference = new ArrayList<>() : previousReference;
	}

	public SwitchOrderV03 setPreviousReference(List<AdditionalReference3> previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public Optional<Pagination> getMessagePagination() {
		return messagePagination == null ? Optional.empty() : Optional.of(messagePagination);
	}

	public SwitchOrderV03 setMessagePagination(Pagination messagePagination) {
		this.messagePagination = messagePagination;
		return this;
	}

	public List<SwitchOrder4> getSwitchOrderDetails() {
		return switchOrderDetails == null ? switchOrderDetails = new ArrayList<>() : switchOrderDetails;
	}

	public SwitchOrderV03 setSwitchOrderDetails(List<SwitchOrder4> switchOrderDetails) {
		this.switchOrderDetails = Objects.requireNonNull(switchOrderDetails);
		return this;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return copyDetails == null ? Optional.empty() : Optional.of(copyDetails);
	}

	public SwitchOrderV03 setCopyDetails(CopyInformation2 copyDetails) {
		this.copyDetails = copyDetails;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public SwitchOrderV03 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.013.001.03")
	static public class Document {
		@XmlElement(name = "SwtchOrdrV03", required = true)
		public SwitchOrderV03 messageBody;
	}
}