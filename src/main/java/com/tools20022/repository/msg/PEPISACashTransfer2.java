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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.PEPOrISAChoice;
import com.tools20022.repository.codeset.PEPISA1Code;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.InvestmentFundTransaction;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.entity.PortfolioTransfer;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Completion of a securities settlement instruction, wherein securities are
 * sold from a securities account and cash credited to the designated cash
 * account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#PercentageOrAmountOrYearRule
 * PEPISACashTransfer2.PercentageOrAmountOrYearRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmTransferConfirmationIdentification
 * PEPISACashTransfer2.mmTransferConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmTransferInstructionReference
 * PEPISACashTransfer2.mmTransferInstructionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmTradeDate
 * PEPISACashTransfer2.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmSettlementDate
 * PEPISACashTransfer2.mmSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmType
 * PEPISACashTransfer2.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmPercentageToBeTransferred
 * PEPISACashTransfer2.mmPercentageToBeTransferred}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmAmountToBeTransferred
 * PEPISACashTransfer2.mmAmountToBeTransferred}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmYear
 * PEPISACashTransfer2.mmYear}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmAssets
 * PEPISACashTransfer2.mmAssets}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
 * PortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPEPOrISARule#forPEPISACashTransfer2
 * ConstraintPEPOrISARule.forPEPISACashTransfer2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PEPISACashTransfer2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Completion of a securities settlement instruction, wherein securities are sold from a securities account and cash credited to the designated cash account."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PEPISACashTransfer2", propOrder = {"transferConfirmationIdentification", "transferInstructionReference", "tradeDate", "settlementDate", "type", "percentageToBeTransferred", "amountToBeTransferred", "year", "assets"})
public class PEPISACashTransfer2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TrfConfId", required = true)
	protected Max35Text transferConfirmationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2
	 * PEPISACashTransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfConfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by the old plan manager to the transfer (Sale of assets)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferConfirmationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISACashTransfer2.mmObject();
			isDerived = false;
			xmlTag = "TrfConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferConfirmationIdentification";
			definition = "Identification assigned by the old plan manager to the transfer (Sale of assets).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TrfInstrRef", required = true)
	protected Max35Text transferInstructionReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2
	 * PEPISACashTransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfInstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferInstructionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification received by the old plan manager and assigned by the new plan manager to the transfer (sale of assets)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferInstructionReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISACashTransfer2.mmObject();
			isDerived = false;
			xmlTag = "TrfInstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferInstructionReference";
			definition = "Identification received by the old plan manager and assigned by the new plan manager to the transfer (sale of assets).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TradDt", required = true)
	protected ISODate tradeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2
	 * PEPISACashTransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the transfer instruction was received."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISACashTransfer2.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Date when the transfer instruction was received.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "SttlmDt", required = true)
	protected ISODate settlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferDate
	 * PortfolioTransfer.mmTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2
	 * PEPISACashTransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the transfer instruction was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISACashTransfer2.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date when the transfer instruction was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected PEPISA1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PEPISA1Code
	 * PEPISA1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmPEPOrISAPlan
	 * PortfolioTransfer.mmPEPOrISAPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2
	 * PEPISACashTransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of product that was transferred. PEP or ISA."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmPEPOrISAPlan;
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISACashTransfer2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates the type of product that was transferred. PEP or ISA.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PEPISA1Code.mmObject();
		}
	};
	@XmlElement(name = "PctgToBeTrfd", required = true)
	protected PercentageRate percentageToBeTransferred;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredPercentage
	 * PortfolioTransfer.mmTransferredPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2
	 * PEPISACashTransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgToBeTrfd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageToBeTransferred"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as a percentage rate, eg, in the investment fund business, a quantity of a financial instrument may be expressed as percentage of the investor's total holding."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPercentageToBeTransferred = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferredPercentage;
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISACashTransfer2.mmObject();
			isDerived = false;
			xmlTag = "PctgToBeTrfd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageToBeTransferred";
			definition = "Quantity expressed as a percentage rate, eg, in the investment fund business, a quantity of a financial instrument may be expressed as percentage of the investor's total holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "AmtToBeTrfd", required = true)
	protected ImpliedCurrencyAndAmount amountToBeTransferred;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAmount
	 * PaymentObligation.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2
	 * PEPISACashTransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtToBeTrfd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountToBeTransferred"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as an amount, eg, in the investment fund business, a quantity of a financial instrument may be expressed as an amount of money."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmountToBeTransferred = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISACashTransfer2.mmObject();
			isDerived = false;
			xmlTag = "AmtToBeTrfd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountToBeTransferred";
			definition = "Quantity expressed as an amount, eg, in the investment fund business, a quantity of a financial instrument may be expressed as an amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "Yr", required = true)
	protected PEPOrISAChoice year;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PEPOrISAChoice
	 * PEPOrISAChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredYear
	 * PortfolioTransfer.mmTransferredYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2
	 * PEPISACashTransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Yr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Year"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the year during which the investment plan was issued."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmYear = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferredYear;
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISACashTransfer2.mmObject();
			isDerived = false;
			xmlTag = "Yr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Year";
			definition = "Specifies the year during which the investment plan was issued.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PEPOrISAChoice.mmObject();
		}
	};
	@XmlElement(name = "Assts", required = true)
	protected List<com.tools20022.repository.msg.UnitsAndCash> assets;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitsAndCash
	 * UnitsAndCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrderExecution
	 * InvestmentFundTransaction.mmInvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2
	 * PEPISACashTransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assets"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type and the number of underlying assets for the PEP or ISA."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAssets = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundOrderExecution;
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISACashTransfer2.mmObject();
			isDerived = false;
			xmlTag = "Assts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assets";
			definition = "Specifies the type and the number of underlying assets for the PEP or ISA.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UnitsAndCash.mmObject();
		}
	};
	/**
	 * One and only one message element in the list (PercentageToBeTransferred,
	 * AmountToBeTransferred, Year) must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2
	 * PEPISACashTransfer2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmPercentageToBeTransferred
	 * PEPISACashTransfer2.mmPercentageToBeTransferred}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmAmountToBeTransferred
	 * PEPISACashTransfer2.mmAmountToBeTransferred}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmYear
	 * PEPISACashTransfer2.mmYear}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOrAmountOrYearRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One and only one message element in the list (PercentageToBeTransferred, AmountToBeTransferred, Year) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor PercentageOrAmountOrYearRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageOrAmountOrYearRule";
			definition = "One and only one message element in the list (PercentageToBeTransferred, AmountToBeTransferred, Year) must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.PEPISACashTransfer2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISACashTransfer2.mmPercentageToBeTransferred, com.tools20022.repository.msg.PEPISACashTransfer2.mmAmountToBeTransferred,
					com.tools20022.repository.msg.PEPISACashTransfer2.mmYear);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISACashTransfer2.mmTransferConfirmationIdentification, com.tools20022.repository.msg.PEPISACashTransfer2.mmTransferInstructionReference,
						com.tools20022.repository.msg.PEPISACashTransfer2.mmTradeDate, com.tools20022.repository.msg.PEPISACashTransfer2.mmSettlementDate, com.tools20022.repository.msg.PEPISACashTransfer2.mmType,
						com.tools20022.repository.msg.PEPISACashTransfer2.mmPercentageToBeTransferred, com.tools20022.repository.msg.PEPISACashTransfer2.mmAmountToBeTransferred, com.tools20022.repository.msg.PEPISACashTransfer2.mmYear,
						com.tools20022.repository.msg.PEPISACashTransfer2.mmAssets);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPEPOrISARule.forPEPISACashTransfer2);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PEPISACashTransfer2";
				definition = "Completion of a securities settlement instruction, wherein securities are sold from a securities account and cash credited to the designated cash account.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISACashTransfer2.PercentageOrAmountOrYearRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransferConfirmationIdentification() {
		return transferConfirmationIdentification;
	}

	public PEPISACashTransfer2 setTransferConfirmationIdentification(Max35Text transferConfirmationIdentification) {
		this.transferConfirmationIdentification = Objects.requireNonNull(transferConfirmationIdentification);
		return this;
	}

	public Max35Text getTransferInstructionReference() {
		return transferInstructionReference;
	}

	public PEPISACashTransfer2 setTransferInstructionReference(Max35Text transferInstructionReference) {
		this.transferInstructionReference = Objects.requireNonNull(transferInstructionReference);
		return this;
	}

	public ISODate getTradeDate() {
		return tradeDate;
	}

	public PEPISACashTransfer2 setTradeDate(ISODate tradeDate) {
		this.tradeDate = Objects.requireNonNull(tradeDate);
		return this;
	}

	public ISODate getSettlementDate() {
		return settlementDate;
	}

	public PEPISACashTransfer2 setSettlementDate(ISODate settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}

	public PEPISA1Code getType() {
		return type;
	}

	public PEPISACashTransfer2 setType(PEPISA1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public PercentageRate getPercentageToBeTransferred() {
		return percentageToBeTransferred;
	}

	public PEPISACashTransfer2 setPercentageToBeTransferred(PercentageRate percentageToBeTransferred) {
		this.percentageToBeTransferred = Objects.requireNonNull(percentageToBeTransferred);
		return this;
	}

	public ImpliedCurrencyAndAmount getAmountToBeTransferred() {
		return amountToBeTransferred;
	}

	public PEPISACashTransfer2 setAmountToBeTransferred(ImpliedCurrencyAndAmount amountToBeTransferred) {
		this.amountToBeTransferred = Objects.requireNonNull(amountToBeTransferred);
		return this;
	}

	public PEPOrISAChoice getYear() {
		return year;
	}

	public PEPISACashTransfer2 setYear(PEPOrISAChoice year) {
		this.year = Objects.requireNonNull(year);
		return this;
	}

	public List<UnitsAndCash> getAssets() {
		return assets == null ? assets = new ArrayList<>() : assets;
	}

	public PEPISACashTransfer2 setAssets(List<com.tools20022.repository.msg.UnitsAndCash> assets) {
		this.assets = Objects.requireNonNull(assets);
		return this;
	}
}