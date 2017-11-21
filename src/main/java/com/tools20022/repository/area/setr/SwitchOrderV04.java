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
import com.tools20022.repository.area.SecuritiesTradeLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The SwitchOrder message is sent by an instructing party, for example, an
 * investment manager or its authorised representative, to the executing party,
 * for example, a transfer agent, to instruct a switch transaction from a
 * financial instrument or multiple financial instruments to a different
 * specified financial instrument or instruments for a specified
 * amount/quantity.<br>
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
 * subscription leg levels.<br>
 * The message caters for a switch from one financial instrument to another
 * financial instrument (within the same fund family), many to one, many to many
 * and one to many.<br>
 * The message caters for switch transactions that result in an additional cash
 * payment from the investor or a transaction that results in a net payment to
 * the investor. Not all institutions or funds permit this type of switch and
 * acceptance is therefore not automatic. <br>
 * There is no limitation on the number of switch legs in a switch message. The
 * number allowed is defined by the fund prospectus or by the service level
 * agreement (SLA) in place between the two parties. However, if the
 * SwitchOrderDetails sequence is present more than once, then the
 * RedemptionLegDetails and SubscriptionLegDetails sequences may only be present
 * once.<br>
 * If SwitchOrderDetails\InvestmentAccount is used, then the
 * InvestmentAccountDetails sequences in SubscriptionLegDetails and
 * RedemptionLegDetails are not allowed. This functionality is to be used by
 * institutions that set up two accounts per investor, rather than one
 * investment account.<br>
 * There is no switch driver type in the message to indicate whether the switch
 * is buy or sell driven. A driver is not needed since it is possible to
 * indicate the total subscription amount or the total redemption amount. Only
 * one of these two amounts should be used. <br>
 * The subscription quantity can be expressed in one of the following ways:<br>
 * - Amount: the monetary value (either GROSS or NET) of the financial
 * instrument to be subscribed to, for example, the subscription of EUR 1,000 of
 * financial instrument ISIN LU1234567890 or <br>
 * - Unit: the number of units of the financial instrument to be subscribed to,
 * for example, the subscription of 10 units of financial instrument ISIN
 * LU1234567890 or <br>
 * - Percentage of the total redemption amount: when the switch transaction is
 * redemption driven, it is the part of the redemption amount that must be
 * switched to a specific financial instrument, for example, the subscription
 * quantity of financial instrument ISIN LU1234567890 represents 50% of the
 * redemption amount of the financial instrument ISIN LU4444444444.<br>
 * The redemption quantity can be expressed in one of the following ways:<br>
 * - Amount: the monetary value (either GROSS or NET) of the financial
 * instrument to be redeemed, for example, the redemption of EUR 1,000 of
 * financial instrument ISIN LU1234567890, or <br>
 * - Unit: the number of units of financial instrument to be redeemed, for
 * example, the redemption of 10 units of financial instrument ISIN
 * LU1234567890, or<br>
 * - Rate: the part of the portfolio to be redeemed, for example, the redemption
 * of 10% of the holdings in financial instrument ISIN LU1234567890, or<br>
 * - Percentage of the total subscription amount: when the switch transaction is
 * subscription driven, it is the part of the subscription amount that must be
 * the result of the redemption of a specific financial instrument, for example,
 * the redemption quantity in financial instrument ABC represents 50% of the
 * subscription amount of the financial instrument ISIN LU4444444444
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradeLatestVersion
 * SecuritiesTradeLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOLatestversion
 * InvestmentFundsISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SwtchOrdr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmMessageIdentification
 * SwitchOrderV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmPoolReference
 * SwitchOrderV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmPreviousReference
 * SwitchOrderV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmMessagePagination
 * SwitchOrderV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmSwitchOrderDetails
 * SwitchOrderV04.mmSwitchOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmCopyDetails
 * SwitchOrderV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmExtension
 * SwitchOrderV04.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.013.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SwitchOrderV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe SwitchOrder message is sent by an instructing party, for example, an investment manager or its authorised representative, to the executing party, for example, a transfer agent, to instruct a switch transaction from a financial instrument or multiple financial instruments to a different specified financial instrument or instruments for a specified amount/quantity.\r\nUsage\r\nThe SwitchOrder message is used to either:\r\n- instruct one switch transaction comprising one or more redemption legs and one or more subscription legs, that is, a single switch transaction that can be a one to one, many to one, many to many or one to many switch transaction, or,\r\n- instruct one or many switch transactions each comprising one redemption leg and one subscription leg, that is, multiple simple switch transactions.\r\nThe SwitchOrder message may be used to either:\r\n- instruct a switch transaction for one investment account, or,\r\n- instruct a switch transaction for separate accounts at the redemption and subscription leg levels.\r\nThe message caters for a switch from one financial instrument to another financial instrument (within the same fund family), many to one, many to many and one to many.\r\nThe message caters for switch transactions that result in an additional cash payment from the investor or a transaction that results in a net payment to the investor. Not all institutions or funds permit this type of switch and acceptance is therefore not automatic. \r\nThere is no limitation on the number of switch legs in a switch message. The number allowed is defined by the fund prospectus or by the service level agreement (SLA) in place between the two parties. However, if the SwitchOrderDetails sequence is present more than once, then the RedemptionLegDetails and SubscriptionLegDetails sequences may only be present once.\r\nIf SwitchOrderDetails\\InvestmentAccount is used, then the InvestmentAccountDetails sequences in SubscriptionLegDetails and RedemptionLegDetails are not allowed. This functionality is to be used by institutions that set up two accounts per investor, rather than one investment account.\r\nThere is no switch driver type in the message to indicate whether the switch is buy or sell driven. A driver is not needed since it is possible to indicate the total subscription amount or the total redemption amount. Only one of these two amounts should be used. \r\nThe subscription quantity can be expressed in one of the following ways:\r\n- Amount: the monetary value (either GROSS or NET) of the financial instrument to be subscribed to, for example, the subscription of EUR 1,000 of financial instrument ISIN LU1234567890 or \r\n- Unit: the number of units of the financial instrument to be subscribed to, for example, the subscription of 10 units of financial instrument ISIN LU1234567890 or \r\n- Percentage of the total redemption amount: when the switch transaction is redemption driven, it is the part of the redemption amount that must be switched to a specific financial instrument, for example, the subscription quantity of financial instrument ISIN LU1234567890 represents 50% of the redemption amount of the financial instrument ISIN LU4444444444.\r\nThe redemption quantity can be expressed in one of the following ways:\r\n- Amount: the monetary value (either GROSS or NET) of the financial instrument to be redeemed, for example, the redemption of EUR 1,000 of financial instrument ISIN LU1234567890, or \r\n- Unit: the number of units of financial instrument to be redeemed, for example, the redemption of 10 units of financial instrument ISIN LU1234567890, or\r\n- Rate: the part of the portfolio to be redeemed, for example, the redemption of 10% of the holdings in financial instrument ISIN LU1234567890, or\r\n- Percentage of the total subscription amount: when the switch transaction is subscription driven, it is the part of the subscription amount that must be the result of the redemption of a specific financial instrument, for example, the redemption quantity in financial instrument ABC represents 50% of the subscription amount of the financial instrument ISIN LU4444444444"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03
 * SwitchOrderV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SwitchOrderV04", propOrder = {"messageIdentification", "poolReference", "previousReference", "messagePagination", "switchOrderDetails", "copyDetails", "extension"})
public class SwitchOrderV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 messageIdentification;
	/**
	 * Reference that uniquely identifies the message from a business
	 * application standpoint.
	 * <p>
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
	 * "Reference that uniquely identifies the message from a business application standpoint. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmMessageIdentification
	 * SwitchOrderV03.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies the message from a business application standpoint. ";
			previousVersion_lazy = () -> SwitchOrderV03.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrderV04.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference9 poolReference;
	/**
	 * Collective reference identifying a set of messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference9
	 * AdditionalReference9}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmPoolReference
	 * SwitchOrderV03.mmPoolReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPoolReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			previousVersion_lazy = () -> SwitchOrderV03.mmPoolReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference9.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrderV04.class.getMethod("getPoolReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<AdditionalReference8> previousReference;
	/**
	 * Reference to a linked message that was previously sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8
	 * AdditionalReference8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmPreviousReference
	 * SwitchOrderV03.mmPreviousReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			previousVersion_lazy = () -> SwitchOrderV03.mmPreviousReference;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrderV04.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Pagination messagePagination;
	/**
	 * Pagination of the message.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmMessagePagination
	 * SwitchOrderV03.mmMessagePagination}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessagePagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Pagination of the message.";
			previousVersion_lazy = () -> SwitchOrderV03.mmMessagePagination;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Pagination.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrderV04.class.getMethod("getMessagePagination", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SwitchOrder7> switchOrderDetails;
	/**
	 * Information related to the switch order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.SwitchOrder7
	 * SwitchOrder7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmSwitchOrderDetails
	 * SwitchOrderV03.mmSwitchOrderDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSwitchOrderDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "SwtchOrdrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchOrderDetails";
			definition = "Information related to the switch order.";
			previousVersion_lazy = () -> SwitchOrderV03.mmSwitchOrderDetails;
			minOccurs = 1;
			complexType_lazy = () -> SwitchOrder7.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrderV04.class.getMethod("getSwitchOrderDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CopyInformation4 copyDetails;
	/**
	 * Information provided when the message is a copy of a previous message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation4
	 * CopyInformation4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmCopyDetails
	 * SwitchOrderV03.mmCopyDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCopyDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CpyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDetails";
			definition = "Information provided when the message is a copy of a previous message.";
			previousVersion_lazy = () -> SwitchOrderV03.mmCopyDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrderV04.class.getMethod("getCopyDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Extension1> extension;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmExtension
	 * SwitchOrderV03.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> SwitchOrderV03.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrderV04.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SwitchOrderV04";
				definition = "Scope\r\nThe SwitchOrder message is sent by an instructing party, for example, an investment manager or its authorised representative, to the executing party, for example, a transfer agent, to instruct a switch transaction from a financial instrument or multiple financial instruments to a different specified financial instrument or instruments for a specified amount/quantity.\r\nUsage\r\nThe SwitchOrder message is used to either:\r\n- instruct one switch transaction comprising one or more redemption legs and one or more subscription legs, that is, a single switch transaction that can be a one to one, many to one, many to many or one to many switch transaction, or,\r\n- instruct one or many switch transactions each comprising one redemption leg and one subscription leg, that is, multiple simple switch transactions.\r\nThe SwitchOrder message may be used to either:\r\n- instruct a switch transaction for one investment account, or,\r\n- instruct a switch transaction for separate accounts at the redemption and subscription leg levels.\r\nThe message caters for a switch from one financial instrument to another financial instrument (within the same fund family), many to one, many to many and one to many.\r\nThe message caters for switch transactions that result in an additional cash payment from the investor or a transaction that results in a net payment to the investor. Not all institutions or funds permit this type of switch and acceptance is therefore not automatic. \r\nThere is no limitation on the number of switch legs in a switch message. The number allowed is defined by the fund prospectus or by the service level agreement (SLA) in place between the two parties. However, if the SwitchOrderDetails sequence is present more than once, then the RedemptionLegDetails and SubscriptionLegDetails sequences may only be present once.\r\nIf SwitchOrderDetails\\InvestmentAccount is used, then the InvestmentAccountDetails sequences in SubscriptionLegDetails and RedemptionLegDetails are not allowed. This functionality is to be used by institutions that set up two accounts per investor, rather than one investment account.\r\nThere is no switch driver type in the message to indicate whether the switch is buy or sell driven. A driver is not needed since it is possible to indicate the total subscription amount or the total redemption amount. Only one of these two amounts should be used. \r\nThe subscription quantity can be expressed in one of the following ways:\r\n- Amount: the monetary value (either GROSS or NET) of the financial instrument to be subscribed to, for example, the subscription of EUR 1,000 of financial instrument ISIN LU1234567890 or \r\n- Unit: the number of units of the financial instrument to be subscribed to, for example, the subscription of 10 units of financial instrument ISIN LU1234567890 or \r\n- Percentage of the total redemption amount: when the switch transaction is redemption driven, it is the part of the redemption amount that must be switched to a specific financial instrument, for example, the subscription quantity of financial instrument ISIN LU1234567890 represents 50% of the redemption amount of the financial instrument ISIN LU4444444444.\r\nThe redemption quantity can be expressed in one of the following ways:\r\n- Amount: the monetary value (either GROSS or NET) of the financial instrument to be redeemed, for example, the redemption of EUR 1,000 of financial instrument ISIN LU1234567890, or \r\n- Unit: the number of units of financial instrument to be redeemed, for example, the redemption of 10 units of financial instrument ISIN LU1234567890, or\r\n- Rate: the part of the portfolio to be redeemed, for example, the redemption of 10% of the holdings in financial instrument ISIN LU1234567890, or\r\n- Percentage of the total subscription amount: when the switch transaction is subscription driven, it is the part of the subscription amount that must be the result of the redemption of a specific financial instrument, for example, the redemption quantity in financial instrument ABC represents 50% of the subscription amount of the financial instrument ISIN LU4444444444";
				previousVersion_lazy = () -> SwitchOrderV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "SwtchOrdr";
				businessArea_lazy = () -> SecuritiesTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SwitchOrderV04.mmMessageIdentification, com.tools20022.repository.area.setr.SwitchOrderV04.mmPoolReference,
						com.tools20022.repository.area.setr.SwitchOrderV04.mmPreviousReference, com.tools20022.repository.area.setr.SwitchOrderV04.mmMessagePagination,
						com.tools20022.repository.area.setr.SwitchOrderV04.mmSwitchOrderDetails, com.tools20022.repository.area.setr.SwitchOrderV04.mmCopyDetails, com.tools20022.repository.area.setr.SwitchOrderV04.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "013";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SwitchOrderV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MsgId", required = true)
	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	@XmlElement(name = "PoolRef")
	public AdditionalReference9 getPoolReference() {
		return poolReference;
	}

	public void setPoolReference(AdditionalReference9 poolReference) {
		this.poolReference = poolReference;
	}

	@XmlElement(name = "PrvsRef")
	public List<AdditionalReference8> getPreviousReference() {
		return previousReference;
	}

	public void setPreviousReference(List<AdditionalReference8> previousReference) {
		this.previousReference = previousReference;
	}

	@XmlElement(name = "MsgPgntn")
	public Pagination getMessagePagination() {
		return messagePagination;
	}

	public void setMessagePagination(Pagination messagePagination) {
		this.messagePagination = messagePagination;
	}

	@XmlElement(name = "SwtchOrdrDtls", required = true)
	public List<SwitchOrder7> getSwitchOrderDetails() {
		return switchOrderDetails;
	}

	public void setSwitchOrderDetails(List<SwitchOrder7> switchOrderDetails) {
		this.switchOrderDetails = switchOrderDetails;
	}

	@XmlElement(name = "CpyDtls")
	public CopyInformation4 getCopyDetails() {
		return copyDetails;
	}

	public void setCopyDetails(CopyInformation4 copyDetails) {
		this.copyDetails = copyDetails;
	}

	@XmlElement(name = "Xtnsn")
	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension1> extension) {
		this.extension = extension;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:setr.013.04.04")
	static public class Document {
		@XmlElement(name = "SwtchOrdr", required = true)
		public SwitchOrderV04 messageBody;
	}
}