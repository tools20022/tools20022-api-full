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
import com.tools20022.repository.choice.ClassificationType32Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.InterestComputationMethodFormat4Choice;
import com.tools20022.repository.choice.MarketIdentification3Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.BaseOne14Rate;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Asset;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Description of the financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#FinancialInstrumentIdentification
 * FinancialInstrumentAttributes81.FinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#PlaceOfListing
 * FinancialInstrumentAttributes81.PlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#DayCountBasis
 * FinancialInstrumentAttributes81.DayCountBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#ClassificationType
 * FinancialInstrumentAttributes81.ClassificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#DenominationCurrency
 * FinancialInstrumentAttributes81.DenominationCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#NextCouponDate
 * FinancialInstrumentAttributes81.NextCouponDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#ExpiryDate
 * FinancialInstrumentAttributes81.ExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#FloatingRateFixingDate
 * FinancialInstrumentAttributes81.FloatingRateFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#MaturityDate
 * FinancialInstrumentAttributes81.MaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#IssueDate
 * FinancialInstrumentAttributes81.IssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#NextCallableDate
 * FinancialInstrumentAttributes81.NextCallableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#PutableDate
 * FinancialInstrumentAttributes81.PutableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#DatedDate
 * FinancialInstrumentAttributes81.DatedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#ConversionDate
 * FinancialInstrumentAttributes81.ConversionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#PreviousFactor
 * FinancialInstrumentAttributes81.PreviousFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#NextFactor
 * FinancialInstrumentAttributes81.NextFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#InterestRate
 * FinancialInstrumentAttributes81.InterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#NextInterestRate
 * FinancialInstrumentAttributes81.NextInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#MinimumNominalQuantity
 * FinancialInstrumentAttributes81.MinimumNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#ContractSize
 * FinancialInstrumentAttributes81.ContractSize}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentAttributes81"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Description of the financial instrument."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65
 * FinancialInstrumentAttributes65}</li>
 * </ul>
 */
public class FinancialInstrumentAttributes81 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#Identification
	 * Security.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#FinancialInstrumentIdentification
	 * FinancialInstrumentAttributes65.FinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd FinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.Identification;
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of a financial instrument.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.FinancialInstrumentIdentification;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecurityIdentification19.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Place where the referenced financial instrument is listed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification3Choice
	 * MarketIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#PlaceOfListing
	 * Security.PlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfListg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the referenced financial instrument is listed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#PlaceOfListing
	 * FinancialInstrumentAttributes65.PlaceOfListing}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PlaceOfListing = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.PlaceOfListing;
			isDerived = false;
			xmlTag = "PlcOfListg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Place where the referenced financial instrument is listed.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.PlaceOfListing;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MarketIdentification3Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies the computation method of (accrued) interest of the financial
	 * instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat4Choice
	 * InterestComputationMethodFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#DayCountBasis
	 * InterestCalculation.DayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DayCntBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayCountBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the computation method of (accrued) interest of the financial instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#DayCountBasis
	 * FinancialInstrumentAttributes65.DayCountBasis}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DayCountBasis = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InterestCalculation.DayCountBasis;
			isDerived = false;
			xmlTag = "DayCntBsis";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayCountBasis";
			definition = "Specifies the computation method of (accrued) interest of the financial instrument.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.DayCountBasis;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InterestComputationMethodFormat4Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Classification type of the financial instrument, as per the ISO
	 * Classification of Financial Instrument (CFI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClassificationType32Choice
	 * ClassificationType32Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#ClassificationType
	 * AssetClassification.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssfctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#ClassificationType
	 * FinancialInstrumentAttributes65.ClassificationType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ClassificationType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AssetClassification.ClassificationType;
			isDerived = false;
			xmlTag = "ClssfctnTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationType";
			definition = "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.ClassificationType;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ClassificationType32Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Currency in which a financial instrument is currently denominated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#DenominationCurrency
	 * Security.DenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DnmtnCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which a financial instrument is currently denominated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#DenominationCurrency
	 * FinancialInstrumentAttributes65.DenominationCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute DenominationCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.DenominationCurrency;
			isDerived = false;
			xmlTag = "DnmtnCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a financial instrument is currently denominated.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.DenominationCurrency;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	/**
	 * Next payment date of an interest bearing financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#NextCouponDate
	 * Debt.NextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtCpnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextCouponDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Next payment date of an interest bearing financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#NextCouponDate
	 * FinancialInstrumentAttributes65.NextCouponDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute NextCouponDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Debt.NextCouponDate;
			isDerived = false;
			xmlTag = "NxtCpnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextCouponDate";
			definition = "Next payment date of an interest bearing financial instrument.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.NextCouponDate;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date on which an order expires or at which a privilege or offer
	 * terminates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#ExpiryDate
	 * Asset.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which an order expires or at which a privilege or offer terminates."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#ExpiryDate
	 * FinancialInstrumentAttributes65.ExpiryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ExpiryDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Asset.ExpiryDate;
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which an order expires or at which a privilege or offer terminates.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.ExpiryDate;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date on which the interest rate or redemption price will be/was
	 * calculated according to the terms of the issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#FixingDate
	 * VariableInterest.FixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FltgRateFxgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloatingRateFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the interest rate or redemption price will be/was calculated according to the terms of the issue."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#FloatingRateFixingDate
	 * FinancialInstrumentAttributes65.FloatingRateFixingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute FloatingRateFixingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VariableInterest.FixingDate;
			isDerived = false;
			xmlTag = "FltgRateFxgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateFixingDate";
			definition = "Date on which the interest rate or redemption price will be/was calculated according to the terms of the issue.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.FloatingRateFixingDate;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date on which a financial instrument becomes due and assets are to be
	 * repaid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#MaturityDate
	 * Asset.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a financial instrument becomes due and assets are to be repaid."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#MaturityDate
	 * FinancialInstrumentAttributes65.MaturityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute MaturityDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Asset.MaturityDate;
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Date on which a financial instrument becomes due and assets are to be repaid.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.MaturityDate;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date on which the financial instrument is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#IssueDate
	 * Issuance.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the financial instrument is issued."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#IssueDate
	 * FinancialInstrumentAttributes65.IssueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute IssueDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Issuance.IssueDate;
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date on which the financial instrument is issued.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.IssueDate;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date on which a financial instrument is called away/redeemed before its
	 * scheduled maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#NextCallableDate
	 * Debt.NextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtCllblDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextCallableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a financial instrument is called away/redeemed before its scheduled maturity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#NextCallableDate
	 * FinancialInstrumentAttributes65.NextCallableDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute NextCallableDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Debt.NextCallableDate;
			isDerived = false;
			xmlTag = "NxtCllblDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextCallableDate";
			definition = "Date on which a financial instrument is called away/redeemed before its scheduled maturity.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.NextCallableDate;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date on which a holder of a financial instrument has the right to request
	 * redemption of the principal amount prior to its scheduled maturity date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#PutableDate
	 * Debt.PutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PutblDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a holder of a financial instrument has the right to request redemption of the principal amount prior to its scheduled maturity date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#PutableDate
	 * FinancialInstrumentAttributes65.PutableDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute PutableDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Debt.PutableDate;
			isDerived = false;
			xmlTag = "PutblDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableDate";
			definition = "Date on which a holder of a financial instrument has the right to request redemption of the principal amount prior to its scheduled maturity date.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.PutableDate;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date on which an interest bearing financial instrument begins to accrue
	 * interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#DatedDate
	 * Debt.DatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which an interest bearing financial instrument begins to accrue interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#DatedDate
	 * FinancialInstrumentAttributes65.DatedDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute DatedDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Debt.DatedDate;
			isDerived = false;
			xmlTag = "DtdDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatedDate";
			definition = "Date on which an interest bearing financial instrument begins to accrue interest.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.DatedDate;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Deadline by which a convertible security must be converted, according to
	 * the terms of the issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionDate
	 * SecuritiesConversion.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which a convertible security must be converted, according to the terms of the issue."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#ConversionDate
	 * FinancialInstrumentAttributes65.ConversionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ConversionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.ConversionDate;
			isDerived = false;
			xmlTag = "ConvsDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionDate";
			definition = "Deadline by which a convertible security must be converted, according to the terms of the issue.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.ConversionDate;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Factor used to calculate the value of the outstanding principal of the
	 * financial instrument (for factored securities) until the next redemption
	 * (factor) date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BaseOne14Rate
	 * BaseOne14Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#Factor Debt.Factor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Factor used to calculate the value of the outstanding principal of the financial instrument (for factored securities) until the next redemption (factor) date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#PreviousFactor
	 * FinancialInstrumentAttributes65.PreviousFactor}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute PreviousFactor = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Debt.Factor;
			isDerived = false;
			xmlTag = "PrvsFctr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousFactor";
			definition = "Factor used to calculate the value of the outstanding principal of the financial instrument (for factored securities) until the next redemption (factor) date.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.PreviousFactor;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOne14Rate.mmObject();
		}
	};
	/**
	 * Factor used to calculate the value of the outstanding principal of the
	 * financial instrument (for factored securities) that will applicable after
	 * the redemption (factor) date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BaseOne14Rate
	 * BaseOne14Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#Factor Debt.Factor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Factor used to calculate the value of the outstanding principal of the financial instrument (for factored securities) that will applicable after the redemption (factor) date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#NextFactor
	 * FinancialInstrumentAttributes65.NextFactor}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute NextFactor = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Debt.Factor;
			isDerived = false;
			xmlTag = "NxtFctr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextFactor";
			definition = "Factor used to calculate the value of the outstanding principal of the financial instrument (for factored securities) that will applicable after the redemption (factor) date.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.NextFactor;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOne14Rate.mmObject();
		}
	};
	/**
	 * Annualised interest rate of a financial instrument used to calculate the
	 * actual interest rate of the coupon or the accrued interest.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#Rate
	 * InterestCalculation.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Annualised interest rate of a financial instrument used to calculate the actual interest rate of the coupon or the accrued interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#InterestRate
	 * FinancialInstrumentAttributes65.InterestRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute InterestRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InterestCalculation.Rate;
			isDerived = false;
			xmlTag = "IntrstRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Annualised interest rate of a financial instrument used to calculate the actual interest rate of the coupon or the accrued interest.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.InterestRate;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Interest rate applicable to the next interest payment period in relation
	 * to variable rate instruments.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#Rate
	 * InterestCalculation.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtIntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextInterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest rate applicable to the next interest payment period in relation to variable rate instruments."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#NextInterestRate
	 * FinancialInstrumentAttributes65.NextInterestRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute NextInterestRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InterestCalculation.Rate;
			isDerived = false;
			xmlTag = "NxtIntrstRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextInterestRate";
			definition = "Interest rate applicable to the next interest payment period in relation to variable rate instruments.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.NextInterestRate;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Minimum nominal quantity of financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#MinimumQuantity
	 * Security.MinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinNmnlQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumNominalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum nominal quantity of financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#MinimumNominalQuantity
	 * FinancialInstrumentAttributes65.MinimumNominalQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd MinimumNominalQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.MinimumQuantity;
			isDerived = false;
			xmlTag = "MinNmnlQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumNominalQuantity";
			definition = "Minimum nominal quantity of financial instrument.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.MinimumNominalQuantity;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Ratio or multiplying factor used to convert one contract into a financial
	 * instrument quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ContractSize
	 * SecuritiesConversion.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
	 * FinancialInstrumentAttributes81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ratio or multiplying factor used to convert one contract into a financial instrument quantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#ContractSize
	 * FinancialInstrumentAttributes65.ContractSize}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ContractSize = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributes81.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.ContractSize;
			isDerived = false;
			xmlTag = "CtrctSz";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractSize";
			definition = "Ratio or multiplying factor used to convert one contract into a financial instrument quantity.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes65.ContractSize;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes81.FinancialInstrumentIdentification, com.tools20022.repository.msg.FinancialInstrumentAttributes81.PlaceOfListing,
						com.tools20022.repository.msg.FinancialInstrumentAttributes81.DayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes81.ClassificationType,
						com.tools20022.repository.msg.FinancialInstrumentAttributes81.DenominationCurrency, com.tools20022.repository.msg.FinancialInstrumentAttributes81.NextCouponDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes81.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes81.FloatingRateFixingDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes81.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes81.IssueDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes81.NextCallableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes81.PutableDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes81.DatedDate, com.tools20022.repository.msg.FinancialInstrumentAttributes81.ConversionDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes81.PreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes81.NextFactor,
						com.tools20022.repository.msg.FinancialInstrumentAttributes81.InterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes81.NextInterestRate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes81.MinimumNominalQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes81.ContractSize);
				trace_lazy = () -> Asset.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentAttributes81";
				definition = "Description of the financial instrument.";
				previousVersion_lazy = () -> FinancialInstrumentAttributes65.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}