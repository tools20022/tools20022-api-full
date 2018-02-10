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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * If ModificationScopeIndication is INSE, then at least one occurrence of
 * Organisation/ModifiedAddress or IndividualPerson/ModifiedAddress must be
 * present with Organisation/ModifiedAddress/ModificationScopeIndication being
 * INSE or IndividualPerson/ModifiedAddres/ModificationScopeIndication being
 * INSE respectively.
 */
public class ConstraintAddressRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties3
	 * AccountParties3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ModificationScopeIndication is INSE, then at least one occurrence of Organisation/ModifiedAddress or IndividualPerson/ModifiedAddress must be present with Organisation/ModifiedAddress/ModificationScopeIndication being INSE or IndividualPerson/ModifiedAddres/ModificationScopeIndication being INSE respectively."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties3> forAccountParties3 = new MMConstraint<AccountParties3>() {
		{
			validator = ConstraintAddressRule::checkAccountParties3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressRule";
			definition = "If ModificationScopeIndication is INSE, then at least one occurrence of Organisation/ModifiedAddress or IndividualPerson/ModifiedAddress must be present with Organisation/ModifiedAddress/ModificationScopeIndication being INSE or IndividualPerson/ModifiedAddres/ModificationScopeIndication being INSE respectively.";
			owner_lazy = () -> AccountParties3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ModificationScopeIndication is INSE, then at least one occurrence of Organisation/ModifiedAddress or IndividualPerson/ModifiedAddress must be present with Organisation/ModifiedAddress/ModificationScopeIndication being INSE or IndividualPerson/ModifiedAddres/ModificationScopeIndication being INSE respectively."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties4> forAccountParties4 = new MMConstraint<AccountParties4>() {
		{
			validator = ConstraintAddressRule::checkAccountParties4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressRule";
			definition = "If ModificationScopeIndication is INSE, then at least one occurrence of Organisation/ModifiedAddress or IndividualPerson/ModifiedAddress must be present with Organisation/ModifiedAddress/ModificationScopeIndication being INSE or IndividualPerson/ModifiedAddres/ModificationScopeIndication being INSE respectively.";
			owner_lazy = () -> AccountParties4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties7
	 * AccountParties7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ModificationScopeIndication is INSE, then at least one occurrence of Organisation/ModifiedAddress or IndividualPerson/ModifiedAddress must be present with Organisation/ModifiedAddress/ModificationScopeIndication being INSE or IndividualPerson/ModifiedAddres/ModificationScopeIndication being INSE respectively."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAddressRule#forAccountParties8
	 * ConstraintAddressRule.forAccountParties8}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties7> forAccountParties7 = new MMConstraint<AccountParties7>() {
		{
			validator = ConstraintAddressRule::checkAccountParties7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressRule";
			definition = "If ModificationScopeIndication is INSE, then at least one occurrence of Organisation/ModifiedAddress or IndividualPerson/ModifiedAddress must be present with Organisation/ModifiedAddress/ModificationScopeIndication being INSE or IndividualPerson/ModifiedAddres/ModificationScopeIndication being INSE respectively.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAddressRule.forAccountParties8);
			owner_lazy = () -> AccountParties7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties8
	 * AccountParties8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ModificationScopeIndication is INSE, then one of the following must be present:\r\nPrincipalAccountParty/PrimaryOwner/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/PrimaryOwner/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Trustee/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Trustee/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/CustodianForMinor/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/CustodianForMinor/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Nominee/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Nominee/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/JointOwner/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/JointOwner/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSecondaryOwner/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSecondaryOwner/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nBeneficiary/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nBeneficiary/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPowerOfAttorney/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPowerOfAttorney/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nLegalGuardian/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nLegalGuardian/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSuccessorOnDeath/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSuccessorOnDeath/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nAdminstrator/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nAdminstrator/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nGranter/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nGranter/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSettler/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSettler/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nOtherParty/OtherPartyDetails/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nOtherParty/OtherPartyDetails/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAddressRule#forAccountParties11
	 * ConstraintAddressRule.forAccountParties11}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAddressRule#forAccountParties7
	 * ConstraintAddressRule.forAccountParties7}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties8> forAccountParties8 = new MMConstraint<AccountParties8>() {
		{
			validator = ConstraintAddressRule::checkAccountParties8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressRule";
			definition = "If ModificationScopeIndication is INSE, then one of the following must be present:\r\nPrincipalAccountParty/PrimaryOwner/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/PrimaryOwner/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Trustee/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Trustee/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/CustodianForMinor/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/CustodianForMinor/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Nominee/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Nominee/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/JointOwner/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/JointOwner/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSecondaryOwner/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSecondaryOwner/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nBeneficiary/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nBeneficiary/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPowerOfAttorney/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPowerOfAttorney/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nLegalGuardian/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nLegalGuardian/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSuccessorOnDeath/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSuccessorOnDeath/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nAdminstrator/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nAdminstrator/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nGranter/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nGranter/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSettler/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSettler/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nOtherParty/OtherPartyDetails/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nOtherParty/OtherPartyDetails/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAddressRule.forAccountParties11);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAddressRule.forAccountParties7;
			owner_lazy = () -> AccountParties8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties11
	 * AccountParties11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ModificationScopeIndication is INSE, then one of the following must be present:\r\nPrincipalAccountParty/PrimaryOwner/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/PrimaryOwner/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Trustee/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Trustee/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/CustodianForMinor/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/CustodianForMinor/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Nominee/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Nominee/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/JointOwner/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/JointOwner/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSecondaryOwner/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSecondaryOwner/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nBeneficiary/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nBeneficiary/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPowerOfAttorney/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPowerOfAttorney/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nLegalGuardian/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nLegalGuardian/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSuccessorOnDeath/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSuccessorOnDeath/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nAdministrator/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nAdministrator/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nGranter/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nGranter/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSettlor/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSettlor/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nOtherParty/OtherPartyDetails/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nOtherParty/OtherPartyDetails/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAddressRule#forAccountParties14
	 * ConstraintAddressRule.forAccountParties14}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAddressRule#forAccountParties8
	 * ConstraintAddressRule.forAccountParties8}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties11> forAccountParties11 = new MMConstraint<AccountParties11>() {
		{
			validator = ConstraintAddressRule::checkAccountParties11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressRule";
			definition = "If ModificationScopeIndication is INSE, then one of the following must be present:\r\nPrincipalAccountParty/PrimaryOwner/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/PrimaryOwner/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Trustee/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Trustee/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/CustodianForMinor/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/CustodianForMinor/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Nominee/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Nominee/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/JointOwner/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/JointOwner/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSecondaryOwner/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSecondaryOwner/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nBeneficiary/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nBeneficiary/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPowerOfAttorney/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPowerOfAttorney/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nLegalGuardian/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nLegalGuardian/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSuccessorOnDeath/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSuccessorOnDeath/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nAdministrator/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nAdministrator/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nGranter/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nGranter/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSettlor/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSettlor/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nOtherParty/OtherPartyDetails/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nOtherParty/OtherPartyDetails/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAddressRule.forAccountParties14);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAddressRule.forAccountParties8;
			owner_lazy = () -> AccountParties11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties14
	 * AccountParties14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ModificationScopeIndication is INSE, then one of the following must be present:\r\nPrincipalAccountParty/PrimaryOwner/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/PrimaryOwner/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Trustee/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Trustee/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/CustodianForMinor/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/CustodianForMinor/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Nominee/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Nominee/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/JointOwner/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/JointOwner/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSecondaryOwner/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSecondaryOwner/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nBeneficiary/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nBeneficiary/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPowerOfAttorney/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPowerOfAttorney/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nLegalGuardian/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nLegalGuardian/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSuccessorOnDeath/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSuccessorOnDeath/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nAdministrator/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nAdministrator/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nGranter/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nGranter/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSettlor/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSettlor/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nOtherParty/OtherPartyDetails/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nOtherParty/OtherPartyDetails/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAddressRule#forAccountParties16
	 * ConstraintAddressRule.forAccountParties16}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAddressRule#forAccountParties11
	 * ConstraintAddressRule.forAccountParties11}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties14> forAccountParties14 = new MMConstraint<AccountParties14>() {
		{
			validator = ConstraintAddressRule::checkAccountParties14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressRule";
			definition = "If ModificationScopeIndication is INSE, then one of the following must be present:\r\nPrincipalAccountParty/PrimaryOwner/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/PrimaryOwner/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Trustee/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Trustee/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/CustodianForMinor/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/CustodianForMinor/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Nominee/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/Nominee/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/JointOwner/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPrincipalAccountParty/JointOwner/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSecondaryOwner/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSecondaryOwner/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nBeneficiary/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nBeneficiary/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPowerOfAttorney/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nPowerOfAttorney/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nLegalGuardian/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nLegalGuardian/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSuccessorOnDeath/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSuccessorOnDeath/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nAdministrator/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nAdministrator/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nGranter/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nGranter/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSettlor/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nSettlor/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nOtherParty/OtherPartyDetails/Party/Organisation/ModifiedPostalAddress/ModificationScopeIndication/INSE\r\nOtherParty/OtherPartyDetails/Party/IndividualPerson/ModifiedPostalAddress/ModificationScopeIndication/INSE.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAddressRule.forAccountParties16);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAddressRule.forAccountParties11;
			owner_lazy = () -> AccountParties14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties16
	 * AccountParties16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ModificationScopeIndication is INSE (InsertNewDataSet), then one of the following must be present:\r\nPrincipalAccountParty/./Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nCustodianForMinor/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nSecondaryOwner/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nBeneficiary/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nPowerOfAttorney/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nLegalGuardian/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nSuccessorOnDeath/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nAdministrator/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nOtherParty/OtherPartyDetails/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nGranter/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nSettlor/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nSeniorManagingOfficial/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nProtector/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAddressRule#forAccountParties14
	 * ConstraintAddressRule.forAccountParties14}</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties16> forAccountParties16 = new MMConstraint<AccountParties16>() {
		{
			validator = ConstraintAddressRule::checkAccountParties16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressRule";
			definition = "If ModificationScopeIndication is INSE (InsertNewDataSet), then one of the following must be present:\r\nPrincipalAccountParty/./Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nCustodianForMinor/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nSecondaryOwner/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nBeneficiary/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nPowerOfAttorney/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nLegalGuardian/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nSuccessorOnDeath/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nAdministrator/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nOtherParty/OtherPartyDetails/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nGranter/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nSettlor/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nSeniorManagingOfficial/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet)\r\nProtector/./ModifiedPostalAddress/ModificationScopeIndication/INSE (InsertNewDataSet).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAddressRule.forAccountParties14;
			owner_lazy = () -> AccountParties16.mmObject();
		}
	};

	/**
	 * If ModificationScopeIndication is INSE, then at least one occurrence of
	 * Organisation/ModifiedAddress or IndividualPerson/ModifiedAddress must be
	 * present with Organisation/ModifiedAddress/ModificationScopeIndication
	 * being INSE or IndividualPerson/ModifiedAddres/ModificationScopeIndication
	 * being INSE respectively.
	 */
	public static void checkAccountParties3(AccountParties3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ModificationScopeIndication is INSE, then at least one occurrence of
	 * Organisation/ModifiedAddress or IndividualPerson/ModifiedAddress must be
	 * present with Organisation/ModifiedAddress/ModificationScopeIndication
	 * being INSE or IndividualPerson/ModifiedAddres/ModificationScopeIndication
	 * being INSE respectively.
	 */
	public static void checkAccountParties4(AccountParties4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ModificationScopeIndication is INSE, then at least one occurrence of
	 * Organisation/ModifiedAddress or IndividualPerson/ModifiedAddress must be
	 * present with Organisation/ModifiedAddress/ModificationScopeIndication
	 * being INSE or IndividualPerson/ModifiedAddres/ModificationScopeIndication
	 * being INSE respectively.
	 */
	public static void checkAccountParties7(AccountParties7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ModificationScopeIndication is INSE, then one of the following must be
	 * present:<br>
	 * PrincipalAccountParty/PrimaryOwner/Party/Organisation/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/PrimaryOwner/Party/IndividualPerson/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/Trustee/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/Trustee/Party/IndividualPerson/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/CustodianForMinor/Party/Organisation/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/CustodianForMinor/Party/IndividualPerson/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/Nominee/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/Nominee/Party/IndividualPerson/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/JointOwner/Party/Organisation/ModifiedPostalAddress
	 * /ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/JointOwner/Party/IndividualPerson/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * SecondaryOwner/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * SecondaryOwner/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Beneficiary/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Beneficiary/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * PowerOfAttorney/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * PowerOfAttorney/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * LegalGuardian/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * LegalGuardian/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * SuccessorOnDeath/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * SuccessorOnDeath/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Adminstrator/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Adminstrator/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Granter/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Granter/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Settler/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Settler/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * OtherParty/OtherPartyDetails/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * OtherParty/OtherPartyDetails/Party/IndividualPerson/ModifiedPostalAddress
	 * /ModificationScopeIndication/INSE<br>
	 */
	public static void checkAccountParties8(AccountParties8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ModificationScopeIndication is INSE, then one of the following must be
	 * present:<br>
	 * PrincipalAccountParty/PrimaryOwner/Party/Organisation/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/PrimaryOwner/Party/IndividualPerson/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/Trustee/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/Trustee/Party/IndividualPerson/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/CustodianForMinor/Party/Organisation/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/CustodianForMinor/Party/IndividualPerson/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/Nominee/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/Nominee/Party/IndividualPerson/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/JointOwner/Party/Organisation/ModifiedPostalAddress
	 * /ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/JointOwner/Party/IndividualPerson/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * SecondaryOwner/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * SecondaryOwner/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Beneficiary/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Beneficiary/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * PowerOfAttorney/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * PowerOfAttorney/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * LegalGuardian/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * LegalGuardian/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * SuccessorOnDeath/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * SuccessorOnDeath/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Administrator/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Administrator/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Granter/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Granter/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Settlor/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Settlor/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * OtherParty/OtherPartyDetails/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * OtherParty/OtherPartyDetails/Party/IndividualPerson/ModifiedPostalAddress
	 * /ModificationScopeIndication/INSE<br>
	 */
	public static void checkAccountParties11(AccountParties11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ModificationScopeIndication is INSE, then one of the following must be
	 * present:<br>
	 * PrincipalAccountParty/PrimaryOwner/Party/Organisation/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/PrimaryOwner/Party/IndividualPerson/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/Trustee/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/Trustee/Party/IndividualPerson/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/CustodianForMinor/Party/Organisation/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/CustodianForMinor/Party/IndividualPerson/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/Nominee/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/Nominee/Party/IndividualPerson/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/JointOwner/Party/Organisation/ModifiedPostalAddress
	 * /ModificationScopeIndication/INSE<br>
	 * PrincipalAccountParty/JointOwner/Party/IndividualPerson/
	 * ModifiedPostalAddress/ModificationScopeIndication/INSE<br>
	 * SecondaryOwner/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * SecondaryOwner/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Beneficiary/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Beneficiary/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * PowerOfAttorney/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * PowerOfAttorney/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * LegalGuardian/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * LegalGuardian/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * SuccessorOnDeath/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * SuccessorOnDeath/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Administrator/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Administrator/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Granter/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Granter/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Settlor/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * Settlor/Party/IndividualPerson/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * OtherParty/OtherPartyDetails/Party/Organisation/ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE<br>
	 * OtherParty/OtherPartyDetails/Party/IndividualPerson/ModifiedPostalAddress
	 * /ModificationScopeIndication/INSE.
	 */
	public static void checkAccountParties14(AccountParties14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ModificationScopeIndication is INSE (InsertNewDataSet), then one of
	 * the following must be present:<br>
	 * PrincipalAccountParty/./Party/./ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE (InsertNewDataSet)<br>
	 * CustodianForMinor/Party/./ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE (InsertNewDataSet)<br>
	 * SecondaryOwner/Party/./ModifiedPostalAddress/ModificationScopeIndication/
	 * INSE (InsertNewDataSet)<br>
	 * Beneficiary/Party/./ModifiedPostalAddress/ModificationScopeIndication/
	 * INSE (InsertNewDataSet)<br>
	 * PowerOfAttorney/Party/./ModifiedPostalAddress/ModificationScopeIndication
	 * /INSE (InsertNewDataSet)<br>
	 * LegalGuardian/Party/./ModifiedPostalAddress/ModificationScopeIndication/
	 * INSE (InsertNewDataSet)<br>
	 * SuccessorOnDeath/Party/./ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE (InsertNewDataSet)<br>
	 * Administrator/Party/./ModifiedPostalAddress/ModificationScopeIndication/
	 * INSE (InsertNewDataSet)<br>
	 * OtherParty/OtherPartyDetails/Party/./ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE (InsertNewDataSet)<br>
	 * Granter/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE
	 * (InsertNewDataSet)<br>
	 * Settlor/Party/./ModifiedPostalAddress/ModificationScopeIndication/INSE
	 * (InsertNewDataSet)<br>
	 * SeniorManagingOfficial/./ModifiedPostalAddress/
	 * ModificationScopeIndication/INSE (InsertNewDataSet)<br>
	 * Protector/./ModifiedPostalAddress/ModificationScopeIndication/INSE
	 * (InsertNewDataSet).
	 */
	public static void checkAccountParties16(AccountParties16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}