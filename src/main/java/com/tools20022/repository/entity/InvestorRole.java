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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.EligibilityCode;
import com.tools20022.repository.codeset.InvestorTypeCode;
import com.tools20022.repository.codeset.RankCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.TradePartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestorRole#mmIndividualInvestor
 * InvestorRole.mmIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestorRole#mmCorporateInvestor
 * InvestorRole.mmCorporateInvestor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestorRole#mmCapacity
 * InvestorRole.mmCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestorRole#mmInvestorProtectionAssociationMembership
 * InvestorRole.mmInvestorProtectionAssociationMembership}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestorRole#mmType
 * InvestorRole.mmType}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.repository.choice.InvestorType3Choice
 * InvestorType3Choice}</li>
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
	protected RankCode individualInvestor;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<InvestorRole, RankCode> mmIndividualInvestor = new MMBusinessAttribute<InvestorRole, RankCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestorRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndividualInvestor";
			definition = "Specifies whether the investor is a primary or the secondary individual investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RankCode.mmObject();
		}

		@Override
		public RankCode getValue(InvestorRole obj) {
			return obj.getIndividualInvestor();
		}

		@Override
		public void setValue(InvestorRole obj, RankCode value) {
			obj.setIndividualInvestor(value);
		}
	};
	protected RankCode corporateInvestor;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmCashAccountDesignation
	 * CashAccount33.mmCashAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountDesignation1Choice#mmCode
	 * AccountDesignation1Choice.mmCode}</li>
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
	public static final MMBusinessAttribute<InvestorRole, RankCode> mmCorporateInvestor = new MMBusinessAttribute<InvestorRole, RankCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccount33.mmCashAccountDesignation, AccountDesignation1Choice.mmCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestorRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateInvestor";
			definition = "Specifies whether the investor is a primary or a secondary corporate investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RankCode.mmObject();
		}

		@Override
		public RankCode getValue(InvestorRole obj) {
			return obj.getCorporateInvestor();
		}

		@Override
		public void setValue(InvestorRole obj, RankCode value) {
			obj.setCorporateInvestor(value);
		}
	};
	protected EligibilityCode capacity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity1Choice#mmCode
	 * InvestorCapacity1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity1Choice#mmProprietary
	 * InvestorCapacity1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#mmInvestorCapacity
	 * SecuritiesTradeDetails25.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmInvestorCapacity
	 * SecuritiesTradeDetails26.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity2Choice#mmCode
	 * InvestorCapacity2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity2Choice#mmProprietary
	 * InvestorCapacity2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#mmInvestorCapacity
	 * SecuritiesTradeDetails27.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmInvestorCapacity
	 * SecuritiesTradeDetails28.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmInvestorCapacity
	 * SecuritiesTradeDetails6.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#mmInvestorCapacity
	 * SecuritiesTradeDetails13.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#mmInvestorCapacity
	 * SecuritiesTradeDetails3.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#mmInvestorCapacity
	 * SecuritiesTradeDetails11.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#mmInvestorCapacity
	 * SecuritiesTradeDetails2.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#mmInvestorCapacity
	 * SecuritiesTradeDetails16.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmInvestorCapacity
	 * SecuritiesTradeDetails1.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmInvestorCapacity
	 * SecuritiesTradeDetails15.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity3Choice#mmCode
	 * InvestorCapacity3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity3Choice#mmProprietary
	 * InvestorCapacity3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2#mmInvestorCapacity
	 * ConfirmationPartyDetails2.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary8#mmOrderOriginatorEligibility
	 * Intermediary8.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary9#mmOrderOriginatorEligibility
	 * Intermediary9.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#mmInvestorCapacity
	 * SecuritiesTradeDetails31.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmInvestorCapacity
	 * SecuritiesTradeDetails33.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmInvestorCapacity
	 * SecuritiesTradeDetails38.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmInvestorCapacity
	 * SecuritiesTradeDetails37.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmInvestorCapacity
	 * SecuritiesTradeDetails34.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#mmInvestorCapacity
	 * SecuritiesTradeDetails32.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmInvestorCapacity
	 * SecuritiesTradeDetails44.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#mmInvestorCapacity
	 * SecuritiesTradeDetails39.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#mmInvestorCapacity
	 * SecuritiesTradeDetails43.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#mmInvestorCapacity
	 * SecuritiesTradeDetails40.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#mmInvestorCapacity
	 * SecuritiesTradeDetails46.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmInvestorCapacity
	 * SecuritiesTradeDetails47.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary29#mmOrderOriginatorEligibility
	 * Intermediary29.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmInvestorCapacity
	 * SecuritiesTradeDetails51.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmInvestorCapacity
	 * SecuritiesTradeDetails53.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmInvestorCapacity
	 * SecuritiesTradeDetails55.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmInvestorCapacity
	 * SecuritiesTradeDetails56.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity4Choice#mmCode
	 * InvestorCapacity4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity4Choice#mmProprietary
	 * InvestorCapacity4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmInvestorCapacity
	 * SecuritiesTradeDetails52.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmInvestorCapacity
	 * SecuritiesTradeDetails50.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#mmInvestorCapacity
	 * SecuritiesTradeDetails59.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#mmInvestorCapacity
	 * SecuritiesTradeDetails58.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmInvestorCapacity
	 * SecuritiesTradeDetails63.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmInvestorCapacity
	 * SecuritiesTradeDetails62.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity5Choice#mmCode
	 * InvestorCapacity5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity5Choice#mmProprietary
	 * InvestorCapacity5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#mmInvestorCapacity
	 * SecuritiesTradeDetails65.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmInvestorCapacity
	 * SecuritiesTradeDetails66.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary39#mmOrderOriginatorEligibility
	 * Intermediary39.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary40#mmOrderOriginatorEligibility
	 * Intermediary40.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmInvestorCapacity
	 * SecuritiesTradeDetails67.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmInvestorCapacity
	 * SecuritiesTradeDetails70.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73#mmInvestorCapacity
	 * SecuritiesTradeDetails73.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails74#mmInvestorCapacity
	 * SecuritiesTradeDetails74.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75#mmInvestorCapacity
	 * SecuritiesTradeDetails75.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76#mmInvestorCapacity
	 * SecuritiesTradeDetails76.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails77#mmInvestorCapacity
	 * SecuritiesTradeDetails77.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78#mmInvestorCapacity
	 * SecuritiesTradeDetails78.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79#mmInvestorCapacity
	 * SecuritiesTradeDetails79.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails82#mmInvestorCapacity
	 * SecuritiesTradeDetails82.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails83#mmInvestorCapacity
	 * SecuritiesTradeDetails83.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails86#mmInvestorCapacity
	 * SecuritiesTradeDetails86.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails87#mmInvestorCapacity
	 * SecuritiesTradeDetails87.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails88#mmInvestorCapacity
	 * SecuritiesTradeDetails88.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails89#mmInvestorCapacity
	 * SecuritiesTradeDetails89.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails90#mmInvestorCapacity
	 * SecuritiesTradeDetails90.mmInvestorCapacity}</li>
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
	public static final MMBusinessAttribute<InvestorRole, EligibilityCode> mmCapacity = new MMBusinessAttribute<InvestorRole, EligibilityCode>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestorCapacity1Choice.mmCode, InvestorCapacity1Choice.mmProprietary, SecuritiesTradeDetails25.mmInvestorCapacity, SecuritiesTradeDetails26.mmInvestorCapacity,
					InvestorCapacity2Choice.mmCode, InvestorCapacity2Choice.mmProprietary, SecuritiesTradeDetails27.mmInvestorCapacity, SecuritiesTradeDetails28.mmInvestorCapacity, SecuritiesTradeDetails6.mmInvestorCapacity,
					SecuritiesTradeDetails13.mmInvestorCapacity, SecuritiesTradeDetails3.mmInvestorCapacity, SecuritiesTradeDetails11.mmInvestorCapacity, SecuritiesTradeDetails2.mmInvestorCapacity,
					SecuritiesTradeDetails16.mmInvestorCapacity, SecuritiesTradeDetails1.mmInvestorCapacity, SecuritiesTradeDetails15.mmInvestorCapacity, InvestorCapacity3Choice.mmCode, InvestorCapacity3Choice.mmProprietary,
					ConfirmationPartyDetails2.mmInvestorCapacity, Intermediary8.mmOrderOriginatorEligibility, Intermediary9.mmOrderOriginatorEligibility, SecuritiesTradeDetails31.mmInvestorCapacity,
					SecuritiesTradeDetails33.mmInvestorCapacity, SecuritiesTradeDetails38.mmInvestorCapacity, SecuritiesTradeDetails37.mmInvestorCapacity, SecuritiesTradeDetails34.mmInvestorCapacity,
					SecuritiesTradeDetails32.mmInvestorCapacity, SecuritiesTradeDetails44.mmInvestorCapacity, SecuritiesTradeDetails39.mmInvestorCapacity, SecuritiesTradeDetails43.mmInvestorCapacity,
					SecuritiesTradeDetails40.mmInvestorCapacity, SecuritiesTradeDetails46.mmInvestorCapacity, SecuritiesTradeDetails47.mmInvestorCapacity, Intermediary29.mmOrderOriginatorEligibility,
					SecuritiesTradeDetails51.mmInvestorCapacity, SecuritiesTradeDetails53.mmInvestorCapacity, SecuritiesTradeDetails55.mmInvestorCapacity, SecuritiesTradeDetails56.mmInvestorCapacity, InvestorCapacity4Choice.mmCode,
					InvestorCapacity4Choice.mmProprietary, SecuritiesTradeDetails52.mmInvestorCapacity, SecuritiesTradeDetails50.mmInvestorCapacity, SecuritiesTradeDetails59.mmInvestorCapacity, SecuritiesTradeDetails58.mmInvestorCapacity,
					SecuritiesTradeDetails63.mmInvestorCapacity, SecuritiesTradeDetails62.mmInvestorCapacity, InvestorCapacity5Choice.mmCode, InvestorCapacity5Choice.mmProprietary, SecuritiesTradeDetails65.mmInvestorCapacity,
					SecuritiesTradeDetails66.mmInvestorCapacity, Intermediary39.mmOrderOriginatorEligibility, Intermediary40.mmOrderOriginatorEligibility, SecuritiesTradeDetails67.mmInvestorCapacity,
					SecuritiesTradeDetails70.mmInvestorCapacity, SecuritiesTradeDetails73.mmInvestorCapacity, SecuritiesTradeDetails74.mmInvestorCapacity, SecuritiesTradeDetails75.mmInvestorCapacity,
					SecuritiesTradeDetails76.mmInvestorCapacity, SecuritiesTradeDetails77.mmInvestorCapacity, SecuritiesTradeDetails78.mmInvestorCapacity, SecuritiesTradeDetails79.mmInvestorCapacity,
					SecuritiesTradeDetails82.mmInvestorCapacity, SecuritiesTradeDetails83.mmInvestorCapacity, SecuritiesTradeDetails86.mmInvestorCapacity, SecuritiesTradeDetails87.mmInvestorCapacity,
					SecuritiesTradeDetails88.mmInvestorCapacity, SecuritiesTradeDetails89.mmInvestorCapacity, SecuritiesTradeDetails90.mmInvestorCapacity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestorRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Capacity";
			definition = "Specifies whether the investor is the primary, or the secondary account owner or another account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EligibilityCode.mmObject();
		}

		@Override
		public EligibilityCode getValue(InvestorRole obj) {
			return obj.getCapacity();
		}

		@Override
		public void setValue(InvestorRole obj, EligibilityCode value) {
			obj.setCapacity(value);
		}
	};
	protected YesNoIndicator investorProtectionAssociationMembership;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6#mmInvestorProtectionAssociationMembership
	 * ConfirmationPartyDetails6.mmInvestorProtectionAssociationMembership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails5#mmInvestorProtectionAssociationMembership
	 * ConfirmationPartyDetails5.mmInvestorProtectionAssociationMembership}</li>
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
	public static final MMBusinessAttribute<InvestorRole, YesNoIndicator> mmInvestorProtectionAssociationMembership = new MMBusinessAttribute<InvestorRole, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(ConfirmationPartyDetails6.mmInvestorProtectionAssociationMembership, ConfirmationPartyDetails5.mmInvestorProtectionAssociationMembership);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestorRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestorProtectionAssociationMembership";
			definition = "Indicates whether the confirmation party is a member of the investor protection association required, eg, as per regulation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InvestorRole obj) {
			return obj.getInvestorProtectionAssociationMembership();
		}

		@Override
		public void setValue(InvestorRole obj, YesNoIndicator value) {
			obj.setInvestorProtectionAssociationMembership(value);
		}
	};
	protected InvestorTypeCode type;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.InvestorType2Choice#mmCode
	 * InvestorType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorType2Choice#mmProprietary
	 * InvestorType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorType3Choice#mmCode
	 * InvestorType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorType3Choice#mmProprietary
	 * InvestorType3Choice.mmProprietary}</li>
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
	public static final MMBusinessAttribute<InvestorRole, InvestorTypeCode> mmType = new MMBusinessAttribute<InvestorRole, InvestorTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestorType2Choice.mmCode, InvestorType2Choice.mmProprietary, InvestorType3Choice.mmCode, InvestorType3Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestorRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies whether the investor is a corporate or an individual";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestorTypeCode.mmObject();
		}

		@Override
		public InvestorTypeCode getValue(InvestorRole obj) {
			return obj.getType();
		}

		@Override
		public void setValue(InvestorRole obj, InvestorTypeCode value) {
			obj.setType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestorRole";
				definition = "Party that makes investment decisions. Identifies the beneficiary or its broker.";
				superType_lazy = () -> TradePartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestorRole.mmIndividualInvestor, com.tools20022.repository.entity.InvestorRole.mmCorporateInvestor,
						com.tools20022.repository.entity.InvestorRole.mmCapacity, com.tools20022.repository.entity.InvestorRole.mmInvestorProtectionAssociationMembership, com.tools20022.repository.entity.InvestorRole.mmType);
				derivationComponent_lazy = () -> Arrays.asList(InvestorCapacity1Choice.mmObject(), InvestorCapacity2Choice.mmObject(), InvestorCapacity3Choice.mmObject(), InvestorType2Choice.mmObject(), InvestorCapacity4Choice.mmObject(),
						AccountDesignation1Choice.mmObject(), InvestorCapacity5Choice.mmObject(), InvestorType3Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestorRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public RankCode getIndividualInvestor() {
		return individualInvestor;
	}

	public InvestorRole setIndividualInvestor(RankCode individualInvestor) {
		this.individualInvestor = Objects.requireNonNull(individualInvestor);
		return this;
	}

	public RankCode getCorporateInvestor() {
		return corporateInvestor;
	}

	public InvestorRole setCorporateInvestor(RankCode corporateInvestor) {
		this.corporateInvestor = Objects.requireNonNull(corporateInvestor);
		return this;
	}

	public EligibilityCode getCapacity() {
		return capacity;
	}

	public InvestorRole setCapacity(EligibilityCode capacity) {
		this.capacity = Objects.requireNonNull(capacity);
		return this;
	}

	public YesNoIndicator getInvestorProtectionAssociationMembership() {
		return investorProtectionAssociationMembership;
	}

	public InvestorRole setInvestorProtectionAssociationMembership(YesNoIndicator investorProtectionAssociationMembership) {
		this.investorProtectionAssociationMembership = Objects.requireNonNull(investorProtectionAssociationMembership);
		return this;
	}

	public InvestorTypeCode getType() {
		return type;
	}

	public InvestorRole setType(InvestorTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}
}