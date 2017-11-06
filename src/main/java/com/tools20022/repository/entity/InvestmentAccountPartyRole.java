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
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmOwnershipBeneficiaryRate
 * InvestmentAccountPartyRole.mmOwnershipBeneficiaryRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmInvestmentAccount
 * InvestmentAccountPartyRole.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmFATCAFormType
 * InvestmentAccountPartyRole.mmFATCAFormType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmFATCAStatus
 * InvestmentAccountPartyRole.mmFATCAStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmCRSStatus
 * InvestmentAccountPartyRole.mmCRSStatus}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountPartyRole
 * InvestmentAccount.mmInvestmentAccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FATCAStatus#mmInvestmentAccountParty
 * FATCAStatus.mmInvestmentAccountParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CRSStatus#mmInvestmentAccountParty
 * CRSStatus.mmInvestmentAccountParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#mmOtherParty
 * AccountParties2.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty2#mmOtherPartyDetails
 * ExtendedParty2.mmOtherPartyDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#mmOtherParty
 * AccountParties5.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty3#mmExtendedPartyRole
 * ExtendedParty3.mmExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty3#mmOtherPartyDetails
 * ExtendedParty3.mmOtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties6#mmPrincipalAccountParty
 * AccountParties6.mmPrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties6#mmOtherParty
 * AccountParties6.mmOtherParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#mmOtherParty
 * AccountParties3.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty1#mmOtherPartyDetails
 * ExtendedParty1.mmOtherPartyDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#mmOtherParty
 * AccountParties4.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty4#mmExtendedPartyRole
 * ExtendedParty4.mmExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty4#mmOtherPartyDetails
 * ExtendedParty4.mmOtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties7#mmPrincipalAccountParty
 * AccountParties7.mmPrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties7#mmOtherParty
 * AccountParties7.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties9#mmPrincipalAccountParty
 * AccountParties9.mmPrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties9#mmOtherParty
 * AccountParties9.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties8#mmPrincipalAccountParty
 * AccountParties8.mmPrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties8#mmOtherParty
 * AccountParties8.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty6#mmExtendedPartyRole
 * ExtendedParty6.mmExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty6#mmOtherPartyDetails
 * ExtendedParty6.mmOtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty5#mmExtendedPartyRole
 * ExtendedParty5.mmExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty5#mmOtherPartyDetails
 * ExtendedParty5.mmOtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties11#mmPrincipalAccountParty
 * AccountParties11.mmPrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties11#mmOtherParty
 * AccountParties11.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties10#mmPrincipalAccountParty
 * AccountParties10.mmPrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties10#mmOtherParty
 * AccountParties10.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties12#mmPrincipalAccountParty
 * AccountParties12.mmPrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties12#mmOtherParty
 * AccountParties12.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty7#mmExtendedPartyRole
 * ExtendedParty7.mmExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty7#mmOtherPartyDetails
 * ExtendedParty7.mmOtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty8#mmExtendedPartyRole
 * ExtendedParty8.mmExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty8#mmOtherPartyDetails
 * ExtendedParty8.mmOtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmPrincipalAccountParty
 * AccountParties13.mmPrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties13#mmOtherParty
 * AccountParties13.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmPrincipalAccountParty
 * AccountParties14.mmPrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties14#mmOtherParty
 * AccountParties14.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty10#mmExtendedPartyRole
 * ExtendedParty10.mmExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty10#mmOtherPartyDetails
 * ExtendedParty10.mmOtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty9#mmExtendedPartyRole
 * ExtendedParty9.mmExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty9#mmOtherPartyDetails
 * ExtendedParty9.mmOtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmPrincipalAccountParty
 * AccountParties15.mmPrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#mmOtherParty
 * AccountParties15.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmPrincipalAccountParty
 * AccountParties16.mmPrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16#mmOtherParty
 * AccountParties16.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty12#mmExtendedPartyRole
 * ExtendedParty12.mmExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty12#mmOtherPartyDetails
 * ExtendedParty12.mmOtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty11#mmExtendedPartyRole
 * ExtendedParty11.mmExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty11#mmOtherPartyDetails
 * ExtendedParty11.mmOtherPartyDetails}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected PercentageRate ownershipBeneficiaryRate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation5.mmOwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation2.mmOwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation6.mmOwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation3.mmOwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation4.mmOwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation7.mmOwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation8.mmOwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation9.mmOwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation10.mmOwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation11.mmOwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation12.mmOwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation13.mmOwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation15.mmOwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation14.mmOwnershipBeneficiaryRate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmOwnershipBeneficiaryRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5.mmOwnershipBeneficiaryRate,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2.mmOwnershipBeneficiaryRate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.mmOwnershipBeneficiaryRate,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmOwnershipBeneficiaryRate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4.mmOwnershipBeneficiaryRate,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmOwnershipBeneficiaryRate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8.mmOwnershipBeneficiaryRate,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9.mmOwnershipBeneficiaryRate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmOwnershipBeneficiaryRate,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11.mmOwnershipBeneficiaryRate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmOwnershipBeneficiaryRate,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.mmOwnershipBeneficiaryRate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmOwnershipBeneficiaryRate,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmOwnershipBeneficiaryRate);
			elementContext_lazy = () -> InvestmentAccountPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OwnershipBeneficiaryRate";
			definition = "Percentage of ownership or of beneficial ownership of the shares/units in the account. All subsequent subscriptions and or redemptions will be allocated using the same percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount;
	/**
	 * Specifies the account for which the party plays a role. It is derived
	 * from the association between AccountPartyRole and Account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountPartyRole
	 * InvestmentAccount.mmInvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut3#mmNomineeAccount
	 * TransferOut3.mmNomineeAccount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmInvestmentAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferOut3.mmNomineeAccount);
			elementContext_lazy = () -> InvestmentAccountPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Specifies the account for which the party plays a role. It is derived from the association between AccountPartyRole and Account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmInvestmentAccountPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	protected FATCAFormTypeCode fATCAFormType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmFATCAFormType
	 * InvestmentAccountOwnershipInformation10.mmFATCAFormType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmFATCAFormType
	 * InvestmentAccountOwnershipInformation11.mmFATCAFormType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.FATCAForm1Choice#mmCode
	 * FATCAForm1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmFATCAFormType
	 * InvestmentAccountOwnershipInformation12.mmFATCAFormType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmFATCAFormType
	 * InvestmentAccountOwnershipInformation13.mmFATCAFormType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmFATCAFormType
	 * InvestmentAccountOwnershipInformation15.mmFATCAFormType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmCRSFormType
	 * InvestmentAccountOwnershipInformation15.mmCRSFormType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.CRSForm1Choice#mmCode
	 * CRSForm1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmFATCAFormType
	 * InvestmentAccountOwnershipInformation14.mmFATCAFormType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmCRSFormType
	 * InvestmentAccountOwnershipInformation14.mmCRSFormType}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmFATCAFormType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmFATCAFormType, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11.mmFATCAFormType,
					com.tools20022.repository.choice.FATCAForm1Choice.mmCode, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmFATCAFormType,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.mmFATCAFormType, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmFATCAFormType,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmCRSFormType, com.tools20022.repository.choice.CRSForm1Choice.mmCode,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmFATCAFormType, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmCRSFormType);
			elementContext_lazy = () -> InvestmentAccountPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FATCAFormType";
			definition = "Type of Foreign Account Tax Compliance Act (FATCA) form submitted by the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FATCAFormTypeCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.FATCAStatus> fATCAStatus;
	/**
	 * Foreign Account Tax Compliance Act (FATCA) status of the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FATCAStatus#mmInvestmentAccountParty
	 * FATCAStatus.mmInvestmentAccountParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FATCAStatus
	 * FATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmFATCAStatus
	 * InvestmentAccountOwnershipInformation10.mmFATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmFATCAStatus
	 * InvestmentAccountOwnershipInformation11.mmFATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmFATCAStatus
	 * InvestmentAccountOwnershipInformation12.mmFATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmFATCAStatus
	 * InvestmentAccountOwnershipInformation13.mmFATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmFATCAStatus
	 * InvestmentAccountOwnershipInformation15.mmFATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmFATCAStatus
	 * InvestmentAccountOwnershipInformation14.mmFATCAStatus}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmFATCAStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmFATCAStatus, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11.mmFATCAStatus,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmFATCAStatus, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.mmFATCAStatus,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmFATCAStatus, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmFATCAStatus);
			elementContext_lazy = () -> InvestmentAccountPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FATCAStatus";
			definition = "Foreign Account Tax Compliance Act (FATCA) status of the investor.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmInvestmentAccountParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmObject();
		}
	};
	protected CRSStatus cRSStatus;
	/**
	 * Common Reporting Standard (CRS) status of the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CRSStatus#mmInvestmentAccountParty
	 * CRSStatus.mmInvestmentAccountParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CRSStatus CRSStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmCRSStatus
	 * InvestmentAccountOwnershipInformation15.mmCRSStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmCRSStatus
	 * InvestmentAccountOwnershipInformation14.mmCRSStatus}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmCRSStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmCRSStatus, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmCRSStatus);
			elementContext_lazy = () -> InvestmentAccountPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CRSStatus";
			definition = "Common Reporting Standard (CRS) status of the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmInvestmentAccountParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountPartyRole";
				definition = "Specifies roles played by a party that are related to an investment account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.mmInvestmentAccountPartyRole, com.tools20022.repository.entity.FATCAStatus.mmInvestmentAccountParty,
						com.tools20022.repository.entity.CRSStatus.mmInvestmentAccountParty);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties2.mmOtherParty, com.tools20022.repository.msg.ExtendedParty2.mmOtherPartyDetails,
						com.tools20022.repository.msg.AccountParties5.mmOtherParty, com.tools20022.repository.msg.ExtendedParty3.mmExtendedPartyRole, com.tools20022.repository.msg.ExtendedParty3.mmOtherPartyDetails,
						com.tools20022.repository.msg.AccountParties6.mmPrincipalAccountParty, com.tools20022.repository.msg.AccountParties6.mmOtherParty, com.tools20022.repository.msg.AccountParties3.mmOtherParty,
						com.tools20022.repository.msg.ExtendedParty1.mmOtherPartyDetails, com.tools20022.repository.msg.AccountParties4.mmOtherParty, com.tools20022.repository.msg.ExtendedParty4.mmExtendedPartyRole,
						com.tools20022.repository.msg.ExtendedParty4.mmOtherPartyDetails, com.tools20022.repository.msg.AccountParties7.mmPrincipalAccountParty, com.tools20022.repository.msg.AccountParties7.mmOtherParty,
						com.tools20022.repository.msg.AccountParties9.mmPrincipalAccountParty, com.tools20022.repository.msg.AccountParties9.mmOtherParty, com.tools20022.repository.msg.AccountParties8.mmPrincipalAccountParty,
						com.tools20022.repository.msg.AccountParties8.mmOtherParty, com.tools20022.repository.msg.ExtendedParty6.mmExtendedPartyRole, com.tools20022.repository.msg.ExtendedParty6.mmOtherPartyDetails,
						com.tools20022.repository.msg.ExtendedParty5.mmExtendedPartyRole, com.tools20022.repository.msg.ExtendedParty5.mmOtherPartyDetails, com.tools20022.repository.msg.AccountParties11.mmPrincipalAccountParty,
						com.tools20022.repository.msg.AccountParties11.mmOtherParty, com.tools20022.repository.msg.AccountParties10.mmPrincipalAccountParty, com.tools20022.repository.msg.AccountParties10.mmOtherParty,
						com.tools20022.repository.msg.AccountParties12.mmPrincipalAccountParty, com.tools20022.repository.msg.AccountParties12.mmOtherParty, com.tools20022.repository.msg.ExtendedParty7.mmExtendedPartyRole,
						com.tools20022.repository.msg.ExtendedParty7.mmOtherPartyDetails, com.tools20022.repository.msg.ExtendedParty8.mmExtendedPartyRole, com.tools20022.repository.msg.ExtendedParty8.mmOtherPartyDetails,
						com.tools20022.repository.msg.AccountParties13.mmPrincipalAccountParty, com.tools20022.repository.msg.AccountParties13.mmOtherParty, com.tools20022.repository.msg.AccountParties14.mmPrincipalAccountParty,
						com.tools20022.repository.msg.AccountParties14.mmOtherParty, com.tools20022.repository.msg.ExtendedParty10.mmExtendedPartyRole, com.tools20022.repository.msg.ExtendedParty10.mmOtherPartyDetails,
						com.tools20022.repository.msg.ExtendedParty9.mmExtendedPartyRole, com.tools20022.repository.msg.ExtendedParty9.mmOtherPartyDetails, com.tools20022.repository.msg.AccountParties15.mmPrincipalAccountParty,
						com.tools20022.repository.msg.AccountParties15.mmOtherParty, com.tools20022.repository.msg.AccountParties16.mmPrincipalAccountParty, com.tools20022.repository.msg.AccountParties16.mmOtherParty,
						com.tools20022.repository.msg.ExtendedParty12.mmExtendedPartyRole, com.tools20022.repository.msg.ExtendedParty12.mmOtherPartyDetails, com.tools20022.repository.msg.ExtendedParty11.mmExtendedPartyRole,
						com.tools20022.repository.msg.ExtendedParty11.mmOtherPartyDetails);
				subType_lazy = () -> Arrays.asList(PrimaryOwner.mmObject(), TrusteeRole.mmObject(), CustodianForMinor.mmObject(), Nominee.mmObject(), JointOwner.mmObject(), SecondaryOwner.mmObject(), LegalGuardianRole.mmObject(),
						SuccessorOnDeath.mmObject(), AdministratorRole.mmObject(), IndividualInvestor.mmObject(), CorporateInvestor.mmObject(), Investor.mmObject());
				superType_lazy = () -> AccountPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountPartyRole.mmOwnershipBeneficiaryRate, com.tools20022.repository.entity.InvestmentAccountPartyRole.mmInvestmentAccount,
						com.tools20022.repository.entity.InvestmentAccountPartyRole.mmFATCAFormType, com.tools20022.repository.entity.InvestmentAccountPartyRole.mmFATCAStatus,
						com.tools20022.repository.entity.InvestmentAccountPartyRole.mmCRSStatus);
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

	public PercentageRate getOwnershipBeneficiaryRate() {
		return ownershipBeneficiaryRate;
	}

	public void setOwnershipBeneficiaryRate(PercentageRate ownershipBeneficiaryRate) {
		this.ownershipBeneficiaryRate = ownershipBeneficiaryRate;
	}

	public List<InvestmentAccount> getInvestmentAccount() {
		return investmentAccount;
	}

	public void setInvestmentAccount(List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount) {
		this.investmentAccount = investmentAccount;
	}

	public FATCAFormTypeCode getFATCAFormType() {
		return fATCAFormType;
	}

	public void setFATCAFormType(FATCAFormTypeCode fATCAFormType) {
		this.fATCAFormType = fATCAFormType;
	}

	public List<FATCAStatus> getFATCAStatus() {
		return fATCAStatus;
	}

	public void setFATCAStatus(List<com.tools20022.repository.entity.FATCAStatus> fATCAStatus) {
		this.fATCAStatus = fATCAStatus;
	}

	public CRSStatus getCRSStatus() {
		return cRSStatus;
	}

	public void setCRSStatus(com.tools20022.repository.entity.CRSStatus cRSStatus) {
		this.cRSStatus = cRSStatus;
	}
}