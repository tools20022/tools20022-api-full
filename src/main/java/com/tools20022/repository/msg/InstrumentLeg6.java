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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.SettlementDateCode;
import com.tools20022.repository.codeset.Side1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Leg;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Additionnal details related to the leg.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegSide
 * InstrumentLeg6.mmLegSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegSettlementType
 * InstrumentLeg6.mmLegSettlementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegSettlementDate
 * InstrumentLeg6.mmLegSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegLastPrice
 * InstrumentLeg6.mmLegLastPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegSettlementCurrency
 * InstrumentLeg6.mmLegSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegOrderQuantity
 * InstrumentLeg6.mmLegOrderQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegForwardPoints
 * InstrumentLeg6.mmLegForwardPoints}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegCalculatedCounterpartyCurrencyLastQuantity
 * InstrumentLeg6.mmLegCalculatedCounterpartyCurrencyLastQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegRiskAmount
 * InstrumentLeg6.mmLegRiskAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegValuationRate
 * InstrumentLeg6.mmLegValuationRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegValueDate
 * InstrumentLeg6.mmLegValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegCurrency
 * InstrumentLeg6.mmLegCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegSymbol
 * InstrumentLeg6.mmLegSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegSecurityIdentification
 * InstrumentLeg6.mmLegSecurityIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Leg Leg}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstrumentLeg6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Additionnal details related to the leg."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.InstrumentLeg1
 * InstrumentLeg1}</li>
 * </ul>
 */
public class InstrumentLeg6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Side1Code legSide;
	/**
	 * Coded list to specify the side of the trade leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Side1Code
	 * Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSide
	 * SecuritiesOrder.mmSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6 InstrumentLeg6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegSd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Coded list to specify the side of the trade leg."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegSide = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmSide;
			componentContext_lazy = () -> InstrumentLeg6.mmObject();
			isDerived = false;
			xmlTag = "LegSd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegSide";
			definition = "Coded list to specify the side of the trade leg.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Side1Code.mmObject();
		}
	};
	protected SettlementDateCode legSettlementType;
	/**
	 * Specifies the date of settlement, in coded form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6 InstrumentLeg6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegSttlmTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegSettlementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the date of settlement, in coded form."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegSettlementType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InstrumentLeg6.mmObject();
			isDerived = false;
			xmlTag = "LegSttlmTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegSettlementType";
			definition = "Specifies the date of settlement, in coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementDateCode.mmObject();
		}
	};
	protected ISODateTime legSettlementDate;
	/**
	 * Specifies the date and time on which the trade will be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6 InstrumentLeg6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date and time on which the trade will be settled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> InstrumentLeg6.mmObject();
			isDerived = false;
			xmlTag = "LegSttlmDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegSettlementDate";
			definition = "Specifies the date and time on which the trade will be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ActiveCurrencyAnd13DecimalAmount legLastPrice;
	/**
	 * Execution price of trade leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6 InstrumentLeg6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegLastPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegLastPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Execution price of trade leg. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegLastPrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InstrumentLeg6.mmObject();
			isDerived = false;
			xmlTag = "LegLastPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegLastPrice";
			definition = "Execution price of trade leg. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected CurrencyCode legSettlementCurrency;
	/**
	 * Settlement currency of trade leg, agreed by both sides of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSettlementCurrency
	 * SecuritiesOrder.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6 InstrumentLeg6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegSttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegSettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement currency of trade leg, agreed by both sides of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegSettlementCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmSettlementCurrency;
			componentContext_lazy = () -> InstrumentLeg6.mmObject();
			isDerived = false;
			xmlTag = "LegSttlmCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegSettlementCurrency";
			definition = "Settlement currency of trade leg, agreed by both sides of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected CurrencyAndAmount legOrderQuantity;
	/**
	 * Amount of trade leg in trading currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6 InstrumentLeg6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegOrdrQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegOrderQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of trade leg in trading currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegOrderQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> InstrumentLeg6.mmObject();
			isDerived = false;
			xmlTag = "LegOrdrQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegOrderQuantity";
			definition = "Amount of trade leg in trading currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected DecimalNumber legForwardPoints;
	/**
	 * Forward points added to last spot rate . May be a negative value.
	 * Expressed in decimal form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6 InstrumentLeg6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegFwdPts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegForwardPoints"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Forward points added to last spot rate . May be a negative value. Expressed in decimal form."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegForwardPoints = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InstrumentLeg6.mmObject();
			isDerived = false;
			xmlTag = "LegFwdPts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegForwardPoints";
			definition = "Forward points added to last spot rate . May be a negative value. Expressed in decimal form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected CurrencyAndAmount legCalculatedCounterpartyCurrencyLastQuantity;
	/**
	 * Used for the calculated quantity of the other side of the currency trade.
	 * Can be derived from leg order quantity and leg last price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6 InstrumentLeg6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegClctdCtrPtyCcyLastQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegCalculatedCounterpartyCurrencyLastQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used for the calculated quantity of the other side of the currency trade. Can be derived from leg order quantity and leg last price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegCalculatedCounterpartyCurrencyLastQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InstrumentLeg6.mmObject();
			isDerived = false;
			xmlTag = "LegClctdCtrPtyCcyLastQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegCalculatedCounterpartyCurrencyLastQuantity";
			definition = "Used for the calculated quantity of the other side of the currency trade. Can be derived from leg order quantity and leg last price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount legRiskAmount;
	/**
	 * Measurement of the leg trade values in terms of a currency (for
	 * example,the amount of trade in US dollars)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6 InstrumentLeg6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegRskAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegRiskAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Measurement of the leg trade values in terms of a currency (for example,the amount of trade in US dollars)"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegRiskAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InstrumentLeg6.mmObject();
			isDerived = false;
			xmlTag = "LegRskAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegRiskAmount";
			definition = "Measurement of the leg trade values in terms of a currency (for example,the amount of trade in US dollars)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected AgreedRate3 legValuationRate;
	/**
	 * Specifies the valuation rate used for the trade leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AgreedRate3
	 * AgreedRate3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRate
	 * SecuritiesPricing.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6 InstrumentLeg6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegValtnRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegValuationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the valuation rate used for the trade leg."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegValuationRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmRate;
			componentContext_lazy = () -> InstrumentLeg6.mmObject();
			isDerived = false;
			xmlTag = "LegValtnRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegValuationRate";
			definition = "Specifies the valuation rate used for the trade leg.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AgreedRate3.mmObject();
		}
	};
	protected ISODate legValueDate;
	/**
	 * Specifies the value date of leg spot transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6 InstrumentLeg6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the value date of leg spot transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegValueDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InstrumentLeg6.mmObject();
			isDerived = false;
			xmlTag = "LegValDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegValueDate";
			definition = "Specifies the value date of leg spot transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected CurrencyCode legCurrency;
	/**
	 * Currency trade is conducted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Leg#mmCurrency
	 * Leg.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6 InstrumentLeg6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency trade is conducted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Leg.mmCurrency;
			componentContext_lazy = () -> InstrumentLeg6.mmObject();
			isDerived = false;
			xmlTag = "LegCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegCurrency";
			definition = "Currency trade is conducted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected Max35Text legSymbol;
	/**
	 * Symbol of the leg trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6 InstrumentLeg6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegSymb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegSymbol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Symbol of the leg trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegSymbol = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InstrumentLeg6.mmObject();
			isDerived = false;
			xmlTag = "LegSymb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegSymbol";
			definition = "Symbol of the leg trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected SecurityIdentification18 legSecurityIdentification;
	/**
	 * Security identification of the leg trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification18
	 * SecurityIdentification18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6 InstrumentLeg6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegSctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegSecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security identification of the leg trade."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegSecurityIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InstrumentLeg6.mmObject();
			isDerived = false;
			xmlTag = "LegSctyId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegSecurityIdentification";
			definition = "Security identification of the leg trade.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification18.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstrumentLeg6.mmLegSide, com.tools20022.repository.msg.InstrumentLeg6.mmLegSettlementType,
						com.tools20022.repository.msg.InstrumentLeg6.mmLegSettlementDate, com.tools20022.repository.msg.InstrumentLeg6.mmLegLastPrice, com.tools20022.repository.msg.InstrumentLeg6.mmLegSettlementCurrency,
						com.tools20022.repository.msg.InstrumentLeg6.mmLegOrderQuantity, com.tools20022.repository.msg.InstrumentLeg6.mmLegForwardPoints,
						com.tools20022.repository.msg.InstrumentLeg6.mmLegCalculatedCounterpartyCurrencyLastQuantity, com.tools20022.repository.msg.InstrumentLeg6.mmLegRiskAmount,
						com.tools20022.repository.msg.InstrumentLeg6.mmLegValuationRate, com.tools20022.repository.msg.InstrumentLeg6.mmLegValueDate, com.tools20022.repository.msg.InstrumentLeg6.mmLegCurrency,
						com.tools20022.repository.msg.InstrumentLeg6.mmLegSymbol, com.tools20022.repository.msg.InstrumentLeg6.mmLegSecurityIdentification);
				trace_lazy = () -> Leg.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InstrumentLeg6";
				definition = "Additionnal details related to the leg.";
				previousVersion_lazy = () -> InstrumentLeg1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Side1Code getLegSide() {
		return legSide;
	}

	public void setLegSide(Side1Code legSide) {
		this.legSide = legSide;
	}

	public SettlementDateCode getLegSettlementType() {
		return legSettlementType;
	}

	public void setLegSettlementType(SettlementDateCode legSettlementType) {
		this.legSettlementType = legSettlementType;
	}

	public ISODateTime getLegSettlementDate() {
		return legSettlementDate;
	}

	public void setLegSettlementDate(ISODateTime legSettlementDate) {
		this.legSettlementDate = legSettlementDate;
	}

	public ActiveCurrencyAnd13DecimalAmount getLegLastPrice() {
		return legLastPrice;
	}

	public void setLegLastPrice(ActiveCurrencyAnd13DecimalAmount legLastPrice) {
		this.legLastPrice = legLastPrice;
	}

	public CurrencyCode getLegSettlementCurrency() {
		return legSettlementCurrency;
	}

	public void setLegSettlementCurrency(CurrencyCode legSettlementCurrency) {
		this.legSettlementCurrency = legSettlementCurrency;
	}

	public CurrencyAndAmount getLegOrderQuantity() {
		return legOrderQuantity;
	}

	public void setLegOrderQuantity(CurrencyAndAmount legOrderQuantity) {
		this.legOrderQuantity = legOrderQuantity;
	}

	public DecimalNumber getLegForwardPoints() {
		return legForwardPoints;
	}

	public void setLegForwardPoints(DecimalNumber legForwardPoints) {
		this.legForwardPoints = legForwardPoints;
	}

	public CurrencyAndAmount getLegCalculatedCounterpartyCurrencyLastQuantity() {
		return legCalculatedCounterpartyCurrencyLastQuantity;
	}

	public void setLegCalculatedCounterpartyCurrencyLastQuantity(CurrencyAndAmount legCalculatedCounterpartyCurrencyLastQuantity) {
		this.legCalculatedCounterpartyCurrencyLastQuantity = legCalculatedCounterpartyCurrencyLastQuantity;
	}

	public ActiveCurrencyAndAmount getLegRiskAmount() {
		return legRiskAmount;
	}

	public void setLegRiskAmount(ActiveCurrencyAndAmount legRiskAmount) {
		this.legRiskAmount = legRiskAmount;
	}

	public AgreedRate3 getLegValuationRate() {
		return legValuationRate;
	}

	public void setLegValuationRate(com.tools20022.repository.msg.AgreedRate3 legValuationRate) {
		this.legValuationRate = legValuationRate;
	}

	public ISODate getLegValueDate() {
		return legValueDate;
	}

	public void setLegValueDate(ISODate legValueDate) {
		this.legValueDate = legValueDate;
	}

	public CurrencyCode getLegCurrency() {
		return legCurrency;
	}

	public void setLegCurrency(CurrencyCode legCurrency) {
		this.legCurrency = legCurrency;
	}

	public Max35Text getLegSymbol() {
		return legSymbol;
	}

	public void setLegSymbol(Max35Text legSymbol) {
		this.legSymbol = legSymbol;
	}

	public SecurityIdentification18 getLegSecurityIdentification() {
		return legSecurityIdentification;
	}

	public void setLegSecurityIdentification(com.tools20022.repository.msg.SecurityIdentification18 legSecurityIdentification) {
		this.legSecurityIdentification = legSecurityIdentification;
	}
}