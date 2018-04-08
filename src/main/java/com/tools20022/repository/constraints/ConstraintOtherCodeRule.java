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
 * If Structured is OTHR, then AdditionalInformation is mandatory.
 */
public class ConstraintOtherCodeRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason6
	 * RejectedStatusReason6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason6> forRejectedStatusReason6 = new MMConstraint<RejectedStatusReason6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> RejectedStatusReason6.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason6 obj) throws Exception {
			checkRejectedStatusReason6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ChargeType1 ChargeType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<ChargeType1> forChargeType1 = new MMConstraint<ChargeType1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> ChargeType1.mmObject();
		}

		@Override
		public void executeValidator(ChargeType1 obj) throws Exception {
			checkChargeType1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TaxationBasis1 TaxationBasis1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<TaxationBasis1> forTaxationBasis1 = new MMConstraint<TaxationBasis1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> TaxationBasis1.mmObject();
		}

		@Override
		public void executeValidator(TaxationBasis1 obj) throws Exception {
			checkTaxationBasis1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionInType1
	 * InvestmentFundTransactionInType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentFundTransactionInType1> forInvestmentFundTransactionInType1 = new MMConstraint<InvestmentFundTransactionInType1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> InvestmentFundTransactionInType1.mmObject();
		}

		@Override
		public void executeValidator(InvestmentFundTransactionInType1 obj) throws Exception {
			checkInvestmentFundTransactionInType1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceType1 PriceType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceType1> forPriceType1 = new MMConstraint<PriceType1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> PriceType1.mmObject();
		}

		@Override
		public void executeValidator(PriceType1 obj) throws Exception {
			checkPriceType1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason1
	 * SuspendedStatusReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<SuspendedStatusReason1> forSuspendedStatusReason1 = new MMConstraint<SuspendedStatusReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> SuspendedStatusReason1.mmObject();
		}

		@Override
		public void executeValidator(SuspendedStatusReason1 obj) throws Exception {
			checkSuspendedStatusReason1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ChargeType2 ChargeType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<ChargeType2> forChargeType2 = new MMConstraint<ChargeType2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> ChargeType2.mmObject();
		}

		@Override
		public void executeValidator(ChargeType2 obj) throws Exception {
			checkChargeType2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TaxExemptionReason1
	 * TaxExemptionReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<TaxExemptionReason1> forTaxExemptionReason1 = new MMConstraint<TaxExemptionReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> TaxExemptionReason1.mmObject();
		}

		@Override
		public void executeValidator(TaxExemptionReason1 obj) throws Exception {
			checkTaxExemptionReason1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountType1
	 * CashAccountType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<CashAccountType1> forCashAccountType1 = new MMConstraint<CashAccountType1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> CashAccountType1.mmObject();
		}

		@Override
		public void executeValidator(CashAccountType1 obj) throws Exception {
			checkCashAccountType1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason1
	 * ConditionallyAcceptedStatusReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<ConditionallyAcceptedStatusReason1> forConditionallyAcceptedStatusReason1 = new MMConstraint<ConditionallyAcceptedStatusReason1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> ConditionallyAcceptedStatusReason1.mmObject();
		}

		@Override
		public void executeValidator(ConditionallyAcceptedStatusReason1 obj) throws Exception {
			checkConditionallyAcceptedStatusReason1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TaxType2 TaxType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<TaxType2> forTaxType2 = new MMConstraint<TaxType2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> TaxType2.mmObject();
		}

		@Override
		public void executeValidator(TaxType2 obj) throws Exception {
			checkTaxType2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CommissionType1
	 * CommissionType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<CommissionType1> forCommissionType1 = new MMConstraint<CommissionType1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> CommissionType1.mmObject();
		}

		@Override
		public void executeValidator(CommissionType1 obj) throws Exception {
			checkCommissionType1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderType1 FundOrderType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<FundOrderType1> forFundOrderType1 = new MMConstraint<FundOrderType1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> FundOrderType1.mmObject();
		}

		@Override
		public void executeValidator(FundOrderType1 obj) throws Exception {
			checkFundOrderType1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CancellationRight1
	 * CancellationRight1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<CancellationRight1> forCancellationRight1 = new MMConstraint<CancellationRight1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> CancellationRight1.mmObject();
		}

		@Override
		public void executeValidator(CancellationRight1 obj) throws Exception {
			checkCancellationRight1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatusReason4
	 * RejectedStatusReason4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<RejectedStatusReason4> forRejectedStatusReason4 = new MMConstraint<RejectedStatusReason4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> RejectedStatusReason4.mmObject();
		}

		@Override
		public void executeValidator(RejectedStatusReason4 obj) throws Exception {
			checkRejectedStatusReason4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceType2 PriceType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceType2> forPriceType2 = new MMConstraint<PriceType2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> PriceType2.mmObject();
		}

		@Override
		public void executeValidator(PriceType2 obj) throws Exception {
			checkPriceType2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TaxType1 TaxType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<TaxType1> forTaxType1 = new MMConstraint<TaxType1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> TaxType1.mmObject();
		}

		@Override
		public void executeValidator(TaxType1 obj) throws Exception {
			checkTaxType1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TaxableIncomePerShareCalculated1
	 * TaxableIncomePerShareCalculated1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<TaxableIncomePerShareCalculated1> forTaxableIncomePerShareCalculated1 = new MMConstraint<TaxableIncomePerShareCalculated1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> TaxableIncomePerShareCalculated1.mmObject();
		}

		@Override
		public void executeValidator(TaxableIncomePerShareCalculated1 obj) throws Exception {
			checkTaxableIncomePerShareCalculated1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationType1
	 * IdentificationType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<IdentificationType1> forIdentificationType1 = new MMConstraint<IdentificationType1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> IdentificationType1.mmObject();
		}

		@Override
		public void executeValidator(IdentificationType1 obj) throws Exception {
			checkIdentificationType1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CalculationBasis1
	 * CalculationBasis1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<CalculationBasis1> forCalculationBasis1 = new MMConstraint<CalculationBasis1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> CalculationBasis1.mmObject();
		}

		@Override
		public void executeValidator(CalculationBasis1 obj) throws Exception {
			checkCalculationBasis1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.WaivingType1 WaivingType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<WaivingType1> forWaivingType1 = new MMConstraint<WaivingType1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> WaivingType1.mmObject();
		}

		@Override
		public void executeValidator(WaivingType1 obj) throws Exception {
			checkWaivingType1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionOutType1
	 * InvestmentFundTransactionOutType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentFundTransactionOutType1> forInvestmentFundTransactionOutType1 = new MMConstraint<InvestmentFundTransactionOutType1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> InvestmentFundTransactionOutType1.mmObject();
		}

		@Override
		public void executeValidator(InvestmentFundTransactionOutType1 obj) throws Exception {
			checkInvestmentFundTransactionOutType1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EUCapitalGain1 EUCapitalGain1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<EUCapitalGain1> forEUCapitalGain1 = new MMConstraint<EUCapitalGain1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> EUCapitalGain1.mmObject();
		}

		@Override
		public void executeValidator(EUCapitalGain1 obj) throws Exception {
			checkEUCapitalGain1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalOrderQuantityType1
	 * OriginalOrderQuantityType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalOrderQuantityType1> forOriginalOrderQuantityType1 = new MMConstraint<OriginalOrderQuantityType1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> OriginalOrderQuantityType1.mmObject();
		}

		@Override
		public void executeValidator(OriginalOrderQuantityType1 obj) throws Exception {
			checkOriginalOrderQuantityType1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TaxType3 TaxType3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Structured is OTHR, then AdditionalInformation is mandatory."</li>
	 * </ul>
	 */
	public static final MMConstraint<TaxType3> forTaxType3 = new MMConstraint<TaxType3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCodeRule";
			definition = "If Structured is OTHR, then AdditionalInformation is mandatory.";
			owner_lazy = () -> TaxType3.mmObject();
		}

		@Override
		public void executeValidator(TaxType3 obj) throws Exception {
			checkTaxType3(obj);
		}
	};

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkRejectedStatusReason6(RejectedStatusReason6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkChargeType1(ChargeType1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkTaxationBasis1(TaxationBasis1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkInvestmentFundTransactionInType1(InvestmentFundTransactionInType1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkPriceType1(PriceType1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkSuspendedStatusReason1(SuspendedStatusReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkChargeType2(ChargeType2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkTaxExemptionReason1(TaxExemptionReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkCashAccountType1(CashAccountType1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkConditionallyAcceptedStatusReason1(ConditionallyAcceptedStatusReason1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkTaxType2(TaxType2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkCommissionType1(CommissionType1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkFundOrderType1(FundOrderType1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkCancellationRight1(CancellationRight1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkRejectedStatusReason4(RejectedStatusReason4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkPriceType2(PriceType2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkTaxType1(TaxType1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkTaxableIncomePerShareCalculated1(TaxableIncomePerShareCalculated1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkIdentificationType1(IdentificationType1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkCalculationBasis1(CalculationBasis1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkWaivingType1(WaivingType1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkInvestmentFundTransactionOutType1(InvestmentFundTransactionOutType1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkEUCapitalGain1(EUCapitalGain1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkOriginalOrderQuantityType1(OriginalOrderQuantityType1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Structured is OTHR, then AdditionalInformation is mandatory.
	 */
	public static void checkTaxType3(TaxType3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}