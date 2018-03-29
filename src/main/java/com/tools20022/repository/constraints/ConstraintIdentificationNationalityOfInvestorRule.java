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
import com.tools20022.repository.msg.PartyIdentificationAndAccount108;
import com.tools20022.repository.msg.PartyIdentificationAndAccount135;
import com.tools20022.repository.msg.PartyIdentificationAndAccount81;
import com.tools20022.repository.msg.PartyIdentificationAndAccount88;
import java.util.Arrays;

/**
 * Identification and/or Nationality must be present.
 */
public class ConstraintIdentificationNationalityOfInvestorRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount81
	 * PartyIdentificationAndAccount81}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationNationalityOfInvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification and/or Nationality must be present."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIdentificationNationalityOfInvestorRule#forPartyIdentificationAndAccount108
	 * ConstraintIdentificationNationalityOfInvestorRule.
	 * forPartyIdentificationAndAccount108}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount81> forPartyIdentificationAndAccount81 = new MMConstraint<PartyIdentificationAndAccount81>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationNationalityOfInvestorRule";
			definition = "Identification and/or Nationality must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIdentificationNationalityOfInvestorRule.forPartyIdentificationAndAccount108);
			owner_lazy = () -> PartyIdentificationAndAccount81.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentificationAndAccount81 obj) throws Exception {
			checkPartyIdentificationAndAccount81(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount88
	 * PartyIdentificationAndAccount88}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationNationalityOfInvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification and/or Nationality must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount88> forPartyIdentificationAndAccount88 = new MMConstraint<PartyIdentificationAndAccount88>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationNationalityOfInvestorRule";
			definition = "Identification and/or Nationality must be present.";
			owner_lazy = () -> PartyIdentificationAndAccount88.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentificationAndAccount88 obj) throws Exception {
			checkPartyIdentificationAndAccount88(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount108
	 * PartyIdentificationAndAccount108}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationNationalityOfInvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification and/or Nationality must be present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIdentificationNationalityOfInvestorRule#forPartyIdentificationAndAccount81
	 * ConstraintIdentificationNationalityOfInvestorRule.
	 * forPartyIdentificationAndAccount81}</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount108> forPartyIdentificationAndAccount108 = new MMConstraint<PartyIdentificationAndAccount108>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationNationalityOfInvestorRule";
			definition = "Identification and/or Nationality must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIdentificationNationalityOfInvestorRule.forPartyIdentificationAndAccount81;
			owner_lazy = () -> PartyIdentificationAndAccount108.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentificationAndAccount108 obj) throws Exception {
			checkPartyIdentificationAndAccount108(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount135
	 * PartyIdentificationAndAccount135}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationNationalityOfInvestorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification and/or Nationality must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationAndAccount135> forPartyIdentificationAndAccount135 = new MMConstraint<PartyIdentificationAndAccount135>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationNationalityOfInvestorRule";
			definition = "Identification and/or Nationality must be present.";
			owner_lazy = () -> PartyIdentificationAndAccount135.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentificationAndAccount135 obj) throws Exception {
			checkPartyIdentificationAndAccount135(obj);
		}
	};

	/**
	 * Identification and/or Nationality must be present.
	 */
	public static void checkPartyIdentificationAndAccount81(PartyIdentificationAndAccount81 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification and/or Nationality must be present.
	 */
	public static void checkPartyIdentificationAndAccount88(PartyIdentificationAndAccount88 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification and/or Nationality must be present.
	 */
	public static void checkPartyIdentificationAndAccount108(PartyIdentificationAndAccount108 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Identification and/or Nationality must be present.
	 */
	public static void checkPartyIdentificationAndAccount135(PartyIdentificationAndAccount135 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}