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

/**
 * If WithholdingTaxRate is repeated, then
 * WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different
 * in each occurrence of WithholdingTaxRate. <br>
 * (MT 564 NVR C8).
 */
public class ConstraintWithholdingTaxRate1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate97
	 * CorporateActionRate97}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate97> forCorporateActionRate97 = new MMConstraint<CorporateActionRate97>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate1Rule";
			definition = "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate97.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate97 obj) throws Exception {
			checkCorporateActionRate97(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails33 RateDetails33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 566 NVR C4)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails33> forRateDetails33 = new MMConstraint<RateDetails33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate1Rule";
			definition = "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 566 NVR C4).";
			owner_lazy = () -> RateDetails33.mmObject();
		}

		@Override
		public void executeValidator(RateDetails33 obj) throws Exception {
			checkRateDetails33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 566 NVR C4)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails32> forRateDetails32 = new MMConstraint<RateDetails32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate1Rule";
			definition = "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 566 NVR C4).";
			owner_lazy = () -> RateDetails32.mmObject();
		}

		@Override
		public void executeValidator(RateDetails32 obj) throws Exception {
			checkRateDetails32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate94
	 * CorporateActionRate94}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate94> forCorporateActionRate94 = new MMConstraint<CorporateActionRate94>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate1Rule";
			definition = "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate94.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate94 obj) throws Exception {
			checkCorporateActionRate94(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate88
	 * CorporateActionRate88}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate88> forCorporateActionRate88 = new MMConstraint<CorporateActionRate88>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate1Rule";
			definition = "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate88.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate88 obj) throws Exception {
			checkCorporateActionRate88(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails34 RateDetails34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails34> forRateDetails34 = new MMConstraint<RateDetails34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate1Rule";
			definition = "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 564 NVR C8).";
			owner_lazy = () -> RateDetails34.mmObject();
		}

		@Override
		public void executeValidator(RateDetails34 obj) throws Exception {
			checkRateDetails34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87
	 * CorporateActionRate87}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate87> forCorporateActionRate87 = new MMConstraint<CorporateActionRate87>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate1Rule";
			definition = "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate87.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate87 obj) throws Exception {
			checkCorporateActionRate87(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86
	 * CorporateActionRate86}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate86> forCorporateActionRate86 = new MMConstraint<CorporateActionRate86>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate1Rule";
			definition = "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate86.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate86 obj) throws Exception {
			checkCorporateActionRate86(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails31> forRateDetails31 = new MMConstraint<RateDetails31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate1Rule";
			definition = "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 564 NVR C8).";
			owner_lazy = () -> RateDetails31.mmObject();
		}

		@Override
		public void executeValidator(RateDetails31 obj) throws Exception {
			checkRateDetails31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate92
	 * CorporateActionRate92}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 564 NVR C8)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate92> forCorporateActionRate92 = new MMConstraint<CorporateActionRate92>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate1Rule";
			definition = "If WithholdingTaxRate is repeated, then WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be different in each occurrence of WithholdingTaxRate. \r\n(MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate92.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate92 obj) throws Exception {
			checkCorporateActionRate92(obj);
		}
	};

	/**
	 * If WithholdingTaxRate is repeated, then
	 * WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be
	 * different in each occurrence of WithholdingTaxRate. <br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate97(CorporateActionRate97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithholdingTaxRate is repeated, then
	 * WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be
	 * different in each occurrence of WithholdingTaxRate. <br>
	 * (MT 566 NVR C4).
	 */
	public static void checkRateDetails33(RateDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithholdingTaxRate is repeated, then
	 * WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be
	 * different in each occurrence of WithholdingTaxRate. <br>
	 * (MT 566 NVR C4).
	 */
	public static void checkRateDetails32(RateDetails32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithholdingTaxRate is repeated, then
	 * WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be
	 * different in each occurrence of WithholdingTaxRate. <br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate94(CorporateActionRate94 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithholdingTaxRate is repeated, then
	 * WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be
	 * different in each occurrence of WithholdingTaxRate. <br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate88(CorporateActionRate88 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithholdingTaxRate is repeated, then
	 * WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be
	 * different in each occurrence of WithholdingTaxRate. <br>
	 * (MT 564 NVR C8).
	 */
	public static void checkRateDetails34(RateDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithholdingTaxRate is repeated, then
	 * WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be
	 * different in each occurrence of WithholdingTaxRate. <br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate87(CorporateActionRate87 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithholdingTaxRate is repeated, then
	 * WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be
	 * different in each occurrence of WithholdingTaxRate. <br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate86(CorporateActionRate86 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithholdingTaxRate is repeated, then
	 * WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be
	 * different in each occurrence of WithholdingTaxRate. <br>
	 * (MT 564 NVR C8).
	 */
	public static void checkRateDetails31(RateDetails31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithholdingTaxRate is repeated, then
	 * WithholdingTaxRate/RateTypeAndRate/RateType/Code values must all be
	 * different in each occurrence of WithholdingTaxRate. <br>
	 * (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate92(CorporateActionRate92 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}