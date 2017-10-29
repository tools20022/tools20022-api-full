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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.EligibilityCode;
import com.tools20022.repository.codeset.InvestorTypeCode;
import com.tools20022.repository.codeset.RankCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.TradePartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party that makes investment decisions. Identifies the beneficiary or its
 * broker.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestorRole" src="doc-files/InvestorRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestorRole#IndividualInvestor
 * InvestorRole.IndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestorRole#CorporateInvestor
 * InvestorRole.CorporateInvestor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestorRole#Capacity
 * InvestorRole.Capacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestorRole#InvestorProtectionAssociationMembership
 * InvestorRole.InvestorProtectionAssociationMembership}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestorRole#Type
 * InvestorRole.Type}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.InvestorCapacity1Choice
 * InvestorCapacity1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InvestorCapacity2Choice
 * InvestorCapacity2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InvestorCapacity3Choice
 * InvestorCapacity3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InvestorType2Choice
 * InvestorType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InvestorCapacity4Choice
 * InvestorCapacity4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountDesignation1Choice
 * AccountDesignation1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InvestorCapacity5Choice
 * InvestorCapacity5Choice}</li>
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
 * "InvestorRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that makes investment decisions. Identifies the beneficiary or its broker."
 * </li>
 * </ul>
 */
public class InvestorRole extends TradePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies whether the investor is a primary or the secondary individual
	 * investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.RankCode
	 * RankCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestorRole InvestorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the investor is a primary or the secondary individual investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IndividualInvestor = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestorRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndividualInvestor";
			definition = "Specifies whether the investor is a primary or the secondary individual investor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RankCode.mmObject();
		}
	};
	/**
	 * Specifies whether the investor is a primary or a secondary corporate
	 * investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.RankCode
	 * RankCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#CashAccountDesignation
	 * CashAccount33.CashAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountDesignation1Choice#Code
	 * AccountDesignation1Choice.Code}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestorRole InvestorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the investor is a primary or a secondary corporate investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CorporateInvestor = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount33.CashAccountDesignation, com.tools20022.repository.choice.AccountDesignation1Choice.Code);
			elementContext_lazy = () -> InvestorRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateInvestor";
			definition = "Specifies whether the investor is a primary or a secondary corporate investor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RankCode.mmObject();
		}
	};
	/**
	 * Specifies whether the investor is the primary, or the secondary account
	 * owner or another account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EligibilityCode
	 * EligibilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity1Choice#Code
	 * InvestorCapacity1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity1Choice#Proprietary
	 * InvestorCapacity1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#InvestorCapacity
	 * SecuritiesTradeDetails25.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#InvestorCapacity
	 * SecuritiesTradeDetails26.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity2Choice#Code
	 * InvestorCapacity2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity2Choice#Proprietary
	 * InvestorCapacity2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#InvestorCapacity
	 * SecuritiesTradeDetails27.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#InvestorCapacity
	 * SecuritiesTradeDetails28.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#InvestorCapacity
	 * SecuritiesTradeDetails6.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#InvestorCapacity
	 * SecuritiesTradeDetails13.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#InvestorCapacity
	 * SecuritiesTradeDetails3.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#InvestorCapacity
	 * SecuritiesTradeDetails11.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#InvestorCapacity
	 * SecuritiesTradeDetails2.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#InvestorCapacity
	 * SecuritiesTradeDetails16.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#InvestorCapacity
	 * SecuritiesTradeDetails1.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#InvestorCapacity
	 * SecuritiesTradeDetails15.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity3Choice#Code
	 * InvestorCapacity3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity3Choice#Proprietary
	 * InvestorCapacity3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2#InvestorCapacity
	 * ConfirmationPartyDetails2.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary8#OrderOriginatorEligibility
	 * Intermediary8.OrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary9#OrderOriginatorEligibility
	 * Intermediary9.OrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#InvestorCapacity
	 * SecuritiesTradeDetails31.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#InvestorCapacity
	 * SecuritiesTradeDetails33.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#InvestorCapacity
	 * SecuritiesTradeDetails38.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#InvestorCapacity
	 * SecuritiesTradeDetails37.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#InvestorCapacity
	 * SecuritiesTradeDetails34.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#InvestorCapacity
	 * SecuritiesTradeDetails32.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#InvestorCapacity
	 * SecuritiesTradeDetails44.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#InvestorCapacity
	 * SecuritiesTradeDetails39.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#InvestorCapacity
	 * SecuritiesTradeDetails43.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#InvestorCapacity
	 * SecuritiesTradeDetails40.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#InvestorCapacity
	 * SecuritiesTradeDetails46.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#InvestorCapacity
	 * SecuritiesTradeDetails47.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary29#OrderOriginatorEligibility
	 * Intermediary29.OrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#InvestorCapacity
	 * SecuritiesTradeDetails51.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#InvestorCapacity
	 * SecuritiesTradeDetails53.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#InvestorCapacity
	 * SecuritiesTradeDetails55.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#InvestorCapacity
	 * SecuritiesTradeDetails56.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity4Choice#Code
	 * InvestorCapacity4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity4Choice#Proprietary
	 * InvestorCapacity4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#InvestorCapacity
	 * SecuritiesTradeDetails52.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#InvestorCapacity
	 * SecuritiesTradeDetails50.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#InvestorCapacity
	 * SecuritiesTradeDetails59.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#InvestorCapacity
	 * SecuritiesTradeDetails58.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#InvestorCapacity
	 * SecuritiesTradeDetails63.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#InvestorCapacity
	 * SecuritiesTradeDetails62.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity5Choice#Code
	 * InvestorCapacity5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity5Choice#Proprietary
	 * InvestorCapacity5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#InvestorCapacity
	 * SecuritiesTradeDetails65.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#InvestorCapacity
	 * SecuritiesTradeDetails66.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary39#OrderOriginatorEligibility
	 * Intermediary39.OrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary40#OrderOriginatorEligibility
	 * Intermediary40.OrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#InvestorCapacity
	 * SecuritiesTradeDetails67.InvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#InvestorCapacity
	 * SecuritiesTradeDetails70.InvestorCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestorRole InvestorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the investor is the primary, or the secondary account owner or another account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Capacity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InvestorCapacity1Choice.Code, com.tools20022.repository.choice.InvestorCapacity1Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesTradeDetails25.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails26.InvestorCapacity, com.tools20022.repository.choice.InvestorCapacity2Choice.Code,
					com.tools20022.repository.choice.InvestorCapacity2Choice.Proprietary, com.tools20022.repository.msg.SecuritiesTradeDetails27.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails28.InvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails6.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails13.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails3.InvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails11.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails2.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails16.InvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails1.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails15.InvestorCapacity, com.tools20022.repository.choice.InvestorCapacity3Choice.Code,
					com.tools20022.repository.choice.InvestorCapacity3Choice.Proprietary, com.tools20022.repository.msg.ConfirmationPartyDetails2.InvestorCapacity, com.tools20022.repository.msg.Intermediary8.OrderOriginatorEligibility,
					com.tools20022.repository.msg.Intermediary9.OrderOriginatorEligibility, com.tools20022.repository.msg.SecuritiesTradeDetails31.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails33.InvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails38.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails37.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails34.InvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails32.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails44.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails39.InvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails43.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails40.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails46.InvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails47.InvestorCapacity, com.tools20022.repository.msg.Intermediary29.OrderOriginatorEligibility, com.tools20022.repository.msg.SecuritiesTradeDetails51.InvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails53.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails55.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails56.InvestorCapacity,
					com.tools20022.repository.choice.InvestorCapacity4Choice.Code, com.tools20022.repository.choice.InvestorCapacity4Choice.Proprietary, com.tools20022.repository.msg.SecuritiesTradeDetails52.InvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails50.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails59.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails58.InvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails63.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails62.InvestorCapacity, com.tools20022.repository.choice.InvestorCapacity5Choice.Code,
					com.tools20022.repository.choice.InvestorCapacity5Choice.Proprietary, com.tools20022.repository.msg.SecuritiesTradeDetails65.InvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails66.InvestorCapacity,
					com.tools20022.repository.msg.Intermediary39.OrderOriginatorEligibility, com.tools20022.repository.msg.Intermediary40.OrderOriginatorEligibility, com.tools20022.repository.msg.SecuritiesTradeDetails67.InvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails70.InvestorCapacity);
			elementContext_lazy = () -> InvestorRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Capacity";
			definition = "Specifies whether the investor is the primary, or the secondary account owner or another account owner.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EligibilityCode.mmObject();
		}
	};
	/**
	 * Indicates whether the confirmation party is a member of the investor
	 * protection association required, eg, as per regulation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6#InvestorProtectionAssociationMembership
	 * ConfirmationPartyDetails6.InvestorProtectionAssociationMembership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails5#InvestorProtectionAssociationMembership
	 * ConfirmationPartyDetails5.InvestorProtectionAssociationMembership}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestorRole InvestorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorProtectionAssociationMembership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the confirmation party is a member of the investor protection association required, eg, as per regulation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InvestorProtectionAssociationMembership = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ConfirmationPartyDetails6.InvestorProtectionAssociationMembership,
					com.tools20022.repository.msg.ConfirmationPartyDetails5.InvestorProtectionAssociationMembership);
			elementContext_lazy = () -> InvestorRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestorProtectionAssociationMembership";
			definition = "Indicates whether the confirmation party is a member of the investor protection association required, eg, as per regulation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether the investor is a corporate or an individual
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode
	 * InvestorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorType2Choice#Code
	 * InvestorType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorType2Choice#Proprietary
	 * InvestorType2Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestorRole InvestorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the investor is a corporate or an individual"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InvestorType2Choice.Code, com.tools20022.repository.choice.InvestorType2Choice.Proprietary);
			elementContext_lazy = () -> InvestorRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies whether the investor is a corporate or an individual";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InvestorTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestorRole";
				definition = "Party that makes investment decisions. Identifies the beneficiary or its broker.";
				superType_lazy = () -> TradePartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestorRole.IndividualInvestor, com.tools20022.repository.entity.InvestorRole.CorporateInvestor, com.tools20022.repository.entity.InvestorRole.Capacity,
						com.tools20022.repository.entity.InvestorRole.InvestorProtectionAssociationMembership, com.tools20022.repository.entity.InvestorRole.Type);
				derivationComponent_lazy = () -> Arrays.asList(InvestorCapacity1Choice.mmObject(), InvestorCapacity2Choice.mmObject(), InvestorCapacity3Choice.mmObject(), InvestorType2Choice.mmObject(), InvestorCapacity4Choice.mmObject(),
						AccountDesignation1Choice.mmObject(), InvestorCapacity5Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}