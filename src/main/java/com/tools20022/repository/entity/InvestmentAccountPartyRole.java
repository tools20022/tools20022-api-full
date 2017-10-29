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
import com.tools20022.repository.codeset.FATCAFormTypeCode;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.AccountPartyRole;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies roles played by a party that are related to an investment account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentAccountPartyRole"
 * src="doc-files/InvestmentAccountPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#OwnershipBeneficiaryRate
 * InvestmentAccountPartyRole.OwnershipBeneficiaryRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#InvestmentAccount
 * InvestmentAccountPartyRole.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#FATCAFormType
 * InvestmentAccountPartyRole.FATCAFormType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#FATCAStatus
 * InvestmentAccountPartyRole.FATCAStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#CRSStatus
 * InvestmentAccountPartyRole.CRSStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentAccountPartyRole
 * InvestmentAccount.InvestmentAccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FATCAStatus#InvestmentAccountParty
 * FATCAStatus.InvestmentAccountParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CRSStatus#InvestmentAccountParty
 * CRSStatus.InvestmentAccountParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#OtherParty
 * AccountParties2.OtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty2#OtherPartyDetails
 * ExtendedParty2.OtherPartyDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#OtherParty
 * AccountParties5.OtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty3#ExtendedPartyRole
 * ExtendedParty3.ExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty3#OtherPartyDetails
 * ExtendedParty3.OtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties6#PrincipalAccountParty
 * AccountParties6.PrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties6#OtherParty
 * AccountParties6.OtherParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#OtherParty
 * AccountParties3.OtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty1#OtherPartyDetails
 * ExtendedParty1.OtherPartyDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#OtherParty
 * AccountParties4.OtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty4#ExtendedPartyRole
 * ExtendedParty4.ExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty4#OtherPartyDetails
 * ExtendedParty4.OtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties7#PrincipalAccountParty
 * AccountParties7.PrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties7#OtherParty
 * AccountParties7.OtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties9#PrincipalAccountParty
 * AccountParties9.PrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties9#OtherParty
 * AccountParties9.OtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties8#PrincipalAccountParty
 * AccountParties8.PrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties8#OtherParty
 * AccountParties8.OtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty6#ExtendedPartyRole
 * ExtendedParty6.ExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty6#OtherPartyDetails
 * ExtendedParty6.OtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty5#ExtendedPartyRole
 * ExtendedParty5.ExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty5#OtherPartyDetails
 * ExtendedParty5.OtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties11#PrincipalAccountParty
 * AccountParties11.PrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties11#OtherParty
 * AccountParties11.OtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties10#PrincipalAccountParty
 * AccountParties10.PrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties10#OtherParty
 * AccountParties10.OtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties12#PrincipalAccountParty
 * AccountParties12.PrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties12#OtherParty
 * AccountParties12.OtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty7#ExtendedPartyRole
 * ExtendedParty7.ExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty7#OtherPartyDetails
 * ExtendedParty7.OtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty8#ExtendedPartyRole
 * ExtendedParty8.ExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty8#OtherPartyDetails
 * ExtendedParty8.OtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#PrincipalAccountParty
 * AccountParties13.PrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties13#OtherParty
 * AccountParties13.OtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties14#PrincipalAccountParty
 * AccountParties14.PrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties14#OtherParty
 * AccountParties14.OtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty10#ExtendedPartyRole
 * ExtendedParty10.ExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty10#OtherPartyDetails
 * ExtendedParty10.OtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty9#ExtendedPartyRole
 * ExtendedParty9.ExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty9#OtherPartyDetails
 * ExtendedParty9.OtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#PrincipalAccountParty
 * AccountParties15.PrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#OtherParty
 * AccountParties15.OtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#PrincipalAccountParty
 * AccountParties16.PrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16#OtherParty
 * AccountParties16.OtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty12#ExtendedPartyRole
 * ExtendedParty12.ExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty12#OtherPartyDetails
 * ExtendedParty12.OtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty11#ExtendedPartyRole
 * ExtendedParty11.ExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty11#OtherPartyDetails
 * ExtendedParty11.OtherPartyDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PrimaryOwner PrimaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TrusteeRole TrusteeRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CustodianForMinor
 * CustodianForMinor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Nominee Nominee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.JointOwner JointOwner}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecondaryOwner
 * SecondaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LegalGuardianRole
 * LegalGuardianRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SuccessorOnDeath
 * SuccessorOnDeath}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AdministratorRole
 * AdministratorRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.IndividualInvestor
 * IndividualInvestor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CorporateInvestor
 * CorporateInvestor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Investor Investor}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountPartyRole
 * AccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5
 * InvestmentAccountOwnershipInformation5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2
 * InvestmentAccountOwnershipInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2
 * AccountParties2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendedParty2 ExtendedParty2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5
 * AccountParties5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MoneyLaunderingCheck1Choice
 * MoneyLaunderingCheck1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6
 * InvestmentAccountOwnershipInformation6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties1Choice
 * AccountParties1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendedParty3 ExtendedParty3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties6
 * AccountParties6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
 * InvestmentAccountOwnershipInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3
 * AccountParties3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
 * InvestmentAccountOwnershipInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendedParty1 ExtendedParty1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4
 * AccountParties4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
 * InvestmentAccountOwnershipInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties2Choice
 * AccountParties2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendedParty4 ExtendedParty4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties7
 * AccountParties7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties9
 * AccountParties9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties8
 * AccountParties8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8
 * InvestmentAccountOwnershipInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendedParty6 ExtendedParty6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9
 * InvestmentAccountOwnershipInformation9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendedParty5 ExtendedParty5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties3Choice
 * AccountParties3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties4Choice
 * AccountParties4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties11
 * AccountParties11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties10
 * AccountParties10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties12
 * AccountParties12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties7Choice
 * AccountParties7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10
 * InvestmentAccountOwnershipInformation10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11
 * InvestmentAccountOwnershipInformation11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FATCAForm1Choice
 * FATCAForm1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendedParty7 ExtendedParty7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties6Choice
 * AccountParties6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendedParty8 ExtendedParty8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties5Choice
 * AccountParties5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties13
 * AccountParties13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties14
 * AccountParties14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
 * InvestmentAccountOwnershipInformation12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendedParty10
 * ExtendedParty10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
 * InvestmentAccountOwnershipInformation13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties9Choice
 * AccountParties9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties8Choice
 * AccountParties8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendedParty9 ExtendedParty9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15
 * AccountParties15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16
 * AccountParties16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
 * InvestmentAccountOwnershipInformation15}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties11Choice
 * AccountParties11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendedParty12
 * ExtendedParty12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CRSForm1Choice
 * CRSForm1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties10Choice
 * AccountParties10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
 * InvestmentAccountOwnershipInformation14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendedParty11
 * ExtendedParty11}</li>
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
 * "InvestmentAccountPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies roles played by a party that are related to an investment account."
 * </li>
 * </ul>
 */
public class InvestmentAccountPartyRole extends AccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Percentage of ownership or of beneficial ownership of the shares/units in
	 * the account. All subsequent subscriptions and or redemptions will be
	 * allocated using the same percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5#OwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation5.OwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2#OwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation2.OwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6#OwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation6.OwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#OwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation3.OwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#OwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation4.OwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#OwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation7.OwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#OwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation8.OwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#OwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation9.OwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#OwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation10.OwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#OwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation11.OwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#OwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation12.OwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#OwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation13.OwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#OwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation15.OwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#OwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation14.OwnershipBeneficiaryRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnershipBeneficiaryRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of ownership or of beneficial ownership of the shares/units in the account. All subsequent subscriptions and or redemptions will be allocated using the same percentage."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OwnershipBeneficiaryRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5.OwnershipBeneficiaryRate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2.OwnershipBeneficiaryRate,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.OwnershipBeneficiaryRate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.OwnershipBeneficiaryRate,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4.OwnershipBeneficiaryRate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.OwnershipBeneficiaryRate,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8.OwnershipBeneficiaryRate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9.OwnershipBeneficiaryRate,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.OwnershipBeneficiaryRate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11.OwnershipBeneficiaryRate,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.OwnershipBeneficiaryRate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.OwnershipBeneficiaryRate,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.OwnershipBeneficiaryRate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.OwnershipBeneficiaryRate);
			elementContext_lazy = () -> InvestmentAccountPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OwnershipBeneficiaryRate";
			definition = "Percentage of ownership or of beneficial ownership of the shares/units in the account. All subsequent subscriptions and or redemptions will be allocated using the same percentage.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Specifies the account for which the party plays a role. It is derived
	 * from the association between AccountPartyRole and Account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentAccountPartyRole
	 * InvestmentAccount.InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut3#NomineeAccount
	 * TransferOut3.NomineeAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account for which the party plays a role. It is derived from the association between AccountPartyRole and Account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferOut3.NomineeAccount);
			elementContext_lazy = () -> InvestmentAccountPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Specifies the account for which the party plays a role. It is derived from the association between AccountPartyRole and Account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.InvestmentAccountPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of Foreign Account Tax Compliance Act (FATCA) form submitted by the
	 * investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
	 * FATCAFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#FATCAFormType
	 * InvestmentAccountOwnershipInformation10.FATCAFormType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#FATCAFormType
	 * InvestmentAccountOwnershipInformation11.FATCAFormType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.FATCAForm1Choice#Code
	 * FATCAForm1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#FATCAFormType
	 * InvestmentAccountOwnershipInformation12.FATCAFormType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#FATCAFormType
	 * InvestmentAccountOwnershipInformation13.FATCAFormType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#FATCAFormType
	 * InvestmentAccountOwnershipInformation15.FATCAFormType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#CRSFormType
	 * InvestmentAccountOwnershipInformation15.CRSFormType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.CRSForm1Choice#Code
	 * CRSForm1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#FATCAFormType
	 * InvestmentAccountOwnershipInformation14.FATCAFormType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#CRSFormType
	 * InvestmentAccountOwnershipInformation14.CRSFormType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAFormType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of Foreign Account Tax Compliance Act (FATCA) form submitted by the investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FATCAFormType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.FATCAFormType, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11.FATCAFormType,
					com.tools20022.repository.choice.FATCAForm1Choice.Code, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.FATCAFormType,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.FATCAFormType, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.FATCAFormType,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.CRSFormType, com.tools20022.repository.choice.CRSForm1Choice.Code,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.FATCAFormType, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.CRSFormType);
			elementContext_lazy = () -> InvestmentAccountPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FATCAFormType";
			definition = "Type of Foreign Account Tax Compliance Act (FATCA) form submitted by the investor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FATCAFormTypeCode.mmObject();
		}
	};
	/**
	 * Foreign Account Tax Compliance Act (FATCA) status of the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FATCAStatus#InvestmentAccountParty
	 * FATCAStatus.InvestmentAccountParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FATCAStatus
	 * FATCAStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#FATCAStatus
	 * InvestmentAccountOwnershipInformation10.FATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#FATCAStatus
	 * InvestmentAccountOwnershipInformation11.FATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#FATCAStatus
	 * InvestmentAccountOwnershipInformation12.FATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#FATCAStatus
	 * InvestmentAccountOwnershipInformation13.FATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#FATCAStatus
	 * InvestmentAccountOwnershipInformation15.FATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#FATCAStatus
	 * InvestmentAccountOwnershipInformation14.FATCAStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign Account Tax Compliance Act (FATCA) status of the investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FATCAStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.FATCAStatus, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11.FATCAStatus,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.FATCAStatus, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.FATCAStatus,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.FATCAStatus, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.FATCAStatus);
			elementContext_lazy = () -> InvestmentAccountPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FATCAStatus";
			definition = "Foreign Account Tax Compliance Act (FATCA) status of the investor.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FATCAStatus.InvestmentAccountParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Common Reporting Standard (CRS) status of the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CRSStatus#InvestmentAccountParty
	 * CRSStatus.InvestmentAccountParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CRSStatus CRSStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#CRSStatus
	 * InvestmentAccountOwnershipInformation15.CRSStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#CRSStatus
	 * InvestmentAccountOwnershipInformation14.CRSStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRSStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common Reporting Standard (CRS) status of the investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CRSStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.CRSStatus, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.CRSStatus);
			elementContext_lazy = () -> InvestmentAccountPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CRSStatus";
			definition = "Common Reporting Standard (CRS) status of the investor.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CRSStatus.InvestmentAccountParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountPartyRole";
				definition = "Specifies roles played by a party that are related to an investment account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.InvestmentAccountPartyRole, com.tools20022.repository.entity.FATCAStatus.InvestmentAccountParty,
						com.tools20022.repository.entity.CRSStatus.InvestmentAccountParty);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties2.OtherParty, com.tools20022.repository.msg.ExtendedParty2.OtherPartyDetails,
						com.tools20022.repository.msg.AccountParties5.OtherParty, com.tools20022.repository.msg.ExtendedParty3.ExtendedPartyRole, com.tools20022.repository.msg.ExtendedParty3.OtherPartyDetails,
						com.tools20022.repository.msg.AccountParties6.PrincipalAccountParty, com.tools20022.repository.msg.AccountParties6.OtherParty, com.tools20022.repository.msg.AccountParties3.OtherParty,
						com.tools20022.repository.msg.ExtendedParty1.OtherPartyDetails, com.tools20022.repository.msg.AccountParties4.OtherParty, com.tools20022.repository.msg.ExtendedParty4.ExtendedPartyRole,
						com.tools20022.repository.msg.ExtendedParty4.OtherPartyDetails, com.tools20022.repository.msg.AccountParties7.PrincipalAccountParty, com.tools20022.repository.msg.AccountParties7.OtherParty,
						com.tools20022.repository.msg.AccountParties9.PrincipalAccountParty, com.tools20022.repository.msg.AccountParties9.OtherParty, com.tools20022.repository.msg.AccountParties8.PrincipalAccountParty,
						com.tools20022.repository.msg.AccountParties8.OtherParty, com.tools20022.repository.msg.ExtendedParty6.ExtendedPartyRole, com.tools20022.repository.msg.ExtendedParty6.OtherPartyDetails,
						com.tools20022.repository.msg.ExtendedParty5.ExtendedPartyRole, com.tools20022.repository.msg.ExtendedParty5.OtherPartyDetails, com.tools20022.repository.msg.AccountParties11.PrincipalAccountParty,
						com.tools20022.repository.msg.AccountParties11.OtherParty, com.tools20022.repository.msg.AccountParties10.PrincipalAccountParty, com.tools20022.repository.msg.AccountParties10.OtherParty,
						com.tools20022.repository.msg.AccountParties12.PrincipalAccountParty, com.tools20022.repository.msg.AccountParties12.OtherParty, com.tools20022.repository.msg.ExtendedParty7.ExtendedPartyRole,
						com.tools20022.repository.msg.ExtendedParty7.OtherPartyDetails, com.tools20022.repository.msg.ExtendedParty8.ExtendedPartyRole, com.tools20022.repository.msg.ExtendedParty8.OtherPartyDetails,
						com.tools20022.repository.msg.AccountParties13.PrincipalAccountParty, com.tools20022.repository.msg.AccountParties13.OtherParty, com.tools20022.repository.msg.AccountParties14.PrincipalAccountParty,
						com.tools20022.repository.msg.AccountParties14.OtherParty, com.tools20022.repository.msg.ExtendedParty10.ExtendedPartyRole, com.tools20022.repository.msg.ExtendedParty10.OtherPartyDetails,
						com.tools20022.repository.msg.ExtendedParty9.ExtendedPartyRole, com.tools20022.repository.msg.ExtendedParty9.OtherPartyDetails, com.tools20022.repository.msg.AccountParties15.PrincipalAccountParty,
						com.tools20022.repository.msg.AccountParties15.OtherParty, com.tools20022.repository.msg.AccountParties16.PrincipalAccountParty, com.tools20022.repository.msg.AccountParties16.OtherParty,
						com.tools20022.repository.msg.ExtendedParty12.ExtendedPartyRole, com.tools20022.repository.msg.ExtendedParty12.OtherPartyDetails, com.tools20022.repository.msg.ExtendedParty11.ExtendedPartyRole,
						com.tools20022.repository.msg.ExtendedParty11.OtherPartyDetails);
				subType_lazy = () -> Arrays.asList(PrimaryOwner.mmObject(), TrusteeRole.mmObject(), CustodianForMinor.mmObject(), Nominee.mmObject(), JointOwner.mmObject(), SecondaryOwner.mmObject(), LegalGuardianRole.mmObject(),
						SuccessorOnDeath.mmObject(), AdministratorRole.mmObject(), IndividualInvestor.mmObject(), CorporateInvestor.mmObject(), Investor.mmObject());
				superType_lazy = () -> AccountPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountPartyRole.OwnershipBeneficiaryRate, com.tools20022.repository.entity.InvestmentAccountPartyRole.InvestmentAccount,
						com.tools20022.repository.entity.InvestmentAccountPartyRole.FATCAFormType, com.tools20022.repository.entity.InvestmentAccountPartyRole.FATCAStatus,
						com.tools20022.repository.entity.InvestmentAccountPartyRole.CRSStatus);
				derivationComponent_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation5.mmObject(), InvestmentAccountOwnershipInformation2.mmObject(), AccountParties2.mmObject(), ExtendedParty2.mmObject(),
						AccountParties5.mmObject(), MoneyLaunderingCheck1Choice.mmObject(), InvestmentAccountOwnershipInformation6.mmObject(), AccountParties1Choice.mmObject(), ExtendedParty3.mmObject(), AccountParties6.mmObject(),
						InvestmentAccountOwnershipInformation3.mmObject(), AccountParties3.mmObject(), InvestmentAccountOwnershipInformation4.mmObject(), ExtendedParty1.mmObject(), AccountParties4.mmObject(),
						InvestmentAccountOwnershipInformation7.mmObject(), AccountParties2Choice.mmObject(), ExtendedParty4.mmObject(), AccountParties7.mmObject(), AccountParties9.mmObject(), AccountParties8.mmObject(),
						InvestmentAccountOwnershipInformation8.mmObject(), ExtendedParty6.mmObject(), InvestmentAccountOwnershipInformation9.mmObject(), ExtendedParty5.mmObject(), AccountParties3Choice.mmObject(),
						AccountParties4Choice.mmObject(), AccountParties11.mmObject(), AccountParties10.mmObject(), AccountParties12.mmObject(), AccountParties7Choice.mmObject(), InvestmentAccountOwnershipInformation10.mmObject(),
						InvestmentAccountOwnershipInformation11.mmObject(), FATCAForm1Choice.mmObject(), ExtendedParty7.mmObject(), AccountParties6Choice.mmObject(), ExtendedParty8.mmObject(), AccountParties5Choice.mmObject(),
						AccountParties13.mmObject(), AccountParties14.mmObject(), InvestmentAccountOwnershipInformation12.mmObject(), ExtendedParty10.mmObject(), InvestmentAccountOwnershipInformation13.mmObject(),
						AccountParties9Choice.mmObject(), AccountParties8Choice.mmObject(), ExtendedParty9.mmObject(), AccountParties15.mmObject(), AccountParties16.mmObject(), InvestmentAccountOwnershipInformation15.mmObject(),
						AccountParties11Choice.mmObject(), ExtendedParty12.mmObject(), CRSForm1Choice.mmObject(), AccountParties10Choice.mmObject(), InvestmentAccountOwnershipInformation14.mmObject(), ExtendedParty11.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}