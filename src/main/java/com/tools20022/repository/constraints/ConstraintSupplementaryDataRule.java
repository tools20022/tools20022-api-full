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
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.area.pacs.*;
import com.tools20022.repository.area.pain.*;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.Arrays;

/**
 * The SupplementaryData building block at message level must not be used to
 * provide additional information about a transaction. The SupplementaryData
 * element at transaction level should be used for that purpose.
 */
public class ConstraintSupplementaryDataRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV02
	 * FIToFIPaymentStatusRequestV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentStatusRequestV01
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusRequestV01}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusRequestV02> for_pacs_FIToFIPaymentStatusRequestV02 = new MMConstraint<FIToFIPaymentStatusRequestV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusRequestV01;
			owner_lazy = () -> FIToFIPaymentStatusRequestV02.mmObject();
		}

		@Override
		public void executeValidator(FIToFIPaymentStatusRequestV02 obj) throws Exception {
			check_pacs_FIToFIPaymentStatusRequestV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08
	 * CustomerPaymentStatusReportV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerPaymentStatusReportV09
	 * ConstraintSupplementaryDataRule.for_pain_CustomerPaymentStatusReportV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerPaymentStatusReportV07
	 * ConstraintSupplementaryDataRule.for_pain_CustomerPaymentStatusReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentStatusReportV08> for_pain_CustomerPaymentStatusReportV08 = new MMConstraint<CustomerPaymentStatusReportV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerPaymentStatusReportV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerPaymentStatusReportV07;
			owner_lazy = () -> CustomerPaymentStatusReportV08.mmObject();
		}

		@Override
		public void executeValidator(CustomerPaymentStatusReportV08 obj) throws Exception {
			check_pain_CustomerPaymentStatusReportV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV08
	 * CustomerCreditTransferInitiationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerCreditTransferInitiationV07
	 * ConstraintSupplementaryDataRule.
	 * for_pain_CustomerCreditTransferInitiationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerCreditTransferInitiationV08> for_pain_CustomerCreditTransferInitiationV08 = new MMConstraint<CustomerCreditTransferInitiationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerCreditTransferInitiationV07;
			owner_lazy = () -> CustomerCreditTransferInitiationV08.mmObject();
		}

		@Override
		public void executeValidator(CustomerCreditTransferInitiationV08 obj) throws Exception {
			check_pain_CustomerCreditTransferInitiationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV04
	 * CreditorPaymentActivationRequestStatusReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CreditorPaymentActivationRequestStatusReportV05
	 * ConstraintSupplementaryDataRule.
	 * for_pain_CreditorPaymentActivationRequestStatusReportV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CreditorPaymentActivationRequestStatusReportV03
	 * ConstraintSupplementaryDataRule.
	 * for_pain_CreditorPaymentActivationRequestStatusReportV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestStatusReportV04> for_pain_CreditorPaymentActivationRequestStatusReportV04 = new MMConstraint<CreditorPaymentActivationRequestStatusReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CreditorPaymentActivationRequestStatusReportV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CreditorPaymentActivationRequestStatusReportV03;
			owner_lazy = () -> CreditorPaymentActivationRequestStatusReportV04.mmObject();
		}

		@Override
		public void executeValidator(CreditorPaymentActivationRequestStatusReportV04 obj) throws Exception {
			check_pain_CreditorPaymentActivationRequestStatusReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV06
	 * CustomerPaymentReversalV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerPaymentReversalV07
	 * ConstraintSupplementaryDataRule.for_pain_CustomerPaymentReversalV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerPaymentReversalV05
	 * ConstraintSupplementaryDataRule.for_pain_CustomerPaymentReversalV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV06> for_pain_CustomerPaymentReversalV06 = new MMConstraint<CustomerPaymentReversalV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerPaymentReversalV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerPaymentReversalV05;
			owner_lazy = () -> CustomerPaymentReversalV06.mmObject();
		}

		@Override
		public void executeValidator(CustomerPaymentReversalV06 obj) throws Exception {
			check_pain_CustomerPaymentReversalV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateCopyRequestV01
	 * MandateCopyRequestV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MandateCopyRequestV01> for_pain_MandateCopyRequestV01 = new MMConstraint<MandateCopyRequestV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> MandateCopyRequestV01.mmObject();
		}

		@Override
		public void executeValidator(MandateCopyRequestV01 obj) throws Exception {
			check_pain_MandateCopyRequestV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV07
	 * CustomerCreditTransferInitiationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerCreditTransferInitiationV08
	 * ConstraintSupplementaryDataRule.
	 * for_pain_CustomerCreditTransferInitiationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerCreditTransferInitiationV06
	 * ConstraintSupplementaryDataRule.
	 * for_pain_CustomerCreditTransferInitiationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerCreditTransferInitiationV07> for_pain_CustomerCreditTransferInitiationV07 = new MMConstraint<CustomerCreditTransferInitiationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerCreditTransferInitiationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerCreditTransferInitiationV06;
			owner_lazy = () -> CustomerCreditTransferInitiationV07.mmObject();
		}

		@Override
		public void executeValidator(CustomerCreditTransferInitiationV07 obj) throws Exception {
			check_pain_CustomerCreditTransferInitiationV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV06
	 * CustomerCreditTransferInitiationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerCreditTransferInitiationV07
	 * ConstraintSupplementaryDataRule.
	 * for_pain_CustomerCreditTransferInitiationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerCreditTransferInitiationV05
	 * ConstraintSupplementaryDataRule.
	 * for_pain_CustomerCreditTransferInitiationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerCreditTransferInitiationV06> for_pain_CustomerCreditTransferInitiationV06 = new MMConstraint<CustomerCreditTransferInitiationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerCreditTransferInitiationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerCreditTransferInitiationV05;
			owner_lazy = () -> CustomerCreditTransferInitiationV06.mmObject();
		}

		@Override
		public void executeValidator(CustomerCreditTransferInitiationV06 obj) throws Exception {
			check_pain_CustomerCreditTransferInitiationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV05
	 * FIToFICustomerCreditTransferV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFICustomerCreditTransferV06
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerCreditTransferV06}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFICustomerCreditTransferV04
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerCreditTransferV04}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerCreditTransferV05> for_pacs_FIToFICustomerCreditTransferV05 = new MMConstraint<FIToFICustomerCreditTransferV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerCreditTransferV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerCreditTransferV04;
			owner_lazy = () -> FIToFICustomerCreditTransferV05.mmObject();
		}

		@Override
		public void executeValidator(FIToFICustomerCreditTransferV05 obj) throws Exception {
			check_pacs_FIToFICustomerCreditTransferV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV06
	 * FIToFICustomerCreditTransferV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFICustomerCreditTransferV07
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerCreditTransferV07}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFICustomerCreditTransferV05
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerCreditTransferV05}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerCreditTransferV06> for_pacs_FIToFICustomerCreditTransferV06 = new MMConstraint<FIToFICustomerCreditTransferV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerCreditTransferV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerCreditTransferV05;
			owner_lazy = () -> FIToFICustomerCreditTransferV06.mmObject();
		}

		@Override
		public void executeValidator(FIToFICustomerCreditTransferV06 obj) throws Exception {
			check_pacs_FIToFICustomerCreditTransferV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV06
	 * CustomerDirectDebitInitiationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerDirectDebitInitiationV07
	 * ConstraintSupplementaryDataRule.for_pain_CustomerDirectDebitInitiationV07
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerDirectDebitInitiationV05
	 * ConstraintSupplementaryDataRule.for_pain_CustomerDirectDebitInitiationV05
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerDirectDebitInitiationV06> for_pain_CustomerDirectDebitInitiationV06 = new MMConstraint<CustomerDirectDebitInitiationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerDirectDebitInitiationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerDirectDebitInitiationV05;
			owner_lazy = () -> CustomerDirectDebitInitiationV06.mmObject();
		}

		@Override
		public void executeValidator(CustomerDirectDebitInitiationV06 obj) throws Exception {
			check_pain_CustomerDirectDebitInitiationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV05
	 * MandateCancellationRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_MandateCancellationRequestV04
	 * ConstraintSupplementaryDataRule.for_pain_MandateCancellationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateCancellationRequestV05> for_pain_MandateCancellationRequestV05 = new MMConstraint<MandateCancellationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_MandateCancellationRequestV04;
			owner_lazy = () -> MandateCancellationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(MandateCancellationRequestV05 obj) throws Exception {
			check_pain_MandateCancellationRequestV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06
	 * CreditorPaymentActivationRequestStatusReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CreditorPaymentActivationRequestStatusReportV05
	 * ConstraintSupplementaryDataRule.
	 * for_pain_CreditorPaymentActivationRequestStatusReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestStatusReportV06> for_pain_CreditorPaymentActivationRequestStatusReportV06 = new MMConstraint<CreditorPaymentActivationRequestStatusReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CreditorPaymentActivationRequestStatusReportV05;
			owner_lazy = () -> CreditorPaymentActivationRequestStatusReportV06.mmObject();
		}

		@Override
		public void executeValidator(CreditorPaymentActivationRequestStatusReportV06 obj) throws Exception {
			check_pain_CreditorPaymentActivationRequestStatusReportV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV05
	 * BankToCustomerDebitCreditNotificationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerDebitCreditNotificationV06
	 * ConstraintSupplementaryDataRule.
	 * for_camt_BankToCustomerDebitCreditNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerDebitCreditNotificationV04
	 * ConstraintSupplementaryDataRule.
	 * for_camt_BankToCustomerDebitCreditNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerDebitCreditNotificationV05> for_camt_BankToCustomerDebitCreditNotificationV05 = new MMConstraint<BankToCustomerDebitCreditNotificationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerDebitCreditNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerDebitCreditNotificationV04;
			owner_lazy = () -> BankToCustomerDebitCreditNotificationV05.mmObject();
		}

		@Override
		public void executeValidator(BankToCustomerDebitCreditNotificationV05 obj) throws Exception {
			check_camt_BankToCustomerDebitCreditNotificationV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV08
	 * FIToFIPaymentReversalV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentReversalV07
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentReversalV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV08> for_pacs_FIToFIPaymentReversalV08 = new MMConstraint<FIToFIPaymentReversalV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentReversalV07;
			owner_lazy = () -> FIToFIPaymentReversalV08.mmObject();
		}

		@Override
		public void executeValidator(FIToFIPaymentReversalV08 obj) throws Exception {
			check_pacs_FIToFIPaymentReversalV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV03
	 * CreditorPaymentActivationRequestStatusReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CreditorPaymentActivationRequestStatusReportV04
	 * ConstraintSupplementaryDataRule.
	 * for_pain_CreditorPaymentActivationRequestStatusReportV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestStatusReportV03> for_pain_CreditorPaymentActivationRequestStatusReportV03 = new MMConstraint<CreditorPaymentActivationRequestStatusReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CreditorPaymentActivationRequestStatusReportV04);
			owner_lazy = () -> CreditorPaymentActivationRequestStatusReportV03.mmObject();
		}

		@Override
		public void executeValidator(CreditorPaymentActivationRequestStatusReportV03 obj) throws Exception {
			check_pain_CreditorPaymentActivationRequestStatusReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV05
	 * FIToFICustomerDirectDebitV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFICustomerDirectDebitV06
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerDirectDebitV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFICustomerDirectDebitV04
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerDirectDebitV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerDirectDebitV05> for_pacs_FIToFICustomerDirectDebitV05 = new MMConstraint<FIToFICustomerDirectDebitV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerDirectDebitV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerDirectDebitV04;
			owner_lazy = () -> FIToFICustomerDirectDebitV05.mmObject();
		}

		@Override
		public void executeValidator(FIToFICustomerDirectDebitV05 obj) throws Exception {
			check_pacs_FIToFICustomerDirectDebitV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV07
	 * BankToCustomerStatementV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerStatementV06
	 * ConstraintSupplementaryDataRule.for_camt_BankToCustomerStatementV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerStatementV07> for_camt_BankToCustomerStatementV07 = new MMConstraint<BankToCustomerStatementV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerStatementV06;
			owner_lazy = () -> BankToCustomerStatementV07.mmObject();
		}

		@Override
		public void executeValidator(BankToCustomerStatementV07 obj) throws Exception {
			check_camt_BankToCustomerStatementV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV03
	 * MandateAmendmentRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_MandateAmendmentRequestV04
	 * ConstraintSupplementaryDataRule.for_pain_MandateAmendmentRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MandateAmendmentRequestV03> for_pain_MandateAmendmentRequestV03 = new MMConstraint<MandateAmendmentRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_MandateAmendmentRequestV04);
			owner_lazy = () -> MandateAmendmentRequestV03.mmObject();
		}

		@Override
		public void executeValidator(MandateAmendmentRequestV03 obj) throws Exception {
			check_pain_MandateAmendmentRequestV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV07
	 * FinancialInstitutionCreditTransferV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FinancialInstitutionCreditTransferV06
	 * ConstraintSupplementaryDataRule.
	 * for_pacs_FinancialInstitutionCreditTransferV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionCreditTransferV07> for_pacs_FinancialInstitutionCreditTransferV07 = new MMConstraint<FinancialInstitutionCreditTransferV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FinancialInstitutionCreditTransferV06;
			owner_lazy = () -> FinancialInstitutionCreditTransferV07.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstitutionCreditTransferV07 obj) throws Exception {
			check_pacs_FinancialInstitutionCreditTransferV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV07
	 * FIToFIPaymentStatusReportV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentStatusReportV08
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentStatusReportV06
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusReportV07> for_pacs_FIToFIPaymentStatusReportV07 = new MMConstraint<FIToFIPaymentStatusReportV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusReportV06;
			owner_lazy = () -> FIToFIPaymentStatusReportV07.mmObject();
		}

		@Override
		public void executeValidator(FIToFIPaymentStatusReportV07 obj) throws Exception {
			check_pacs_FIToFIPaymentStatusReportV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV05
	 * BankToCustomerStatementV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerStatementV06
	 * ConstraintSupplementaryDataRule.for_camt_BankToCustomerStatementV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerStatementV04
	 * ConstraintSupplementaryDataRule.for_camt_BankToCustomerStatementV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerStatementV05> for_camt_BankToCustomerStatementV05 = new MMConstraint<BankToCustomerStatementV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerStatementV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerStatementV04;
			owner_lazy = () -> BankToCustomerStatementV05.mmObject();
		}

		@Override
		public void executeValidator(BankToCustomerStatementV05 obj) throws Exception {
			check_camt_BankToCustomerStatementV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV04
	 * CustomerPaymentReversalV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerPaymentReversalV05
	 * ConstraintSupplementaryDataRule.for_pain_CustomerPaymentReversalV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV04> for_pain_CustomerPaymentReversalV04 = new MMConstraint<CustomerPaymentReversalV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerPaymentReversalV05);
			owner_lazy = () -> CustomerPaymentReversalV04.mmObject();
		}

		@Override
		public void executeValidator(CustomerPaymentReversalV04 obj) throws Exception {
			check_pain_CustomerPaymentReversalV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06
	 * FinancialInstitutionCreditTransferV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FinancialInstitutionCreditTransferV07
	 * ConstraintSupplementaryDataRule.
	 * for_pacs_FinancialInstitutionCreditTransferV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FinancialInstitutionCreditTransferV05
	 * ConstraintSupplementaryDataRule.
	 * for_pacs_FinancialInstitutionCreditTransferV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionCreditTransferV06> for_pacs_FinancialInstitutionCreditTransferV06 = new MMConstraint<FinancialInstitutionCreditTransferV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FinancialInstitutionCreditTransferV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FinancialInstitutionCreditTransferV05;
			owner_lazy = () -> FinancialInstitutionCreditTransferV06.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstitutionCreditTransferV06 obj) throws Exception {
			check_pacs_FinancialInstitutionCreditTransferV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV05
	 * MandateInitiationRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_MandateInitiationRequestV04
	 * ConstraintSupplementaryDataRule.for_pain_MandateInitiationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateInitiationRequestV05> for_pain_MandateInitiationRequestV05 = new MMConstraint<MandateInitiationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_MandateInitiationRequestV04;
			owner_lazy = () -> MandateInitiationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(MandateInitiationRequestV05 obj) throws Exception {
			check_pain_MandateInitiationRequestV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV04
	 * MandateInitiationRequestV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_MandateInitiationRequestV05
	 * ConstraintSupplementaryDataRule.for_pain_MandateInitiationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_MandateInitiationRequestV03
	 * ConstraintSupplementaryDataRule.for_pain_MandateInitiationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateInitiationRequestV04> for_pain_MandateInitiationRequestV04 = new MMConstraint<MandateInitiationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_MandateInitiationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_MandateInitiationRequestV03;
			owner_lazy = () -> MandateInitiationRequestV04.mmObject();
		}

		@Override
		public void executeValidator(MandateInitiationRequestV04 obj) throws Exception {
			check_pain_MandateInitiationRequestV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV05
	 * CustomerCreditTransferInitiationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerCreditTransferInitiationV06
	 * ConstraintSupplementaryDataRule.
	 * for_pain_CustomerCreditTransferInitiationV06}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerCreditTransferInitiationV05> for_pain_CustomerCreditTransferInitiationV05 = new MMConstraint<CustomerCreditTransferInitiationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerCreditTransferInitiationV06);
			owner_lazy = () -> CustomerCreditTransferInitiationV05.mmObject();
		}

		@Override
		public void executeValidator(CustomerCreditTransferInitiationV05 obj) throws Exception {
			check_pain_CustomerCreditTransferInitiationV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV04
	 * CustomerDirectDebitInitiationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerDirectDebitInitiationV05
	 * ConstraintSupplementaryDataRule.for_pain_CustomerDirectDebitInitiationV05
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerDirectDebitInitiationV04> for_pain_CustomerDirectDebitInitiationV04 = new MMConstraint<CustomerDirectDebitInitiationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerDirectDebitInitiationV05);
			owner_lazy = () -> CustomerDirectDebitInitiationV04.mmObject();
		}

		@Override
		public void executeValidator(CustomerDirectDebitInitiationV04 obj) throws Exception {
			check_pain_CustomerDirectDebitInitiationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV05
	 * CustomerPaymentStatusReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerPaymentStatusReportV06
	 * ConstraintSupplementaryDataRule.for_pain_CustomerPaymentStatusReportV06}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentStatusReportV05> for_pain_CustomerPaymentStatusReportV05 = new MMConstraint<CustomerPaymentStatusReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerPaymentStatusReportV06);
			owner_lazy = () -> CustomerPaymentStatusReportV05.mmObject();
		}

		@Override
		public void executeValidator(CustomerPaymentStatusReportV05 obj) throws Exception {
			check_pain_CustomerPaymentStatusReportV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV04
	 * CustomerPaymentCancellationRequestV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_CustomerPaymentCancellationRequestV05
	 * ConstraintSupplementaryDataRule.
	 * for_camt_CustomerPaymentCancellationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_CustomerPaymentCancellationRequestV03
	 * ConstraintSupplementaryDataRule.
	 * for_camt_CustomerPaymentCancellationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentCancellationRequestV04> for_camt_CustomerPaymentCancellationRequestV04 = new MMConstraint<CustomerPaymentCancellationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_CustomerPaymentCancellationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_CustomerPaymentCancellationRequestV03;
			owner_lazy = () -> CustomerPaymentCancellationRequestV04.mmObject();
		}

		@Override
		public void executeValidator(CustomerPaymentCancellationRequestV04 obj) throws Exception {
			check_camt_CustomerPaymentCancellationRequestV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV06
	 * PaymentReturnV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_PaymentReturnV07
	 * ConstraintSupplementaryDataRule.for_pacs_PaymentReturnV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_PaymentReturnV05
	 * ConstraintSupplementaryDataRule.for_pacs_PaymentReturnV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV06> for_pacs_PaymentReturnV06 = new MMConstraint<PaymentReturnV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_PaymentReturnV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_PaymentReturnV05;
			owner_lazy = () -> PaymentReturnV06.mmObject();
		}

		@Override
		public void executeValidator(PaymentReturnV06 obj) throws Exception {
			check_pacs_PaymentReturnV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV04
	 * MandateCancellationRequestV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_MandateCancellationRequestV05
	 * ConstraintSupplementaryDataRule.for_pain_MandateCancellationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_MandateCancellationRequestV03
	 * ConstraintSupplementaryDataRule.for_pain_MandateCancellationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateCancellationRequestV04> for_pain_MandateCancellationRequestV04 = new MMConstraint<MandateCancellationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_MandateCancellationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_MandateCancellationRequestV03;
			owner_lazy = () -> MandateCancellationRequestV04.mmObject();
		}

		@Override
		public void executeValidator(MandateCancellationRequestV04 obj) throws Exception {
			check_pain_MandateCancellationRequestV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV07
	 * BankToCustomerDebitCreditNotificationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerDebitCreditNotificationV06
	 * ConstraintSupplementaryDataRule.
	 * for_camt_BankToCustomerDebitCreditNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerDebitCreditNotificationV07> for_camt_BankToCustomerDebitCreditNotificationV07 = new MMConstraint<BankToCustomerDebitCreditNotificationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerDebitCreditNotificationV06;
			owner_lazy = () -> BankToCustomerDebitCreditNotificationV07.mmObject();
		}

		@Override
		public void executeValidator(BankToCustomerDebitCreditNotificationV07 obj) throws Exception {
			check_camt_BankToCustomerDebitCreditNotificationV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV06
	 * CustomerPaymentStatusReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerPaymentStatusReportV07
	 * ConstraintSupplementaryDataRule.for_pain_CustomerPaymentStatusReportV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerPaymentStatusReportV05
	 * ConstraintSupplementaryDataRule.for_pain_CustomerPaymentStatusReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentStatusReportV06> for_pain_CustomerPaymentStatusReportV06 = new MMConstraint<CustomerPaymentStatusReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerPaymentStatusReportV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerPaymentStatusReportV05;
			owner_lazy = () -> CustomerPaymentStatusReportV06.mmObject();
		}

		@Override
		public void executeValidator(CustomerPaymentStatusReportV06 obj) throws Exception {
			check_pain_CustomerPaymentStatusReportV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV07
	 * FIToFICustomerDirectDebitV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFICustomerDirectDebitV06
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerDirectDebitV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerDirectDebitV07> for_pacs_FIToFICustomerDirectDebitV07 = new MMConstraint<FIToFICustomerDirectDebitV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerDirectDebitV06;
			owner_lazy = () -> FIToFICustomerDirectDebitV07.mmObject();
		}

		@Override
		public void executeValidator(FIToFICustomerDirectDebitV07 obj) throws Exception {
			check_pacs_FIToFICustomerDirectDebitV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV03
	 * CreditorPaymentActivationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CreditorPaymentActivationRequestV04
	 * ConstraintSupplementaryDataRule.
	 * for_pain_CreditorPaymentActivationRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestV03> for_pain_CreditorPaymentActivationRequestV03 = new MMConstraint<CreditorPaymentActivationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CreditorPaymentActivationRequestV04);
			owner_lazy = () -> CreditorPaymentActivationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(CreditorPaymentActivationRequestV03 obj) throws Exception {
			check_pain_CreditorPaymentActivationRequestV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV08
	 * FIToFIPaymentStatusReportV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentStatusReportV09
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusReportV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentStatusReportV07
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusReportV08> for_pacs_FIToFIPaymentStatusReportV08 = new MMConstraint<FIToFIPaymentStatusReportV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusReportV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusReportV07;
			owner_lazy = () -> FIToFIPaymentStatusReportV08.mmObject();
		}

		@Override
		public void executeValidator(FIToFIPaymentStatusReportV08 obj) throws Exception {
			check_pacs_FIToFIPaymentStatusReportV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV07
	 * PaymentReturnV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_PaymentReturnV08
	 * ConstraintSupplementaryDataRule.for_pacs_PaymentReturnV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_PaymentReturnV06
	 * ConstraintSupplementaryDataRule.for_pacs_PaymentReturnV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV07> for_pacs_PaymentReturnV07 = new MMConstraint<PaymentReturnV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_PaymentReturnV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_PaymentReturnV06;
			owner_lazy = () -> PaymentReturnV07.mmObject();
		}

		@Override
		public void executeValidator(PaymentReturnV07 obj) throws Exception {
			check_pacs_PaymentReturnV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV04
	 * BankToCustomerAccountReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerAccountReportV05
	 * ConstraintSupplementaryDataRule.for_camt_BankToCustomerAccountReportV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerAccountReportV04> for_camt_BankToCustomerAccountReportV04 = new MMConstraint<BankToCustomerAccountReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerAccountReportV05);
			owner_lazy = () -> BankToCustomerAccountReportV04.mmObject();
		}

		@Override
		public void executeValidator(BankToCustomerAccountReportV04 obj) throws Exception {
			check_camt_BankToCustomerAccountReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV06
	 * BankToCustomerAccountReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerAccountReportV07
	 * ConstraintSupplementaryDataRule.for_camt_BankToCustomerAccountReportV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerAccountReportV05
	 * ConstraintSupplementaryDataRule.for_camt_BankToCustomerAccountReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerAccountReportV06> for_camt_BankToCustomerAccountReportV06 = new MMConstraint<BankToCustomerAccountReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerAccountReportV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerAccountReportV05;
			owner_lazy = () -> BankToCustomerAccountReportV06.mmObject();
		}

		@Override
		public void executeValidator(BankToCustomerAccountReportV06 obj) throws Exception {
			check_camt_BankToCustomerAccountReportV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV05
	 * CustomerPaymentReversalV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerPaymentReversalV06
	 * ConstraintSupplementaryDataRule.for_pain_CustomerPaymentReversalV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerPaymentReversalV04
	 * ConstraintSupplementaryDataRule.for_pain_CustomerPaymentReversalV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV05> for_pain_CustomerPaymentReversalV05 = new MMConstraint<CustomerPaymentReversalV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerPaymentReversalV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerPaymentReversalV04;
			owner_lazy = () -> CustomerPaymentReversalV05.mmObject();
		}

		@Override
		public void executeValidator(CustomerPaymentReversalV05 obj) throws Exception {
			check_pain_CustomerPaymentReversalV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV07
	 * FIToFIPaymentCancellationRequestV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_FIToFIPaymentCancellationRequestV06
	 * ConstraintSupplementaryDataRule.
	 * for_camt_FIToFIPaymentCancellationRequestV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentCancellationRequestV07> for_camt_FIToFIPaymentCancellationRequestV07 = new MMConstraint<FIToFIPaymentCancellationRequestV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_FIToFIPaymentCancellationRequestV06;
			owner_lazy = () -> FIToFIPaymentCancellationRequestV07.mmObject();
		}

		@Override
		public void executeValidator(FIToFIPaymentCancellationRequestV07 obj) throws Exception {
			check_camt_FIToFIPaymentCancellationRequestV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV07
	 * CustomerPaymentStatusReportV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerPaymentStatusReportV08
	 * ConstraintSupplementaryDataRule.for_pain_CustomerPaymentStatusReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerPaymentStatusReportV06
	 * ConstraintSupplementaryDataRule.for_pain_CustomerPaymentStatusReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentStatusReportV07> for_pain_CustomerPaymentStatusReportV07 = new MMConstraint<CustomerPaymentStatusReportV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerPaymentStatusReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerPaymentStatusReportV06;
			owner_lazy = () -> CustomerPaymentStatusReportV07.mmObject();
		}

		@Override
		public void executeValidator(CustomerPaymentStatusReportV07 obj) throws Exception {
			check_pain_CustomerPaymentStatusReportV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV05
	 * MandateAmendmentRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_MandateAmendmentRequestV04
	 * ConstraintSupplementaryDataRule.for_pain_MandateAmendmentRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateAmendmentRequestV05> for_pain_MandateAmendmentRequestV05 = new MMConstraint<MandateAmendmentRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_MandateAmendmentRequestV04;
			owner_lazy = () -> MandateAmendmentRequestV05.mmObject();
		}

		@Override
		public void executeValidator(MandateAmendmentRequestV05 obj) throws Exception {
			check_pain_MandateAmendmentRequestV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV03
	 * MandateCancellationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_MandateCancellationRequestV04
	 * ConstraintSupplementaryDataRule.for_pain_MandateCancellationRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MandateCancellationRequestV03> for_pain_MandateCancellationRequestV03 = new MMConstraint<MandateCancellationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_MandateCancellationRequestV04);
			owner_lazy = () -> MandateCancellationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(MandateCancellationRequestV03 obj) throws Exception {
			check_pain_MandateCancellationRequestV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV08
	 * CustomerPaymentReversalV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerPaymentReversalV07
	 * ConstraintSupplementaryDataRule.for_pain_CustomerPaymentReversalV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV08> for_pain_CustomerPaymentReversalV08 = new MMConstraint<CustomerPaymentReversalV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerPaymentReversalV07;
			owner_lazy = () -> CustomerPaymentReversalV08.mmObject();
		}

		@Override
		public void executeValidator(CustomerPaymentReversalV08 obj) throws Exception {
			check_pain_CustomerPaymentReversalV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV05
	 * CreditorPaymentActivationRequestStatusReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CreditorPaymentActivationRequestStatusReportV06
	 * ConstraintSupplementaryDataRule.
	 * for_pain_CreditorPaymentActivationRequestStatusReportV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CreditorPaymentActivationRequestStatusReportV04
	 * ConstraintSupplementaryDataRule.
	 * for_pain_CreditorPaymentActivationRequestStatusReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestStatusReportV05> for_pain_CreditorPaymentActivationRequestStatusReportV05 = new MMConstraint<CreditorPaymentActivationRequestStatusReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CreditorPaymentActivationRequestStatusReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CreditorPaymentActivationRequestStatusReportV04;
			owner_lazy = () -> CreditorPaymentActivationRequestStatusReportV05.mmObject();
		}

		@Override
		public void executeValidator(CreditorPaymentActivationRequestStatusReportV05 obj) throws Exception {
			check_pain_CreditorPaymentActivationRequestStatusReportV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV03
	 * CustomerPaymentCancellationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_CustomerPaymentCancellationRequestV04
	 * ConstraintSupplementaryDataRule.
	 * for_camt_CustomerPaymentCancellationRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentCancellationRequestV03> for_camt_CustomerPaymentCancellationRequestV03 = new MMConstraint<CustomerPaymentCancellationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_CustomerPaymentCancellationRequestV04);
			owner_lazy = () -> CustomerPaymentCancellationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(CustomerPaymentCancellationRequestV03 obj) throws Exception {
			check_camt_CustomerPaymentCancellationRequestV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV04
	 * BankToCustomerStatementV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerStatementV05
	 * ConstraintSupplementaryDataRule.for_camt_BankToCustomerStatementV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerStatementV04> for_camt_BankToCustomerStatementV04 = new MMConstraint<BankToCustomerStatementV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerStatementV05);
			owner_lazy = () -> BankToCustomerStatementV04.mmObject();
		}

		@Override
		public void executeValidator(BankToCustomerStatementV04 obj) throws Exception {
			check_camt_BankToCustomerStatementV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV04
	 * MandateAcceptanceReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_MandateAcceptanceReportV05
	 * ConstraintSupplementaryDataRule.for_pain_MandateAcceptanceReportV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_MandateAcceptanceReportV03
	 * ConstraintSupplementaryDataRule.for_pain_MandateAcceptanceReportV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateAcceptanceReportV04> for_pain_MandateAcceptanceReportV04 = new MMConstraint<MandateAcceptanceReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_MandateAcceptanceReportV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_MandateAcceptanceReportV03;
			owner_lazy = () -> MandateAcceptanceReportV04.mmObject();
		}

		@Override
		public void executeValidator(MandateAcceptanceReportV04 obj) throws Exception {
			check_pain_MandateAcceptanceReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV03
	 * MandateAcceptanceReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_MandateAcceptanceReportV04
	 * ConstraintSupplementaryDataRule.for_pain_MandateAcceptanceReportV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MandateAcceptanceReportV03> for_pain_MandateAcceptanceReportV03 = new MMConstraint<MandateAcceptanceReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_MandateAcceptanceReportV04);
			owner_lazy = () -> MandateAcceptanceReportV03.mmObject();
		}

		@Override
		public void executeValidator(MandateAcceptanceReportV03 obj) throws Exception {
			check_pain_MandateAcceptanceReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV06
	 * BankToCustomerStatementV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerStatementV07
	 * ConstraintSupplementaryDataRule.for_camt_BankToCustomerStatementV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerStatementV05
	 * ConstraintSupplementaryDataRule.for_camt_BankToCustomerStatementV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerStatementV06> for_camt_BankToCustomerStatementV06 = new MMConstraint<BankToCustomerStatementV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerStatementV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerStatementV05;
			owner_lazy = () -> BankToCustomerStatementV06.mmObject();
		}

		@Override
		public void executeValidator(BankToCustomerStatementV06 obj) throws Exception {
			check_camt_BankToCustomerStatementV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV07
	 * FIToFICustomerCreditTransferV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFICustomerCreditTransferV06
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerCreditTransferV06}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerCreditTransferV07> for_pacs_FIToFICustomerCreditTransferV07 = new MMConstraint<FIToFICustomerCreditTransferV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerCreditTransferV06;
			owner_lazy = () -> FIToFICustomerCreditTransferV07.mmObject();
		}

		@Override
		public void executeValidator(FIToFICustomerCreditTransferV07 obj) throws Exception {
			check_pacs_FIToFICustomerCreditTransferV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV09
	 * FIToFIPaymentStatusReportV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentStatusReportV08
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusReportV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusReportV09> for_pacs_FIToFIPaymentStatusReportV09 = new MMConstraint<FIToFIPaymentStatusReportV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusReportV08;
			owner_lazy = () -> FIToFIPaymentStatusReportV09.mmObject();
		}

		@Override
		public void executeValidator(FIToFIPaymentStatusReportV09 obj) throws Exception {
			check_pacs_FIToFIPaymentStatusReportV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV06
	 * BankToCustomerDebitCreditNotificationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerDebitCreditNotificationV07
	 * ConstraintSupplementaryDataRule.
	 * for_camt_BankToCustomerDebitCreditNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerDebitCreditNotificationV05
	 * ConstraintSupplementaryDataRule.
	 * for_camt_BankToCustomerDebitCreditNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerDebitCreditNotificationV06> for_camt_BankToCustomerDebitCreditNotificationV06 = new MMConstraint<BankToCustomerDebitCreditNotificationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerDebitCreditNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerDebitCreditNotificationV05;
			owner_lazy = () -> BankToCustomerDebitCreditNotificationV06.mmObject();
		}

		@Override
		public void executeValidator(BankToCustomerDebitCreditNotificationV06 obj) throws Exception {
			check_camt_BankToCustomerDebitCreditNotificationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07
	 * CustomerDirectDebitInitiationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerDirectDebitInitiationV06
	 * ConstraintSupplementaryDataRule.for_pain_CustomerDirectDebitInitiationV06
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerDirectDebitInitiationV07> for_pain_CustomerDirectDebitInitiationV07 = new MMConstraint<CustomerDirectDebitInitiationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerDirectDebitInitiationV06;
			owner_lazy = () -> CustomerDirectDebitInitiationV07.mmObject();
		}

		@Override
		public void executeValidator(CustomerDirectDebitInitiationV07 obj) throws Exception {
			check_pain_CustomerDirectDebitInitiationV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV06
	 * FIToFIPaymentReversalV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentReversalV07
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentReversalV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentReversalV05
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentReversalV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV06> for_pacs_FIToFIPaymentReversalV06 = new MMConstraint<FIToFIPaymentReversalV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentReversalV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentReversalV05;
			owner_lazy = () -> FIToFIPaymentReversalV06.mmObject();
		}

		@Override
		public void executeValidator(FIToFIPaymentReversalV06 obj) throws Exception {
			check_pacs_FIToFIPaymentReversalV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV03
	 * FIToFIPaymentCancellationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_FIToFIPaymentCancellationRequestV04
	 * ConstraintSupplementaryDataRule.
	 * for_camt_FIToFIPaymentCancellationRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentCancellationRequestV03> for_camt_FIToFIPaymentCancellationRequestV03 = new MMConstraint<FIToFIPaymentCancellationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_FIToFIPaymentCancellationRequestV04);
			owner_lazy = () -> FIToFIPaymentCancellationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(FIToFIPaymentCancellationRequestV03 obj) throws Exception {
			check_camt_FIToFIPaymentCancellationRequestV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06
	 * FIToFIPaymentCancellationRequestV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_FIToFIPaymentCancellationRequestV07
	 * ConstraintSupplementaryDataRule.
	 * for_camt_FIToFIPaymentCancellationRequestV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_FIToFIPaymentCancellationRequestV05
	 * ConstraintSupplementaryDataRule.
	 * for_camt_FIToFIPaymentCancellationRequestV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentCancellationRequestV06> for_camt_FIToFIPaymentCancellationRequestV06 = new MMConstraint<FIToFIPaymentCancellationRequestV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_FIToFIPaymentCancellationRequestV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_FIToFIPaymentCancellationRequestV05;
			owner_lazy = () -> FIToFIPaymentCancellationRequestV06.mmObject();
		}

		@Override
		public void executeValidator(FIToFIPaymentCancellationRequestV06 obj) throws Exception {
			check_camt_FIToFIPaymentCancellationRequestV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionDirectDebitV02
	 * FinancialInstitutionDirectDebitV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionDirectDebitV02> for_pacs_FinancialInstitutionDirectDebitV02 = new MMConstraint<FinancialInstitutionDirectDebitV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> FinancialInstitutionDirectDebitV02.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstitutionDirectDebitV02 obj) throws Exception {
			check_pacs_FinancialInstitutionDirectDebitV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06
	 * FIToFIPaymentStatusReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentStatusReportV07
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusReportV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentStatusReportV05
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusReportV06> for_pacs_FIToFIPaymentStatusReportV06 = new MMConstraint<FIToFIPaymentStatusReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusReportV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusReportV05;
			owner_lazy = () -> FIToFIPaymentStatusReportV06.mmObject();
		}

		@Override
		public void executeValidator(FIToFIPaymentStatusReportV06 obj) throws Exception {
			check_pacs_FIToFIPaymentStatusReportV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06
	 * CustomerPaymentCancellationRequestV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_CustomerPaymentCancellationRequestV07
	 * ConstraintSupplementaryDataRule.
	 * for_camt_CustomerPaymentCancellationRequestV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_CustomerPaymentCancellationRequestV05
	 * ConstraintSupplementaryDataRule.
	 * for_camt_CustomerPaymentCancellationRequestV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentCancellationRequestV06> for_camt_CustomerPaymentCancellationRequestV06 = new MMConstraint<CustomerPaymentCancellationRequestV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_CustomerPaymentCancellationRequestV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_CustomerPaymentCancellationRequestV05;
			owner_lazy = () -> CustomerPaymentCancellationRequestV06.mmObject();
		}

		@Override
		public void executeValidator(CustomerPaymentCancellationRequestV06 obj) throws Exception {
			check_camt_CustomerPaymentCancellationRequestV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateSuspensionRequestV01
	 * MandateSuspensionRequestV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MandateSuspensionRequestV01> for_pain_MandateSuspensionRequestV01 = new MMConstraint<MandateSuspensionRequestV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> MandateSuspensionRequestV01.mmObject();
		}

		@Override
		public void executeValidator(MandateSuspensionRequestV01 obj) throws Exception {
			check_pain_MandateSuspensionRequestV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV05
	 * MandateAcceptanceReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_MandateAcceptanceReportV04
	 * ConstraintSupplementaryDataRule.for_pain_MandateAcceptanceReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateAcceptanceReportV05> for_pain_MandateAcceptanceReportV05 = new MMConstraint<MandateAcceptanceReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_MandateAcceptanceReportV04;
			owner_lazy = () -> MandateAcceptanceReportV05.mmObject();
		}

		@Override
		public void executeValidator(MandateAcceptanceReportV05 obj) throws Exception {
			check_pain_MandateAcceptanceReportV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV05
	 * FinancialInstitutionCreditTransferV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FinancialInstitutionCreditTransferV06
	 * ConstraintSupplementaryDataRule.
	 * for_pacs_FinancialInstitutionCreditTransferV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FinancialInstitutionCreditTransferV04
	 * ConstraintSupplementaryDataRule.
	 * for_pacs_FinancialInstitutionCreditTransferV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionCreditTransferV05> for_pacs_FinancialInstitutionCreditTransferV05 = new MMConstraint<FinancialInstitutionCreditTransferV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FinancialInstitutionCreditTransferV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FinancialInstitutionCreditTransferV04;
			owner_lazy = () -> FinancialInstitutionCreditTransferV05.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstitutionCreditTransferV05 obj) throws Exception {
			check_pacs_FinancialInstitutionCreditTransferV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV05
	 * FIToFIPaymentStatusReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentStatusReportV06
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusReportV06}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusReportV05> for_pacs_FIToFIPaymentStatusReportV05 = new MMConstraint<FIToFIPaymentStatusReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusReportV06);
			owner_lazy = () -> FIToFIPaymentStatusReportV05.mmObject();
		}

		@Override
		public void executeValidator(FIToFIPaymentStatusReportV05 obj) throws Exception {
			check_pacs_FIToFIPaymentStatusReportV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV04
	 * PaymentReturnV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_PaymentReturnV05
	 * ConstraintSupplementaryDataRule.for_pacs_PaymentReturnV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV04> for_pacs_PaymentReturnV04 = new MMConstraint<PaymentReturnV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_PaymentReturnV05);
			owner_lazy = () -> PaymentReturnV04.mmObject();
		}

		@Override
		public void executeValidator(PaymentReturnV04 obj) throws Exception {
			check_pacs_PaymentReturnV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV04
	 * FIToFIPaymentReversalV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentReversalV05
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentReversalV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV04> for_pacs_FIToFIPaymentReversalV04 = new MMConstraint<FIToFIPaymentReversalV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentReversalV05);
			owner_lazy = () -> FIToFIPaymentReversalV04.mmObject();
		}

		@Override
		public void executeValidator(FIToFIPaymentReversalV04 obj) throws Exception {
			check_pacs_FIToFIPaymentReversalV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV07
	 * CustomerPaymentCancellationRequestV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_CustomerPaymentCancellationRequestV06
	 * ConstraintSupplementaryDataRule.
	 * for_camt_CustomerPaymentCancellationRequestV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentCancellationRequestV07> for_camt_CustomerPaymentCancellationRequestV07 = new MMConstraint<CustomerPaymentCancellationRequestV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_CustomerPaymentCancellationRequestV06;
			owner_lazy = () -> CustomerPaymentCancellationRequestV07.mmObject();
		}

		@Override
		public void executeValidator(CustomerPaymentCancellationRequestV07 obj) throws Exception {
			check_camt_CustomerPaymentCancellationRequestV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV06
	 * FIToFICustomerDirectDebitV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFICustomerDirectDebitV07
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerDirectDebitV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFICustomerDirectDebitV05
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerDirectDebitV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerDirectDebitV06> for_pacs_FIToFICustomerDirectDebitV06 = new MMConstraint<FIToFICustomerDirectDebitV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerDirectDebitV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerDirectDebitV05;
			owner_lazy = () -> FIToFICustomerDirectDebitV06.mmObject();
		}

		@Override
		public void executeValidator(FIToFICustomerDirectDebitV06 obj) throws Exception {
			check_pacs_FIToFICustomerDirectDebitV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV07
	 * CustomerPaymentReversalV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerPaymentReversalV08
	 * ConstraintSupplementaryDataRule.for_pain_CustomerPaymentReversalV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerPaymentReversalV06
	 * ConstraintSupplementaryDataRule.for_pain_CustomerPaymentReversalV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV07> for_pain_CustomerPaymentReversalV07 = new MMConstraint<CustomerPaymentReversalV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerPaymentReversalV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerPaymentReversalV06;
			owner_lazy = () -> CustomerPaymentReversalV07.mmObject();
		}

		@Override
		public void executeValidator(CustomerPaymentReversalV07 obj) throws Exception {
			check_pain_CustomerPaymentReversalV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV05
	 * CreditorPaymentActivationRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CreditorPaymentActivationRequestV06
	 * ConstraintSupplementaryDataRule.
	 * for_pain_CreditorPaymentActivationRequestV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CreditorPaymentActivationRequestV04
	 * ConstraintSupplementaryDataRule.
	 * for_pain_CreditorPaymentActivationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestV05> for_pain_CreditorPaymentActivationRequestV05 = new MMConstraint<CreditorPaymentActivationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CreditorPaymentActivationRequestV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CreditorPaymentActivationRequestV04;
			owner_lazy = () -> CreditorPaymentActivationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(CreditorPaymentActivationRequestV05 obj) throws Exception {
			check_pain_CreditorPaymentActivationRequestV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV04
	 * MandateAmendmentRequestV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_MandateAmendmentRequestV05
	 * ConstraintSupplementaryDataRule.for_pain_MandateAmendmentRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_MandateAmendmentRequestV03
	 * ConstraintSupplementaryDataRule.for_pain_MandateAmendmentRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateAmendmentRequestV04> for_pain_MandateAmendmentRequestV04 = new MMConstraint<MandateAmendmentRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_MandateAmendmentRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_MandateAmendmentRequestV03;
			owner_lazy = () -> MandateAmendmentRequestV04.mmObject();
		}

		@Override
		public void executeValidator(MandateAmendmentRequestV04 obj) throws Exception {
			check_pain_MandateAmendmentRequestV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV08
	 * PaymentReturnV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_PaymentReturnV07
	 * ConstraintSupplementaryDataRule.for_pacs_PaymentReturnV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV08> for_pacs_PaymentReturnV08 = new MMConstraint<PaymentReturnV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_PaymentReturnV07;
			owner_lazy = () -> PaymentReturnV08.mmObject();
		}

		@Override
		public void executeValidator(PaymentReturnV08 obj) throws Exception {
			check_pacs_PaymentReturnV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV05
	 * CustomerPaymentCancellationRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_CustomerPaymentCancellationRequestV06
	 * ConstraintSupplementaryDataRule.
	 * for_camt_CustomerPaymentCancellationRequestV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_CustomerPaymentCancellationRequestV04
	 * ConstraintSupplementaryDataRule.
	 * for_camt_CustomerPaymentCancellationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentCancellationRequestV05> for_camt_CustomerPaymentCancellationRequestV05 = new MMConstraint<CustomerPaymentCancellationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_CustomerPaymentCancellationRequestV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_CustomerPaymentCancellationRequestV04;
			owner_lazy = () -> CustomerPaymentCancellationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(CustomerPaymentCancellationRequestV05 obj) throws Exception {
			check_camt_CustomerPaymentCancellationRequestV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This component may not be used without the explicit approval of a SEG and submission to the RA of ISO 20022 compliant structure(s) to be used in the Envelope element."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SupplementaryData1> forSupplementaryData1 = new MMConstraint<SupplementaryData1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "This component may not be used without the explicit approval of a SEG and submission to the RA of ISO 20022 compliant structure(s) to be used in the Envelope element.";
			owner_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public void executeValidator(SupplementaryData1 obj) throws Exception {
			checkSupplementaryData1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV07
	 * BankToCustomerAccountReportV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerAccountReportV06
	 * ConstraintSupplementaryDataRule.for_camt_BankToCustomerAccountReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerAccountReportV07> for_camt_BankToCustomerAccountReportV07 = new MMConstraint<BankToCustomerAccountReportV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerAccountReportV06;
			owner_lazy = () -> BankToCustomerAccountReportV07.mmObject();
		}

		@Override
		public void executeValidator(BankToCustomerAccountReportV07 obj) throws Exception {
			check_camt_BankToCustomerAccountReportV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV05
	 * CustomerDirectDebitInitiationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerDirectDebitInitiationV06
	 * ConstraintSupplementaryDataRule.for_pain_CustomerDirectDebitInitiationV06
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerDirectDebitInitiationV04
	 * ConstraintSupplementaryDataRule.for_pain_CustomerDirectDebitInitiationV04
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerDirectDebitInitiationV05> for_pain_CustomerDirectDebitInitiationV05 = new MMConstraint<CustomerDirectDebitInitiationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerDirectDebitInitiationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerDirectDebitInitiationV04;
			owner_lazy = () -> CustomerDirectDebitInitiationV05.mmObject();
		}

		@Override
		public void executeValidator(CustomerDirectDebitInitiationV05 obj) throws Exception {
			check_pain_CustomerDirectDebitInitiationV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV04
	 * FIToFICustomerCreditTransferV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFICustomerCreditTransferV05
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerCreditTransferV05}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerCreditTransferV04> for_pacs_FIToFICustomerCreditTransferV04 = new MMConstraint<FIToFICustomerCreditTransferV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerCreditTransferV05);
			owner_lazy = () -> FIToFICustomerCreditTransferV04.mmObject();
		}

		@Override
		public void executeValidator(FIToFICustomerCreditTransferV04 obj) throws Exception {
			check_pacs_FIToFICustomerCreditTransferV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV05
	 * PaymentReturnV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_PaymentReturnV06
	 * ConstraintSupplementaryDataRule.for_pacs_PaymentReturnV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_PaymentReturnV04
	 * ConstraintSupplementaryDataRule.for_pacs_PaymentReturnV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV05> for_pacs_PaymentReturnV05 = new MMConstraint<PaymentReturnV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_PaymentReturnV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_PaymentReturnV04;
			owner_lazy = () -> PaymentReturnV05.mmObject();
		}

		@Override
		public void executeValidator(PaymentReturnV05 obj) throws Exception {
			check_pacs_PaymentReturnV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV04
	 * FIToFICustomerDirectDebitV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFICustomerDirectDebitV05
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerDirectDebitV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerDirectDebitV04> for_pacs_FIToFICustomerDirectDebitV04 = new MMConstraint<FIToFICustomerDirectDebitV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerDirectDebitV05);
			owner_lazy = () -> FIToFICustomerDirectDebitV04.mmObject();
		}

		@Override
		public void executeValidator(FIToFICustomerDirectDebitV04 obj) throws Exception {
			check_pacs_FIToFICustomerDirectDebitV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV05
	 * FIToFIPaymentCancellationRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_FIToFIPaymentCancellationRequestV06
	 * ConstraintSupplementaryDataRule.
	 * for_camt_FIToFIPaymentCancellationRequestV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_FIToFIPaymentCancellationRequestV04
	 * ConstraintSupplementaryDataRule.
	 * for_camt_FIToFIPaymentCancellationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentCancellationRequestV05> for_camt_FIToFIPaymentCancellationRequestV05 = new MMConstraint<FIToFIPaymentCancellationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_FIToFIPaymentCancellationRequestV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_FIToFIPaymentCancellationRequestV04;
			owner_lazy = () -> FIToFIPaymentCancellationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(FIToFIPaymentCancellationRequestV05 obj) throws Exception {
			check_camt_FIToFIPaymentCancellationRequestV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV05
	 * BankToCustomerAccountReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerAccountReportV06
	 * ConstraintSupplementaryDataRule.for_camt_BankToCustomerAccountReportV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerAccountReportV04
	 * ConstraintSupplementaryDataRule.for_camt_BankToCustomerAccountReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerAccountReportV05> for_camt_BankToCustomerAccountReportV05 = new MMConstraint<BankToCustomerAccountReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerAccountReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerAccountReportV04;
			owner_lazy = () -> BankToCustomerAccountReportV05.mmObject();
		}

		@Override
		public void executeValidator(BankToCustomerAccountReportV05 obj) throws Exception {
			check_camt_BankToCustomerAccountReportV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01
	 * FIToFIPaymentStatusRequestV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentStatusRequestV02
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusRequestV02}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusRequestV01> for_pacs_FIToFIPaymentStatusRequestV01 = new MMConstraint<FIToFIPaymentStatusRequestV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentStatusRequestV02);
			owner_lazy = () -> FIToFIPaymentStatusRequestV01.mmObject();
		}

		@Override
		public void executeValidator(FIToFIPaymentStatusRequestV01 obj) throws Exception {
			check_pacs_FIToFIPaymentStatusRequestV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV03
	 * MandateInitiationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_MandateInitiationRequestV04
	 * ConstraintSupplementaryDataRule.for_pain_MandateInitiationRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MandateInitiationRequestV03> for_pain_MandateInitiationRequestV03 = new MMConstraint<MandateInitiationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_MandateInitiationRequestV04);
			owner_lazy = () -> MandateInitiationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(MandateInitiationRequestV03 obj) throws Exception {
			check_pain_MandateInitiationRequestV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07
	 * FIToFIPaymentReversalV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentReversalV08
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentReversalV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentReversalV06
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentReversalV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV07> for_pacs_FIToFIPaymentReversalV07 = new MMConstraint<FIToFIPaymentReversalV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentReversalV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentReversalV06;
			owner_lazy = () -> FIToFIPaymentReversalV07.mmObject();
		}

		@Override
		public void executeValidator(FIToFIPaymentReversalV07 obj) throws Exception {
			check_pacs_FIToFIPaymentReversalV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV05
	 * FIToFIPaymentReversalV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentReversalV06
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentReversalV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFIPaymentReversalV04
	 * ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentReversalV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV05> for_pacs_FIToFIPaymentReversalV05 = new MMConstraint<FIToFIPaymentReversalV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentReversalV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFIPaymentReversalV04;
			owner_lazy = () -> FIToFIPaymentReversalV05.mmObject();
		}

		@Override
		public void executeValidator(FIToFIPaymentReversalV05 obj) throws Exception {
			check_pacs_FIToFIPaymentReversalV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV04
	 * BankToCustomerDebitCreditNotificationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerDebitCreditNotificationV05
	 * ConstraintSupplementaryDataRule.
	 * for_camt_BankToCustomerDebitCreditNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerDebitCreditNotificationV04> for_camt_BankToCustomerDebitCreditNotificationV04 = new MMConstraint<BankToCustomerDebitCreditNotificationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerDebitCreditNotificationV05);
			owner_lazy = () -> BankToCustomerDebitCreditNotificationV04.mmObject();
		}

		@Override
		public void executeValidator(BankToCustomerDebitCreditNotificationV04 obj) throws Exception {
			check_camt_BankToCustomerDebitCreditNotificationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV04
	 * FinancialInstitutionCreditTransferV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FinancialInstitutionCreditTransferV05
	 * ConstraintSupplementaryDataRule.
	 * for_pacs_FinancialInstitutionCreditTransferV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionCreditTransferV04> for_pacs_FinancialInstitutionCreditTransferV04 = new MMConstraint<FinancialInstitutionCreditTransferV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FinancialInstitutionCreditTransferV05);
			owner_lazy = () -> FinancialInstitutionCreditTransferV04.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstitutionCreditTransferV04 obj) throws Exception {
			check_pacs_FinancialInstitutionCreditTransferV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV04
	 * FIToFIPaymentCancellationRequestV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_FIToFIPaymentCancellationRequestV05
	 * ConstraintSupplementaryDataRule.
	 * for_camt_FIToFIPaymentCancellationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_FIToFIPaymentCancellationRequestV03
	 * ConstraintSupplementaryDataRule.
	 * for_camt_FIToFIPaymentCancellationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentCancellationRequestV04> for_camt_FIToFIPaymentCancellationRequestV04 = new MMConstraint<FIToFIPaymentCancellationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_FIToFIPaymentCancellationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_FIToFIPaymentCancellationRequestV03;
			owner_lazy = () -> FIToFIPaymentCancellationRequestV04.mmObject();
		}

		@Override
		public void executeValidator(FIToFIPaymentCancellationRequestV04 obj) throws Exception {
			check_camt_FIToFIPaymentCancellationRequestV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV09
	 * CustomerPaymentStatusReportV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerPaymentStatusReportV08
	 * ConstraintSupplementaryDataRule.for_pain_CustomerPaymentStatusReportV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentStatusReportV09> for_pain_CustomerPaymentStatusReportV09 = new MMConstraint<CustomerPaymentStatusReportV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerPaymentStatusReportV08;
			owner_lazy = () -> CustomerPaymentStatusReportV09.mmObject();
		}

		@Override
		public void executeValidator(CustomerPaymentStatusReportV09 obj) throws Exception {
			check_pain_CustomerPaymentStatusReportV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV04
	 * CreditorPaymentActivationRequestV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CreditorPaymentActivationRequestV05
	 * ConstraintSupplementaryDataRule.
	 * for_pain_CreditorPaymentActivationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CreditorPaymentActivationRequestV03
	 * ConstraintSupplementaryDataRule.
	 * for_pain_CreditorPaymentActivationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestV04> for_pain_CreditorPaymentActivationRequestV04 = new MMConstraint<CreditorPaymentActivationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CreditorPaymentActivationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CreditorPaymentActivationRequestV03;
			owner_lazy = () -> CreditorPaymentActivationRequestV04.mmObject();
		}

		@Override
		public void executeValidator(CreditorPaymentActivationRequestV04 obj) throws Exception {
			check_pain_CreditorPaymentActivationRequestV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV06
	 * CreditorPaymentActivationRequestV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CreditorPaymentActivationRequestV05
	 * ConstraintSupplementaryDataRule.
	 * for_pain_CreditorPaymentActivationRequestV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestV06> for_pain_CreditorPaymentActivationRequestV06 = new MMConstraint<CreditorPaymentActivationRequestV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CreditorPaymentActivationRequestV05;
			owner_lazy = () -> CreditorPaymentActivationRequestV06.mmObject();
		}

		@Override
		public void executeValidator(CreditorPaymentActivationRequestV06 obj) throws Exception {
			check_pain_CreditorPaymentActivationRequestV06(obj);
		}
	};

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFIPaymentStatusRequestV02(FIToFIPaymentStatusRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CustomerPaymentStatusReportV08(CustomerPaymentStatusReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CustomerCreditTransferInitiationV08(CustomerCreditTransferInitiationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CreditorPaymentActivationRequestStatusReportV04(CreditorPaymentActivationRequestStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CustomerPaymentReversalV06(CustomerPaymentReversalV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_MandateCopyRequestV01(MandateCopyRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CustomerCreditTransferInitiationV07(CustomerCreditTransferInitiationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CustomerCreditTransferInitiationV06(CustomerCreditTransferInitiationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFICustomerCreditTransferV05(FIToFICustomerCreditTransferV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFICustomerCreditTransferV06(FIToFICustomerCreditTransferV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CustomerDirectDebitInitiationV06(CustomerDirectDebitInitiationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_MandateCancellationRequestV05(MandateCancellationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CreditorPaymentActivationRequestStatusReportV06(CreditorPaymentActivationRequestStatusReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_BankToCustomerDebitCreditNotificationV05(BankToCustomerDebitCreditNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFIPaymentReversalV08(FIToFIPaymentReversalV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CreditorPaymentActivationRequestStatusReportV03(CreditorPaymentActivationRequestStatusReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFICustomerDirectDebitV05(FIToFICustomerDirectDebitV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_BankToCustomerStatementV07(BankToCustomerStatementV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_MandateAmendmentRequestV03(MandateAmendmentRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FinancialInstitutionCreditTransferV07(FinancialInstitutionCreditTransferV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFIPaymentStatusReportV07(FIToFIPaymentStatusReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_BankToCustomerStatementV05(BankToCustomerStatementV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CustomerPaymentReversalV04(CustomerPaymentReversalV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FinancialInstitutionCreditTransferV06(FinancialInstitutionCreditTransferV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_MandateInitiationRequestV05(MandateInitiationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_MandateInitiationRequestV04(MandateInitiationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CustomerCreditTransferInitiationV05(CustomerCreditTransferInitiationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CustomerDirectDebitInitiationV04(CustomerDirectDebitInitiationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CustomerPaymentStatusReportV05(CustomerPaymentStatusReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_CustomerPaymentCancellationRequestV04(CustomerPaymentCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_PaymentReturnV06(PaymentReturnV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_MandateCancellationRequestV04(MandateCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_BankToCustomerDebitCreditNotificationV07(BankToCustomerDebitCreditNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CustomerPaymentStatusReportV06(CustomerPaymentStatusReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFICustomerDirectDebitV07(FIToFICustomerDirectDebitV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CreditorPaymentActivationRequestV03(CreditorPaymentActivationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFIPaymentStatusReportV08(FIToFIPaymentStatusReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_PaymentReturnV07(PaymentReturnV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_BankToCustomerAccountReportV04(BankToCustomerAccountReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_BankToCustomerAccountReportV06(BankToCustomerAccountReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CustomerPaymentReversalV05(CustomerPaymentReversalV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_FIToFIPaymentCancellationRequestV07(FIToFIPaymentCancellationRequestV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CustomerPaymentStatusReportV07(CustomerPaymentStatusReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_MandateAmendmentRequestV05(MandateAmendmentRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_MandateCancellationRequestV03(MandateCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CustomerPaymentReversalV08(CustomerPaymentReversalV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CreditorPaymentActivationRequestStatusReportV05(CreditorPaymentActivationRequestStatusReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_CustomerPaymentCancellationRequestV03(CustomerPaymentCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_BankToCustomerStatementV04(BankToCustomerStatementV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_MandateAcceptanceReportV04(MandateAcceptanceReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_MandateAcceptanceReportV03(MandateAcceptanceReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_BankToCustomerStatementV06(BankToCustomerStatementV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFICustomerCreditTransferV07(FIToFICustomerCreditTransferV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFIPaymentStatusReportV09(FIToFIPaymentStatusReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_BankToCustomerDebitCreditNotificationV06(BankToCustomerDebitCreditNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CustomerDirectDebitInitiationV07(CustomerDirectDebitInitiationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFIPaymentReversalV06(FIToFIPaymentReversalV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_FIToFIPaymentCancellationRequestV03(FIToFIPaymentCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_FIToFIPaymentCancellationRequestV06(FIToFIPaymentCancellationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FinancialInstitutionDirectDebitV02(FinancialInstitutionDirectDebitV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFIPaymentStatusReportV06(FIToFIPaymentStatusReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_CustomerPaymentCancellationRequestV06(CustomerPaymentCancellationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_MandateSuspensionRequestV01(MandateSuspensionRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_MandateAcceptanceReportV05(MandateAcceptanceReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FinancialInstitutionCreditTransferV05(FinancialInstitutionCreditTransferV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFIPaymentStatusReportV05(FIToFIPaymentStatusReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_PaymentReturnV04(PaymentReturnV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFIPaymentReversalV04(FIToFIPaymentReversalV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_CustomerPaymentCancellationRequestV07(CustomerPaymentCancellationRequestV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFICustomerDirectDebitV06(FIToFICustomerDirectDebitV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CustomerPaymentReversalV07(CustomerPaymentReversalV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CreditorPaymentActivationRequestV05(CreditorPaymentActivationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_MandateAmendmentRequestV04(MandateAmendmentRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_PaymentReturnV08(PaymentReturnV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_CustomerPaymentCancellationRequestV05(CustomerPaymentCancellationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * This component may not be used without the explicit approval of a SEG and
	 * submission to the RA of ISO 20022 compliant structure(s) to be used in
	 * the Envelope element.
	 */
	public static void checkSupplementaryData1(SupplementaryData1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_BankToCustomerAccountReportV07(BankToCustomerAccountReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CustomerDirectDebitInitiationV05(CustomerDirectDebitInitiationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFICustomerCreditTransferV04(FIToFICustomerCreditTransferV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_PaymentReturnV05(PaymentReturnV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFICustomerDirectDebitV04(FIToFICustomerDirectDebitV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_FIToFIPaymentCancellationRequestV05(FIToFIPaymentCancellationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_BankToCustomerAccountReportV05(BankToCustomerAccountReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFIPaymentStatusRequestV01(FIToFIPaymentStatusRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_MandateInitiationRequestV03(MandateInitiationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFIPaymentReversalV07(FIToFIPaymentReversalV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FIToFIPaymentReversalV05(FIToFIPaymentReversalV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_BankToCustomerDebitCreditNotificationV04(BankToCustomerDebitCreditNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pacs_FinancialInstitutionCreditTransferV04(FinancialInstitutionCreditTransferV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_camt_FIToFIPaymentCancellationRequestV04(FIToFIPaymentCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CustomerPaymentStatusReportV09(CustomerPaymentStatusReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CreditorPaymentActivationRequestV04(CreditorPaymentActivationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void check_pain_CreditorPaymentActivationRequestV06(CreditorPaymentActivationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}