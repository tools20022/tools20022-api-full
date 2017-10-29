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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique and unambiguous identifier of a security, assigned under a formal or
 * proprietary identification scheme.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesIdentification"
 * src="doc-files/SecuritiesIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#IdentifiedSecurity
 * SecuritiesIdentification.IdentifiedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#SecurityIdentification
 * SecuritiesIdentification.SecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#RIC
 * SecuritiesIdentification.RIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#TickerSymbol
 * SecuritiesIdentification.TickerSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#Bloomberg
 * SecuritiesIdentification.Bloomberg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#CTA
 * SecuritiesIdentification.CTA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#Common
 * SecuritiesIdentification.Common}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#Name
 * SecuritiesIdentification.Name}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#SEDOL
 * SecuritiesIdentification.SEDOL}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#CUSIP
 * SecuritiesIdentification.CUSIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#QUICK
 * SecuritiesIdentification.QUICK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#Wertpapier
 * SecuritiesIdentification.Wertpapier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#Dutch
 * SecuritiesIdentification.Dutch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#Valoren
 * SecuritiesIdentification.Valoren}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#Sicovam
 * SecuritiesIdentification.Sicovam}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#Belgian
 * SecuritiesIdentification.Belgian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#IdentificationSuffix
 * SecuritiesIdentification.IdentificationSuffix}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#GenericIdentification
 * SecuritiesIdentification.GenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#ValidityPeriod
 * SecuritiesIdentification.ValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#ApplicableTradingMarket
 * SecuritiesIdentification.ApplicableTradingMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#PrimeIdentification
 * SecuritiesIdentification.PrimeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#RelatedOtherIdentification
 * SecuritiesIdentification.RelatedOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#TradingIdentification
 * SecuritiesIdentification.TradingIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Identification
 * Security.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#PrimeIdentification
 * SecuritiesIdentification.PrimeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#RelatedOtherIdentification
 * SecuritiesIdentification.RelatedOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedSecuritiesIdentification
 * GenericIdentification.RelatedSecuritiesIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LocalName#RelatedSecurity
 * LocalName.RelatedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#ListedSecurityTradingIdentification
 * TradingMarket.ListedSecurityTradingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedSecuritiesIdentification
 * DateTimePeriod.RelatedSecuritiesIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7#OtherIdentification
 * SecurityIdentification7.OtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7#Description
 * SecurityIdentification7.Description}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification1#Identification
 * SecurityIdentification1.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#AlternateIdentification
 * SecurityIdentification1Choice.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#OtherProprietaryIdentification
 * SecurityIdentification3Choice.OtherProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification1#IdentificationSource
 * AlternateIdentification1.IdentificationSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification11Choice#OtherIdentification
 * SecurityIdentification11Choice.OtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification11#Identification
 * SecurityIdentification11.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification11#Description
 * SecurityIdentification11.Description}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14#OtherIdentification
 * SecurityIdentification14.OtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14#Description
 * SecurityIdentification14.Description}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15#OtherIdentification
 * SecurityIdentification15.OtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15#Description
 * SecurityIdentification15.Description}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification2#IdentificationSource
 * AlternateIdentification2.IdentificationSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification12Choice#OtherIdentification
 * SecurityIdentification12Choice.OtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification12#Identification
 * SecurityIdentification12.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification12#Description
 * SecurityIdentification12.Description}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification16#OtherIdentification
 * SecurityIdentification16.OtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification16#Description
 * SecurityIdentification16.Description}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification2#Type
 * AlternateSecurityIdentification2.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification4Choice#Proprietary
 * SecurityIdentification4Choice.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3#OtherIdentification
 * SecurityIdentification3.OtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification5Choice#OtherIdentification
 * SecurityIdentification5Choice.OtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification6Choice#OtherIdentification
 * SecurityIdentification6Choice.OtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification10Choice#OtherIdentification
 * SecurityIdentification10Choice.OtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification9#SecurityIdentification
 * SecurityIdentification9.SecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification9#Description
 * SecurityIdentification9.Description}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification7Choice#OtherProprietaryIdentification
 * SecurityIdentification7Choice.OtherProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification8#SecurityIdentification
 * SecurityIdentification8.SecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification8#Description
 * SecurityIdentification8.Description}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentIdentificationValidity1#FinancialInstrumentIdentification
 * FinancialInstrumentIdentificationValidity1.FinancialInstrumentIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#TriggerSecurityDetails
 * TriggeringInstructions.TriggerSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportItem1#FinancialInstrumentIdentification
 * ReportItem1.FinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1#FinancialInstrumentIdentification
 * AggregateHoldingBalance1.FinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#AlternateIdentification
 * SecurityIdentification22Choice.AlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#OtherProprietaryIdentification
 * SecurityIdentification23Choice.OtherProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#OtherIdentification
 * SecurityIdentification19.OtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#Description
 * SecurityIdentification19.Description}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20#OtherIdentification
 * SecurityIdentification20.OtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20#Description
 * SecurityIdentification20.Description}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification32#OtherIdentification
 * SecurityIdentification32.OtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification32#Description
 * SecurityIdentification32.Description}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification21#OtherIdentification
 * SecurityIdentification21.OtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification21#Description
 * SecurityIdentification21.Description}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#OtherProprietaryIdentification
 * SecurityIdentification25Choice.OtherProprietaryIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwapLegIdentification2#SwapIn
 * SwapLegIdentification2.SwapIn}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwapLegIdentification2#SwapOut
 * SwapLegIdentification2.SwapOut}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification3
 * AlternateSecurityIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification7
 * SecurityIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification1
 * SecurityIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1
 * AlternateSecurityIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice
 * SecurityIdentification1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
 * SecurityIdentification3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification2Choice
 * SecurityIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternateIdentification1
 * AlternateIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification11Choice
 * SecurityIdentification11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification11
 * SecurityIdentification11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherIdentification1
 * OtherIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification14
 * SecurityIdentification14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherIdentification2
 * OtherIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification15
 * SecurityIdentification15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternateIdentification2
 * AlternateIdentification2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification12Choice
 * SecurityIdentification12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification12
 * SecurityIdentification12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherIdentification3
 * OtherIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification16
 * SecurityIdentification16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification2
 * AlternateSecurityIdentification2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification4Choice
 * SecurityIdentification4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1
 * AlternateFinancialInstrumentIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification3
 * SecurityIdentification3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification5Choice
 * SecurityIdentification5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification6Choice
 * SecurityIdentification6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification10Choice
 * SecurityIdentification10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification9
 * SecurityIdentification9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification4
 * AlternateSecurityIdentification4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification7Choice
 * SecurityIdentification7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification8
 * SecurityIdentification8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentIdentificationValidity1
 * FinancialInstrumentIdentificationValidity1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherIdentification2SD1
 * OtherIdentification2SD1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification14SD1
 * SecurityIdentification14SD1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherIdentification4
 * OtherIdentification4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice
 * SecurityIdentification22Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification7
 * AlternateSecurityIdentification7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice
 * SecurityIdentification23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification19
 * SecurityIdentification19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification20
 * SecurityIdentification20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification32
 * SecurityIdentification32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification21
 * SecurityIdentification21}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
 * SecurityIdentification25Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification6Choice
 * FinancialInstrumentIdentification6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BasketDescription3
 * BasketDescription3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice
 * FinancialInstrumentIdentification7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification5Choice
 * FinancialInstrumentIdentification5Choice}</li>
 * </ul>
 * </li>
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
 * "SecuritiesIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme."
 * </li>
 * </ul>
 */
public class SecuritiesIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Security for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#Identification
	 * Security.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification5Choice#InstrumentDescription
	 * SecurityIdentification5Choice.InstrumentDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification6Choice#InstrumentDescription
	 * SecurityIdentification6Choice.InstrumentDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification6Choice#Index
	 * FinancialInstrumentIdentification6Choice.Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice#Single
	 * FinancialInstrumentIdentification7Choice.Single}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice#Basket
	 * FinancialInstrumentIdentification7Choice.Basket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification5Choice#Single
	 * FinancialInstrumentIdentification5Choice.Single}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification5Choice#Basket
	 * FinancialInstrumentIdentification5Choice.Basket}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentifiedSecurity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification5Choice.InstrumentDescription, com.tools20022.repository.choice.SecurityIdentification6Choice.InstrumentDescription,
					com.tools20022.repository.choice.FinancialInstrumentIdentification6Choice.Index, com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice.Single,
					com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice.Basket, com.tools20022.repository.choice.FinancialInstrumentIdentification5Choice.Single,
					com.tools20022.repository.choice.FinancialInstrumentIdentification5Choice.Basket);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentifiedSecurity";
			definition = "Security for which an identification is provided.";
			minOccurs = 1;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification of a security by an ISIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINOct2015Identifier
	 * ISINOct2015Identifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7#ISIN
	 * SecurityIdentification7.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#ISIN
	 * SecurityIdentification1Choice.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#ISIN
	 * SecurityIdentification3Choice.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification2Choice#ISIN
	 * SecurityIdentification2Choice.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification11Choice#ISIN
	 * SecurityIdentification11Choice.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14#ISIN
	 * SecurityIdentification14.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15#ISIN
	 * SecurityIdentification15.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification12Choice#ISIN
	 * SecurityIdentification12Choice.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification16#ISIN
	 * SecurityIdentification16.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification4Choice#ISIN
	 * SecurityIdentification4Choice.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#Identification
	 * InvestmentFundTransactionsByFund1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund2#Identification
	 * InvestmentFundTransactionsByFund2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3#ISIN
	 * SecurityIdentification3.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification5Choice#ISIN
	 * SecurityIdentification5Choice.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification6Choice#ISIN
	 * SecurityIdentification6Choice.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification10Choice#ISIN
	 * SecurityIdentification10Choice.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification7Choice#ISIN
	 * SecurityIdentification7Choice.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2#BenchmarkIdentification
	 * BenchmarkCurve2.BenchmarkIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValue1#SecurityIdentification
	 * CollateralValue1.SecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve1#BenchmarkIdentification
	 * BenchmarkCurve1.BenchmarkIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#Identification
	 * InvestmentFundTransactionsByFund3.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralValuation3#ISIN
	 * CollateralValuation3.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InflationIndex1Choice#ISIN
	 * InflationIndex1Choice.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName4Choice#ISIN
	 * BenchmarkCurveName4Choice.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#ISIN
	 * SecurityIdentification22Choice.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#ISIN
	 * SecurityIdentification23Choice.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#ISIN
	 * SecurityIdentification19.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20#ISIN
	 * SecurityIdentification20.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification32#ISIN
	 * SecurityIdentification32.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification21#ISIN
	 * SecurityIdentification21.ISIN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralValuation6#ISIN
	 * CollateralValuation6.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport2#Identification
	 * VolumeCapReport2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrument46Choice#ISIN
	 * FinancialInstrument46Choice.ISIN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument53#ISIN
	 * FinancialInstrument53.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice#ISIN
	 * BenchmarkCurveName6Choice.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#ISIN
	 * SecurityIdentification25Choice.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#Identification
	 * TransparencyDataReport11.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13#Identification
	 * TransparencyDataReport13.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#Identification
	 * TransparencyDataReport12.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport15#Identification
	 * TransparencyDataReport15.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#Identification
	 * TransparencyDataReport10.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#Identification
	 * TransparencyDataReport14.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification6Choice#ISIN
	 * FinancialInstrumentIdentification6Choice.ISIN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument58#ISIN
	 * FinancialInstrument58.ISIN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BasketDescription3#ISIN
	 * BasketDescription3.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrument48Choice#ISIN
	 * FinancialInstrument48Choice.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4#UnderlyingNameIdentification
	 * CreditDefaultSwapDerivative4.UnderlyingNameIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4#ObligationIdentification
	 * CreditDefaultSwapDerivative4.ObligationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentAttributes3Choice#Identification
	 * FinancialInstrumentAttributes3Choice.Identification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a security by an ISIN."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecurityIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityIdentification7.ISIN, com.tools20022.repository.choice.SecurityIdentification1Choice.ISIN,
					com.tools20022.repository.choice.SecurityIdentification3Choice.ISIN, com.tools20022.repository.choice.SecurityIdentification2Choice.ISIN, com.tools20022.repository.choice.SecurityIdentification11Choice.ISIN,
					com.tools20022.repository.msg.SecurityIdentification14.ISIN, com.tools20022.repository.msg.SecurityIdentification15.ISIN, com.tools20022.repository.choice.SecurityIdentification12Choice.ISIN,
					com.tools20022.repository.msg.SecurityIdentification16.ISIN, com.tools20022.repository.choice.SecurityIdentification4Choice.ISIN, com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.Identification,
					com.tools20022.repository.msg.InvestmentFundTransactionsByFund2.Identification, com.tools20022.repository.msg.SecurityIdentification3.ISIN, com.tools20022.repository.choice.SecurityIdentification5Choice.ISIN,
					com.tools20022.repository.choice.SecurityIdentification6Choice.ISIN, com.tools20022.repository.choice.SecurityIdentification10Choice.ISIN, com.tools20022.repository.choice.SecurityIdentification7Choice.ISIN,
					com.tools20022.repository.msg.BenchmarkCurve2.BenchmarkIdentification, com.tools20022.repository.msg.CollateralValue1.SecurityIdentification, com.tools20022.repository.msg.BenchmarkCurve1.BenchmarkIdentification,
					com.tools20022.repository.msg.InvestmentFundTransactionsByFund3.Identification, com.tools20022.repository.msg.CollateralValuation3.ISIN, com.tools20022.repository.choice.InflationIndex1Choice.ISIN,
					com.tools20022.repository.choice.BenchmarkCurveName4Choice.ISIN, com.tools20022.repository.choice.SecurityIdentification22Choice.ISIN, com.tools20022.repository.choice.SecurityIdentification23Choice.ISIN,
					com.tools20022.repository.msg.SecurityIdentification19.ISIN, com.tools20022.repository.msg.SecurityIdentification20.ISIN, com.tools20022.repository.msg.SecurityIdentification32.ISIN,
					com.tools20022.repository.msg.SecurityIdentification21.ISIN, com.tools20022.repository.msg.CollateralValuation6.ISIN, com.tools20022.repository.msg.VolumeCapReport2.Identification,
					com.tools20022.repository.choice.FinancialInstrument46Choice.ISIN, com.tools20022.repository.msg.FinancialInstrument53.ISIN, com.tools20022.repository.choice.BenchmarkCurveName6Choice.ISIN,
					com.tools20022.repository.choice.SecurityIdentification25Choice.ISIN, com.tools20022.repository.msg.TransparencyDataReport11.Identification, com.tools20022.repository.msg.TransparencyDataReport13.Identification,
					com.tools20022.repository.msg.TransparencyDataReport12.Identification, com.tools20022.repository.msg.TransparencyDataReport15.Identification, com.tools20022.repository.msg.TransparencyDataReport10.Identification,
					com.tools20022.repository.msg.TransparencyDataReport14.Identification, com.tools20022.repository.choice.FinancialInstrumentIdentification6Choice.ISIN, com.tools20022.repository.msg.FinancialInstrument58.ISIN,
					com.tools20022.repository.msg.BasketDescription3.ISIN, com.tools20022.repository.choice.FinancialInstrument48Choice.ISIN, com.tools20022.repository.msg.CreditDefaultSwapDerivative4.UnderlyingNameIdentification,
					com.tools20022.repository.msg.CreditDefaultSwapDerivative4.ObligationIdentification, com.tools20022.repository.choice.FinancialInstrumentAttributes3Choice.Identification);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityIdentification";
			definition = "Identification of a security by an ISIN.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}
	};
	/**
	 * Reuters Identification Code (RIC). A numbering system used within the
	 * Reuters system to identify instruments worldwide. The RIC contains an
	 * X-character market specific code (can be the CUSIP or EPIC codes)
	 * followed by a full stop, then the two-digit ISO country code, eg, IBM in
	 * UK is IBM.UK.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RICIdentifier
	 * RICIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#RIC
	 * SecurityIdentification1Choice.RIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#RIC
	 * SecurityIdentification3Choice.RIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#RIC
	 * SecurityIdentification22Choice.RIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#RIC
	 * SecurityIdentification23Choice.RIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#RIC
	 * SecurityIdentification25Choice.RIC}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reuters Identification Code (RIC). A numbering system used within the Reuters system to identify instruments worldwide. The RIC contains an X-character market specific code (can be the CUSIP or EPIC codes) followed by a full stop, then the two-digit ISO country code, eg, IBM in UK is IBM.UK."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RIC = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification1Choice.RIC, com.tools20022.repository.choice.SecurityIdentification3Choice.RIC,
					com.tools20022.repository.choice.SecurityIdentification22Choice.RIC, com.tools20022.repository.choice.SecurityIdentification23Choice.RIC, com.tools20022.repository.choice.SecurityIdentification25Choice.RIC);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RIC";
			definition = "Reuters Identification Code (RIC). A numbering system used within the Reuters system to identify instruments worldwide. The RIC contains an X-character market specific code (can be the CUSIP or EPIC codes) followed by a full stop, then the two-digit ISO country code, eg, IBM in UK is IBM.UK.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RICIdentifier.mmObject();
		}
	};
	/**
	 * Letters that identify a stock traded on a stock exchange. The Ticker
	 * Symbol is a short and convenient way of identifying a stock, eg, RTR.L
	 * for Reuters quoted in London.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TickerIdentifier
	 * TickerIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#TickerSymbol
	 * SecurityIdentification1Choice.TickerSymbol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#TickerSymbol
	 * SecurityIdentification3Choice.TickerSymbol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3#TickerSymbol
	 * SecurityIdentification3.TickerSymbol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#TickerSymbol
	 * SecurityIdentification22Choice.TickerSymbol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#TickerSymbol
	 * SecurityIdentification23Choice.TickerSymbol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#TickerSymbol
	 * SecurityIdentification25Choice.TickerSymbol}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TickerSymbol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Letters that identify a stock traded on a stock exchange. The Ticker Symbol is a short and convenient way of identifying a stock, eg, RTR.L for Reuters quoted in London."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TickerSymbol = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification1Choice.TickerSymbol, com.tools20022.repository.choice.SecurityIdentification3Choice.TickerSymbol,
					com.tools20022.repository.msg.SecurityIdentification3.TickerSymbol, com.tools20022.repository.choice.SecurityIdentification22Choice.TickerSymbol,
					com.tools20022.repository.choice.SecurityIdentification23Choice.TickerSymbol, com.tools20022.repository.choice.SecurityIdentification25Choice.TickerSymbol);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TickerSymbol";
			definition = "Letters that identify a stock traded on a stock exchange. The Ticker Symbol is a short and convenient way of identifying a stock, eg, RTR.L for Reuters quoted in London.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TickerIdentifier.mmObject();
		}
	};
	/**
	 * Identifier of a security assigned by the Bloomberg organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Bloomberg2Identifier
	 * Bloomberg2Identifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#Bloomberg
	 * SecurityIdentification1Choice.Bloomberg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#Bloomberg
	 * SecurityIdentification3Choice.Bloomberg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#Bloomberg
	 * SecurityIdentification22Choice.Bloomberg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#Bloomberg
	 * SecurityIdentification23Choice.Bloomberg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#Bloomberg
	 * SecurityIdentification25Choice.Bloomberg}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bloomberg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a security assigned by the Bloomberg organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Bloomberg = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification1Choice.Bloomberg, com.tools20022.repository.choice.SecurityIdentification3Choice.Bloomberg,
					com.tools20022.repository.choice.SecurityIdentification22Choice.Bloomberg, com.tools20022.repository.choice.SecurityIdentification23Choice.Bloomberg,
					com.tools20022.repository.choice.SecurityIdentification25Choice.Bloomberg);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Bloomberg";
			definition = "Identifier of a security assigned by the Bloomberg organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Bloomberg2Identifier.mmObject();
		}
	};
	/**
	 * Identifier of a security assigned by the Consolidated Tape Association.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ConsolidatedTapeAssociationIdentifier
	 * ConsolidatedTapeAssociationIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#CTA
	 * SecurityIdentification1Choice.CTA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#CTA
	 * SecurityIdentification3Choice.CTA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#CTA
	 * SecurityIdentification22Choice.CTA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#CTA
	 * SecurityIdentification23Choice.CTA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#CTA
	 * SecurityIdentification25Choice.CTA}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a security assigned by the Consolidated Tape Association."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CTA = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification1Choice.CTA, com.tools20022.repository.choice.SecurityIdentification3Choice.CTA,
					com.tools20022.repository.choice.SecurityIdentification22Choice.CTA, com.tools20022.repository.choice.SecurityIdentification23Choice.CTA, com.tools20022.repository.choice.SecurityIdentification25Choice.CTA);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CTA";
			definition = "Identifier of a security assigned by the Consolidated Tape Association.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ConsolidatedTapeAssociationIdentifier.mmObject();
		}
	};
	/**
	 * Identifier of securities issued in Luxembourg. The common code is a
	 * 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.EuroclearClearstreamIdentifier
	 * EuroclearClearstreamIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#Common
	 * SecurityIdentification1Choice.Common}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#Common
	 * SecurityIdentification3Choice.Common}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#Common
	 * SecurityIdentification22Choice.Common}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#Common
	 * SecurityIdentification23Choice.Common}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#Common
	 * SecurityIdentification25Choice.Common}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Common"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of securities issued in Luxembourg.  The common code is a 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Common = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification1Choice.Common, com.tools20022.repository.choice.SecurityIdentification3Choice.Common,
					com.tools20022.repository.choice.SecurityIdentification22Choice.Common, com.tools20022.repository.choice.SecurityIdentification23Choice.Common, com.tools20022.repository.choice.SecurityIdentification25Choice.Common);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Common";
			definition = "Identifier of securities issued in Luxembourg.  The common code is a 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EuroclearClearstreamIdentifier.mmObject();
		}
	};
	/**
	 * Name of the financial instrument in free format text.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#RelatedSecurity
	 * LocalName.RelatedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LocalName LocalName}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount1#FinancialInstrumentName
	 * SecuritiesAccount1.FinancialInstrumentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount4#FinancialInstrumentName
	 * SecuritiesAccount4.FinancialInstrumentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#Name
	 * InvestmentFundTransactionsByFund1.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund2#Name
	 * InvestmentFundTransactionsByFund2.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#Name
	 * InvestmentFundTransactionsByFund3.Name}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the financial instrument in free format text."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Name = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccount1.FinancialInstrumentName, com.tools20022.repository.msg.SecuritiesAccount4.FinancialInstrumentName,
					com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.Name, com.tools20022.repository.msg.InvestmentFundTransactionsByFund2.Name, com.tools20022.repository.msg.InvestmentFundTransactionsByFund3.Name);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of the financial instrument in free format text.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> LocalName.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LocalName.RelatedSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Stock Exchange Daily Official List (SEDOL) number. A code used by the
	 * London Stock Exchange to identify foreign stocks, especially those that
	 * aren't actively traded in the US and don't have a CUSIP number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SEDOLIdentifier
	 * SEDOLIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#SEDOL
	 * SecurityIdentification3Choice.SEDOL}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification2Choice#Sedol
	 * SecurityIdentification2Choice.Sedol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3#SEDOL
	 * SecurityIdentification3.SEDOL}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#SEDOL
	 * SecurityIdentification23Choice.SEDOL}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#SEDOL
	 * SecurityIdentification25Choice.SEDOL}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEDOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Stock Exchange Daily Official List (SEDOL) number.  A code used by the London Stock Exchange to identify foreign stocks, especially those that aren't actively traded in the US and don't have a CUSIP number."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SEDOL = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification3Choice.SEDOL, com.tools20022.repository.choice.SecurityIdentification2Choice.Sedol,
					com.tools20022.repository.msg.SecurityIdentification3.SEDOL, com.tools20022.repository.choice.SecurityIdentification23Choice.SEDOL, com.tools20022.repository.choice.SecurityIdentification25Choice.SEDOL);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SEDOL";
			definition = "Stock Exchange Daily Official List (SEDOL) number.  A code used by the London Stock Exchange to identify foreign stocks, especially those that aren't actively traded in the US and don't have a CUSIP number.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SEDOLIdentifier.mmObject();
		}
	};
	/**
	 * Committee on Uniform Securities and Identification Procedures (CUSIP).
	 * The standards body that created and maintains the securities
	 * classification system in the US. The CUSIP is composed of a 9-character
	 * number that uniquely identifies a particular security. Non-US securities
	 * have a similar number called the CINS number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CUSIPIdentifier
	 * CUSIPIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#CUSIP
	 * SecurityIdentification3Choice.CUSIP}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3#CUSIP
	 * SecurityIdentification3.CUSIP}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#CUSIP
	 * SecurityIdentification23Choice.CUSIP}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#CUSIP
	 * SecurityIdentification25Choice.CUSIP}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Committee on Uniform Securities and Identification Procedures (CUSIP). The standards body that created and maintains the securities classification system in the US. The CUSIP is composed of a 9-character number that uniquely identifies a particular security.  Non-US securities have a similar number called the CINS number."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CUSIP = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification3Choice.CUSIP, com.tools20022.repository.msg.SecurityIdentification3.CUSIP,
					com.tools20022.repository.choice.SecurityIdentification23Choice.CUSIP, com.tools20022.repository.choice.SecurityIdentification25Choice.CUSIP);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CUSIP";
			definition = "Committee on Uniform Securities and Identification Procedures (CUSIP). The standards body that created and maintains the securities classification system in the US. The CUSIP is composed of a 9-character number that uniquely identifies a particular security.  Non-US securities have a similar number called the CINS number.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CUSIPIdentifier.mmObject();
		}
	};
	/**
	 * Identifier of a security assigned by the Japanese QUICK identification
	 * scheme for financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.QUICKIdentifier
	 * QUICKIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#QUICK
	 * SecurityIdentification3Choice.QUICK}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3#QUICK
	 * SecurityIdentification3.QUICK}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#QUICK
	 * SecurityIdentification23Choice.QUICK}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#QUICK
	 * SecurityIdentification25Choice.QUICK}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QUICK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a security assigned by the Japanese QUICK identification scheme for financial instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute QUICK = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification3Choice.QUICK, com.tools20022.repository.msg.SecurityIdentification3.QUICK,
					com.tools20022.repository.choice.SecurityIdentification23Choice.QUICK, com.tools20022.repository.choice.SecurityIdentification25Choice.QUICK);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QUICK";
			definition = "Identifier of a security assigned by the Japanese QUICK identification scheme for financial instruments.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> QUICKIdentifier.mmObject();
		}
	};
	/**
	 * Wertpapier Kenn-nummer. A number issued in Germany by the Wertpapier
	 * Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains
	 * 6-digits, but no check digit. There are different ranges of numbers
	 * representing different classes of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.WertpapierIdentifier
	 * WertpapierIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#Wertpapier
	 * SecurityIdentification3Choice.Wertpapier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#Wertpapier
	 * SecurityIdentification23Choice.Wertpapier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#Wertpapier
	 * SecurityIdentification25Choice.Wertpapier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wertpapier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Wertpapier Kenn-nummer.  A number issued in Germany by the Wertpapier Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains 6-digits, but no check digit. There are different ranges of numbers representing different classes of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Wertpapier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification3Choice.Wertpapier, com.tools20022.repository.choice.SecurityIdentification23Choice.Wertpapier,
					com.tools20022.repository.choice.SecurityIdentification25Choice.Wertpapier);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Wertpapier";
			definition = "Wertpapier Kenn-nummer.  A number issued in Germany by the Wertpapier Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains 6-digits, but no check digit. There are different ranges of numbers representing different classes of securities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> WertpapierIdentifier.mmObject();
		}
	};
	/**
	 * Identifier for Dutch securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DutchIdentifier
	 * DutchIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#Dutch
	 * SecurityIdentification3Choice.Dutch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#Dutch
	 * SecurityIdentification23Choice.Dutch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#Dutch
	 * SecurityIdentification25Choice.Dutch}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dutch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier for Dutch securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Dutch = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification3Choice.Dutch, com.tools20022.repository.choice.SecurityIdentification23Choice.Dutch,
					com.tools20022.repository.choice.SecurityIdentification25Choice.Dutch);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dutch";
			definition = "Identifier for Dutch securities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DutchIdentifier.mmObject();
		}
	};
	/**
	 * Identifier for Swiss securities assigned by Telekurs Financial, the Swiss
	 * numbering agency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ValorenIdentifier
	 * ValorenIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#Valoren
	 * SecurityIdentification3Choice.Valoren}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#Valoren
	 * SecurityIdentification23Choice.Valoren}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#Valoren
	 * SecurityIdentification25Choice.Valoren}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Valoren"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier for Swiss securities assigned by Telekurs Financial, the Swiss numbering agency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Valoren = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification3Choice.Valoren, com.tools20022.repository.choice.SecurityIdentification23Choice.Valoren,
					com.tools20022.repository.choice.SecurityIdentification25Choice.Valoren);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Valoren";
			definition = "Identifier for Swiss securities assigned by Telekurs Financial, the Swiss numbering agency.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ValorenIdentifier.mmObject();
		}
	};
	/**
	 * Identifier for French securities assigned by the Societe
	 * Interprofessionnelle Pour La Compensation des Valeurs Mobilieres in
	 * France. The Sicovam is composed of 5-digits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SicovamIdentifier
	 * SicovamIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#Sicovam
	 * SecurityIdentification3Choice.Sicovam}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#Sicovam
	 * SecurityIdentification23Choice.Sicovam}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#Sicovam
	 * SecurityIdentification25Choice.Sicovam}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sicovam"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier for French securities assigned by the Societe Interprofessionnelle Pour La Compensation des Valeurs Mobilieres in France.  The Sicovam is composed of 5-digits."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Sicovam = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification3Choice.Sicovam, com.tools20022.repository.choice.SecurityIdentification23Choice.Sicovam,
					com.tools20022.repository.choice.SecurityIdentification25Choice.Sicovam);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sicovam";
			definition = "Identifier for French securities assigned by the Societe Interprofessionnelle Pour La Compensation des Valeurs Mobilieres in France.  The Sicovam is composed of 5-digits.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SicovamIdentifier.mmObject();
		}
	};
	/**
	 * Identifier for Belgian securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BelgianIdentifier
	 * BelgianIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#Belgian
	 * SecurityIdentification3Choice.Belgian}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#Belgian
	 * SecurityIdentification23Choice.Belgian}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#Belgian
	 * SecurityIdentification25Choice.Belgian}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Belgian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier for Belgian securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Belgian = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification3Choice.Belgian, com.tools20022.repository.choice.SecurityIdentification23Choice.Belgian,
					com.tools20022.repository.choice.SecurityIdentification25Choice.Belgian);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Belgian";
			definition = "Identifier for Belgian securities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BelgianIdentifier.mmObject();
		}
	};
	/**
	 * Identifies the suffix of the security identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification1#Suffix
	 * OtherIdentification1.Suffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification2#Suffix
	 * OtherIdentification2.Suffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification3#Suffix
	 * OtherIdentification3.Suffix}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationSuffix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the suffix of the security identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IdentificationSuffix = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherIdentification1.Suffix, com.tools20022.repository.msg.OtherIdentification2.Suffix, com.tools20022.repository.msg.OtherIdentification3.Suffix);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationSuffix";
			definition = "Identifies the suffix of the security identification.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Proprietary identification of a security assigned by an institution or
	 * organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedSecuritiesIdentification
	 * GenericIdentification.RelatedSecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification7#IdentificationSource
	 * AlternateSecurityIdentification7.IdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentAttributes3Choice#Other
	 * FinancialInstrumentAttributes3Choice.Other}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification of a security assigned by an institution or organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd GenericIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlternateSecurityIdentification7.IdentificationSource, com.tools20022.repository.choice.FinancialInstrumentAttributes3Choice.Other);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GenericIdentification";
			definition = "Proprietary identification of a security assigned by an institution or organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.RelatedSecuritiesIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the period during which an identification is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedSecuritiesIdentification
	 * DateTimePeriod.RelatedSecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period during which an identification is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which an identification is valid.";
			minOccurs = 0;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedSecuritiesIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market(s) on which the trading identification is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#ListedSecurityTradingIdentification
	 * TradingMarket.ListedSecurityTradingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableTradingMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the trading identification is used."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ApplicableTradingMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicableTradingMarket";
			definition = "Market(s) on which the trading identification is used.";
			minOccurs = 0;
			type_lazy = () -> TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.ListedSecurityTradingIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the main identification of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#RelatedOtherIdentification
	 * SecuritiesIdentification.RelatedOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the main identification of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PrimeIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrimeIdentification";
			definition = "Specifies the main identification of a security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.RelatedOtherIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Alternate security identification(s) related to the security trading
	 * identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#PrimeIdentification
	 * SecuritiesIdentification.PrimeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Alternate security identification(s) related to the security trading identification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOtherIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOtherIdentification";
			definition = "Alternate security identification(s) related to the security trading identification.";
			minOccurs = 1;
			type_lazy = () -> SecuritiesIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.PrimeIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Security identifier specific to a trading market or markets, for example,
	 * Ticker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security identifier specific to a trading market or markets, for example, Ticker."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradingIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingIdentification";
			definition = "Security identifier specific to a trading market or markets, for example, Ticker.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesIdentification";
				definition = "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Identification, com.tools20022.repository.entity.SecuritiesIdentification.PrimeIdentification,
						com.tools20022.repository.entity.SecuritiesIdentification.RelatedOtherIdentification, com.tools20022.repository.entity.GenericIdentification.RelatedSecuritiesIdentification,
						com.tools20022.repository.entity.LocalName.RelatedSecurity, com.tools20022.repository.entity.TradingMarket.ListedSecurityTradingIdentification,
						com.tools20022.repository.entity.DateTimePeriod.RelatedSecuritiesIdentification);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityIdentification7.OtherIdentification, com.tools20022.repository.msg.SecurityIdentification7.Description,
						com.tools20022.repository.msg.SecurityIdentification1.Identification, com.tools20022.repository.choice.SecurityIdentification1Choice.AlternateIdentification,
						com.tools20022.repository.choice.SecurityIdentification3Choice.OtherProprietaryIdentification, com.tools20022.repository.msg.AlternateIdentification1.IdentificationSource,
						com.tools20022.repository.choice.SecurityIdentification11Choice.OtherIdentification, com.tools20022.repository.msg.SecurityIdentification11.Identification,
						com.tools20022.repository.msg.SecurityIdentification11.Description, com.tools20022.repository.msg.SecurityIdentification14.OtherIdentification, com.tools20022.repository.msg.SecurityIdentification14.Description,
						com.tools20022.repository.msg.SecurityIdentification15.OtherIdentification, com.tools20022.repository.msg.SecurityIdentification15.Description,
						com.tools20022.repository.msg.AlternateIdentification2.IdentificationSource, com.tools20022.repository.choice.SecurityIdentification12Choice.OtherIdentification,
						com.tools20022.repository.msg.SecurityIdentification12.Identification, com.tools20022.repository.msg.SecurityIdentification12.Description, com.tools20022.repository.msg.SecurityIdentification16.OtherIdentification,
						com.tools20022.repository.msg.SecurityIdentification16.Description, com.tools20022.repository.msg.AlternateSecurityIdentification2.Type, com.tools20022.repository.choice.SecurityIdentification4Choice.Proprietary,
						com.tools20022.repository.msg.SecurityIdentification3.OtherIdentification, com.tools20022.repository.choice.SecurityIdentification5Choice.OtherIdentification,
						com.tools20022.repository.choice.SecurityIdentification6Choice.OtherIdentification, com.tools20022.repository.choice.SecurityIdentification10Choice.OtherIdentification,
						com.tools20022.repository.msg.SecurityIdentification9.SecurityIdentification, com.tools20022.repository.msg.SecurityIdentification9.Description,
						com.tools20022.repository.choice.SecurityIdentification7Choice.OtherProprietaryIdentification, com.tools20022.repository.msg.SecurityIdentification8.SecurityIdentification,
						com.tools20022.repository.msg.SecurityIdentification8.Description, com.tools20022.repository.msg.FinancialInstrumentIdentificationValidity1.FinancialInstrumentIdentification,
						com.tools20022.repository.msg.TriggeringInstructions.TriggerSecurityDetails, com.tools20022.repository.msg.ReportItem1.FinancialInstrumentIdentification,
						com.tools20022.repository.msg.AggregateHoldingBalance1.FinancialInstrumentIdentification, com.tools20022.repository.choice.SecurityIdentification22Choice.AlternateIdentification,
						com.tools20022.repository.choice.SecurityIdentification23Choice.OtherProprietaryIdentification, com.tools20022.repository.msg.SecurityIdentification19.OtherIdentification,
						com.tools20022.repository.msg.SecurityIdentification19.Description, com.tools20022.repository.msg.SecurityIdentification20.OtherIdentification, com.tools20022.repository.msg.SecurityIdentification20.Description,
						com.tools20022.repository.msg.SecurityIdentification32.OtherIdentification, com.tools20022.repository.msg.SecurityIdentification32.Description,
						com.tools20022.repository.msg.SecurityIdentification21.OtherIdentification, com.tools20022.repository.msg.SecurityIdentification21.Description,
						com.tools20022.repository.choice.SecurityIdentification25Choice.OtherProprietaryIdentification, com.tools20022.repository.msg.SwapLegIdentification2.SwapIn,
						com.tools20022.repository.msg.SwapLegIdentification2.SwapOut);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesIdentification.IdentifiedSecurity, com.tools20022.repository.entity.SecuritiesIdentification.SecurityIdentification,
						com.tools20022.repository.entity.SecuritiesIdentification.RIC, com.tools20022.repository.entity.SecuritiesIdentification.TickerSymbol, com.tools20022.repository.entity.SecuritiesIdentification.Bloomberg,
						com.tools20022.repository.entity.SecuritiesIdentification.CTA, com.tools20022.repository.entity.SecuritiesIdentification.Common, com.tools20022.repository.entity.SecuritiesIdentification.Name,
						com.tools20022.repository.entity.SecuritiesIdentification.SEDOL, com.tools20022.repository.entity.SecuritiesIdentification.CUSIP, com.tools20022.repository.entity.SecuritiesIdentification.QUICK,
						com.tools20022.repository.entity.SecuritiesIdentification.Wertpapier, com.tools20022.repository.entity.SecuritiesIdentification.Dutch, com.tools20022.repository.entity.SecuritiesIdentification.Valoren,
						com.tools20022.repository.entity.SecuritiesIdentification.Sicovam, com.tools20022.repository.entity.SecuritiesIdentification.Belgian, com.tools20022.repository.entity.SecuritiesIdentification.IdentificationSuffix,
						com.tools20022.repository.entity.SecuritiesIdentification.GenericIdentification, com.tools20022.repository.entity.SecuritiesIdentification.ValidityPeriod,
						com.tools20022.repository.entity.SecuritiesIdentification.ApplicableTradingMarket, com.tools20022.repository.entity.SecuritiesIdentification.PrimeIdentification,
						com.tools20022.repository.entity.SecuritiesIdentification.RelatedOtherIdentification, com.tools20022.repository.entity.SecuritiesIdentification.TradingIdentification);
				derivationComponent_lazy = () -> Arrays.asList(AlternateSecurityIdentification3.mmObject(), SecurityIdentification7.mmObject(), SecurityIdentification1.mmObject(), AlternateSecurityIdentification1.mmObject(),
						SecurityIdentification1Choice.mmObject(), SecurityIdentification3Choice.mmObject(), SecurityIdentification2Choice.mmObject(), AlternateIdentification1.mmObject(), SecurityIdentification11Choice.mmObject(),
						SecurityIdentification11.mmObject(), OtherIdentification1.mmObject(), SecurityIdentification14.mmObject(), OtherIdentification2.mmObject(), SecurityIdentification15.mmObject(), AlternateIdentification2.mmObject(),
						SecurityIdentification12Choice.mmObject(), SecurityIdentification12.mmObject(), OtherIdentification3.mmObject(), SecurityIdentification16.mmObject(), AlternateSecurityIdentification2.mmObject(),
						SecurityIdentification4Choice.mmObject(), AlternateFinancialInstrumentIdentification1.mmObject(), SecurityIdentification3.mmObject(), SecurityIdentification5Choice.mmObject(),
						SecurityIdentification6Choice.mmObject(), SecurityIdentification10Choice.mmObject(), SecurityIdentification9.mmObject(), AlternateSecurityIdentification4.mmObject(), SecurityIdentification7Choice.mmObject(),
						SecurityIdentification8.mmObject(), FinancialInstrumentIdentificationValidity1.mmObject(), OtherIdentification2SD1.mmObject(), SecurityIdentification14SD1.mmObject(), OtherIdentification4.mmObject(),
						SecurityIdentification22Choice.mmObject(), AlternateSecurityIdentification7.mmObject(), SecurityIdentification23Choice.mmObject(), SecurityIdentification19.mmObject(), SecurityIdentification20.mmObject(),
						SecurityIdentification32.mmObject(), SecurityIdentification21.mmObject(), SecurityIdentification25Choice.mmObject(), FinancialInstrumentIdentification6Choice.mmObject(), BasketDescription3.mmObject(),
						FinancialInstrumentIdentification7Choice.mmObject(), FinancialInstrumentIdentification5Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}