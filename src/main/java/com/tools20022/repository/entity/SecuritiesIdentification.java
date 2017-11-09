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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmIdentification
 * Security.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmPrimeIdentification
 * SecuritiesIdentification.mmPrimeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmRelatedOtherIdentification
 * SecuritiesIdentification.mmRelatedOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSecuritiesIdentification
 * GenericIdentification.mmRelatedSecuritiesIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LocalName#mmRelatedSecurity
 * LocalName.mmRelatedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListedSecurityTradingIdentification
 * TradingMarket.mmListedSecurityTradingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSecuritiesIdentification
 * DateTimePeriod.mmRelatedSecuritiesIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7#mmOtherIdentification
 * SecurityIdentification7.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7#mmDescription
 * SecurityIdentification7.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification1#mmIdentification
 * SecurityIdentification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmAlternateIdentification
 * SecurityIdentification1Choice.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmOtherProprietaryIdentification
 * SecurityIdentification3Choice.mmOtherProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification1#mmIdentificationSource
 * AlternateIdentification1.mmIdentificationSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification11Choice#mmOtherIdentification
 * SecurityIdentification11Choice.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification11#mmIdentification
 * SecurityIdentification11.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification11#mmDescription
 * SecurityIdentification11.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14#mmOtherIdentification
 * SecurityIdentification14.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14#mmDescription
 * SecurityIdentification14.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15#mmOtherIdentification
 * SecurityIdentification15.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15#mmDescription
 * SecurityIdentification15.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification2#mmIdentificationSource
 * AlternateIdentification2.mmIdentificationSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification12Choice#mmOtherIdentification
 * SecurityIdentification12Choice.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification12#mmIdentification
 * SecurityIdentification12.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification12#mmDescription
 * SecurityIdentification12.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification16#mmOtherIdentification
 * SecurityIdentification16.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification16#mmDescription
 * SecurityIdentification16.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification2#mmType
 * AlternateSecurityIdentification2.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification4Choice#mmProprietary
 * SecurityIdentification4Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3#mmOtherIdentification
 * SecurityIdentification3.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification5Choice#mmOtherIdentification
 * SecurityIdentification5Choice.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification6Choice#mmOtherIdentification
 * SecurityIdentification6Choice.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification10Choice#mmOtherIdentification
 * SecurityIdentification10Choice.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification9#mmSecurityIdentification
 * SecurityIdentification9.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification9#mmDescription
 * SecurityIdentification9.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification7Choice#mmOtherProprietaryIdentification
 * SecurityIdentification7Choice.mmOtherProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification8#mmSecurityIdentification
 * SecurityIdentification8.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification8#mmDescription
 * SecurityIdentification8.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentIdentificationValidity1#mmFinancialInstrumentIdentification
 * FinancialInstrumentIdentificationValidity1.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#mmTriggerSecurityDetails
 * TriggeringInstructions.mmTriggerSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportItem1#mmFinancialInstrumentIdentification
 * ReportItem1.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1#mmFinancialInstrumentIdentification
 * AggregateHoldingBalance1.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmAlternateIdentification
 * SecurityIdentification22Choice.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmOtherProprietaryIdentification
 * SecurityIdentification23Choice.mmOtherProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#mmOtherIdentification
 * SecurityIdentification19.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#mmDescription
 * SecurityIdentification19.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20#mmOtherIdentification
 * SecurityIdentification20.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20#mmDescription
 * SecurityIdentification20.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification32#mmOtherIdentification
 * SecurityIdentification32.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification32#mmDescription
 * SecurityIdentification32.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification21#mmOtherIdentification
 * SecurityIdentification21.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification21#mmDescription
 * SecurityIdentification21.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmOtherProprietaryIdentification
 * SecurityIdentification25Choice.mmOtherProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwapLegIdentification2#mmSwapIn
 * SwapLegIdentification2.mmSwapIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwapLegIdentification2#mmSwapOut
 * SwapLegIdentification2.mmSwapOut}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmIdentifiedSecurity
 * SecuritiesIdentification.mmIdentifiedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
 * SecuritiesIdentification.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmRIC
 * SecuritiesIdentification.mmRIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmTickerSymbol
 * SecuritiesIdentification.mmTickerSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmBloomberg
 * SecuritiesIdentification.mmBloomberg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmCTA
 * SecuritiesIdentification.mmCTA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmCommon
 * SecuritiesIdentification.mmCommon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmName
 * SecuritiesIdentification.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSEDOL
 * SecuritiesIdentification.mmSEDOL}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmCUSIP
 * SecuritiesIdentification.mmCUSIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmQUICK
 * SecuritiesIdentification.mmQUICK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmWertpapier
 * SecuritiesIdentification.mmWertpapier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmDutch
 * SecuritiesIdentification.mmDutch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmValoren
 * SecuritiesIdentification.mmValoren}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSicovam
 * SecuritiesIdentification.mmSicovam}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmBelgian
 * SecuritiesIdentification.mmBelgian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmIdentificationSuffix
 * SecuritiesIdentification.mmIdentificationSuffix}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmGenericIdentification
 * SecuritiesIdentification.mmGenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmValidityPeriod
 * SecuritiesIdentification.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmApplicableTradingMarket
 * SecuritiesIdentification.mmApplicableTradingMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmPrimeIdentification
 * SecuritiesIdentification.mmPrimeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmRelatedOtherIdentification
 * SecuritiesIdentification.mmRelatedOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmTradingIdentification
 * SecuritiesIdentification.mmTradingIdentification}</li>
 * </ul>
 * </li>
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
 * "SecuritiesIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme."
 * </li>
 * </ul>
 */
public class SecuritiesIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Security> identifiedSecurity;
	/**
	 * Security for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification5Choice#mmInstrumentDescription
	 * SecurityIdentification5Choice.mmInstrumentDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification6Choice#mmInstrumentDescription
	 * SecurityIdentification6Choice.mmInstrumentDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification6Choice#mmIndex
	 * FinancialInstrumentIdentification6Choice.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice#mmSingle
	 * FinancialInstrumentIdentification7Choice.mmSingle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice#mmBasket
	 * FinancialInstrumentIdentification7Choice.mmBasket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification5Choice#mmSingle
	 * FinancialInstrumentIdentification5Choice.mmSingle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification5Choice#mmBasket
	 * FinancialInstrumentIdentification5Choice.mmBasket}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmIdentifiedSecurity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification5Choice.mmInstrumentDescription, SecurityIdentification6Choice.mmInstrumentDescription, FinancialInstrumentIdentification6Choice.mmIndex,
					FinancialInstrumentIdentification7Choice.mmSingle, FinancialInstrumentIdentification7Choice.mmBasket, FinancialInstrumentIdentification5Choice.mmSingle, FinancialInstrumentIdentification5Choice.mmBasket);
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedSecurity";
			definition = "Security for which an identification is provided.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected ISINOct2015Identifier securityIdentification;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7#mmISIN
	 * SecurityIdentification7.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmISIN
	 * SecurityIdentification1Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmISIN
	 * SecurityIdentification3Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification2Choice#mmISIN
	 * SecurityIdentification2Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification11Choice#mmISIN
	 * SecurityIdentification11Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14#mmISIN
	 * SecurityIdentification14.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15#mmISIN
	 * SecurityIdentification15.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification12Choice#mmISIN
	 * SecurityIdentification12Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification16#mmISIN
	 * SecurityIdentification16.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification4Choice#mmISIN
	 * SecurityIdentification4Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#mmIdentification
	 * InvestmentFundTransactionsByFund1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund2#mmIdentification
	 * InvestmentFundTransactionsByFund2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3#mmISIN
	 * SecurityIdentification3.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification5Choice#mmISIN
	 * SecurityIdentification5Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification6Choice#mmISIN
	 * SecurityIdentification6Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification10Choice#mmISIN
	 * SecurityIdentification10Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification7Choice#mmISIN
	 * SecurityIdentification7Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2#mmBenchmarkIdentification
	 * BenchmarkCurve2.mmBenchmarkIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValue1#mmSecurityIdentification
	 * CollateralValue1.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve1#mmBenchmarkIdentification
	 * BenchmarkCurve1.mmBenchmarkIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#mmIdentification
	 * InvestmentFundTransactionsByFund3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation3#mmISIN
	 * CollateralValuation3.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InflationIndex1Choice#mmISIN
	 * InflationIndex1Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName4Choice#mmISIN
	 * BenchmarkCurveName4Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmISIN
	 * SecurityIdentification22Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmISIN
	 * SecurityIdentification23Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#mmISIN
	 * SecurityIdentification19.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20#mmISIN
	 * SecurityIdentification20.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification32#mmISIN
	 * SecurityIdentification32.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification21#mmISIN
	 * SecurityIdentification21.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation6#mmISIN
	 * CollateralValuation6.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport2#mmIdentification
	 * VolumeCapReport2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrument46Choice#mmISIN
	 * FinancialInstrument46Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument53#mmISIN
	 * FinancialInstrument53.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice#mmISIN
	 * BenchmarkCurveName6Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmISIN
	 * SecurityIdentification25Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmIdentification
	 * TransparencyDataReport11.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13#mmIdentification
	 * TransparencyDataReport13.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#mmIdentification
	 * TransparencyDataReport12.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport15#mmIdentification
	 * TransparencyDataReport15.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmIdentification
	 * TransparencyDataReport10.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#mmIdentification
	 * TransparencyDataReport14.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification6Choice#mmISIN
	 * FinancialInstrumentIdentification6Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument58#mmISIN
	 * FinancialInstrument58.mmISIN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BasketDescription3#mmISIN
	 * BasketDescription3.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrument48Choice#mmISIN
	 * FinancialInstrument48Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4#mmUnderlyingNameIdentification
	 * CreditDefaultSwapDerivative4.mmUnderlyingNameIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4#mmObligationIdentification
	 * CreditDefaultSwapDerivative4.mmObligationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentAttributes3Choice#mmIdentification
	 * FinancialInstrumentAttributes3Choice.mmIdentification}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmSecurityIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification7.mmISIN, SecurityIdentification1Choice.mmISIN, SecurityIdentification3Choice.mmISIN, SecurityIdentification2Choice.mmISIN, SecurityIdentification11Choice.mmISIN,
					SecurityIdentification14.mmISIN, SecurityIdentification15.mmISIN, SecurityIdentification12Choice.mmISIN, SecurityIdentification16.mmISIN, SecurityIdentification4Choice.mmISIN,
					InvestmentFundTransactionsByFund1.mmIdentification, InvestmentFundTransactionsByFund2.mmIdentification, SecurityIdentification3.mmISIN, SecurityIdentification5Choice.mmISIN, SecurityIdentification6Choice.mmISIN,
					SecurityIdentification10Choice.mmISIN, SecurityIdentification7Choice.mmISIN, BenchmarkCurve2.mmBenchmarkIdentification, CollateralValue1.mmSecurityIdentification, BenchmarkCurve1.mmBenchmarkIdentification,
					InvestmentFundTransactionsByFund3.mmIdentification, CollateralValuation3.mmISIN, InflationIndex1Choice.mmISIN, BenchmarkCurveName4Choice.mmISIN, SecurityIdentification22Choice.mmISIN,
					SecurityIdentification23Choice.mmISIN, SecurityIdentification19.mmISIN, SecurityIdentification20.mmISIN, SecurityIdentification32.mmISIN, SecurityIdentification21.mmISIN, CollateralValuation6.mmISIN,
					VolumeCapReport2.mmIdentification, FinancialInstrument46Choice.mmISIN, FinancialInstrument53.mmISIN, BenchmarkCurveName6Choice.mmISIN, SecurityIdentification25Choice.mmISIN, TransparencyDataReport11.mmIdentification,
					TransparencyDataReport13.mmIdentification, TransparencyDataReport12.mmIdentification, TransparencyDataReport15.mmIdentification, TransparencyDataReport10.mmIdentification, TransparencyDataReport14.mmIdentification,
					FinancialInstrumentIdentification6Choice.mmISIN, FinancialInstrument58.mmISIN, BasketDescription3.mmISIN, FinancialInstrument48Choice.mmISIN, CreditDefaultSwapDerivative4.mmUnderlyingNameIdentification,
					CreditDefaultSwapDerivative4.mmObligationIdentification, FinancialInstrumentAttributes3Choice.mmIdentification);
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityIdentification";
			definition = "Identification of a security by an ISIN.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}
	};
	protected RICIdentifier rIC;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmRIC
	 * SecurityIdentification1Choice.mmRIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmRIC
	 * SecurityIdentification3Choice.mmRIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmRIC
	 * SecurityIdentification22Choice.mmRIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmRIC
	 * SecurityIdentification23Choice.mmRIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmRIC
	 * SecurityIdentification25Choice.mmRIC}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmRIC = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification1Choice.mmRIC, SecurityIdentification3Choice.mmRIC, SecurityIdentification22Choice.mmRIC, SecurityIdentification23Choice.mmRIC, SecurityIdentification25Choice.mmRIC);
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RIC";
			definition = "Reuters Identification Code (RIC). A numbering system used within the Reuters system to identify instruments worldwide. The RIC contains an X-character market specific code (can be the CUSIP or EPIC codes) followed by a full stop, then the two-digit ISO country code, eg, IBM in UK is IBM.UK.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RICIdentifier.mmObject();
		}
	};
	protected TickerIdentifier tickerSymbol;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmTickerSymbol
	 * SecurityIdentification1Choice.mmTickerSymbol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmTickerSymbol
	 * SecurityIdentification3Choice.mmTickerSymbol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3#mmTickerSymbol
	 * SecurityIdentification3.mmTickerSymbol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmTickerSymbol
	 * SecurityIdentification22Choice.mmTickerSymbol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmTickerSymbol
	 * SecurityIdentification23Choice.mmTickerSymbol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmTickerSymbol
	 * SecurityIdentification25Choice.mmTickerSymbol}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTickerSymbol = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification1Choice.mmTickerSymbol, SecurityIdentification3Choice.mmTickerSymbol, SecurityIdentification3.mmTickerSymbol, SecurityIdentification22Choice.mmTickerSymbol,
					SecurityIdentification23Choice.mmTickerSymbol, SecurityIdentification25Choice.mmTickerSymbol);
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TickerSymbol";
			definition = "Letters that identify a stock traded on a stock exchange. The Ticker Symbol is a short and convenient way of identifying a stock, eg, RTR.L for Reuters quoted in London.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TickerIdentifier.mmObject();
		}
	};
	protected Bloomberg2Identifier bloomberg;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmBloomberg
	 * SecurityIdentification1Choice.mmBloomberg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmBloomberg
	 * SecurityIdentification3Choice.mmBloomberg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmBloomberg
	 * SecurityIdentification22Choice.mmBloomberg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmBloomberg
	 * SecurityIdentification23Choice.mmBloomberg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmBloomberg
	 * SecurityIdentification25Choice.mmBloomberg}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmBloomberg = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification1Choice.mmBloomberg, SecurityIdentification3Choice.mmBloomberg, SecurityIdentification22Choice.mmBloomberg, SecurityIdentification23Choice.mmBloomberg,
					SecurityIdentification25Choice.mmBloomberg);
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bloomberg";
			definition = "Identifier of a security assigned by the Bloomberg organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Bloomberg2Identifier.mmObject();
		}
	};
	protected ConsolidatedTapeAssociationIdentifier cTA;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmCTA
	 * SecurityIdentification1Choice.mmCTA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmCTA
	 * SecurityIdentification3Choice.mmCTA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmCTA
	 * SecurityIdentification22Choice.mmCTA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmCTA
	 * SecurityIdentification23Choice.mmCTA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmCTA
	 * SecurityIdentification25Choice.mmCTA}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCTA = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification1Choice.mmCTA, SecurityIdentification3Choice.mmCTA, SecurityIdentification22Choice.mmCTA, SecurityIdentification23Choice.mmCTA, SecurityIdentification25Choice.mmCTA);
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CTA";
			definition = "Identifier of a security assigned by the Consolidated Tape Association.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConsolidatedTapeAssociationIdentifier.mmObject();
		}
	};
	protected EuroclearClearstreamIdentifier common;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmCommon
	 * SecurityIdentification1Choice.mmCommon}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmCommon
	 * SecurityIdentification3Choice.mmCommon}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmCommon
	 * SecurityIdentification22Choice.mmCommon}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmCommon
	 * SecurityIdentification23Choice.mmCommon}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmCommon
	 * SecurityIdentification25Choice.mmCommon}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCommon = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification1Choice.mmCommon, SecurityIdentification3Choice.mmCommon, SecurityIdentification22Choice.mmCommon, SecurityIdentification23Choice.mmCommon,
					SecurityIdentification25Choice.mmCommon);
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Common";
			definition = "Identifier of securities issued in Luxembourg.  The common code is a 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EuroclearClearstreamIdentifier.mmObject();
		}
	};
	protected LocalName name;
	/**
	 * Name of the financial instrument in free format text.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmRelatedSecurity
	 * LocalName.mmRelatedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LocalName LocalName}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount1#mmFinancialInstrumentName
	 * SecuritiesAccount1.mmFinancialInstrumentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount4#mmFinancialInstrumentName
	 * SecuritiesAccount4.mmFinancialInstrumentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#mmName
	 * InvestmentFundTransactionsByFund1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund2#mmName
	 * InvestmentFundTransactionsByFund2.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#mmName
	 * InvestmentFundTransactionsByFund3.mmName}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmName = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesAccount1.mmFinancialInstrumentName, SecuritiesAccount4.mmFinancialInstrumentName, InvestmentFundTransactionsByFund1.mmName, InvestmentFundTransactionsByFund2.mmName,
					InvestmentFundTransactionsByFund3.mmName);
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of the financial instrument in free format text.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LocalName.mmRelatedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LocalName.mmObject();
		}
	};
	protected SEDOLIdentifier sEDOL;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmSEDOL
	 * SecurityIdentification3Choice.mmSEDOL}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification2Choice#mmSedol
	 * SecurityIdentification2Choice.mmSedol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3#mmSEDOL
	 * SecurityIdentification3.mmSEDOL}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmSEDOL
	 * SecurityIdentification23Choice.mmSEDOL}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmSEDOL
	 * SecurityIdentification25Choice.mmSEDOL}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmSEDOL = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays
					.asList(SecurityIdentification3Choice.mmSEDOL, SecurityIdentification2Choice.mmSedol, SecurityIdentification3.mmSEDOL, SecurityIdentification23Choice.mmSEDOL, SecurityIdentification25Choice.mmSEDOL);
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SEDOL";
			definition = "Stock Exchange Daily Official List (SEDOL) number.  A code used by the London Stock Exchange to identify foreign stocks, especially those that aren't actively traded in the US and don't have a CUSIP number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SEDOLIdentifier.mmObject();
		}
	};
	protected CUSIPIdentifier cUSIP;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmCUSIP
	 * SecurityIdentification3Choice.mmCUSIP}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3#mmCUSIP
	 * SecurityIdentification3.mmCUSIP}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmCUSIP
	 * SecurityIdentification23Choice.mmCUSIP}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmCUSIP
	 * SecurityIdentification25Choice.mmCUSIP}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCUSIP = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmCUSIP, SecurityIdentification3.mmCUSIP, SecurityIdentification23Choice.mmCUSIP, SecurityIdentification25Choice.mmCUSIP);
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CUSIP";
			definition = "Committee on Uniform Securities and Identification Procedures (CUSIP). The standards body that created and maintains the securities classification system in the US. The CUSIP is composed of a 9-character number that uniquely identifies a particular security.  Non-US securities have a similar number called the CINS number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CUSIPIdentifier.mmObject();
		}
	};
	protected QUICKIdentifier qUICK;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmQUICK
	 * SecurityIdentification3Choice.mmQUICK}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3#mmQUICK
	 * SecurityIdentification3.mmQUICK}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmQUICK
	 * SecurityIdentification23Choice.mmQUICK}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmQUICK
	 * SecurityIdentification25Choice.mmQUICK}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmQUICK = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmQUICK, SecurityIdentification3.mmQUICK, SecurityIdentification23Choice.mmQUICK, SecurityIdentification25Choice.mmQUICK);
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QUICK";
			definition = "Identifier of a security assigned by the Japanese QUICK identification scheme for financial instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QUICKIdentifier.mmObject();
		}
	};
	protected WertpapierIdentifier wertpapier;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmWertpapier
	 * SecurityIdentification3Choice.mmWertpapier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmWertpapier
	 * SecurityIdentification23Choice.mmWertpapier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmWertpapier
	 * SecurityIdentification25Choice.mmWertpapier}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmWertpapier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmWertpapier, SecurityIdentification23Choice.mmWertpapier, SecurityIdentification25Choice.mmWertpapier);
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Wertpapier";
			definition = "Wertpapier Kenn-nummer.  A number issued in Germany by the Wertpapier Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains 6-digits, but no check digit. There are different ranges of numbers representing different classes of securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WertpapierIdentifier.mmObject();
		}
	};
	protected DutchIdentifier dutch;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmDutch
	 * SecurityIdentification3Choice.mmDutch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmDutch
	 * SecurityIdentification23Choice.mmDutch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmDutch
	 * SecurityIdentification25Choice.mmDutch}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmDutch = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmDutch, SecurityIdentification23Choice.mmDutch, SecurityIdentification25Choice.mmDutch);
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dutch";
			definition = "Identifier for Dutch securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DutchIdentifier.mmObject();
		}
	};
	protected ValorenIdentifier valoren;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmValoren
	 * SecurityIdentification3Choice.mmValoren}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmValoren
	 * SecurityIdentification23Choice.mmValoren}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmValoren
	 * SecurityIdentification25Choice.mmValoren}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmValoren = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmValoren, SecurityIdentification23Choice.mmValoren, SecurityIdentification25Choice.mmValoren);
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Valoren";
			definition = "Identifier for Swiss securities assigned by Telekurs Financial, the Swiss numbering agency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ValorenIdentifier.mmObject();
		}
	};
	protected SicovamIdentifier sicovam;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmSicovam
	 * SecurityIdentification3Choice.mmSicovam}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmSicovam
	 * SecurityIdentification23Choice.mmSicovam}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmSicovam
	 * SecurityIdentification25Choice.mmSicovam}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmSicovam = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmSicovam, SecurityIdentification23Choice.mmSicovam, SecurityIdentification25Choice.mmSicovam);
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sicovam";
			definition = "Identifier for French securities assigned by the Societe Interprofessionnelle Pour La Compensation des Valeurs Mobilieres in France.  The Sicovam is composed of 5-digits.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SicovamIdentifier.mmObject();
		}
	};
	protected BelgianIdentifier belgian;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmBelgian
	 * SecurityIdentification3Choice.mmBelgian}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmBelgian
	 * SecurityIdentification23Choice.mmBelgian}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmBelgian
	 * SecurityIdentification25Choice.mmBelgian}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmBelgian = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmBelgian, SecurityIdentification23Choice.mmBelgian, SecurityIdentification25Choice.mmBelgian);
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Belgian";
			definition = "Identifier for Belgian securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BelgianIdentifier.mmObject();
		}
	};
	protected Max35Text identificationSuffix;
	/**
	 * Identifies the suffix of the security identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification1#mmSuffix
	 * OtherIdentification1.mmSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification2#mmSuffix
	 * OtherIdentification2.mmSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification3#mmSuffix
	 * OtherIdentification3.mmSuffix}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmIdentificationSuffix = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OtherIdentification1.mmSuffix, OtherIdentification2.mmSuffix, OtherIdentification3.mmSuffix);
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationSuffix";
			definition = "Identifies the suffix of the security identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected GenericIdentification genericIdentification;
	/**
	 * Proprietary identification of a security assigned by an institution or
	 * organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSecuritiesIdentification
	 * GenericIdentification.mmRelatedSecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification7#mmIdentificationSource
	 * AlternateSecurityIdentification7.mmIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentAttributes3Choice#mmOther
	 * FinancialInstrumentAttributes3Choice.mmOther}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmGenericIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AlternateSecurityIdentification7.mmIdentificationSource, FinancialInstrumentAttributes3Choice.mmOther);
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GenericIdentification";
			definition = "Proprietary identification of a security assigned by an institution or organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmRelatedSecuritiesIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DateTimePeriod> validityPeriod;
	/**
	 * Specifies the period during which an identification is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSecuritiesIdentification
	 * DateTimePeriod.mmRelatedSecuritiesIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which an identification is valid.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedSecuritiesIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TradingMarket> applicableTradingMarket;
	/**
	 * Market(s) on which the trading identification is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListedSecurityTradingIdentification
	 * TradingMarket.mmListedSecurityTradingIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmApplicableTradingMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicableTradingMarket";
			definition = "Market(s) on which the trading identification is used.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmListedSecurityTradingIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected SecuritiesIdentification primeIdentification;
	/**
	 * Specifies the main identification of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmRelatedOtherIdentification
	 * SecuritiesIdentification.mmRelatedOtherIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmPrimeIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrimeIdentification";
			definition = "Specifies the main identification of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmRelatedOtherIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesIdentification> relatedOtherIdentification;
	/**
	 * Alternate security identification(s) related to the security trading
	 * identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmPrimeIdentification
	 * SecuritiesIdentification.mmPrimeIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedOtherIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOtherIdentification";
			definition = "Alternate security identification(s) related to the security trading identification.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmPrimeIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
		}
	};
	protected Max70Text tradingIdentification;
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
	public static final MMBusinessAttribute mmTradingIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingIdentification";
			definition = "Security identifier specific to a trading market or markets, for example, Ticker.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesIdentification";
				definition = "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmIdentification, com.tools20022.repository.entity.SecuritiesIdentification.mmPrimeIdentification,
						com.tools20022.repository.entity.SecuritiesIdentification.mmRelatedOtherIdentification, com.tools20022.repository.entity.GenericIdentification.mmRelatedSecuritiesIdentification,
						com.tools20022.repository.entity.LocalName.mmRelatedSecurity, com.tools20022.repository.entity.TradingMarket.mmListedSecurityTradingIdentification,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedSecuritiesIdentification);
				derivationElement_lazy = () -> Arrays.asList(SecurityIdentification7.mmOtherIdentification, SecurityIdentification7.mmDescription, SecurityIdentification1.mmIdentification,
						SecurityIdentification1Choice.mmAlternateIdentification, SecurityIdentification3Choice.mmOtherProprietaryIdentification, AlternateIdentification1.mmIdentificationSource,
						SecurityIdentification11Choice.mmOtherIdentification, SecurityIdentification11.mmIdentification, SecurityIdentification11.mmDescription, SecurityIdentification14.mmOtherIdentification,
						SecurityIdentification14.mmDescription, SecurityIdentification15.mmOtherIdentification, SecurityIdentification15.mmDescription, AlternateIdentification2.mmIdentificationSource,
						SecurityIdentification12Choice.mmOtherIdentification, SecurityIdentification12.mmIdentification, SecurityIdentification12.mmDescription, SecurityIdentification16.mmOtherIdentification,
						SecurityIdentification16.mmDescription, AlternateSecurityIdentification2.mmType, SecurityIdentification4Choice.mmProprietary, SecurityIdentification3.mmOtherIdentification,
						SecurityIdentification5Choice.mmOtherIdentification, SecurityIdentification6Choice.mmOtherIdentification, SecurityIdentification10Choice.mmOtherIdentification, SecurityIdentification9.mmSecurityIdentification,
						SecurityIdentification9.mmDescription, SecurityIdentification7Choice.mmOtherProprietaryIdentification, SecurityIdentification8.mmSecurityIdentification, SecurityIdentification8.mmDescription,
						FinancialInstrumentIdentificationValidity1.mmFinancialInstrumentIdentification, TriggeringInstructions.mmTriggerSecurityDetails, ReportItem1.mmFinancialInstrumentIdentification,
						AggregateHoldingBalance1.mmFinancialInstrumentIdentification, SecurityIdentification22Choice.mmAlternateIdentification, SecurityIdentification23Choice.mmOtherProprietaryIdentification,
						SecurityIdentification19.mmOtherIdentification, SecurityIdentification19.mmDescription, SecurityIdentification20.mmOtherIdentification, SecurityIdentification20.mmDescription,
						SecurityIdentification32.mmOtherIdentification, SecurityIdentification32.mmDescription, SecurityIdentification21.mmOtherIdentification, SecurityIdentification21.mmDescription,
						SecurityIdentification25Choice.mmOtherProprietaryIdentification, SwapLegIdentification2.mmSwapIn, SwapLegIdentification2.mmSwapOut);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesIdentification.mmIdentifiedSecurity, com.tools20022.repository.entity.SecuritiesIdentification.mmSecurityIdentification,
						com.tools20022.repository.entity.SecuritiesIdentification.mmRIC, com.tools20022.repository.entity.SecuritiesIdentification.mmTickerSymbol, com.tools20022.repository.entity.SecuritiesIdentification.mmBloomberg,
						com.tools20022.repository.entity.SecuritiesIdentification.mmCTA, com.tools20022.repository.entity.SecuritiesIdentification.mmCommon, com.tools20022.repository.entity.SecuritiesIdentification.mmName,
						com.tools20022.repository.entity.SecuritiesIdentification.mmSEDOL, com.tools20022.repository.entity.SecuritiesIdentification.mmCUSIP, com.tools20022.repository.entity.SecuritiesIdentification.mmQUICK,
						com.tools20022.repository.entity.SecuritiesIdentification.mmWertpapier, com.tools20022.repository.entity.SecuritiesIdentification.mmDutch, com.tools20022.repository.entity.SecuritiesIdentification.mmValoren,
						com.tools20022.repository.entity.SecuritiesIdentification.mmSicovam, com.tools20022.repository.entity.SecuritiesIdentification.mmBelgian,
						com.tools20022.repository.entity.SecuritiesIdentification.mmIdentificationSuffix, com.tools20022.repository.entity.SecuritiesIdentification.mmGenericIdentification,
						com.tools20022.repository.entity.SecuritiesIdentification.mmValidityPeriod, com.tools20022.repository.entity.SecuritiesIdentification.mmApplicableTradingMarket,
						com.tools20022.repository.entity.SecuritiesIdentification.mmPrimeIdentification, com.tools20022.repository.entity.SecuritiesIdentification.mmRelatedOtherIdentification,
						com.tools20022.repository.entity.SecuritiesIdentification.mmTradingIdentification);
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

	public List<Security> getIdentifiedSecurity() {
		return identifiedSecurity;
	}

	public void setIdentifiedSecurity(List<com.tools20022.repository.entity.Security> identifiedSecurity) {
		this.identifiedSecurity = identifiedSecurity;
	}

	public ISINOct2015Identifier getSecurityIdentification() {
		return securityIdentification;
	}

	public void setSecurityIdentification(ISINOct2015Identifier securityIdentification) {
		this.securityIdentification = securityIdentification;
	}

	public RICIdentifier getRIC() {
		return rIC;
	}

	public void setRIC(RICIdentifier rIC) {
		this.rIC = rIC;
	}

	public TickerIdentifier getTickerSymbol() {
		return tickerSymbol;
	}

	public void setTickerSymbol(TickerIdentifier tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
	}

	public Bloomberg2Identifier getBloomberg() {
		return bloomberg;
	}

	public void setBloomberg(Bloomberg2Identifier bloomberg) {
		this.bloomberg = bloomberg;
	}

	public ConsolidatedTapeAssociationIdentifier getCTA() {
		return cTA;
	}

	public void setCTA(ConsolidatedTapeAssociationIdentifier cTA) {
		this.cTA = cTA;
	}

	public EuroclearClearstreamIdentifier getCommon() {
		return common;
	}

	public void setCommon(EuroclearClearstreamIdentifier common) {
		this.common = common;
	}

	public LocalName getName() {
		return name;
	}

	public void setName(com.tools20022.repository.entity.LocalName name) {
		this.name = name;
	}

	public SEDOLIdentifier getSEDOL() {
		return sEDOL;
	}

	public void setSEDOL(SEDOLIdentifier sEDOL) {
		this.sEDOL = sEDOL;
	}

	public CUSIPIdentifier getCUSIP() {
		return cUSIP;
	}

	public void setCUSIP(CUSIPIdentifier cUSIP) {
		this.cUSIP = cUSIP;
	}

	public QUICKIdentifier getQUICK() {
		return qUICK;
	}

	public void setQUICK(QUICKIdentifier qUICK) {
		this.qUICK = qUICK;
	}

	public WertpapierIdentifier getWertpapier() {
		return wertpapier;
	}

	public void setWertpapier(WertpapierIdentifier wertpapier) {
		this.wertpapier = wertpapier;
	}

	public DutchIdentifier getDutch() {
		return dutch;
	}

	public void setDutch(DutchIdentifier dutch) {
		this.dutch = dutch;
	}

	public ValorenIdentifier getValoren() {
		return valoren;
	}

	public void setValoren(ValorenIdentifier valoren) {
		this.valoren = valoren;
	}

	public SicovamIdentifier getSicovam() {
		return sicovam;
	}

	public void setSicovam(SicovamIdentifier sicovam) {
		this.sicovam = sicovam;
	}

	public BelgianIdentifier getBelgian() {
		return belgian;
	}

	public void setBelgian(BelgianIdentifier belgian) {
		this.belgian = belgian;
	}

	public Max35Text getIdentificationSuffix() {
		return identificationSuffix;
	}

	public void setIdentificationSuffix(Max35Text identificationSuffix) {
		this.identificationSuffix = identificationSuffix;
	}

	public GenericIdentification getGenericIdentification() {
		return genericIdentification;
	}

	public void setGenericIdentification(com.tools20022.repository.entity.GenericIdentification genericIdentification) {
		this.genericIdentification = genericIdentification;
	}

	public List<DateTimePeriod> getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(List<com.tools20022.repository.entity.DateTimePeriod> validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public List<TradingMarket> getApplicableTradingMarket() {
		return applicableTradingMarket;
	}

	public void setApplicableTradingMarket(List<com.tools20022.repository.entity.TradingMarket> applicableTradingMarket) {
		this.applicableTradingMarket = applicableTradingMarket;
	}

	public SecuritiesIdentification getPrimeIdentification() {
		return primeIdentification;
	}

	public void setPrimeIdentification(com.tools20022.repository.entity.SecuritiesIdentification primeIdentification) {
		this.primeIdentification = primeIdentification;
	}

	public List<SecuritiesIdentification> getRelatedOtherIdentification() {
		return relatedOtherIdentification;
	}

	public void setRelatedOtherIdentification(List<com.tools20022.repository.entity.SecuritiesIdentification> relatedOtherIdentification) {
		this.relatedOtherIdentification = relatedOtherIdentification;
	}

	public Max70Text getTradingIdentification() {
		return tradingIdentification;
	}

	public void setTradingIdentification(Max70Text tradingIdentification) {
		this.tradingIdentification = tradingIdentification;
	}
}