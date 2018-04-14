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
 * If TaxCreditRate is repeated, then:<br>
 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in
 * each occurrence of TaxCreditRate. (MT 564 NVR C8).
 */
public class ConstraintTaxCreditRate1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails26 RateDetails26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C8)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forRateDetails22
	 * ConstraintTaxCreditRate1Rule.forRateDetails22}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails26> forRateDetails26 = new MMConstraint<RateDetails26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C8).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forRateDetails22;
			owner_lazy = () -> RateDetails26.mmObject();
		}

		@Override
		public void executeValidator(RateDetails26 obj) throws Exception {
			checkRateDetails26(obj);
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
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 564 NVR C9)."
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
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 564 NVR C9).";
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails11 RateDetails11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forRateDetails15
	 * ConstraintTaxCreditRate1Rule.forRateDetails15}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails11> forRateDetails11 = new MMConstraint<RateDetails11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 566 NVR C4 ).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forRateDetails15);
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails28 RateDetails28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C8)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails28> forRateDetails28 = new MMConstraint<RateDetails28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C8).";
			owner_lazy = () -> RateDetails28.mmObject();
		}

		@Override
		public void executeValidator(RateDetails28 obj) throws Exception {
			checkRateDetails28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate33
	 * CorporateActionRate33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate33> forCorporateActionRate33 = new MMConstraint<CorporateActionRate33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C9).";
			owner_lazy = () -> CorporateActionRate33.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate33 obj) throws Exception {
			checkCorporateActionRate33(obj);
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
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forRateDetails22
	 * ConstraintTaxCreditRate1Rule.forRateDetails22}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forRateDetails10
	 * ConstraintTaxCreditRate1Rule.forRateDetails10}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails14> forRateDetails14 = new MMConstraint<RateDetails14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 564 NVR C9).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forRateDetails22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forRateDetails10;
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails25 RateDetails25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C8)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails25> forRateDetails25 = new MMConstraint<RateDetails25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C8).";
			owner_lazy = () -> RateDetails25.mmObject();
		}

		@Override
		public void executeValidator(RateDetails25 obj) throws Exception {
			checkRateDetails25(obj);
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
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 564 NVR C9)."
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
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 564 NVR C9).";
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails7 RateDetails7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 566 NVR C4 )."
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
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 566 NVR C4 ).";
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
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forRateDetails14
	 * ConstraintTaxCreditRate1Rule.forRateDetails14}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails10> forRateDetails10 = new MMConstraint<RateDetails10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 564 NVR C9).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forRateDetails14);
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails24 RateDetails24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails24> forRateDetails24 = new MMConstraint<RateDetails24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).";
			owner_lazy = () -> RateDetails24.mmObject();
		}

		@Override
		public void executeValidator(RateDetails24 obj) throws Exception {
			checkRateDetails24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48
	 * CorporateActionRate48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forCorporateActionRate69
	 * ConstraintTaxCreditRate1Rule.forCorporateActionRate69}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forCorporateActionRate28
	 * ConstraintTaxCreditRate1Rule.forCorporateActionRate28}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate48> forCorporateActionRate48 = new MMConstraint<CorporateActionRate48>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C9).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forCorporateActionRate69);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forCorporateActionRate28;
			owner_lazy = () -> CorporateActionRate48.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate48 obj) throws Exception {
			checkCorporateActionRate48(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77
	 * CorporateActionRate77}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C8)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate77> forCorporateActionRate77 = new MMConstraint<CorporateActionRate77>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C8).";
			owner_lazy = () -> CorporateActionRate77.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate77 obj) throws Exception {
			checkCorporateActionRate77(obj);
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
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 566 NVR C4 )."
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
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 566 NVR C4 ).";
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
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 566 NVR C4 )."
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
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 566 NVR C4 ).";
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails27 RateDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forRateDetails23
	 * ConstraintTaxCreditRate1Rule.forRateDetails23}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails27> forRateDetails27 = new MMConstraint<RateDetails27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forRateDetails23;
			owner_lazy = () -> RateDetails27.mmObject();
		}

		@Override
		public void executeValidator(RateDetails27 obj) throws Exception {
			checkRateDetails27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72
	 * CorporateActionRate72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If\r\nTaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forCorporateActionRate49
	 * ConstraintTaxCreditRate1Rule.forCorporateActionRate49}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate72> forCorporateActionRate72 = new MMConstraint<CorporateActionRate72>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If\r\nTaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forCorporateActionRate49;
			owner_lazy = () -> CorporateActionRate72.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate72 obj) throws Exception {
			checkCorporateActionRate72(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate75
	 * CorporateActionRate75}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If\r\nTaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate75> forCorporateActionRate75 = new MMConstraint<CorporateActionRate75>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If\r\nTaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).";
			owner_lazy = () -> CorporateActionRate75.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate75 obj) throws Exception {
			checkCorporateActionRate75(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate49
	 * CorporateActionRate49}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If\r\nTaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forCorporateActionRate72
	 * ConstraintTaxCreditRate1Rule.forCorporateActionRate72}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forCorporateActionRate29
	 * ConstraintTaxCreditRate1Rule.forCorporateActionRate29}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate49> forCorporateActionRate49 = new MMConstraint<CorporateActionRate49>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If\r\nTaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forCorporateActionRate72);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forCorporateActionRate29;
			owner_lazy = () -> CorporateActionRate49.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate49 obj) throws Exception {
			checkCorporateActionRate49(obj);
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
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forRateDetails23
	 * ConstraintTaxCreditRate1Rule.forRateDetails23}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forRateDetails11
	 * ConstraintTaxCreditRate1Rule.forRateDetails11}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails15> forRateDetails15 = new MMConstraint<RateDetails15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 566 NVR C4 ).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forRateDetails23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forRateDetails11;
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
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 566 NVR C4 )."
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
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 566 NVR C4 ).";
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails22 RateDetails22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C8)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forRateDetails26
	 * ConstraintTaxCreditRate1Rule.forRateDetails26}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forRateDetails14
	 * ConstraintTaxCreditRate1Rule.forRateDetails14}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails22> forRateDetails22 = new MMConstraint<RateDetails22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C8).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forRateDetails26);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forRateDetails14;
			owner_lazy = () -> RateDetails22.mmObject();
		}

		@Override
		public void executeValidator(RateDetails22 obj) throws Exception {
			checkRateDetails22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69
	 * CorporateActionRate69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C8)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forCorporateActionRate48
	 * ConstraintTaxCreditRate1Rule.forCorporateActionRate48}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate69> forCorporateActionRate69 = new MMConstraint<CorporateActionRate69>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C8).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forCorporateActionRate48;
			owner_lazy = () -> CorporateActionRate69.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate69 obj) throws Exception {
			checkCorporateActionRate69(obj);
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
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 564 NVR C9)."
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
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 564 NVR C9).";
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
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 566 NVR C4 )."
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
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 566 NVR C4 ).";
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58
	 * CorporateActionRate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate58> forCorporateActionRate58 = new MMConstraint<CorporateActionRate58>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C9).";
			owner_lazy = () -> CorporateActionRate58.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate58 obj) throws Exception {
			checkCorporateActionRate58(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate65
	 * CorporateActionRate65}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If\r\nTaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate65> forCorporateActionRate65 = new MMConstraint<CorporateActionRate65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If\r\nTaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).";
			owner_lazy = () -> CorporateActionRate65.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate65 obj) throws Exception {
			checkCorporateActionRate65(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate34
	 * CorporateActionRate34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If\r\nTaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate34> forCorporateActionRate34 = new MMConstraint<CorporateActionRate34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If\r\nTaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).";
			owner_lazy = () -> CorporateActionRate34.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate34 obj) throws Exception {
			checkCorporateActionRate34(obj);
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
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 564 NVR C9)."
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
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 564 NVR C9).";
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate29
	 * CorporateActionRate29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If\r\nTaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forCorporateActionRate49
	 * ConstraintTaxCreditRate1Rule.forCorporateActionRate49}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate29> forCorporateActionRate29 = new MMConstraint<CorporateActionRate29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If\r\nTaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forCorporateActionRate49);
			owner_lazy = () -> CorporateActionRate29.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate29 obj) throws Exception {
			checkCorporateActionRate29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails30 RateDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails30> forRateDetails30 = new MMConstraint<RateDetails30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).";
			owner_lazy = () -> RateDetails30.mmObject();
		}

		@Override
		public void executeValidator(RateDetails30 obj) throws Exception {
			checkRateDetails30(obj);
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
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 566 NVR C4 )."
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
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate.\r\n\r\n(MT 566 NVR C4 ).";
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails23 RateDetails23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 )."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forRateDetails27
	 * ConstraintTaxCreditRate1Rule.forRateDetails27}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forRateDetails15
	 * ConstraintTaxCreditRate1Rule.forRateDetails15}</li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails23> forRateDetails23 = new MMConstraint<RateDetails23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then:\r\n- RateTypeAndAmountAndRateStatus/RateType/Code value must all be different in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forRateDetails27);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forRateDetails15;
			owner_lazy = () -> RateDetails23.mmObject();
		}

		@Override
		public void executeValidator(RateDetails23 obj) throws Exception {
			checkRateDetails23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate28
	 * CorporateActionRate28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C9)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule#forCorporateActionRate48
	 * ConstraintTaxCreditRate1Rule.forCorporateActionRate48}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate28> forCorporateActionRate28 = new MMConstraint<CorporateActionRate28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate1Rule";
			definition = "If TaxCreditRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of TaxCreditRate. (MT 564 NVR C9).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTaxCreditRate1Rule.forCorporateActionRate48);
			owner_lazy = () -> CorporateActionRate28.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate28 obj) throws Exception {
			checkCorporateActionRate28(obj);
		}
	};

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate. (MT 564 NVR C8).
	 */
	public static void checkRateDetails26(RateDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkRateDetails3(RateDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails11(RateDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate. (MT 564 NVR C8).
	 */
	public static void checkRateDetails28(RateDetails28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then
	 * RateTypeAndAmountAndRateStatus/RateType/Code values must all be different
	 * in each occurrence of TaxCreditRate. (MT 564 NVR C9).
	 */
	public static void checkCorporateActionRate33(CorporateActionRate33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkRateDetails14(RateDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate. (MT 564 NVR C8).
	 */
	public static void checkRateDetails25(RateDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkRateDetails18(RateDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails7(RateDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkRateDetails10(RateDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails24(RateDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then
	 * RateTypeAndAmountAndRateStatus/RateType/Code values must all be different
	 * in each occurrence of TaxCreditRate. (MT 564 NVR C9).
	 */
	public static void checkCorporateActionRate48(CorporateActionRate48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then
	 * RateTypeAndAmountAndRateStatus/RateType/Code values must all be different
	 * in each occurrence of TaxCreditRate. (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate77(CorporateActionRate77 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails2(RateDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails21(RateDetails21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails27(RateDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If<br>
	 * TaxCreditRate is repeated, then
	 * RateTypeAndAmountAndRateStatus/RateType/Code values must all be different
	 * in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).
	 */
	public static void checkCorporateActionRate72(CorporateActionRate72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If<br>
	 * TaxCreditRate is repeated, then
	 * RateTypeAndAmountAndRateStatus/RateType/Code values must all be different
	 * in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).
	 */
	public static void checkCorporateActionRate75(CorporateActionRate75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If<br>
	 * TaxCreditRate is repeated, then
	 * RateTypeAndAmountAndRateStatus/RateType/Code values must all be different
	 * in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).
	 */
	public static void checkCorporateActionRate49(CorporateActionRate49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails15(RateDetails15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails4(RateDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate. (MT 564 NVR C8).
	 */
	public static void checkRateDetails22(RateDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then
	 * RateTypeAndAmountAndRateStatus/RateType/Code values must all be different
	 * in each occurrence of TaxCreditRate. (MT 564 NVR C8).
	 */
	public static void checkCorporateActionRate69(CorporateActionRate69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkRateDetails13(RateDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails9(RateDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then
	 * RateTypeAndAmountAndRateStatus/RateType/Code values must all be different
	 * in each occurrence of TaxCreditRate. (MT 564 NVR C9).
	 */
	public static void checkCorporateActionRate58(CorporateActionRate58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If<br>
	 * TaxCreditRate is repeated, then
	 * RateTypeAndAmountAndRateStatus/RateType/Code values must all be different
	 * in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).
	 */
	public static void checkCorporateActionRate65(CorporateActionRate65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If<br>
	 * TaxCreditRate is repeated, then
	 * RateTypeAndAmountAndRateStatus/RateType/Code values must all be different
	 * in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).
	 */
	public static void checkCorporateActionRate34(CorporateActionRate34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate.<br>
	 * <br>
	 * (MT 564 NVR C9).
	 */
	public static void checkRateDetails5(RateDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If<br>
	 * TaxCreditRate is repeated, then
	 * RateTypeAndAmountAndRateStatus/RateType/Code values must all be different
	 * in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).
	 */
	public static void checkCorporateActionRate29(CorporateActionRate29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails30(RateDetails30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate.<br>
	 * <br>
	 * (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails12(RateDetails12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then:<br>
	 * - RateTypeAndAmountAndRateStatus/RateType/Code value must all be
	 * different in each occurrence of TaxCreditRate. (MT 566 NVR C4 ).
	 */
	public static void checkRateDetails23(RateDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TaxCreditRate is repeated, then
	 * RateTypeAndAmountAndRateStatus/RateType/Code values must all be different
	 * in each occurrence of TaxCreditRate. (MT 564 NVR C9).
	 */
	public static void checkCorporateActionRate28(CorporateActionRate28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}