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
 * If TaxRelatedRate is repeated, then RateType/Code values must all be
 * different in each occurrence of TaxRelatedRate.<br>
 * <br>
 * (MT 566 NVR C4 ).
 */
public class ConstraintTaxRelatedRateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64
	 * CorporateActionRate64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate64> forCorporateActionRate64 = new MMConstraint<CorporateActionRate64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 ).";
			owner_lazy = () -> CorporateActionRate64.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate64 obj) throws Exception {
			checkCorporateActionRate64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37
	 * CorporateActionRate37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule#forCorporateActionRate45
	 * ConstraintTaxRelatedRateRule.forCorporateActionRate45}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate37> forCorporateActionRate37 = new MMConstraint<CorporateActionRate37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule.forCorporateActionRate45);
			owner_lazy = () -> CorporateActionRate37.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate37 obj) throws Exception {
			checkCorporateActionRate37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20
	 * CorporateActionRate20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate20> forCorporateActionRate20 = new MMConstraint<CorporateActionRate20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 ).";
			owner_lazy = () -> CorporateActionRate20.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate20 obj) throws Exception {
			checkCorporateActionRate20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60
	 * CorporateActionRate60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate60> forCorporateActionRate60 = new MMConstraint<CorporateActionRate60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			owner_lazy = () -> CorporateActionRate60.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate60 obj) throws Exception {
			checkCorporateActionRate60(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15
	 * CorporateActionRate15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate15> forCorporateActionRate15 = new MMConstraint<CorporateActionRate15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			owner_lazy = () -> CorporateActionRate15.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate15 obj) throws Exception {
			checkCorporateActionRate15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails3 RateDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails3> forRateDetails3 = new MMConstraint<RateDetails3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			owner_lazy = () -> RateDetails3.mmObject();
		}

		@Override
		public void executeValidator(RateDetails3 obj) throws Exception {
			checkRateDetails3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12
	 * CorporateActionRate12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate12> forCorporateActionRate12 = new MMConstraint<CorporateActionRate12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			owner_lazy = () -> CorporateActionRate12.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate12 obj) throws Exception {
			checkCorporateActionRate12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails11 RateDetails11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule#forRateDetails15
	 * ConstraintTaxRelatedRateRule.forRateDetails15}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails11> forRateDetails11 = new MMConstraint<RateDetails11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 ).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule.forRateDetails15);
			owner_lazy = () -> RateDetails11.mmObject();
		}

		@Override
		public void executeValidator(RateDetails11 obj) throws Exception {
			checkRateDetails11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31
	 * CorporateActionRate31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate31> forCorporateActionRate31 = new MMConstraint<CorporateActionRate31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 ).";
			owner_lazy = () -> CorporateActionRate31.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate31 obj) throws Exception {
			checkCorporateActionRate31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails14 RateDetails14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule#forRateDetails10
	 * ConstraintTaxRelatedRateRule.forRateDetails10}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails14> forRateDetails14 = new MMConstraint<RateDetails14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule.forRateDetails10;
			owner_lazy = () -> RateDetails14.mmObject();
		}

		@Override
		public void executeValidator(RateDetails14 obj) throws Exception {
			checkRateDetails14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26
	 * CorporateActionRate26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate26> forCorporateActionRate26 = new MMConstraint<CorporateActionRate26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 ).";
			owner_lazy = () -> CorporateActionRate26.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate26 obj) throws Exception {
			checkCorporateActionRate26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails18 RateDetails18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails18> forRateDetails18 = new MMConstraint<RateDetails18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			owner_lazy = () -> RateDetails18.mmObject();
		}

		@Override
		public void executeValidator(RateDetails18 obj) throws Exception {
			checkRateDetails18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25
	 * CorporateActionRate25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate25> forCorporateActionRate25 = new MMConstraint<CorporateActionRate25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			owner_lazy = () -> CorporateActionRate25.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate25 obj) throws Exception {
			checkCorporateActionRate25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails7 RateDetails7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails7> forRateDetails7 = new MMConstraint<RateDetails7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 ).";
			owner_lazy = () -> RateDetails7.mmObject();
		}

		@Override
		public void executeValidator(RateDetails7 obj) throws Exception {
			checkRateDetails7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails10 RateDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule#forRateDetails14
	 * ConstraintTaxRelatedRateRule.forRateDetails14}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails10> forRateDetails10 = new MMConstraint<RateDetails10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule.forRateDetails14);
			owner_lazy = () -> RateDetails10.mmObject();
		}

		@Override
		public void executeValidator(RateDetails10 obj) throws Exception {
			checkRateDetails10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46
	 * CorporateActionRate46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule#forCorporateActionRate38
	 * ConstraintTaxRelatedRateRule.forCorporateActionRate38}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate46> forCorporateActionRate46 = new MMConstraint<CorporateActionRate46>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 ).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule.forCorporateActionRate38;
			owner_lazy = () -> CorporateActionRate46.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate46 obj) throws Exception {
			checkCorporateActionRate46(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18
	 * CorporateActionRate18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate18> forCorporateActionRate18 = new MMConstraint<CorporateActionRate18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			owner_lazy = () -> CorporateActionRate18.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate18 obj) throws Exception {
			checkCorporateActionRate18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30
	 * CorporateActionRate30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate30> forCorporateActionRate30 = new MMConstraint<CorporateActionRate30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			owner_lazy = () -> CorporateActionRate30.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate30 obj) throws Exception {
			checkCorporateActionRate30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38
	 * CorporateActionRate38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule#forCorporateActionRate46
	 * ConstraintTaxRelatedRateRule.forCorporateActionRate46}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate38> forCorporateActionRate38 = new MMConstraint<CorporateActionRate38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 ).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule.forCorporateActionRate46);
			owner_lazy = () -> CorporateActionRate38.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate38 obj) throws Exception {
			checkCorporateActionRate38(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42
	 * CorporateActionRate42}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate42> forCorporateActionRate42 = new MMConstraint<CorporateActionRate42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			owner_lazy = () -> CorporateActionRate42.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate42 obj) throws Exception {
			checkCorporateActionRate42(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails2 RateDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails2> forRateDetails2 = new MMConstraint<RateDetails2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 ).";
			owner_lazy = () -> RateDetails2.mmObject();
		}

		@Override
		public void executeValidator(RateDetails2 obj) throws Exception {
			checkRateDetails2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails21 RateDetails21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails21> forRateDetails21 = new MMConstraint<RateDetails21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 ).";
			owner_lazy = () -> RateDetails21.mmObject();
		}

		@Override
		public void executeValidator(RateDetails21 obj) throws Exception {
			checkRateDetails21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22
	 * CorporateActionRate22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate22> forCorporateActionRate22 = new MMConstraint<CorporateActionRate22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 ).";
			owner_lazy = () -> CorporateActionRate22.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate22 obj) throws Exception {
			checkCorporateActionRate22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails15 RateDetails15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule#forRateDetails11
	 * ConstraintTaxRelatedRateRule.forRateDetails11}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails15> forRateDetails15 = new MMConstraint<RateDetails15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 ).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule.forRateDetails11;
			owner_lazy = () -> RateDetails15.mmObject();
		}

		@Override
		public void executeValidator(RateDetails15 obj) throws Exception {
			checkRateDetails15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails4 RateDetails4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails4> forRateDetails4 = new MMConstraint<RateDetails4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 ).";
			owner_lazy = () -> RateDetails4.mmObject();
		}

		@Override
		public void executeValidator(RateDetails4 obj) throws Exception {
			checkRateDetails4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36
	 * CorporateActionRate36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule#forCorporateActionRate44
	 * ConstraintTaxRelatedRateRule.forCorporateActionRate44}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate36> forCorporateActionRate36 = new MMConstraint<CorporateActionRate36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule.forCorporateActionRate44);
			owner_lazy = () -> CorporateActionRate36.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate36 obj) throws Exception {
			checkCorporateActionRate36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40
	 * CorporateActionRate40}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate40> forCorporateActionRate40 = new MMConstraint<CorporateActionRate40>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			owner_lazy = () -> CorporateActionRate40.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate40 obj) throws Exception {
			checkCorporateActionRate40(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57
	 * CorporateActionRate57}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate57> forCorporateActionRate57 = new MMConstraint<CorporateActionRate57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			owner_lazy = () -> CorporateActionRate57.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate57 obj) throws Exception {
			checkCorporateActionRate57(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails13 RateDetails13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails13> forRateDetails13 = new MMConstraint<RateDetails13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			owner_lazy = () -> RateDetails13.mmObject();
		}

		@Override
		public void executeValidator(RateDetails13 obj) throws Exception {
			checkRateDetails13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails9 RateDetails9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails9> forRateDetails9 = new MMConstraint<RateDetails9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 ).";
			owner_lazy = () -> RateDetails9.mmObject();
		}

		@Override
		public void executeValidator(RateDetails9 obj) throws Exception {
			checkRateDetails9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39
	 * CorporateActionRate39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate39> forCorporateActionRate39 = new MMConstraint<CorporateActionRate39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 ).";
			owner_lazy = () -> CorporateActionRate39.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate39 obj) throws Exception {
			checkCorporateActionRate39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails5 RateDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails5> forRateDetails5 = new MMConstraint<RateDetails5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			owner_lazy = () -> RateDetails5.mmObject();
		}

		@Override
		public void executeValidator(RateDetails5 obj) throws Exception {
			checkRateDetails5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44
	 * CorporateActionRate44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule#forCorporateActionRate36
	 * ConstraintTaxRelatedRateRule.forCorporateActionRate36}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate44> forCorporateActionRate44 = new MMConstraint<CorporateActionRate44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule.forCorporateActionRate36;
			owner_lazy = () -> CorporateActionRate44.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate44 obj) throws Exception {
			checkCorporateActionRate44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails12 RateDetails12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails12> forRateDetails12 = new MMConstraint<RateDetails12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C4 ).";
			owner_lazy = () -> RateDetails12.mmObject();
		}

		@Override
		public void executeValidator(RateDetails12 obj) throws Exception {
			checkRateDetails12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4
	 * CorporateActionRate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C3 and C4)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate4> forCorporateActionRate4 = new MMConstraint<CorporateActionRate4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C3 and C4).";
			owner_lazy = () -> CorporateActionRate4.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate4 obj) throws Exception {
			checkCorporateActionRate4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45
	 * CorporateActionRate45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule#forCorporateActionRate37
	 * ConstraintTaxRelatedRateRule.forCorporateActionRate37}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate45> forCorporateActionRate45 = new MMConstraint<CorporateActionRate45>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTaxRelatedRateRule.forCorporateActionRate37;
			owner_lazy = () -> CorporateActionRate45.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate45 obj) throws Exception {
			checkCorporateActionRate45(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5
	 * CorporateActionRate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate5> forCorporateActionRate5 = new MMConstraint<CorporateActionRate5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 564 NVR C9).";
			owner_lazy = () -> CorporateActionRate5.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate5 obj) throws Exception {
			checkCorporateActionRate5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10
	 * CorporateActionRate10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRelatedRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C3 and C4)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate10> forCorporateActionRate10 = new MMConstraint<CorporateActionRate10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRelatedRateRule";
			definition = "If TaxRelatedRate is repeated, then RateType/Code values must all be different in each occurrence of TaxRelatedRate.\r\n\r\n(MT 566 NVR C3 and C4).";
			owner_lazy = () -> CorporateActionRate10.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate10 obj) throws Exception {
			checkCorporateActionRate10(obj);
		}
	};

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkCorporateActionRate64(CorporateActionRate64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkCorporateActionRate37(CorporateActionRate37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkCorporateActionRate20(CorporateActionRate20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkCorporateActionRate60(CorporateActionRate60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkCorporateActionRate15(CorporateActionRate15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkRateDetails3(RateDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkCorporateActionRate12(CorporateActionRate12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails11(RateDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkCorporateActionRate31(CorporateActionRate31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkRateDetails14(RateDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkCorporateActionRate26(CorporateActionRate26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkRateDetails18(RateDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkCorporateActionRate25(CorporateActionRate25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails7(RateDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkRateDetails10(RateDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkCorporateActionRate46(CorporateActionRate46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkCorporateActionRate18(CorporateActionRate18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkCorporateActionRate30(CorporateActionRate30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkCorporateActionRate38(CorporateActionRate38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkCorporateActionRate42(CorporateActionRate42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails2(RateDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails21(RateDetails21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkCorporateActionRate22(CorporateActionRate22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails15(RateDetails15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails4(RateDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkCorporateActionRate36(CorporateActionRate36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkCorporateActionRate40(CorporateActionRate40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkCorporateActionRate57(CorporateActionRate57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkRateDetails13(RateDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails9(RateDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkCorporateActionRate39(CorporateActionRate39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkRateDetails5(RateDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkCorporateActionRate44(CorporateActionRate44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails12(RateDetails12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 566 NVR C3 and C4).
	 */
	public static void checkCorporateActionRate4(CorporateActionRate4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkCorporateActionRate45(CorporateActionRate45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkCorporateActionRate5(CorporateActionRate5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxRelatedRate is repeated, then RateType/Code values must all be
	 * different in each occurrence of TaxRelatedRate.<br>
	 * <br>
	 * (MT 566 NVR C3 and C4).
	 */
	public static void checkCorporateActionRate10(CorporateActionRate10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}