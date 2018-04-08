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
 * If TypeOfPriceCode is not MRKT, then Value may not be expressed with
 * UnknownIndicator.
 */
public class ConstraintValueRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation5
	 * PriceInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintValueRule#forPriceInformation12
	 * ConstraintValueRule.forPriceInformation12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceInformation5> forPriceInformation5 = new MMConstraint<PriceInformation5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueRule";
			definition = "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintValueRule.forPriceInformation12);
			owner_lazy = () -> PriceInformation5.mmObject();
		}

		@Override
		public void executeValidator(PriceInformation5 obj) throws Exception {
			checkPriceInformation5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation14
	 * PriceInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceInformation14> forPriceInformation14 = new MMConstraint<PriceInformation14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueRule";
			definition = "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator.";
			owner_lazy = () -> PriceInformation14.mmObject();
		}

		@Override
		public void executeValidator(PriceInformation14 obj) throws Exception {
			checkPriceInformation14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation13
	 * PriceInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintValueRule#forPriceInformation18
	 * ConstraintValueRule.forPriceInformation18}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintValueRule#forPriceInformation6
	 * ConstraintValueRule.forPriceInformation6}</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceInformation13> forPriceInformation13 = new MMConstraint<PriceInformation13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueRule";
			definition = "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintValueRule.forPriceInformation18);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintValueRule.forPriceInformation6;
			owner_lazy = () -> PriceInformation13.mmObject();
		}

		@Override
		public void executeValidator(PriceInformation13 obj) throws Exception {
			checkPriceInformation13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation8
	 * PriceInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceInformation8> forPriceInformation8 = new MMConstraint<PriceInformation8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueRule";
			definition = "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator.";
			owner_lazy = () -> PriceInformation8.mmObject();
		}

		@Override
		public void executeValidator(PriceInformation8 obj) throws Exception {
			checkPriceInformation8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation7
	 * PriceInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceInformation7> forPriceInformation7 = new MMConstraint<PriceInformation7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueRule";
			definition = "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator.";
			owner_lazy = () -> PriceInformation7.mmObject();
		}

		@Override
		public void executeValidator(PriceInformation7 obj) throws Exception {
			checkPriceInformation7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation16
	 * PriceInformation16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceInformation16> forPriceInformation16 = new MMConstraint<PriceInformation16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueRule";
			definition = "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator.";
			owner_lazy = () -> PriceInformation16.mmObject();
		}

		@Override
		public void executeValidator(PriceInformation16 obj) throws Exception {
			checkPriceInformation16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation6
	 * PriceInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintValueRule#forPriceInformation13
	 * ConstraintValueRule.forPriceInformation13}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceInformation6> forPriceInformation6 = new MMConstraint<PriceInformation6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueRule";
			definition = "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintValueRule.forPriceInformation13);
			owner_lazy = () -> PriceInformation6.mmObject();
		}

		@Override
		public void executeValidator(PriceInformation6 obj) throws Exception {
			checkPriceInformation6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation1
	 * PriceInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is not MRKT, then Value may not be expressed with UnknownIndicator."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceInformation1> forPriceInformation1 = new MMConstraint<PriceInformation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueRule";
			definition = "If Type is not MRKT, then Value may not be expressed with UnknownIndicator.";
			owner_lazy = () -> PriceInformation1.mmObject();
		}

		@Override
		public void executeValidator(PriceInformation1 obj) throws Exception {
			checkPriceInformation1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation2
	 * PriceInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is not MRKT, then Value may not be expressed with UnknownIndicator."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceInformation2> forPriceInformation2 = new MMConstraint<PriceInformation2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueRule";
			definition = "If Type is not MRKT, then Value may not be expressed with UnknownIndicator.";
			owner_lazy = () -> PriceInformation2.mmObject();
		}

		@Override
		public void executeValidator(PriceInformation2 obj) throws Exception {
			checkPriceInformation2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation18
	 * PriceInformation18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintValueRule#forPriceInformation13
	 * ConstraintValueRule.forPriceInformation13}</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceInformation18> forPriceInformation18 = new MMConstraint<PriceInformation18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueRule";
			definition = "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintValueRule.forPriceInformation13;
			owner_lazy = () -> PriceInformation18.mmObject();
		}

		@Override
		public void executeValidator(PriceInformation18 obj) throws Exception {
			checkPriceInformation18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation12
	 * PriceInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintValueRule#forPriceInformation5
	 * ConstraintValueRule.forPriceInformation5}</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceInformation12> forPriceInformation12 = new MMConstraint<PriceInformation12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueRule";
			definition = "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintValueRule.forPriceInformation5;
			owner_lazy = () -> PriceInformation12.mmObject();
		}

		@Override
		public void executeValidator(PriceInformation12 obj) throws Exception {
			checkPriceInformation12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation19
	 * PriceInformation19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceInformation19> forPriceInformation19 = new MMConstraint<PriceInformation19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueRule";
			definition = "If TypeOfPriceCode is not MRKT, then Value\t may not be expressed with UnknownIndicator.";
			owner_lazy = () -> PriceInformation19.mmObject();
		}

		@Override
		public void executeValidator(PriceInformation19 obj) throws Exception {
			checkPriceInformation19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation4
	 * PriceInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type/Code is not MRKT, then Value may not be expressed with UnknownIndicator."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceInformation4> forPriceInformation4 = new MMConstraint<PriceInformation4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueRule";
			definition = "If Type/Code is not MRKT, then Value may not be expressed with UnknownIndicator.";
			owner_lazy = () -> PriceInformation4.mmObject();
		}

		@Override
		public void executeValidator(PriceInformation4 obj) throws Exception {
			checkPriceInformation4(obj);
		}
	};

	/**
	 * If TypeOfPriceCode is not MRKT, then Value may not be expressed with
	 * UnknownIndicator.
	 */
	public static void checkPriceInformation5(PriceInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TypeOfPriceCode is not MRKT, then Value may not be expressed with
	 * UnknownIndicator.
	 */
	public static void checkPriceInformation14(PriceInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TypeOfPriceCode is not MRKT, then Value may not be expressed with
	 * UnknownIndicator.
	 */
	public static void checkPriceInformation13(PriceInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TypeOfPriceCode is not MRKT, then Value may not be expressed with
	 * UnknownIndicator.
	 */
	public static void checkPriceInformation8(PriceInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TypeOfPriceCode is not MRKT, then Value may not be expressed with
	 * UnknownIndicator.
	 */
	public static void checkPriceInformation7(PriceInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TypeOfPriceCode is not MRKT, then Value may not be expressed with
	 * UnknownIndicator.
	 */
	public static void checkPriceInformation16(PriceInformation16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TypeOfPriceCode is not MRKT, then Value may not be expressed with
	 * UnknownIndicator.
	 */
	public static void checkPriceInformation6(PriceInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type is not MRKT, then Value may not be expressed with
	 * UnknownIndicator.
	 */
	public static void checkPriceInformation1(PriceInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type is not MRKT, then Value may not be expressed with
	 * UnknownIndicator.
	 */
	public static void checkPriceInformation2(PriceInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TypeOfPriceCode is not MRKT, then Value may not be expressed with
	 * UnknownIndicator.
	 */
	public static void checkPriceInformation18(PriceInformation18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TypeOfPriceCode is not MRKT, then Value may not be expressed with
	 * UnknownIndicator.
	 */
	public static void checkPriceInformation12(PriceInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TypeOfPriceCode is not MRKT, then Value may not be expressed with
	 * UnknownIndicator.
	 */
	public static void checkPriceInformation19(PriceInformation19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type/Code is not MRKT, then Value may not be expressed with
	 * UnknownIndicator.
	 */
	public static void checkPriceInformation4(PriceInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}