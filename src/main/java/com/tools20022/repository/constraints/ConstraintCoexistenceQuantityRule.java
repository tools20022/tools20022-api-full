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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
 * than 15, including the decimal point.
 */
public class ConstraintCoexistenceQuantityRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails10
	 * TransactionDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails10> forTransactionDetails10 = new MMConstraint<TransactionDetails10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails10.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails10 obj) throws Exception {
			checkTransactionDetails10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails29
	 * TransactionDetails29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails29> forTransactionDetails29 = new MMConstraint<TransactionDetails29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails29.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails29 obj) throws Exception {
			checkTransactionDetails29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PairedOrTurnedQuantity1Choice
	 * PairedOrTurnedQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PairedOrTurnedQuantity1Choice> forPairedOrTurnedQuantity1Choice = new MMConstraint<PairedOrTurnedQuantity1Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PairedOrTurnedQuantity1Choice.mmObject();
		}

		@Override
		public void executeValidator(PairedOrTurnedQuantity1Choice obj) throws Exception {
			checkPairedOrTurnedQuantity1Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages1 Linkages1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages1> forLinkages1 = new MMConstraint<Linkages1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Linkages1.mmObject();
		}

		@Override
		public void executeValidator(Linkages1 obj) throws Exception {
			checkLinkages1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8
	 * FinancialInstrumentAttributes8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes8> forFinancialInstrumentAttributes8 = new MMConstraint<FinancialInstrumentAttributes8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes8.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes8 obj) throws Exception {
			checkFinancialInstrumentAttributes8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20
	 * FinancialInstrumentAttributes20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes20> forFinancialInstrumentAttributes20 = new MMConstraint<FinancialInstrumentAttributes20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes20.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes20 obj) throws Exception {
			checkFinancialInstrumentAttributes20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35
	 * FinancialInstrumentAttributes35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes35> forFinancialInstrumentAttributes35 = new MMConstraint<FinancialInstrumentAttributes35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes35.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes35 obj) throws Exception {
			checkFinancialInstrumentAttributes35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown3
	 * QuantityBreakdown3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown3> forQuantityBreakdown3 = new MMConstraint<QuantityBreakdown3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown3.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown3 obj) throws Exception {
			checkQuantityBreakdown3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown13
	 * QuantityBreakdown13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown13> forQuantityBreakdown13 = new MMConstraint<QuantityBreakdown13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown13.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown13 obj) throws Exception {
			checkQuantityBreakdown13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount29
	 * QuantityAndAccount29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount29> forQuantityAndAccount29 = new MMConstraint<QuantityAndAccount29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount29.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount29 obj) throws Exception {
			checkQuantityAndAccount29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount30
	 * QuantityAndAccount30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount30> forQuantityAndAccount30 = new MMConstraint<QuantityAndAccount30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount30.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount30 obj) throws Exception {
			checkQuantityAndAccount30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails28
	 * TransactionDetails28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails28> forTransactionDetails28 = new MMConstraint<TransactionDetails28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails28.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails28 obj) throws Exception {
			checkTransactionDetails28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails31
	 * TransactionDetails31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails31> forTransactionDetails31 = new MMConstraint<TransactionDetails31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails31.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails31 obj) throws Exception {
			checkTransactionDetails31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails44
	 * TransactionDetails44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails44> forTransactionDetails44 = new MMConstraint<TransactionDetails44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails44.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails44 obj) throws Exception {
			checkTransactionDetails44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PairedOrTurnedQuantity2Choice
	 * PairedOrTurnedQuantity2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PairedOrTurnedQuantity2Choice> forPairedOrTurnedQuantity2Choice = new MMConstraint<PairedOrTurnedQuantity2Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> PairedOrTurnedQuantity2Choice.mmObject();
		}

		@Override
		public void executeValidator(PairedOrTurnedQuantity2Choice obj) throws Exception {
			checkPairedOrTurnedQuantity2Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages4 Linkages4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages4> forLinkages4 = new MMConstraint<Linkages4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> Linkages4.mmObject();
		}

		@Override
		public void executeValidator(Linkages4 obj) throws Exception {
			checkLinkages4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41
	 * FinancialInstrumentAttributes41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes41> forFinancialInstrumentAttributes41 = new MMConstraint<FinancialInstrumentAttributes41>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes41.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes41 obj) throws Exception {
			checkFinancialInstrumentAttributes41(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown18
	 * QuantityBreakdown18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown18> forQuantityBreakdown18 = new MMConstraint<QuantityBreakdown18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown18.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown18 obj) throws Exception {
			checkQuantityBreakdown18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount32
	 * QuantityAndAccount32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount32> forQuantityAndAccount32 = new MMConstraint<QuantityAndAccount32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount32.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount32 obj) throws Exception {
			checkQuantityAndAccount32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount33
	 * QuantityAndAccount33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount33> forQuantityAndAccount33 = new MMConstraint<QuantityAndAccount33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount33.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount33 obj) throws Exception {
			checkQuantityAndAccount33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6
	 * FinancialInstrumentAttributes6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes6> forFinancialInstrumentAttributes6 = new MMConstraint<FinancialInstrumentAttributes6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes6.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes6 obj) throws Exception {
			checkFinancialInstrumentAttributes6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat2
	 * SignedQuantityFormat2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SignedQuantityFormat2> forSignedQuantityFormat2 = new MMConstraint<SignedQuantityFormat2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SignedQuantityFormat2.mmObject();
		}

		@Override
		public void executeValidator(SignedQuantityFormat2 obj) throws Exception {
			checkSignedQuantityFormat2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Quantity4Choice
	 * Quantity4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Quantity4Choice> forQuantity4Choice = new MMConstraint<Quantity4Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Quantity4Choice.mmObject();
		}

		@Override
		public void executeValidator(Quantity4Choice obj) throws Exception {
			checkQuantity4Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity3
	 * ProprietaryQuantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryQuantity3> forProprietaryQuantity3 = new MMConstraint<ProprietaryQuantity3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> ProprietaryQuantity3.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryQuantity3 obj) throws Exception {
			checkProprietaryQuantity3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Quantity3Choice
	 * Quantity3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Quantity3Choice> forQuantity3Choice = new MMConstraint<Quantity3Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Quantity3Choice.mmObject();
		}

		@Override
		public void executeValidator(Quantity3Choice obj) throws Exception {
			checkQuantity3Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity2
	 * ProprietaryQuantity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryQuantity2> forProprietaryQuantity2 = new MMConstraint<ProprietaryQuantity2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> ProprietaryQuantity2.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryQuantity2 obj) throws Exception {
			checkProprietaryQuantity2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Quantity2Choice
	 * Quantity2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Quantity2Choice> forQuantity2Choice = new MMConstraint<Quantity2Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Quantity2Choice.mmObject();
		}

		@Override
		public void executeValidator(Quantity2Choice obj) throws Exception {
			checkQuantity2Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat1
	 * SignedQuantityFormat1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SignedQuantityFormat1> forSignedQuantityFormat1 = new MMConstraint<SignedQuantityFormat1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SignedQuantityFormat1.mmObject();
		}

		@Override
		public void executeValidator(SignedQuantityFormat1 obj) throws Exception {
			checkSignedQuantityFormat1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Quantity5Choice
	 * Quantity5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Quantity5Choice> forQuantity5Choice = new MMConstraint<Quantity5Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Quantity5Choice.mmObject();
		}

		@Override
		public void executeValidator(Quantity5Choice obj) throws Exception {
			checkQuantity5Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive1Choice
	 * InstructedOrQuantityToReceive1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InstructedOrQuantityToReceive1Choice> forInstructedOrQuantityToReceive1Choice = new MMConstraint<InstructedOrQuantityToReceive1Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> InstructedOrQuantityToReceive1Choice.mmObject();
		}

		@Override
		public void executeValidator(InstructedOrQuantityToReceive1Choice obj) throws Exception {
			checkInstructedOrQuantityToReceive1Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption2
	 * SecuritiesOption2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption2> forSecuritiesOption2 = new MMConstraint<SecuritiesOption2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption2.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption2 obj) throws Exception {
			checkSecuritiesOption2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3
	 * AmountPricePerFinancialInstrumentQuantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountPricePerFinancialInstrumentQuantity3> forAmountPricePerFinancialInstrumentQuantity3 = new MMConstraint<AmountPricePerFinancialInstrumentQuantity3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AmountPricePerFinancialInstrumentQuantity3.mmObject();
		}

		@Override
		public void executeValidator(AmountPricePerFinancialInstrumentQuantity3 obj) throws Exception {
			checkAmountPricePerFinancialInstrumentQuantity3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat9Choice
	 * PriceFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat9Choice> forPriceFormat9Choice = new MMConstraint<PriceFormat9Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat9Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormat9Choice obj) throws Exception {
			checkPriceFormat9Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5
	 * CorporateActionOption5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption5> forCorporateActionOption5 = new MMConstraint<CorporateActionOption5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption5.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption5 obj) throws Exception {
			checkCorporateActionOption5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9
	 * FinancialInstrumentAttributes9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes9> forFinancialInstrumentAttributes9 = new MMConstraint<FinancialInstrumentAttributes9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> FinancialInstrumentAttributes9.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes9 obj) throws Exception {
			checkFinancialInstrumentAttributes9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SignedQuantityFormat4> forSignedQuantityFormat4 = new MMConstraint<SignedQuantityFormat4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SignedQuantityFormat4.mmObject();
		}

		@Override
		public void executeValidator(SignedQuantityFormat4 obj) throws Exception {
			checkSignedQuantityFormat4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Quantity9Choice
	 * Quantity9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Quantity9Choice> forQuantity9Choice = new MMConstraint<Quantity9Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> Quantity9Choice.mmObject();
		}

		@Override
		public void executeValidator(Quantity9Choice obj) throws Exception {
			checkQuantity9Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity5
	 * ProprietaryQuantity5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryQuantity5> forProprietaryQuantity5 = new MMConstraint<ProprietaryQuantity5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> ProprietaryQuantity5.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryQuantity5 obj) throws Exception {
			checkProprietaryQuantity5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Quantity8Choice
	 * Quantity8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Quantity8Choice> forQuantity8Choice = new MMConstraint<Quantity8Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> Quantity8Choice.mmObject();
		}

		@Override
		public void executeValidator(Quantity8Choice obj) throws Exception {
			checkQuantity8Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity4
	 * ProprietaryQuantity4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryQuantity4> forProprietaryQuantity4 = new MMConstraint<ProprietaryQuantity4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> ProprietaryQuantity4.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryQuantity4 obj) throws Exception {
			checkProprietaryQuantity4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Quantity7Choice
	 * Quantity7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Quantity7Choice> forQuantity7Choice = new MMConstraint<Quantity7Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> Quantity7Choice.mmObject();
		}

		@Override
		public void executeValidator(Quantity7Choice obj) throws Exception {
			checkQuantity7Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat3
	 * SignedQuantityFormat3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SignedQuantityFormat3> forSignedQuantityFormat3 = new MMConstraint<SignedQuantityFormat3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SignedQuantityFormat3.mmObject();
		}

		@Override
		public void executeValidator(SignedQuantityFormat3 obj) throws Exception {
			checkSignedQuantityFormat3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Quantity11Choice
	 * Quantity11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Quantity11Choice> forQuantity11Choice = new MMConstraint<Quantity11Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> Quantity11Choice.mmObject();
		}

		@Override
		public void executeValidator(Quantity11Choice obj) throws Exception {
			checkQuantity11Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice
	 * InstructedOrQuantityToReceive2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InstructedOrQuantityToReceive2Choice> forInstructedOrQuantityToReceive2Choice = new MMConstraint<InstructedOrQuantityToReceive2Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> InstructedOrQuantityToReceive2Choice.mmObject();
		}

		@Override
		public void executeValidator(InstructedOrQuantityToReceive2Choice obj) throws Exception {
			checkInstructedOrQuantityToReceive2Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption7
	 * SecuritiesOption7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption7> forSecuritiesOption7 = new MMConstraint<SecuritiesOption7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SecuritiesOption7.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption7 obj) throws Exception {
			checkSecuritiesOption7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity4
	 * AmountPricePerFinancialInstrumentQuantity4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountPricePerFinancialInstrumentQuantity4> forAmountPricePerFinancialInstrumentQuantity4 = new MMConstraint<AmountPricePerFinancialInstrumentQuantity4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> AmountPricePerFinancialInstrumentQuantity4.mmObject();
		}

		@Override
		public void executeValidator(AmountPricePerFinancialInstrumentQuantity4 obj) throws Exception {
			checkAmountPricePerFinancialInstrumentQuantity4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat18Choice
	 * PriceFormat18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat18Choice> forPriceFormat18Choice = new MMConstraint<PriceFormat18Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> PriceFormat18Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormat18Choice obj) throws Exception {
			checkPriceFormat18Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13
	 * CorporateActionOption13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption13> forCorporateActionOption13 = new MMConstraint<CorporateActionOption13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> CorporateActionOption13.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption13 obj) throws Exception {
			checkCorporateActionOption13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18
	 * FinancialInstrumentAttributes18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes18> forFinancialInstrumentAttributes18 = new MMConstraint<FinancialInstrumentAttributes18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes18.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes18 obj) throws Exception {
			checkFinancialInstrumentAttributes18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat21Choice
	 * PriceFormat21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forPriceFormat33Choice
	 * ConstraintCoexistenceQuantityRule.forPriceFormat33Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat21Choice> forPriceFormat21Choice = new MMConstraint<PriceFormat21Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forPriceFormat33Choice);
			owner_lazy = () -> PriceFormat21Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormat21Choice obj) throws Exception {
			checkPriceFormat21Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25
	 * CorporateActionOption25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption25> forCorporateActionOption25 = new MMConstraint<CorporateActionOption25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption25.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption25 obj) throws Exception {
			checkCorporateActionOption25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22
	 * FinancialInstrumentAttributes22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes22> forFinancialInstrumentAttributes22 = new MMConstraint<FinancialInstrumentAttributes22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes22.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes22 obj) throws Exception {
			checkFinancialInstrumentAttributes22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat24Choice
	 * PriceFormat24Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat24Choice> forPriceFormat24Choice = new MMConstraint<PriceFormat24Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat24Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormat24Choice obj) throws Exception {
			checkPriceFormat24Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30
	 * CorporateActionOption30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption30> forCorporateActionOption30 = new MMConstraint<CorporateActionOption30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption30.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption30 obj) throws Exception {
			checkCorporateActionOption30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32
	 * FinancialInstrumentAttributes32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forFinancialInstrumentAttributes50
	 * ConstraintCoexistenceQuantityRule.forFinancialInstrumentAttributes50}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes32> forFinancialInstrumentAttributes32 = new MMConstraint<FinancialInstrumentAttributes32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forFinancialInstrumentAttributes50);
			owner_lazy = () -> FinancialInstrumentAttributes32.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes32 obj) throws Exception {
			checkFinancialInstrumentAttributes32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38
	 * CorporateActionOption38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption38> forCorporateActionOption38 = new MMConstraint<CorporateActionOption38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption38.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption38 obj) throws Exception {
			checkCorporateActionOption38(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38
	 * FinancialInstrumentAttributes38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes38> forFinancialInstrumentAttributes38 = new MMConstraint<FinancialInstrumentAttributes38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes38.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes38 obj) throws Exception {
			checkFinancialInstrumentAttributes38(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47
	 * CorporateActionOption47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption47> forCorporateActionOption47 = new MMConstraint<CorporateActionOption47>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption47.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption47 obj) throws Exception {
			checkCorporateActionOption47(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57
	 * CorporateActionOption57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forCorporateActionOption103
	 * ConstraintCoexistenceQuantityRule.forCorporateActionOption103}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption57> forCorporateActionOption57 = new MMConstraint<CorporateActionOption57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forCorporateActionOption103);
			owner_lazy = () -> CorporateActionOption57.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption57 obj) throws Exception {
			checkCorporateActionOption57(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58
	 * CorporateActionOption58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption58> forCorporateActionOption58 = new MMConstraint<CorporateActionOption58>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption58.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption58 obj) throws Exception {
			checkCorporateActionOption58(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.StatusOrQuantityToReceive1Choice
	 * StatusOrQuantityToReceive1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StatusOrQuantityToReceive1Choice> forStatusOrQuantityToReceive1Choice = new MMConstraint<StatusOrQuantityToReceive1Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> StatusOrQuantityToReceive1Choice.mmObject();
		}

		@Override
		public void executeValidator(StatusOrQuantityToReceive1Choice obj) throws Exception {
			checkStatusOrQuantityToReceive1Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.StatusOrQuantityToReceive2Choice
	 * StatusOrQuantityToReceive2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StatusOrQuantityToReceive2Choice> forStatusOrQuantityToReceive2Choice = new MMConstraint<StatusOrQuantityToReceive2Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> StatusOrQuantityToReceive2Choice.mmObject();
		}

		@Override
		public void executeValidator(StatusOrQuantityToReceive2Choice obj) throws Exception {
			checkStatusOrQuantityToReceive2Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat7Choice
	 * PriceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forPriceFormat34Choice
	 * ConstraintCoexistenceQuantityRule.forPriceFormat34Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat7Choice> forPriceFormat7Choice = new MMConstraint<PriceFormat7Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forPriceFormat34Choice);
			owner_lazy = () -> PriceFormat7Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormat7Choice obj) throws Exception {
			checkPriceFormat7Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat3Choice
	 * RatioFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat3Choice> forRatioFormat3Choice = new MMConstraint<RatioFormat3Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat3Choice.mmObject();
		}

		@Override
		public void executeValidator(RatioFormat3Choice obj) throws Exception {
			checkRatioFormat3Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio2
	 * AmountAndQuantityRatio2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndQuantityRatio2> forAmountAndQuantityRatio2 = new MMConstraint<AmountAndQuantityRatio2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AmountAndQuantityRatio2.mmObject();
		}

		@Override
		public void executeValidator(AmountAndQuantityRatio2 obj) throws Exception {
			checkAmountAndQuantityRatio2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat4Choice
	 * RatioFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat4Choice> forRatioFormat4Choice = new MMConstraint<RatioFormat4Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat4Choice.mmObject();
		}

		@Override
		public void executeValidator(RatioFormat4Choice obj) throws Exception {
			checkRatioFormat4Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3
	 * SecuritiesOption3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption3> forSecuritiesOption3 = new MMConstraint<SecuritiesOption3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption3.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption3 obj) throws Exception {
			checkSecuritiesOption3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat13Choice
	 * PriceFormat13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat13Choice> forPriceFormat13Choice = new MMConstraint<PriceFormat13Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> PriceFormat13Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormat13Choice obj) throws Exception {
			checkPriceFormat13Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat7Choice
	 * RatioFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat7Choice> forRatioFormat7Choice = new MMConstraint<RatioFormat7Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RatioFormat7Choice.mmObject();
		}

		@Override
		public void executeValidator(RatioFormat7Choice obj) throws Exception {
			checkRatioFormat7Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio3
	 * AmountAndQuantityRatio3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountAndQuantityRatio3> forAmountAndQuantityRatio3 = new MMConstraint<AmountAndQuantityRatio3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> AmountAndQuantityRatio3.mmObject();
		}

		@Override
		public void executeValidator(AmountAndQuantityRatio3 obj) throws Exception {
			checkAmountAndQuantityRatio3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat8Choice
	 * RatioFormat8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat8Choice> forRatioFormat8Choice = new MMConstraint<RatioFormat8Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RatioFormat8Choice.mmObject();
		}

		@Override
		public void executeValidator(RatioFormat8Choice obj) throws Exception {
			checkRatioFormat8Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8
	 * SecuritiesOption8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption8> forSecuritiesOption8 = new MMConstraint<SecuritiesOption8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SecuritiesOption8.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption8 obj) throws Exception {
			checkSecuritiesOption8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18
	 * SecuritiesOption18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption18> forSecuritiesOption18 = new MMConstraint<SecuritiesOption18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption18.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption18 obj) throws Exception {
			checkSecuritiesOption18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20
	 * SecuritiesOption20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption20> forSecuritiesOption20 = new MMConstraint<SecuritiesOption20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption20.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption20 obj) throws Exception {
			checkSecuritiesOption20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat15Choice
	 * RatioFormat15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat15Choice> forRatioFormat15Choice = new MMConstraint<RatioFormat15Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat15Choice.mmObject();
		}

		@Override
		public void executeValidator(RatioFormat15Choice obj) throws Exception {
			checkRatioFormat15Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26
	 * SecuritiesOption26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption26> forSecuritiesOption26 = new MMConstraint<SecuritiesOption26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption26.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption26 obj) throws Exception {
			checkSecuritiesOption26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat16Choice
	 * RatioFormat16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat16Choice> forRatioFormat16Choice = new MMConstraint<RatioFormat16Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat16Choice.mmObject();
		}

		@Override
		public void executeValidator(RatioFormat16Choice obj) throws Exception {
			checkRatioFormat16Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31
	 * SecuritiesOption31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption31> forSecuritiesOption31 = new MMConstraint<SecuritiesOption31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption31.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption31 obj) throws Exception {
			checkSecuritiesOption31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35
	 * SecuritiesOption35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forSecuritiesOption42
	 * ConstraintCoexistenceQuantityRule.forSecuritiesOption42}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption35> forSecuritiesOption35 = new MMConstraint<SecuritiesOption35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forSecuritiesOption42);
			owner_lazy = () -> SecuritiesOption35.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption35 obj) throws Exception {
			checkSecuritiesOption35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36
	 * SecuritiesOption36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption36> forSecuritiesOption36 = new MMConstraint<SecuritiesOption36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption36.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption36 obj) throws Exception {
			checkSecuritiesOption36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7
	 * FinancialInstrumentAttributes7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes7> forFinancialInstrumentAttributes7 = new MMConstraint<FinancialInstrumentAttributes7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes7.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes7 obj) throws Exception {
			checkFinancialInstrumentAttributes7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat1Choice
	 * SolicitationFeeRateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SolicitationFeeRateFormat1Choice> forSolicitationFeeRateFormat1Choice = new MMConstraint<SolicitationFeeRateFormat1Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SolicitationFeeRateFormat1Choice.mmObject();
		}

		@Override
		public void executeValidator(SolicitationFeeRateFormat1Choice obj) throws Exception {
			checkSolicitationFeeRateFormat1Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption1
	 * SecuritiesOption1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption1> forSecuritiesOption1 = new MMConstraint<SecuritiesOption1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption1.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption1 obj) throws Exception {
			checkSecuritiesOption1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5
	 * FinancialInstrumentAttributes5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes5> forFinancialInstrumentAttributes5 = new MMConstraint<FinancialInstrumentAttributes5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes5.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes5 obj) throws Exception {
			checkFinancialInstrumentAttributes5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat5Choice
	 * RatioFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat5Choice> forRatioFormat5Choice = new MMConstraint<RatioFormat5Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat5Choice.mmObject();
		}

		@Override
		public void executeValidator(RatioFormat5Choice obj) throws Exception {
			checkRatioFormat5Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat6Choice
	 * RatioFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat6Choice> forRatioFormat6Choice = new MMConstraint<RatioFormat6Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat6Choice.mmObject();
		}

		@Override
		public void executeValidator(RatioFormat6Choice obj) throws Exception {
			checkRatioFormat6Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4
	 * SecuritiesOption4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption4> forSecuritiesOption4 = new MMConstraint<SecuritiesOption4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption4.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption4 obj) throws Exception {
			checkSecuritiesOption4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat10Choice
	 * PriceFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat10Choice> forPriceFormat10Choice = new MMConstraint<PriceFormat10Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat10Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormat10Choice obj) throws Exception {
			checkPriceFormat10Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10
	 * CorporateActionOption10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption10> forCorporateActionOption10 = new MMConstraint<CorporateActionOption10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption10.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption10 obj) throws Exception {
			checkCorporateActionOption10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11
	 * FinancialInstrumentAttributes11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes11> forFinancialInstrumentAttributes11 = new MMConstraint<FinancialInstrumentAttributes11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> FinancialInstrumentAttributes11.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes11 obj) throws Exception {
			checkFinancialInstrumentAttributes11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat2Choice
	 * SolicitationFeeRateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SolicitationFeeRateFormat2Choice> forSolicitationFeeRateFormat2Choice = new MMConstraint<SolicitationFeeRateFormat2Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SolicitationFeeRateFormat2Choice.mmObject();
		}

		@Override
		public void executeValidator(SolicitationFeeRateFormat2Choice obj) throws Exception {
			checkSolicitationFeeRateFormat2Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption9
	 * SecuritiesOption9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption9> forSecuritiesOption9 = new MMConstraint<SecuritiesOption9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SecuritiesOption9.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption9 obj) throws Exception {
			checkSecuritiesOption9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10
	 * FinancialInstrumentAttributes10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes10> forFinancialInstrumentAttributes10 = new MMConstraint<FinancialInstrumentAttributes10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> FinancialInstrumentAttributes10.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes10 obj) throws Exception {
			checkFinancialInstrumentAttributes10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat9Choice
	 * RatioFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat9Choice> forRatioFormat9Choice = new MMConstraint<RatioFormat9Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RatioFormat9Choice.mmObject();
		}

		@Override
		public void executeValidator(RatioFormat9Choice obj) throws Exception {
			checkRatioFormat9Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat10Choice
	 * RatioFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat10Choice> forRatioFormat10Choice = new MMConstraint<RatioFormat10Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> RatioFormat10Choice.mmObject();
		}

		@Override
		public void executeValidator(RatioFormat10Choice obj) throws Exception {
			checkRatioFormat10Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10
	 * SecuritiesOption10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption10> forSecuritiesOption10 = new MMConstraint<SecuritiesOption10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SecuritiesOption10.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption10 obj) throws Exception {
			checkSecuritiesOption10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat14Choice
	 * PriceFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat14Choice> forPriceFormat14Choice = new MMConstraint<PriceFormat14Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> PriceFormat14Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormat14Choice obj) throws Exception {
			checkPriceFormat14Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15
	 * CorporateActionOption15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption15> forCorporateActionOption15 = new MMConstraint<CorporateActionOption15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> CorporateActionOption15.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption15 obj) throws Exception {
			checkCorporateActionOption15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19
	 * FinancialInstrumentAttributes19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes19> forFinancialInstrumentAttributes19 = new MMConstraint<FinancialInstrumentAttributes19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes19.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes19 obj) throws Exception {
			checkFinancialInstrumentAttributes19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice
	 * PriceFormat20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forPriceFormat32Choice
	 * ConstraintCoexistenceQuantityRule.forPriceFormat32Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat20Choice> forPriceFormat20Choice = new MMConstraint<PriceFormat20Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forPriceFormat32Choice);
			owner_lazy = () -> PriceFormat20Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormat20Choice obj) throws Exception {
			checkPriceFormat20Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption15
	 * SecuritiesOption15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption15> forSecuritiesOption15 = new MMConstraint<SecuritiesOption15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption15.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption15 obj) throws Exception {
			checkSecuritiesOption15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16
	 * FinancialInstrumentAttributes16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes16> forFinancialInstrumentAttributes16 = new MMConstraint<FinancialInstrumentAttributes16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes16.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes16 obj) throws Exception {
			checkFinancialInstrumentAttributes16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat11Choice
	 * RatioFormat11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat11Choice> forRatioFormat11Choice = new MMConstraint<RatioFormat11Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat11Choice.mmObject();
		}

		@Override
		public void executeValidator(RatioFormat11Choice obj) throws Exception {
			checkRatioFormat11Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat12Choice
	 * RatioFormat12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat12Choice> forRatioFormat12Choice = new MMConstraint<RatioFormat12Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat12Choice.mmObject();
		}

		@Override
		public void executeValidator(RatioFormat12Choice obj) throws Exception {
			checkRatioFormat12Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13
	 * SecuritiesOption13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption13> forSecuritiesOption13 = new MMConstraint<SecuritiesOption13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption13.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption13 obj) throws Exception {
			checkSecuritiesOption13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat3Choice
	 * SolicitationFeeRateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SolicitationFeeRateFormat3Choice> forSolicitationFeeRateFormat3Choice = new MMConstraint<SolicitationFeeRateFormat3Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SolicitationFeeRateFormat3Choice.mmObject();
		}

		@Override
		public void executeValidator(SolicitationFeeRateFormat3Choice obj) throws Exception {
			checkSolicitationFeeRateFormat3Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat22Choice
	 * PriceFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat22Choice> forPriceFormat22Choice = new MMConstraint<PriceFormat22Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat22Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormat22Choice obj) throws Exception {
			checkPriceFormat22Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20
	 * CorporateActionOption20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption20> forCorporateActionOption20 = new MMConstraint<CorporateActionOption20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption20.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption20 obj) throws Exception {
			checkCorporateActionOption20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23
	 * FinancialInstrumentAttributes23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes23> forFinancialInstrumentAttributes23 = new MMConstraint<FinancialInstrumentAttributes23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes23.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes23 obj) throws Exception {
			checkFinancialInstrumentAttributes23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat26Choice
	 * PriceFormat26Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat26Choice> forPriceFormat26Choice = new MMConstraint<PriceFormat26Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat26Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormat26Choice obj) throws Exception {
			checkPriceFormat26Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption16
	 * SecuritiesOption16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption16> forSecuritiesOption16 = new MMConstraint<SecuritiesOption16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption16.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption16 obj) throws Exception {
			checkSecuritiesOption16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24
	 * FinancialInstrumentAttributes24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes24> forFinancialInstrumentAttributes24 = new MMConstraint<FinancialInstrumentAttributes24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes24.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes24 obj) throws Exception {
			checkFinancialInstrumentAttributes24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat13Choice
	 * RatioFormat13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat13Choice> forRatioFormat13Choice = new MMConstraint<RatioFormat13Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat13Choice.mmObject();
		}

		@Override
		public void executeValidator(RatioFormat13Choice obj) throws Exception {
			checkRatioFormat13Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat14Choice
	 * RatioFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RatioFormat14Choice> forRatioFormat14Choice = new MMConstraint<RatioFormat14Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> RatioFormat14Choice.mmObject();
		}

		@Override
		public void executeValidator(RatioFormat14Choice obj) throws Exception {
			checkRatioFormat14Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17
	 * SecuritiesOption17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption17> forSecuritiesOption17 = new MMConstraint<SecuritiesOption17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption17.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption17 obj) throws Exception {
			checkSecuritiesOption17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat4Choice
	 * SolicitationFeeRateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SolicitationFeeRateFormat4Choice> forSolicitationFeeRateFormat4Choice = new MMConstraint<SolicitationFeeRateFormat4Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SolicitationFeeRateFormat4Choice.mmObject();
		}

		@Override
		public void executeValidator(SolicitationFeeRateFormat4Choice obj) throws Exception {
			checkSolicitationFeeRateFormat4Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice
	 * PriceFormat28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat28Choice> forPriceFormat28Choice = new MMConstraint<PriceFormat28Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat28Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormat28Choice obj) throws Exception {
			checkPriceFormat28Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32
	 * CorporateActionOption32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption32> forCorporateActionOption32 = new MMConstraint<CorporateActionOption32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption32.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption32 obj) throws Exception {
			checkCorporateActionOption32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33
	 * FinancialInstrumentAttributes33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes33> forFinancialInstrumentAttributes33 = new MMConstraint<FinancialInstrumentAttributes33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes33.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes33 obj) throws Exception {
			checkFinancialInstrumentAttributes33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23
	 * SecuritiesOption23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption23> forSecuritiesOption23 = new MMConstraint<SecuritiesOption23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption23.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption23 obj) throws Exception {
			checkSecuritiesOption23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34
	 * FinancialInstrumentAttributes34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forFinancialInstrumentAttributes49
	 * ConstraintCoexistenceQuantityRule.forFinancialInstrumentAttributes49}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes34> forFinancialInstrumentAttributes34 = new MMConstraint<FinancialInstrumentAttributes34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forFinancialInstrumentAttributes49);
			owner_lazy = () -> FinancialInstrumentAttributes34.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes34 obj) throws Exception {
			checkFinancialInstrumentAttributes34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24
	 * SecuritiesOption24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption24> forSecuritiesOption24 = new MMConstraint<SecuritiesOption24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption24.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption24 obj) throws Exception {
			checkSecuritiesOption24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35
	 * CorporateActionOption35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption35> forCorporateActionOption35 = new MMConstraint<CorporateActionOption35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption35.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption35 obj) throws Exception {
			checkCorporateActionOption35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39
	 * FinancialInstrumentAttributes39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes39> forFinancialInstrumentAttributes39 = new MMConstraint<FinancialInstrumentAttributes39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes39.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes39 obj) throws Exception {
			checkFinancialInstrumentAttributes39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28
	 * SecuritiesOption28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption28> forSecuritiesOption28 = new MMConstraint<SecuritiesOption28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption28.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption28 obj) throws Exception {
			checkSecuritiesOption28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40
	 * FinancialInstrumentAttributes40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes40> forFinancialInstrumentAttributes40 = new MMConstraint<FinancialInstrumentAttributes40>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes40.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes40 obj) throws Exception {
			checkFinancialInstrumentAttributes40(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29
	 * SecuritiesOption29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption29> forSecuritiesOption29 = new MMConstraint<SecuritiesOption29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption29.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption29 obj) throws Exception {
			checkSecuritiesOption29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44
	 * CorporateActionOption44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption44> forCorporateActionOption44 = new MMConstraint<CorporateActionOption44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption44.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption44 obj) throws Exception {
			checkCorporateActionOption44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43
	 * FinancialInstrumentAttributes43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forFinancialInstrumentAttributes48
	 * ConstraintCoexistenceQuantityRule.forFinancialInstrumentAttributes48}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes43> forFinancialInstrumentAttributes43 = new MMConstraint<FinancialInstrumentAttributes43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forFinancialInstrumentAttributes48);
			owner_lazy = () -> FinancialInstrumentAttributes43.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes43 obj) throws Exception {
			checkFinancialInstrumentAttributes43(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33
	 * SecuritiesOption33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption33> forSecuritiesOption33 = new MMConstraint<SecuritiesOption33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption33.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption33 obj) throws Exception {
			checkSecuritiesOption33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38
	 * SecuritiesOption38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forSecuritiesOption40
	 * ConstraintCoexistenceQuantityRule.forSecuritiesOption40}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption38> forSecuritiesOption38 = new MMConstraint<SecuritiesOption38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forSecuritiesOption40);
			owner_lazy = () -> SecuritiesOption38.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption38 obj) throws Exception {
			checkSecuritiesOption38(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat5Choice
	 * SolicitationFeeRateFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SolicitationFeeRateFormat5Choice> forSolicitationFeeRateFormat5Choice = new MMConstraint<SolicitationFeeRateFormat5Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SolicitationFeeRateFormat5Choice.mmObject();
		}

		@Override
		public void executeValidator(SolicitationFeeRateFormat5Choice obj) throws Exception {
			checkSolicitationFeeRateFormat5Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52
	 * CorporateActionOption52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forCorporateActionOption100
	 * ConstraintCoexistenceQuantityRule.forCorporateActionOption100}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption52> forCorporateActionOption52 = new MMConstraint<CorporateActionOption52>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forCorporateActionOption100);
			owner_lazy = () -> CorporateActionOption52.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption52 obj) throws Exception {
			checkCorporateActionOption52(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45
	 * FinancialInstrumentAttributes45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes45> forFinancialInstrumentAttributes45 = new MMConstraint<FinancialInstrumentAttributes45>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes45.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes45 obj) throws Exception {
			checkFinancialInstrumentAttributes45(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37
	 * SecuritiesOption37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption37> forSecuritiesOption37 = new MMConstraint<SecuritiesOption37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption37.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption37 obj) throws Exception {
			checkSecuritiesOption37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39
	 * SecuritiesOption39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption39> forSecuritiesOption39 = new MMConstraint<SecuritiesOption39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption39.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption39 obj) throws Exception {
			checkSecuritiesOption39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat6Choice
	 * SolicitationFeeRateFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SolicitationFeeRateFormat6Choice> forSolicitationFeeRateFormat6Choice = new MMConstraint<SolicitationFeeRateFormat6Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SolicitationFeeRateFormat6Choice.mmObject();
		}

		@Override
		public void executeValidator(SolicitationFeeRateFormat6Choice obj) throws Exception {
			checkSolicitationFeeRateFormat6Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55
	 * CorporateActionOption55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption55> forCorporateActionOption55 = new MMConstraint<CorporateActionOption55>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption55.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption55 obj) throws Exception {
			checkCorporateActionOption55(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption5
	 * SecuritiesOption5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption5> forSecuritiesOption5 = new MMConstraint<SecuritiesOption5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption5.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption5 obj) throws Exception {
			checkSecuritiesOption5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption11
	 * SecuritiesOption11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption11> forSecuritiesOption11 = new MMConstraint<SecuritiesOption11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SecuritiesOption11.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption11 obj) throws Exception {
			checkSecuritiesOption11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption19
	 * SecuritiesOption19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption19> forSecuritiesOption19 = new MMConstraint<SecuritiesOption19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption19.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption19 obj) throws Exception {
			checkSecuritiesOption19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption21
	 * SecuritiesOption21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption21> forSecuritiesOption21 = new MMConstraint<SecuritiesOption21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption21.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption21 obj) throws Exception {
			checkSecuritiesOption21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption27
	 * SecuritiesOption27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption27> forSecuritiesOption27 = new MMConstraint<SecuritiesOption27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption27.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption27 obj) throws Exception {
			checkSecuritiesOption27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption32
	 * SecuritiesOption32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption32> forSecuritiesOption32 = new MMConstraint<SecuritiesOption32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption32.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption32 obj) throws Exception {
			checkSecuritiesOption32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3
	 * FinancialInstrumentAttributes3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes3> forFinancialInstrumentAttributes3 = new MMConstraint<FinancialInstrumentAttributes3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes3.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes3 obj) throws Exception {
			checkFinancialInstrumentAttributes3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1
	 * CorporateActionQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionQuantity1> forCorporateActionQuantity1 = new MMConstraint<CorporateActionQuantity1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionQuantity1.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionQuantity1 obj) throws Exception {
			checkCorporateActionQuantity1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3
	 * CorporateAction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateAction3> forCorporateAction3 = new MMConstraint<CorporateAction3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateAction3.mmObject();
		}

		@Override
		public void executeValidator(CorporateAction3 obj) throws Exception {
			checkCorporateAction3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6
	 * SecuritiesOption6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption6> forSecuritiesOption6 = new MMConstraint<SecuritiesOption6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption6.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption6 obj) throws Exception {
			checkSecuritiesOption6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3
	 * CorporateActionOption3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption3> forCorporateActionOption3 = new MMConstraint<CorporateActionOption3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption3.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption3 obj) throws Exception {
			checkCorporateActionOption3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12
	 * FinancialInstrumentAttributes12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes12> forFinancialInstrumentAttributes12 = new MMConstraint<FinancialInstrumentAttributes12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> FinancialInstrumentAttributes12.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes12 obj) throws Exception {
			checkFinancialInstrumentAttributes12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2
	 * CorporateActionQuantity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionQuantity2> forCorporateActionQuantity2 = new MMConstraint<CorporateActionQuantity2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> CorporateActionQuantity2.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionQuantity2 obj) throws Exception {
			checkCorporateActionQuantity2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4
	 * CorporateAction4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateAction4> forCorporateAction4 = new MMConstraint<CorporateAction4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> CorporateAction4.mmObject();
		}

		@Override
		public void executeValidator(CorporateAction4 obj) throws Exception {
			checkCorporateAction4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12
	 * SecuritiesOption12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption12> forSecuritiesOption12 = new MMConstraint<SecuritiesOption12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SecuritiesOption12.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption12 obj) throws Exception {
			checkSecuritiesOption12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17
	 * CorporateActionOption17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption17> forCorporateActionOption17 = new MMConstraint<CorporateActionOption17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> CorporateActionOption17.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption17 obj) throws Exception {
			checkCorporateActionOption17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17
	 * FinancialInstrumentAttributes17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes17> forFinancialInstrumentAttributes17 = new MMConstraint<FinancialInstrumentAttributes17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes17.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes17 obj) throws Exception {
			checkFinancialInstrumentAttributes17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3
	 * CorporateActionQuantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionQuantity3> forCorporateActionQuantity3 = new MMConstraint<CorporateActionQuantity3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionQuantity3.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionQuantity3 obj) throws Exception {
			checkCorporateActionQuantity3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateAction5> forCorporateAction5 = new MMConstraint<CorporateAction5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateAction5.mmObject();
		}

		@Override
		public void executeValidator(CorporateAction5 obj) throws Exception {
			checkCorporateAction5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14
	 * SecuritiesOption14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption14> forSecuritiesOption14 = new MMConstraint<SecuritiesOption14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption14.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption14 obj) throws Exception {
			checkSecuritiesOption14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption19> forCorporateActionOption19 = new MMConstraint<CorporateActionOption19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption19.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption19 obj) throws Exception {
			checkCorporateActionOption19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25
	 * FinancialInstrumentAttributes25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes25> forFinancialInstrumentAttributes25 = new MMConstraint<FinancialInstrumentAttributes25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes25.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes25 obj) throws Exception {
			checkFinancialInstrumentAttributes25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4
	 * CorporateActionQuantity4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionQuantity4> forCorporateActionQuantity4 = new MMConstraint<CorporateActionQuantity4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionQuantity4.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionQuantity4 obj) throws Exception {
			checkCorporateActionQuantity4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6
	 * CorporateAction6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateAction6> forCorporateAction6 = new MMConstraint<CorporateAction6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateAction6.mmObject();
		}

		@Override
		public void executeValidator(CorporateAction6 obj) throws Exception {
			checkCorporateAction6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22
	 * SecuritiesOption22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption22> forSecuritiesOption22 = new MMConstraint<SecuritiesOption22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption22.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption22 obj) throws Exception {
			checkSecuritiesOption22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34
	 * CorporateActionOption34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption34> forCorporateActionOption34 = new MMConstraint<CorporateActionOption34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption34.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption34 obj) throws Exception {
			checkCorporateActionOption34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5
	 * CorporateActionQuantity5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionQuantity5> forCorporateActionQuantity5 = new MMConstraint<CorporateActionQuantity5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionQuantity5.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionQuantity5 obj) throws Exception {
			checkCorporateActionQuantity5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7
	 * CorporateAction7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateAction7> forCorporateAction7 = new MMConstraint<CorporateAction7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateAction7.mmObject();
		}

		@Override
		public void executeValidator(CorporateAction7 obj) throws Exception {
			checkCorporateAction7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25
	 * SecuritiesOption25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption25> forSecuritiesOption25 = new MMConstraint<SecuritiesOption25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption25.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption25 obj) throws Exception {
			checkSecuritiesOption25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36
	 * CorporateActionOption36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption36> forCorporateActionOption36 = new MMConstraint<CorporateActionOption36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption36.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption36 obj) throws Exception {
			checkCorporateActionOption36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6
	 * CorporateActionQuantity6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionQuantity6> forCorporateActionQuantity6 = new MMConstraint<CorporateActionQuantity6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionQuantity6.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionQuantity6 obj) throws Exception {
			checkCorporateActionQuantity6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8
	 * CorporateAction8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateAction8> forCorporateAction8 = new MMConstraint<CorporateAction8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateAction8.mmObject();
		}

		@Override
		public void executeValidator(CorporateAction8 obj) throws Exception {
			checkCorporateAction8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30
	 * SecuritiesOption30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption30> forSecuritiesOption30 = new MMConstraint<SecuritiesOption30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption30.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption30 obj) throws Exception {
			checkSecuritiesOption30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45
	 * CorporateActionOption45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption45> forCorporateActionOption45 = new MMConstraint<CorporateActionOption45>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption45.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption45 obj) throws Exception {
			checkCorporateActionOption45(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46
	 * FinancialInstrumentAttributes46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes46> forFinancialInstrumentAttributes46 = new MMConstraint<FinancialInstrumentAttributes46>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes46.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes46 obj) throws Exception {
			checkFinancialInstrumentAttributes46(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10
	 * CorporateAction10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forCorporateAction12
	 * ConstraintCoexistenceQuantityRule.forCorporateAction12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateAction10> forCorporateAction10 = new MMConstraint<CorporateAction10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forCorporateAction12);
			owner_lazy = () -> CorporateAction10.mmObject();
		}

		@Override
		public void executeValidator(CorporateAction10 obj) throws Exception {
			checkCorporateAction10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51
	 * CorporateActionOption51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forCorporateActionOption101
	 * ConstraintCoexistenceQuantityRule.forCorporateActionOption101}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption51> forCorporateActionOption51 = new MMConstraint<CorporateActionOption51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forCorporateActionOption101);
			owner_lazy = () -> CorporateActionOption51.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption51 obj) throws Exception {
			checkCorporateActionOption51(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47
	 * FinancialInstrumentAttributes47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes47> forFinancialInstrumentAttributes47 = new MMConstraint<FinancialInstrumentAttributes47>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes47.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes47 obj) throws Exception {
			checkFinancialInstrumentAttributes47(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11
	 * CorporateAction11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateAction11> forCorporateAction11 = new MMConstraint<CorporateAction11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateAction11.mmObject();
		}

		@Override
		public void executeValidator(CorporateAction11 obj) throws Exception {
			checkCorporateAction11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56
	 * CorporateActionOption56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption56> forCorporateActionOption56 = new MMConstraint<CorporateActionOption56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption56.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption56 obj) throws Exception {
			checkCorporateActionOption56(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD1Choice
	 * PriceFormatSD1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forPriceFormatSD2Choice
	 * ConstraintCoexistenceQuantityRule.forPriceFormatSD2Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormatSD1Choice> forPriceFormatSD1Choice = new MMConstraint<PriceFormatSD1Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forPriceFormatSD2Choice);
			owner_lazy = () -> PriceFormatSD1Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormatSD1Choice obj) throws Exception {
			checkPriceFormatSD1Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown5
	 * QuantityBreakdown5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown5> forQuantityBreakdown5 = new MMConstraint<QuantityBreakdown5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown5.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown5 obj) throws Exception {
			checkQuantityBreakdown5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4
	 * FinancialInstrumentAttributes4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes4> forFinancialInstrumentAttributes4 = new MMConstraint<FinancialInstrumentAttributes4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes4.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes4 obj) throws Exception {
			checkFinancialInstrumentAttributes4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails2
	 * IntraPositionDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails2> forIntraPositionDetails2 = new MMConstraint<IntraPositionDetails2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionDetails2.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails2 obj) throws Exception {
			checkIntraPositionDetails2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown6
	 * QuantityBreakdown6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown6> forQuantityBreakdown6 = new MMConstraint<QuantityBreakdown6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> QuantityBreakdown6.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown6 obj) throws Exception {
			checkQuantityBreakdown6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13
	 * FinancialInstrumentAttributes13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes13> forFinancialInstrumentAttributes13 = new MMConstraint<FinancialInstrumentAttributes13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> FinancialInstrumentAttributes13.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes13 obj) throws Exception {
			checkFinancialInstrumentAttributes13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails8
	 * IntraPositionDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails8> forIntraPositionDetails8 = new MMConstraint<IntraPositionDetails8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> IntraPositionDetails8.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails8 obj) throws Exception {
			checkIntraPositionDetails8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21
	 * FinancialInstrumentAttributes21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes21> forFinancialInstrumentAttributes21 = new MMConstraint<FinancialInstrumentAttributes21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes21.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes21 obj) throws Exception {
			checkFinancialInstrumentAttributes21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12
	 * IntraPositionDetails12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails12> forIntraPositionDetails12 = new MMConstraint<IntraPositionDetails12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionDetails12.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails12 obj) throws Exception {
			checkIntraPositionDetails12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26
	 * FinancialInstrumentAttributes26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes26> forFinancialInstrumentAttributes26 = new MMConstraint<FinancialInstrumentAttributes26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes26.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes26 obj) throws Exception {
			checkFinancialInstrumentAttributes26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13
	 * IntraPositionDetails13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails13> forIntraPositionDetails13 = new MMConstraint<IntraPositionDetails13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionDetails13.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails13 obj) throws Exception {
			checkIntraPositionDetails13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown15
	 * QuantityBreakdown15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown15> forQuantityBreakdown15 = new MMConstraint<QuantityBreakdown15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown15.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown15 obj) throws Exception {
			checkQuantityBreakdown15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes36> forFinancialInstrumentAttributes36 = new MMConstraint<FinancialInstrumentAttributes36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes36.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes36 obj) throws Exception {
			checkFinancialInstrumentAttributes36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown9
	 * QuantityBreakdown9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown9> forQuantityBreakdown9 = new MMConstraint<QuantityBreakdown9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown9.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown9 obj) throws Exception {
			checkQuantityBreakdown9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown12
	 * QuantityBreakdown12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown12> forQuantityBreakdown12 = new MMConstraint<QuantityBreakdown12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown12.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown12 obj) throws Exception {
			checkQuantityBreakdown12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22
	 * IntraPositionDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails22> forIntraPositionDetails22 = new MMConstraint<IntraPositionDetails22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionDetails22.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails22 obj) throws Exception {
			checkIntraPositionDetails22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown20
	 * QuantityBreakdown20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown20> forQuantityBreakdown20 = new MMConstraint<QuantityBreakdown20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown20.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown20 obj) throws Exception {
			checkQuantityBreakdown20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42
	 * FinancialInstrumentAttributes42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes42> forFinancialInstrumentAttributes42 = new MMConstraint<FinancialInstrumentAttributes42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes42.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes42 obj) throws Exception {
			checkFinancialInstrumentAttributes42(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown17
	 * QuantityBreakdown17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown17> forQuantityBreakdown17 = new MMConstraint<QuantityBreakdown17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown17.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown17 obj) throws Exception {
			checkQuantityBreakdown17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26
	 * IntraPositionDetails26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails26> forIntraPositionDetails26 = new MMConstraint<IntraPositionDetails26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionDetails26.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails26 obj) throws Exception {
			checkIntraPositionDetails26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27
	 * IntraPositionDetails27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails27> forIntraPositionDetails27 = new MMConstraint<IntraPositionDetails27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionDetails27.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails27 obj) throws Exception {
			checkIntraPositionDetails27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29
	 * IntraPositionDetails29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails29> forIntraPositionDetails29 = new MMConstraint<IntraPositionDetails29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionDetails29.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails29 obj) throws Exception {
			checkIntraPositionDetails29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1
	 * IntraPositionMovementDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails1> forIntraPositionMovementDetails1 = new MMConstraint<IntraPositionMovementDetails1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionMovementDetails1.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementDetails1 obj) throws Exception {
			checkIntraPositionMovementDetails1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2
	 * IntraPositionMovementDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails2> forIntraPositionMovementDetails2 = new MMConstraint<IntraPositionMovementDetails2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> IntraPositionMovementDetails2.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementDetails2 obj) throws Exception {
			checkIntraPositionMovementDetails2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5
	 * IntraPositionMovementDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails5> forIntraPositionMovementDetails5 = new MMConstraint<IntraPositionMovementDetails5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionMovementDetails5.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementDetails5 obj) throws Exception {
			checkIntraPositionMovementDetails5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27
	 * FinancialInstrumentAttributes27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes27> forFinancialInstrumentAttributes27 = new MMConstraint<FinancialInstrumentAttributes27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes27.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes27 obj) throws Exception {
			checkFinancialInstrumentAttributes27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6
	 * IntraPositionMovementDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails6> forIntraPositionMovementDetails6 = new MMConstraint<IntraPositionMovementDetails6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> IntraPositionMovementDetails6.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementDetails6 obj) throws Exception {
			checkIntraPositionMovementDetails6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7
	 * IntraPositionMovementDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails7> forIntraPositionMovementDetails7 = new MMConstraint<IntraPositionMovementDetails7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionMovementDetails7.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementDetails7 obj) throws Exception {
			checkIntraPositionMovementDetails7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8
	 * IntraPositionMovementDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails8> forIntraPositionMovementDetails8 = new MMConstraint<IntraPositionMovementDetails8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionMovementDetails8.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementDetails8 obj) throws Exception {
			checkIntraPositionMovementDetails8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9
	 * IntraPositionMovementDetails9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails9> forIntraPositionMovementDetails9 = new MMConstraint<IntraPositionMovementDetails9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionMovementDetails9.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementDetails9 obj) throws Exception {
			checkIntraPositionMovementDetails9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10
	 * IntraPositionMovementDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails10> forIntraPositionMovementDetails10 = new MMConstraint<IntraPositionMovementDetails10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionMovementDetails10.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementDetails10 obj) throws Exception {
			checkIntraPositionMovementDetails10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity4Choice
	 * BalanceQuantity4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BalanceQuantity4Choice> forBalanceQuantity4Choice = new MMConstraint<BalanceQuantity4Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> BalanceQuantity4Choice.mmObject();
		}

		@Override
		public void executeValidator(BalanceQuantity4Choice obj) throws Exception {
			checkBalanceQuantity4Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Balance1 Balance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Balance1> forBalance1 = new MMConstraint<Balance1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Balance1.mmObject();
		}

		@Override
		public void executeValidator(Balance1 obj) throws Exception {
			checkBalance1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown4
	 * QuantityBreakdown4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown4> forQuantityBreakdown4 = new MMConstraint<QuantityBreakdown4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown4.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown4 obj) throws Exception {
			checkQuantityBreakdown4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity3Choice
	 * SubBalanceQuantity3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceQuantity3Choice> forSubBalanceQuantity3Choice = new MMConstraint<SubBalanceQuantity3Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SubBalanceQuantity3Choice.mmObject();
		}

		@Override
		public void executeValidator(SubBalanceQuantity3Choice obj) throws Exception {
			checkSubBalanceQuantity3Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation6
	 * AdditionalBalanceInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation6> forAdditionalBalanceInformation6 = new MMConstraint<AdditionalBalanceInformation6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AdditionalBalanceInformation6.mmObject();
		}

		@Override
		public void executeValidator(AdditionalBalanceInformation6 obj) throws Exception {
			checkAdditionalBalanceInformation6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation6
	 * SubBalanceInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation6> forSubBalanceInformation6 = new MMConstraint<SubBalanceInformation6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SubBalanceInformation6.mmObject();
		}

		@Override
		public void executeValidator(SubBalanceInformation6 obj) throws Exception {
			checkSubBalanceInformation6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14
	 * FinancialInstrumentAttributes14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes14> forFinancialInstrumentAttributes14 = new MMConstraint<FinancialInstrumentAttributes14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> FinancialInstrumentAttributes14.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes14 obj) throws Exception {
			checkFinancialInstrumentAttributes14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity6Choice
	 * BalanceQuantity6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BalanceQuantity6Choice> forBalanceQuantity6Choice = new MMConstraint<BalanceQuantity6Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> BalanceQuantity6Choice.mmObject();
		}

		@Override
		public void executeValidator(BalanceQuantity6Choice obj) throws Exception {
			checkBalanceQuantity6Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Balance2 Balance2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Balance2> forBalance2 = new MMConstraint<Balance2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> Balance2.mmObject();
		}

		@Override
		public void executeValidator(Balance2 obj) throws Exception {
			checkBalance2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown8
	 * QuantityBreakdown8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown8> forQuantityBreakdown8 = new MMConstraint<QuantityBreakdown8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> QuantityBreakdown8.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown8 obj) throws Exception {
			checkQuantityBreakdown8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity4Choice
	 * SubBalanceQuantity4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceQuantity4Choice> forSubBalanceQuantity4Choice = new MMConstraint<SubBalanceQuantity4Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SubBalanceQuantity4Choice.mmObject();
		}

		@Override
		public void executeValidator(SubBalanceQuantity4Choice obj) throws Exception {
			checkSubBalanceQuantity4Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation7
	 * AdditionalBalanceInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation7> forAdditionalBalanceInformation7 = new MMConstraint<AdditionalBalanceInformation7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> AdditionalBalanceInformation7.mmObject();
		}

		@Override
		public void executeValidator(AdditionalBalanceInformation7 obj) throws Exception {
			checkAdditionalBalanceInformation7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation7
	 * SubBalanceInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation7> forSubBalanceInformation7 = new MMConstraint<SubBalanceInformation7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SubBalanceInformation7.mmObject();
		}

		@Override
		public void executeValidator(SubBalanceInformation7 obj) throws Exception {
			checkSubBalanceInformation7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30
	 * FinancialInstrumentAttributes30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes30> forFinancialInstrumentAttributes30 = new MMConstraint<FinancialInstrumentAttributes30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes30.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes30 obj) throws Exception {
			checkFinancialInstrumentAttributes30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown14
	 * QuantityBreakdown14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown14> forQuantityBreakdown14 = new MMConstraint<QuantityBreakdown14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown14.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown14 obj) throws Exception {
			checkQuantityBreakdown14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown19
	 * QuantityBreakdown19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown19> forQuantityBreakdown19 = new MMConstraint<QuantityBreakdown19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown19.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown19 obj) throws Exception {
			checkQuantityBreakdown19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Balance4 Balance4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Balance4> forBalance4 = new MMConstraint<Balance4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Balance4.mmObject();
		}

		@Override
		public void executeValidator(Balance4 obj) throws Exception {
			checkBalance4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown24
	 * QuantityBreakdown24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown24> forQuantityBreakdown24 = new MMConstraint<QuantityBreakdown24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown24.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown24 obj) throws Exception {
			checkQuantityBreakdown24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Balance5 Balance5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Balance5> forBalance5 = new MMConstraint<Balance5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> Balance5.mmObject();
		}

		@Override
		public void executeValidator(Balance5 obj) throws Exception {
			checkBalance5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown25
	 * QuantityBreakdown25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown25> forQuantityBreakdown25 = new MMConstraint<QuantityBreakdown25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown25.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown25 obj) throws Exception {
			checkQuantityBreakdown25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity5Choice
	 * BalanceQuantity5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BalanceQuantity5Choice> forBalanceQuantity5Choice = new MMConstraint<BalanceQuantity5Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> BalanceQuantity5Choice.mmObject();
		}

		@Override
		public void executeValidator(BalanceQuantity5Choice obj) throws Exception {
			checkBalanceQuantity5Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation5
	 * AdditionalBalanceInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation5> forAdditionalBalanceInformation5 = new MMConstraint<AdditionalBalanceInformation5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AdditionalBalanceInformation5.mmObject();
		}

		@Override
		public void executeValidator(AdditionalBalanceInformation5 obj) throws Exception {
			checkAdditionalBalanceInformation5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation5
	 * SubBalanceInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation5> forSubBalanceInformation5 = new MMConstraint<SubBalanceInformation5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SubBalanceInformation5.mmObject();
		}

		@Override
		public void executeValidator(SubBalanceInformation5 obj) throws Exception {
			checkSubBalanceInformation5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity7Choice
	 * BalanceQuantity7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BalanceQuantity7Choice> forBalanceQuantity7Choice = new MMConstraint<BalanceQuantity7Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> BalanceQuantity7Choice.mmObject();
		}

		@Override
		public void executeValidator(BalanceQuantity7Choice obj) throws Exception {
			checkBalanceQuantity7Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown7
	 * QuantityBreakdown7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown7> forQuantityBreakdown7 = new MMConstraint<QuantityBreakdown7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> QuantityBreakdown7.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown7 obj) throws Exception {
			checkQuantityBreakdown7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation8
	 * AdditionalBalanceInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation8> forAdditionalBalanceInformation8 = new MMConstraint<AdditionalBalanceInformation8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> AdditionalBalanceInformation8.mmObject();
		}

		@Override
		public void executeValidator(AdditionalBalanceInformation8 obj) throws Exception {
			checkAdditionalBalanceInformation8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation8
	 * SubBalanceInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation8> forSubBalanceInformation8 = new MMConstraint<SubBalanceInformation8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SubBalanceInformation8.mmObject();
		}

		@Override
		public void executeValidator(SubBalanceInformation8 obj) throws Exception {
			checkSubBalanceInformation8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation9
	 * AdditionalBalanceInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation9> forAdditionalBalanceInformation9 = new MMConstraint<AdditionalBalanceInformation9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AdditionalBalanceInformation9.mmObject();
		}

		@Override
		public void executeValidator(AdditionalBalanceInformation9 obj) throws Exception {
			checkAdditionalBalanceInformation9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation9
	 * SubBalanceInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation9> forSubBalanceInformation9 = new MMConstraint<SubBalanceInformation9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SubBalanceInformation9.mmObject();
		}

		@Override
		public void executeValidator(SubBalanceInformation9 obj) throws Exception {
			checkSubBalanceInformation9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation10
	 * AdditionalBalanceInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation10> forAdditionalBalanceInformation10 = new MMConstraint<AdditionalBalanceInformation10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AdditionalBalanceInformation10.mmObject();
		}

		@Override
		public void executeValidator(AdditionalBalanceInformation10 obj) throws Exception {
			checkAdditionalBalanceInformation10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation10
	 * SubBalanceInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation10> forSubBalanceInformation10 = new MMConstraint<SubBalanceInformation10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SubBalanceInformation10.mmObject();
		}

		@Override
		public void executeValidator(SubBalanceInformation10 obj) throws Exception {
			checkSubBalanceInformation10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown23
	 * QuantityBreakdown23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown23> forQuantityBreakdown23 = new MMConstraint<QuantityBreakdown23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown23.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown23 obj) throws Exception {
			checkQuantityBreakdown23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation11
	 * AdditionalBalanceInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation11> forAdditionalBalanceInformation11 = new MMConstraint<AdditionalBalanceInformation11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AdditionalBalanceInformation11.mmObject();
		}

		@Override
		public void executeValidator(AdditionalBalanceInformation11 obj) throws Exception {
			checkAdditionalBalanceInformation11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation11
	 * SubBalanceInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation11> forSubBalanceInformation11 = new MMConstraint<SubBalanceInformation11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SubBalanceInformation11.mmObject();
		}

		@Override
		public void executeValidator(SubBalanceInformation11 obj) throws Exception {
			checkSubBalanceInformation11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown26
	 * QuantityBreakdown26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown26> forQuantityBreakdown26 = new MMConstraint<QuantityBreakdown26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown26.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown26 obj) throws Exception {
			checkQuantityBreakdown26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation12
	 * AdditionalBalanceInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalBalanceInformation12> forAdditionalBalanceInformation12 = new MMConstraint<AdditionalBalanceInformation12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AdditionalBalanceInformation12.mmObject();
		}

		@Override
		public void executeValidator(AdditionalBalanceInformation12 obj) throws Exception {
			checkAdditionalBalanceInformation12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation12
	 * SubBalanceInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubBalanceInformation12> forSubBalanceInformation12 = new MMConstraint<SubBalanceInformation12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SubBalanceInformation12.mmObject();
		}

		@Override
		public void executeValidator(SubBalanceInformation12 obj) throws Exception {
			checkSubBalanceInformation12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6
	 * QuantityAndAccount6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount6> forQuantityAndAccount6 = new MMConstraint<QuantityAndAccount6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount6.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount6 obj) throws Exception {
			checkQuantityAndAccount6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount11
	 * QuantityAndAccount11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount11> forQuantityAndAccount11 = new MMConstraint<QuantityAndAccount11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> QuantityAndAccount11.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount11 obj) throws Exception {
			checkQuantityAndAccount11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18
	 * QuantityAndAccount18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount18> forQuantityAndAccount18 = new MMConstraint<QuantityAndAccount18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount18.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount18 obj) throws Exception {
			checkQuantityAndAccount18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28
	 * FinancialInstrumentAttributes28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes28> forFinancialInstrumentAttributes28 = new MMConstraint<FinancialInstrumentAttributes28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes28.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes28 obj) throws Exception {
			checkFinancialInstrumentAttributes28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount19
	 * QuantityAndAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount19> forQuantityAndAccount19 = new MMConstraint<QuantityAndAccount19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount19.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount19 obj) throws Exception {
			checkQuantityAndAccount19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount1
	 * QuantityAndAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount1> forQuantityAndAccount1 = new MMConstraint<QuantityAndAccount1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount1.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount1 obj) throws Exception {
			checkQuantityAndAccount1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount5
	 * QuantityAndAccount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount5> forQuantityAndAccount5 = new MMConstraint<QuantityAndAccount5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> QuantityAndAccount5.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount5 obj) throws Exception {
			checkQuantityAndAccount5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages9 Linkages9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages9> forLinkages9 = new MMConstraint<Linkages9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Linkages9.mmObject();
		}

		@Override
		public void executeValidator(Linkages9 obj) throws Exception {
			checkLinkages9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount17
	 * QuantityAndAccount17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount17> forQuantityAndAccount17 = new MMConstraint<QuantityAndAccount17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount17.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount17 obj) throws Exception {
			checkQuantityAndAccount17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages14 Linkages14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages14> forLinkages14 = new MMConstraint<Linkages14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Linkages14.mmObject();
		}

		@Override
		public void executeValidator(Linkages14 obj) throws Exception {
			checkLinkages14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount24
	 * QuantityAndAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount24> forQuantityAndAccount24 = new MMConstraint<QuantityAndAccount24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount24.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount24 obj) throws Exception {
			checkQuantityAndAccount24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages17 Linkages17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages17> forLinkages17 = new MMConstraint<Linkages17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Linkages17.mmObject();
		}

		@Override
		public void executeValidator(Linkages17 obj) throws Exception {
			checkLinkages17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount25
	 * QuantityAndAccount25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount25> forQuantityAndAccount25 = new MMConstraint<QuantityAndAccount25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount25.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount25 obj) throws Exception {
			checkQuantityAndAccount25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages24 Linkages24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages24> forLinkages24 = new MMConstraint<Linkages24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Linkages24.mmObject();
		}

		@Override
		public void executeValidator(Linkages24 obj) throws Exception {
			checkLinkages24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount34
	 * QuantityAndAccount34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount34> forQuantityAndAccount34 = new MMConstraint<QuantityAndAccount34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount34.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount34 obj) throws Exception {
			checkQuantityAndAccount34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation3
	 * AdditionalInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalInformation3> forAdditionalInformation3 = new MMConstraint<AdditionalInformation3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AdditionalInformation3.mmObject();
		}

		@Override
		public void executeValidator(AdditionalInformation3 obj) throws Exception {
			checkAdditionalInformation3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation4
	 * AdditionalInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalInformation4> forAdditionalInformation4 = new MMConstraint<AdditionalInformation4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> AdditionalInformation4.mmObject();
		}

		@Override
		public void executeValidator(AdditionalInformation4 obj) throws Exception {
			checkAdditionalInformation4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7
	 * AdditionalInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forAdditionalInformation9
	 * ConstraintCoexistenceQuantityRule.forAdditionalInformation9}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalInformation7> forAdditionalInformation7 = new MMConstraint<AdditionalInformation7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forAdditionalInformation9);
			owner_lazy = () -> AdditionalInformation7.mmObject();
		}

		@Override
		public void executeValidator(AdditionalInformation7 obj) throws Exception {
			checkAdditionalInformation7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation8
	 * AdditionalInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalInformation8> forAdditionalInformation8 = new MMConstraint<AdditionalInformation8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AdditionalInformation8.mmObject();
		}

		@Override
		public void executeValidator(AdditionalInformation8 obj) throws Exception {
			checkAdditionalInformation8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2
	 * QuantityAndAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount2> forQuantityAndAccount2 = new MMConstraint<QuantityAndAccount2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount2.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount2 obj) throws Exception {
			checkQuantityAndAccount2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12
	 * QuantityAndAccount12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount12> forQuantityAndAccount12 = new MMConstraint<QuantityAndAccount12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> QuantityAndAccount12.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount12 obj) throws Exception {
			checkQuantityAndAccount12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15
	 * QuantityAndAccount15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount15> forQuantityAndAccount15 = new MMConstraint<QuantityAndAccount15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount15.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount15 obj) throws Exception {
			checkQuantityAndAccount15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown10
	 * QuantityBreakdown10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown10> forQuantityBreakdown10 = new MMConstraint<QuantityBreakdown10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown10.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown10 obj) throws Exception {
			checkQuantityBreakdown10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20
	 * QuantityAndAccount20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount20> forQuantityAndAccount20 = new MMConstraint<QuantityAndAccount20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount20.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount20 obj) throws Exception {
			checkQuantityAndAccount20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown16
	 * QuantityBreakdown16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown16> forQuantityBreakdown16 = new MMConstraint<QuantityBreakdown16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown16.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown16 obj) throws Exception {
			checkQuantityBreakdown16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28
	 * QuantityAndAccount28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount28> forQuantityAndAccount28 = new MMConstraint<QuantityAndAccount28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount28.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount28 obj) throws Exception {
			checkQuantityAndAccount28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown21
	 * QuantityBreakdown21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown21> forQuantityBreakdown21 = new MMConstraint<QuantityBreakdown21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown21.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown21 obj) throws Exception {
			checkQuantityBreakdown21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37
	 * QuantityAndAccount37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount37> forQuantityAndAccount37 = new MMConstraint<QuantityAndAccount37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount37.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount37 obj) throws Exception {
			checkQuantityAndAccount37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages7 Linkages7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages7> forLinkages7 = new MMConstraint<Linkages7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Linkages7.mmObject();
		}

		@Override
		public void executeValidator(Linkages7 obj) throws Exception {
			checkLinkages7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Linkages12 Linkages12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Linkages12> forLinkages12 = new MMConstraint<Linkages12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Linkages12.mmObject();
		}

		@Override
		public void executeValidator(Linkages12 obj) throws Exception {
			checkLinkages12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5
	 * TransactionDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails5> forTransactionDetails5 = new MMConstraint<TransactionDetails5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails5.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails5 obj) throws Exception {
			checkTransactionDetails5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9
	 * TransactionDetails9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails9> forTransactionDetails9 = new MMConstraint<TransactionDetails9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> TransactionDetails9.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails9 obj) throws Exception {
			checkTransactionDetails9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22
	 * TransactionDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails22> forTransactionDetails22 = new MMConstraint<TransactionDetails22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails22.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails22 obj) throws Exception {
			checkTransactionDetails22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23
	 * TransactionDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails23> forTransactionDetails23 = new MMConstraint<TransactionDetails23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails23.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails23 obj) throws Exception {
			checkTransactionDetails23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36
	 * TransactionDetails36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails36> forTransactionDetails36 = new MMConstraint<TransactionDetails36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails36.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails36 obj) throws Exception {
			checkTransactionDetails36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47
	 * TransactionDetails47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails47> forTransactionDetails47 = new MMConstraint<TransactionDetails47>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails47.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails47 obj) throws Exception {
			checkTransactionDetails47(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53
	 * TransactionDetails53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forTransactionDetails61
	 * ConstraintCoexistenceQuantityRule.forTransactionDetails61}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails53> forTransactionDetails53 = new MMConstraint<TransactionDetails53>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forTransactionDetails61);
			owner_lazy = () -> TransactionDetails53.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails53 obj) throws Exception {
			checkTransactionDetails53(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58
	 * TransactionDetails58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails58> forTransactionDetails58 = new MMConstraint<TransactionDetails58>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails58.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails58 obj) throws Exception {
			checkTransactionDetails58(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7
	 * TransactionDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails7> forTransactionDetails7 = new MMConstraint<TransactionDetails7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails7.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails7 obj) throws Exception {
			checkTransactionDetails7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8
	 * TransactionDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails8> forTransactionDetails8 = new MMConstraint<TransactionDetails8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails8.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails8 obj) throws Exception {
			checkTransactionDetails8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16
	 * TransactionDetails16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails16> forTransactionDetails16 = new MMConstraint<TransactionDetails16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> TransactionDetails16.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails16 obj) throws Exception {
			checkTransactionDetails16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17
	 * TransactionDetails17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails17> forTransactionDetails17 = new MMConstraint<TransactionDetails17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> TransactionDetails17.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails17 obj) throws Exception {
			checkTransactionDetails17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26
	 * TransactionDetails26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails26> forTransactionDetails26 = new MMConstraint<TransactionDetails26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails26.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails26 obj) throws Exception {
			checkTransactionDetails26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25
	 * TransactionDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails25> forTransactionDetails25 = new MMConstraint<TransactionDetails25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails25.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails25 obj) throws Exception {
			checkTransactionDetails25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27
	 * TransactionDetails27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails27> forTransactionDetails27 = new MMConstraint<TransactionDetails27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails27.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails27 obj) throws Exception {
			checkTransactionDetails27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33
	 * TransactionDetails33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails33> forTransactionDetails33 = new MMConstraint<TransactionDetails33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails33.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails33 obj) throws Exception {
			checkTransactionDetails33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39
	 * TransactionDetails39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails39> forTransactionDetails39 = new MMConstraint<TransactionDetails39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails39.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails39 obj) throws Exception {
			checkTransactionDetails39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50
	 * TransactionDetails50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails50> forTransactionDetails50 = new MMConstraint<TransactionDetails50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails50.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails50 obj) throws Exception {
			checkTransactionDetails50(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56
	 * TransactionDetails56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forTransactionDetails62
	 * ConstraintCoexistenceQuantityRule.forTransactionDetails62}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails56> forTransactionDetails56 = new MMConstraint<TransactionDetails56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forTransactionDetails62);
			owner_lazy = () -> TransactionDetails56.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails56 obj) throws Exception {
			checkTransactionDetails56(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59
	 * TransactionDetails59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails59> forTransactionDetails59 = new MMConstraint<TransactionDetails59>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails59.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails59 obj) throws Exception {
			checkTransactionDetails59(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6
	 * TransactionDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails6> forTransactionDetails6 = new MMConstraint<TransactionDetails6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails6.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails6 obj) throws Exception {
			checkTransactionDetails6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18
	 * TransactionDetails18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails18> forTransactionDetails18 = new MMConstraint<TransactionDetails18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> TransactionDetails18.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails18 obj) throws Exception {
			checkTransactionDetails18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24
	 * TransactionDetails24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails24> forTransactionDetails24 = new MMConstraint<TransactionDetails24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails24.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails24 obj) throws Exception {
			checkTransactionDetails24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34
	 * TransactionDetails34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails34> forTransactionDetails34 = new MMConstraint<TransactionDetails34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails34.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails34 obj) throws Exception {
			checkTransactionDetails34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37
	 * TransactionDetails37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails37> forTransactionDetails37 = new MMConstraint<TransactionDetails37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails37.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails37 obj) throws Exception {
			checkTransactionDetails37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48
	 * TransactionDetails48}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails48> forTransactionDetails48 = new MMConstraint<TransactionDetails48>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails48.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails48 obj) throws Exception {
			checkTransactionDetails48(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57
	 * TransactionDetails57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forTransactionDetails63
	 * ConstraintCoexistenceQuantityRule.forTransactionDetails63}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails57> forTransactionDetails57 = new MMConstraint<TransactionDetails57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forTransactionDetails63);
			owner_lazy = () -> TransactionDetails57.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails57 obj) throws Exception {
			checkTransactionDetails57(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60
	 * TransactionDetails60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails60> forTransactionDetails60 = new MMConstraint<TransactionDetails60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails60.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails60 obj) throws Exception {
			checkTransactionDetails60(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails1
	 * IntraPositionDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails1> forIntraPositionDetails1 = new MMConstraint<IntraPositionDetails1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionDetails1.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails1 obj) throws Exception {
			checkIntraPositionDetails1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails11
	 * IntraPositionDetails11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails11> forIntraPositionDetails11 = new MMConstraint<IntraPositionDetails11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionDetails11.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails11 obj) throws Exception {
			checkIntraPositionDetails11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails4
	 * IntraPositionDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails4> forIntraPositionDetails4 = new MMConstraint<IntraPositionDetails4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionDetails4.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails4 obj) throws Exception {
			checkIntraPositionDetails4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails9
	 * IntraPositionDetails9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails9> forIntraPositionDetails9 = new MMConstraint<IntraPositionDetails9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionDetails9.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails9 obj) throws Exception {
			checkIntraPositionDetails9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Quantity5 Quantity5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Quantity5> forQuantity5 = new MMConstraint<Quantity5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Quantity5.mmObject();
		}

		@Override
		public void executeValidator(Quantity5 obj) throws Exception {
			checkQuantity5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount7
	 * QuantityAndAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount7> forQuantityAndAccount7 = new MMConstraint<QuantityAndAccount7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount7.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount7 obj) throws Exception {
			checkQuantityAndAccount7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount16
	 * QuantityAndAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount16> forQuantityAndAccount16 = new MMConstraint<QuantityAndAccount16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount16.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount16 obj) throws Exception {
			checkQuantityAndAccount16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2
	 * SecuritiesFinancingTransactionDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails2> forSecuritiesFinancingTransactionDetails2 = new MMConstraint<SecuritiesFinancingTransactionDetails2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails2.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingTransactionDetails2 obj) throws Exception {
			checkSecuritiesFinancingTransactionDetails2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8
	 * SecuritiesFinancingTransactionDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails8> forSecuritiesFinancingTransactionDetails8 = new MMConstraint<SecuritiesFinancingTransactionDetails8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails8.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingTransactionDetails8 obj) throws Exception {
			checkSecuritiesFinancingTransactionDetails8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount3
	 * QuantityAndAccount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount3> forQuantityAndAccount3 = new MMConstraint<QuantityAndAccount3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount3.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount3 obj) throws Exception {
			checkQuantityAndAccount3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15
	 * FinancialInstrumentAttributes15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes15> forFinancialInstrumentAttributes15 = new MMConstraint<FinancialInstrumentAttributes15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes15.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes15 obj) throws Exception {
			checkFinancialInstrumentAttributes15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount13
	 * QuantityAndAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount13> forQuantityAndAccount13 = new MMConstraint<QuantityAndAccount13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount13.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount13 obj) throws Exception {
			checkQuantityAndAccount13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount8
	 * QuantityAndAccount8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount8> forQuantityAndAccount8 = new MMConstraint<QuantityAndAccount8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount8.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount8 obj) throws Exception {
			checkQuantityAndAccount8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount14
	 * QuantityAndAccount14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount14> forQuantityAndAccount14 = new MMConstraint<QuantityAndAccount14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount14.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount14 obj) throws Exception {
			checkQuantityAndAccount14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails4
	 * TransactionDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails4> forTransactionDetails4 = new MMConstraint<TransactionDetails4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails4.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails4 obj) throws Exception {
			checkTransactionDetails4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails30
	 * TransactionDetails30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails30> forTransactionDetails30 = new MMConstraint<TransactionDetails30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails30.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails30 obj) throws Exception {
			checkTransactionDetails30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount10
	 * QuantityAndAccount10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount10> forQuantityAndAccount10 = new MMConstraint<QuantityAndAccount10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> QuantityAndAccount10.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount10 obj) throws Exception {
			checkQuantityAndAccount10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount21
	 * QuantityAndAccount21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount21> forQuantityAndAccount21 = new MMConstraint<QuantityAndAccount21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount21.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount21 obj) throws Exception {
			checkQuantityAndAccount21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6
	 * SecuritiesFinancingTransactionDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails6> forSecuritiesFinancingTransactionDetails6 = new MMConstraint<SecuritiesFinancingTransactionDetails6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails6.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingTransactionDetails6 obj) throws Exception {
			checkSecuritiesFinancingTransactionDetails6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10
	 * SecuritiesFinancingTransactionDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails10> forSecuritiesFinancingTransactionDetails10 = new MMConstraint<SecuritiesFinancingTransactionDetails10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails10.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingTransactionDetails10 obj) throws Exception {
			checkSecuritiesFinancingTransactionDetails10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17
	 * SecuritiesFinancingTransactionDetails17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forSecuritiesFinancingTransactionDetails21
	 * ConstraintCoexistenceQuantityRule.
	 * forSecuritiesFinancingTransactionDetails21}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails17> forSecuritiesFinancingTransactionDetails17 = new MMConstraint<SecuritiesFinancingTransactionDetails17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forSecuritiesFinancingTransactionDetails21);
			owner_lazy = () -> SecuritiesFinancingTransactionDetails17.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingTransactionDetails17 obj) throws Exception {
			checkSecuritiesFinancingTransactionDetails17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18
	 * SecuritiesFinancingTransactionDetails18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails18> forSecuritiesFinancingTransactionDetails18 = new MMConstraint<SecuritiesFinancingTransactionDetails18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails18.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingTransactionDetails18 obj) throws Exception {
			checkSecuritiesFinancingTransactionDetails18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails20
	 * TransactionDetails20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails20> forTransactionDetails20 = new MMConstraint<TransactionDetails20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> TransactionDetails20.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails20 obj) throws Exception {
			checkTransactionDetails20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount4
	 * QuantityAndAccount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount4> forQuantityAndAccount4 = new MMConstraint<QuantityAndAccount4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> QuantityAndAccount4.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount4 obj) throws Exception {
			checkQuantityAndAccount4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29
	 * FinancialInstrumentAttributes29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes29> forFinancialInstrumentAttributes29 = new MMConstraint<FinancialInstrumentAttributes29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes29.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes29 obj) throws Exception {
			checkFinancialInstrumentAttributes29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount22
	 * QuantityAndAccount22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount22> forQuantityAndAccount22 = new MMConstraint<QuantityAndAccount22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount22.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount22 obj) throws Exception {
			checkQuantityAndAccount22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount27
	 * QuantityAndAccount27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount27> forQuantityAndAccount27 = new MMConstraint<QuantityAndAccount27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount27.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount27 obj) throws Exception {
			checkQuantityAndAccount27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount36
	 * QuantityAndAccount36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount36> forQuantityAndAccount36 = new MMConstraint<QuantityAndAccount36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount36.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount36 obj) throws Exception {
			checkQuantityAndAccount36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount9
	 * QuantityAndAccount9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount9> forQuantityAndAccount9 = new MMConstraint<QuantityAndAccount9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> QuantityAndAccount9.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount9 obj) throws Exception {
			checkQuantityAndAccount9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount23
	 * QuantityAndAccount23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount23> forQuantityAndAccount23 = new MMConstraint<QuantityAndAccount23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount23.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount23 obj) throws Exception {
			checkQuantityAndAccount23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount26
	 * QuantityAndAccount26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount26> forQuantityAndAccount26 = new MMConstraint<QuantityAndAccount26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount26.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount26 obj) throws Exception {
			checkQuantityAndAccount26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount35
	 * QuantityAndAccount35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityAndAccount35> forQuantityAndAccount35 = new MMConstraint<QuantityAndAccount35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityAndAccount35.mmObject();
		}

		@Override
		public void executeValidator(QuantityAndAccount35 obj) throws Exception {
			checkQuantityAndAccount35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40
	 * TransactionDetails40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails40> forTransactionDetails40 = new MMConstraint<TransactionDetails40>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails40.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails40 obj) throws Exception {
			checkTransactionDetails40(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42
	 * TransactionDetails42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails42> forTransactionDetails42 = new MMConstraint<TransactionDetails42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails42.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails42 obj) throws Exception {
			checkTransactionDetails42(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails46
	 * TransactionDetails46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails46> forTransactionDetails46 = new MMConstraint<TransactionDetails46>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails46.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails46 obj) throws Exception {
			checkTransactionDetails46(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails32
	 * TransactionDetails32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails32> forTransactionDetails32 = new MMConstraint<TransactionDetails32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails32.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails32 obj) throws Exception {
			checkTransactionDetails32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails14
	 * TransactionDetails14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails14> forTransactionDetails14 = new MMConstraint<TransactionDetails14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> TransactionDetails14.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails14 obj) throws Exception {
			checkTransactionDetails14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails35
	 * TransactionDetails35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails35> forTransactionDetails35 = new MMConstraint<TransactionDetails35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails35.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails35 obj) throws Exception {
			checkTransactionDetails35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails7
	 * IntraPositionDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails7> forIntraPositionDetails7 = new MMConstraint<IntraPositionDetails7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> IntraPositionDetails7.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails7 obj) throws Exception {
			checkIntraPositionDetails7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails16
	 * IntraPositionDetails16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails16> forIntraPositionDetails16 = new MMConstraint<IntraPositionDetails16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionDetails16.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails16 obj) throws Exception {
			checkIntraPositionDetails16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails21
	 * IntraPositionDetails21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails21> forIntraPositionDetails21 = new MMConstraint<IntraPositionDetails21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionDetails21.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails21 obj) throws Exception {
			checkIntraPositionDetails21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25
	 * IntraPositionDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails25> forIntraPositionDetails25 = new MMConstraint<IntraPositionDetails25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionDetails25.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails25 obj) throws Exception {
			checkIntraPositionDetails25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5
	 * IntraPositionDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails5> forIntraPositionDetails5 = new MMConstraint<IntraPositionDetails5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> IntraPositionDetails5.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails5 obj) throws Exception {
			checkIntraPositionDetails5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails15
	 * IntraPositionDetails15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails15> forIntraPositionDetails15 = new MMConstraint<IntraPositionDetails15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionDetails15.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails15 obj) throws Exception {
			checkIntraPositionDetails15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails19
	 * IntraPositionDetails19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails19> forIntraPositionDetails19 = new MMConstraint<IntraPositionDetails19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionDetails19.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails19 obj) throws Exception {
			checkIntraPositionDetails19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails23
	 * IntraPositionDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionDetails23> forIntraPositionDetails23 = new MMConstraint<IntraPositionDetails23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionDetails23.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionDetails23 obj) throws Exception {
			checkIntraPositionDetails23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Quantity6 Quantity6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Quantity6> forQuantity6 = new MMConstraint<Quantity6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> Quantity6.mmObject();
		}

		@Override
		public void executeValidator(Quantity6 obj) throws Exception {
			checkQuantity6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Quantity7 Quantity7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Quantity7> forQuantity7 = new MMConstraint<Quantity7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Quantity7.mmObject();
		}

		@Override
		public void executeValidator(Quantity7 obj) throws Exception {
			checkQuantity7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Quantity8 Quantity8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Quantity8> forQuantity8 = new MMConstraint<Quantity8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Quantity8.mmObject();
		}

		@Override
		public void executeValidator(Quantity8 obj) throws Exception {
			checkQuantity8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45
	 * TransactionDetails45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails45> forTransactionDetails45 = new MMConstraint<TransactionDetails45>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails45.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails45 obj) throws Exception {
			checkTransactionDetails45(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3
	 * IntraPositionMovementDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails3> forIntraPositionMovementDetails3 = new MMConstraint<IntraPositionMovementDetails3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionMovementDetails3.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementDetails3 obj) throws Exception {
			checkIntraPositionMovementDetails3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4
	 * IntraPositionMovementDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPositionMovementDetails4> forIntraPositionMovementDetails4 = new MMConstraint<IntraPositionMovementDetails4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPositionMovementDetails4.mmObject();
		}

		@Override
		public void executeValidator(IntraPositionMovementDetails4 obj) throws Exception {
			checkIntraPositionMovementDetails4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown22
	 * QuantityBreakdown22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QuantityBreakdown22> forQuantityBreakdown22 = new MMConstraint<QuantityBreakdown22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> QuantityBreakdown22.mmObject();
		}

		@Override
		public void executeValidator(QuantityBreakdown22 obj) throws Exception {
			checkQuantityBreakdown22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5
	 * AmountPricePerFinancialInstrumentQuantity5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AmountPricePerFinancialInstrumentQuantity5> forAmountPricePerFinancialInstrumentQuantity5 = new MMConstraint<AmountPricePerFinancialInstrumentQuantity5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AmountPricePerFinancialInstrumentQuantity5.mmObject();
		}

		@Override
		public void executeValidator(AmountPricePerFinancialInstrumentQuantity5 obj) throws Exception {
			checkAmountPricePerFinancialInstrumentQuantity5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51
	 * TransactionDetails51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails51> forTransactionDetails51 = new MMConstraint<TransactionDetails51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails51.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails51 obj) throws Exception {
			checkTransactionDetails51(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.IntraPosition4 IntraPosition4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<IntraPosition4> forIntraPosition4 = new MMConstraint<IntraPosition4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> IntraPosition4.mmObject();
		}

		@Override
		public void executeValidator(IntraPosition4 obj) throws Exception {
			checkIntraPosition4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails52
	 * TransactionDetails52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails52> forTransactionDetails52 = new MMConstraint<TransactionDetails52>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails52.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails52 obj) throws Exception {
			checkTransactionDetails52(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61
	 * TransactionDetails61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forTransactionDetails70
	 * ConstraintCoexistenceQuantityRule.forTransactionDetails70}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forTransactionDetails53
	 * ConstraintCoexistenceQuantityRule.forTransactionDetails53}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails61> forTransactionDetails61 = new MMConstraint<TransactionDetails61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forTransactionDetails70);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forTransactionDetails53;
			owner_lazy = () -> TransactionDetails61.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails61 obj) throws Exception {
			checkTransactionDetails61(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21
	 * SecuritiesFinancingTransactionDetails21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forSecuritiesFinancingTransactionDetails24
	 * ConstraintCoexistenceQuantityRule.
	 * forSecuritiesFinancingTransactionDetails24}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forSecuritiesFinancingTransactionDetails17
	 * ConstraintCoexistenceQuantityRule.
	 * forSecuritiesFinancingTransactionDetails17}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails21> forSecuritiesFinancingTransactionDetails21 = new MMConstraint<SecuritiesFinancingTransactionDetails21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forSecuritiesFinancingTransactionDetails24);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forSecuritiesFinancingTransactionDetails17;
			owner_lazy = () -> SecuritiesFinancingTransactionDetails21.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingTransactionDetails21 obj) throws Exception {
			checkSecuritiesFinancingTransactionDetails21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62
	 * TransactionDetails62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forTransactionDetails69
	 * ConstraintCoexistenceQuantityRule.forTransactionDetails69}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forTransactionDetails56
	 * ConstraintCoexistenceQuantityRule.forTransactionDetails56}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails62> forTransactionDetails62 = new MMConstraint<TransactionDetails62>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forTransactionDetails69);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forTransactionDetails56;
			owner_lazy = () -> TransactionDetails62.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails62 obj) throws Exception {
			checkTransactionDetails62(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63
	 * TransactionDetails63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forTransactionDetails57
	 * ConstraintCoexistenceQuantityRule.forTransactionDetails57}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails63> forTransactionDetails63 = new MMConstraint<TransactionDetails63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forTransactionDetails57;
			owner_lazy = () -> TransactionDetails63.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails63 obj) throws Exception {
			checkTransactionDetails63(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103
	 * CorporateActionOption103}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forCorporateActionOption57
	 * ConstraintCoexistenceQuantityRule.forCorporateActionOption57}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption103> forCorporateActionOption103 = new MMConstraint<CorporateActionOption103>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forCorporateActionOption57;
			owner_lazy = () -> CorporateActionOption103.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption103 obj) throws Exception {
			checkCorporateActionOption103(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100
	 * CorporateActionOption100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forCorporateActionOption52
	 * ConstraintCoexistenceQuantityRule.forCorporateActionOption52}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption100> forCorporateActionOption100 = new MMConstraint<CorporateActionOption100>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forCorporateActionOption52;
			owner_lazy = () -> CorporateActionOption100.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption100 obj) throws Exception {
			checkCorporateActionOption100(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101
	 * CorporateActionOption101}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forCorporateActionOption51
	 * ConstraintCoexistenceQuantityRule.forCorporateActionOption51}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption101> forCorporateActionOption101 = new MMConstraint<CorporateActionOption101>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forCorporateActionOption51;
			owner_lazy = () -> CorporateActionOption101.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption101 obj) throws Exception {
			checkCorporateActionOption101(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12
	 * CorporateAction12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forCorporateAction10
	 * ConstraintCoexistenceQuantityRule.forCorporateAction10}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateAction12> forCorporateAction12 = new MMConstraint<CorporateAction12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forCorporateAction10;
			owner_lazy = () -> CorporateAction12.mmObject();
		}

		@Override
		public void executeValidator(CorporateAction12 obj) throws Exception {
			checkCorporateAction12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat33Choice
	 * PriceFormat33Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forPriceFormat21Choice
	 * ConstraintCoexistenceQuantityRule.forPriceFormat21Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat33Choice> forPriceFormat33Choice = new MMConstraint<PriceFormat33Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forPriceFormat21Choice;
			owner_lazy = () -> PriceFormat33Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormat33Choice obj) throws Exception {
			checkPriceFormat33Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48
	 * FinancialInstrumentAttributes48}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forFinancialInstrumentAttributes43
	 * ConstraintCoexistenceQuantityRule.forFinancialInstrumentAttributes43}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes48> forFinancialInstrumentAttributes48 = new MMConstraint<FinancialInstrumentAttributes48>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forFinancialInstrumentAttributes43;
			owner_lazy = () -> FinancialInstrumentAttributes48.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes48 obj) throws Exception {
			checkFinancialInstrumentAttributes48(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42
	 * SecuritiesOption42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forSecuritiesOption35
	 * ConstraintCoexistenceQuantityRule.forSecuritiesOption35}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption42> forSecuritiesOption42 = new MMConstraint<SecuritiesOption42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forSecuritiesOption35;
			owner_lazy = () -> SecuritiesOption42.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption42 obj) throws Exception {
			checkSecuritiesOption42(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50
	 * FinancialInstrumentAttributes50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forFinancialInstrumentAttributes32
	 * ConstraintCoexistenceQuantityRule.forFinancialInstrumentAttributes32}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes50> forFinancialInstrumentAttributes50 = new MMConstraint<FinancialInstrumentAttributes50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forFinancialInstrumentAttributes32;
			owner_lazy = () -> FinancialInstrumentAttributes50.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes50 obj) throws Exception {
			checkFinancialInstrumentAttributes50(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat32Choice
	 * PriceFormat32Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forPriceFormat20Choice
	 * ConstraintCoexistenceQuantityRule.forPriceFormat20Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat32Choice> forPriceFormat32Choice = new MMConstraint<PriceFormat32Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forPriceFormat20Choice;
			owner_lazy = () -> PriceFormat32Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormat32Choice obj) throws Exception {
			checkPriceFormat32Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice
	 * PriceFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forPriceFormat7Choice
	 * ConstraintCoexistenceQuantityRule.forPriceFormat7Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat34Choice> forPriceFormat34Choice = new MMConstraint<PriceFormat34Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forPriceFormat7Choice;
			owner_lazy = () -> PriceFormat34Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormat34Choice obj) throws Exception {
			checkPriceFormat34Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49
	 * FinancialInstrumentAttributes49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forFinancialInstrumentAttributes34
	 * ConstraintCoexistenceQuantityRule.forFinancialInstrumentAttributes34}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes49> forFinancialInstrumentAttributes49 = new MMConstraint<FinancialInstrumentAttributes49>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forFinancialInstrumentAttributes34;
			owner_lazy = () -> FinancialInstrumentAttributes49.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes49 obj) throws Exception {
			checkFinancialInstrumentAttributes49(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40
	 * SecuritiesOption40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forSecuritiesOption38
	 * ConstraintCoexistenceQuantityRule.forSecuritiesOption38}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption40> forSecuritiesOption40 = new MMConstraint<SecuritiesOption40>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forSecuritiesOption38;
			owner_lazy = () -> SecuritiesOption40.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption40 obj) throws Exception {
			checkSecuritiesOption40(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9
	 * AdditionalInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forAdditionalInformation7
	 * ConstraintCoexistenceQuantityRule.forAdditionalInformation7}</li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalInformation9> forAdditionalInformation9 = new MMConstraint<AdditionalInformation9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forAdditionalInformation7;
			owner_lazy = () -> AdditionalInformation9.mmObject();
		}

		@Override
		public void executeValidator(AdditionalInformation9 obj) throws Exception {
			checkAdditionalInformation9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption108> forCorporateActionOption108 = new MMConstraint<CorporateActionOption108>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption108.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption108 obj) throws Exception {
			checkCorporateActionOption108(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107
	 * CorporateActionOption107}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption107> forCorporateActionOption107 = new MMConstraint<CorporateActionOption107>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption107.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption107 obj) throws Exception {
			checkCorporateActionOption107(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106
	 * CorporateActionOption106}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption106> forCorporateActionOption106 = new MMConstraint<CorporateActionOption106>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateActionOption106.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption106 obj) throws Exception {
			checkCorporateActionOption106(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17
	 * CorporateAction17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateAction17> forCorporateAction17 = new MMConstraint<CorporateAction17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> CorporateAction17.mmObject();
		}

		@Override
		public void executeValidator(CorporateAction17 obj) throws Exception {
			checkCorporateAction17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat43Choice
	 * PriceFormat43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat43Choice> forPriceFormat43Choice = new MMConstraint<PriceFormat43Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> PriceFormat43Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormat43Choice obj) throws Exception {
			checkPriceFormat43Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Quantity15Choice
	 * Quantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Quantity15Choice> forQuantity15Choice = new MMConstraint<Quantity15Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Quantity15Choice.mmObject();
		}

		@Override
		public void executeValidator(Quantity15Choice obj) throws Exception {
			checkQuantity15Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat5
	 * SignedQuantityFormat5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SignedQuantityFormat5> forSignedQuantityFormat5 = new MMConstraint<SignedQuantityFormat5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SignedQuantityFormat5.mmObject();
		}

		@Override
		public void executeValidator(SignedQuantityFormat5 obj) throws Exception {
			checkSignedQuantityFormat5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity6
	 * ProprietaryQuantity6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryQuantity6> forProprietaryQuantity6 = new MMConstraint<ProprietaryQuantity6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> ProprietaryQuantity6.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryQuantity6 obj) throws Exception {
			checkProprietaryQuantity6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Quantity16Choice
	 * Quantity16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Quantity16Choice> forQuantity16Choice = new MMConstraint<Quantity16Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> Quantity16Choice.mmObject();
		}

		@Override
		public void executeValidator(Quantity16Choice obj) throws Exception {
			checkQuantity16Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55
	 * FinancialInstrumentAttributes55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes55> forFinancialInstrumentAttributes55 = new MMConstraint<FinancialInstrumentAttributes55>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes55.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes55 obj) throws Exception {
			checkFinancialInstrumentAttributes55(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57
	 * FinancialInstrumentAttributes57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes57> forFinancialInstrumentAttributes57 = new MMConstraint<FinancialInstrumentAttributes57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes57.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes57 obj) throws Exception {
			checkFinancialInstrumentAttributes57(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat40Choice
	 * PriceFormat40Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat40Choice> forPriceFormat40Choice = new MMConstraint<PriceFormat40Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat40Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormat40Choice obj) throws Exception {
			checkPriceFormat40Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48
	 * SecuritiesOption48}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption48> forSecuritiesOption48 = new MMConstraint<SecuritiesOption48>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption48.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption48 obj) throws Exception {
			checkSecuritiesOption48(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat39Choice
	 * PriceFormat39Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormat39Choice> forPriceFormat39Choice = new MMConstraint<PriceFormat39Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> PriceFormat39Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormat39Choice obj) throws Exception {
			checkPriceFormat39Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56
	 * FinancialInstrumentAttributes56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes56> forFinancialInstrumentAttributes56 = new MMConstraint<FinancialInstrumentAttributes56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> FinancialInstrumentAttributes56.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes56 obj) throws Exception {
			checkFinancialInstrumentAttributes56(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45
	 * SecuritiesOption45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption45> forSecuritiesOption45 = new MMConstraint<SecuritiesOption45>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesOption45.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption45 obj) throws Exception {
			checkSecuritiesOption45(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22
	 * SecuritiesFinancingTransactionDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails22> forSecuritiesFinancingTransactionDetails22 = new MMConstraint<SecuritiesFinancingTransactionDetails22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails22.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingTransactionDetails22 obj) throws Exception {
			checkSecuritiesFinancingTransactionDetails22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66
	 * TransactionDetails66}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails66> forTransactionDetails66 = new MMConstraint<TransactionDetails66>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails66.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails66 obj) throws Exception {
			checkTransactionDetails66(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation10
	 * AdditionalInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AdditionalInformation10> forAdditionalInformation10 = new MMConstraint<AdditionalInformation10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> AdditionalInformation10.mmObject();
		}

		@Override
		public void executeValidator(AdditionalInformation10 obj) throws Exception {
			checkAdditionalInformation10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67
	 * TransactionDetails67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails67> forTransactionDetails67 = new MMConstraint<TransactionDetails67>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails67.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails67 obj) throws Exception {
			checkTransactionDetails67(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68
	 * TransactionDetails68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails68> forTransactionDetails68 = new MMConstraint<TransactionDetails68>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails68.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails68 obj) throws Exception {
			checkTransactionDetails68(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24
	 * SecuritiesFinancingTransactionDetails24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forSecuritiesFinancingTransactionDetails21
	 * ConstraintCoexistenceQuantityRule.
	 * forSecuritiesFinancingTransactionDetails21}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails24> forSecuritiesFinancingTransactionDetails24 = new MMConstraint<SecuritiesFinancingTransactionDetails24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forSecuritiesFinancingTransactionDetails21;
			owner_lazy = () -> SecuritiesFinancingTransactionDetails24.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingTransactionDetails24 obj) throws Exception {
			checkSecuritiesFinancingTransactionDetails24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70
	 * TransactionDetails70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forTransactionDetails61
	 * ConstraintCoexistenceQuantityRule.forTransactionDetails61}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails70> forTransactionDetails70 = new MMConstraint<TransactionDetails70>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forTransactionDetails61;
			owner_lazy = () -> TransactionDetails70.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails70 obj) throws Exception {
			checkTransactionDetails70(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69
	 * TransactionDetails69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forTransactionDetails62
	 * ConstraintCoexistenceQuantityRule.forTransactionDetails62}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails69> forTransactionDetails69 = new MMConstraint<TransactionDetails69>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forTransactionDetails62;
			owner_lazy = () -> TransactionDetails69.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails69 obj) throws Exception {
			checkTransactionDetails69(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71
	 * TransactionDetails71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails71> forTransactionDetails71 = new MMConstraint<TransactionDetails71>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails71.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails71 obj) throws Exception {
			checkTransactionDetails71(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25
	 * SecuritiesFinancingTransactionDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingTransactionDetails25> forSecuritiesFinancingTransactionDetails25 = new MMConstraint<SecuritiesFinancingTransactionDetails25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> SecuritiesFinancingTransactionDetails25.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesFinancingTransactionDetails25 obj) throws Exception {
			checkSecuritiesFinancingTransactionDetails25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72
	 * TransactionDetails72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails72> forTransactionDetails72 = new MMConstraint<TransactionDetails72>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			owner_lazy = () -> TransactionDetails72.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails72 obj) throws Exception {
			checkTransactionDetails72(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD2Choice
	 * PriceFormatSD2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceQuantityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forPriceFormatSD1Choice
	 * ConstraintCoexistenceQuantityRule.forPriceFormatSD1Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceFormatSD2Choice> forPriceFormatSD2Choice = new MMConstraint<PriceFormatSD2Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceQuantityRule";
			definition = "During ISO 15022 – 20022 coexistence, Quantity length must not be greater than 15, including the decimal point.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forPriceFormatSD1Choice;
			owner_lazy = () -> PriceFormatSD2Choice.mmObject();
		}

		@Override
		public void executeValidator(PriceFormatSD2Choice obj) throws Exception {
			checkPriceFormatSD2Choice(obj);
		}
	};

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails10(TransactionDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails29(TransactionDetails29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPairedOrTurnedQuantity1Choice(PairedOrTurnedQuantity1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkLinkages1(Linkages1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes8(FinancialInstrumentAttributes8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes20(FinancialInstrumentAttributes20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes35(FinancialInstrumentAttributes35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown3(QuantityBreakdown3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown13(QuantityBreakdown13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount29(QuantityAndAccount29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount30(QuantityAndAccount30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails28(TransactionDetails28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails31(TransactionDetails31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails44(TransactionDetails44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkPairedOrTurnedQuantity2Choice(PairedOrTurnedQuantity2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkLinkages4(Linkages4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes41(FinancialInstrumentAttributes41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown18(QuantityBreakdown18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount32(QuantityAndAccount32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount33(QuantityAndAccount33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes6(FinancialInstrumentAttributes6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSignedQuantityFormat2(SignedQuantityFormat2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantity4Choice(Quantity4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkProprietaryQuantity3(ProprietaryQuantity3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantity3Choice(Quantity3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkProprietaryQuantity2(ProprietaryQuantity2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantity2Choice(Quantity2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSignedQuantityFormat1(SignedQuantityFormat1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantity5Choice(Quantity5Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkInstructedOrQuantityToReceive1Choice(InstructedOrQuantityToReceive1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption2(SecuritiesOption2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountPricePerFinancialInstrumentQuantity3(AmountPricePerFinancialInstrumentQuantity3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat9Choice(PriceFormat9Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption5(CorporateActionOption5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkFinancialInstrumentAttributes9(FinancialInstrumentAttributes9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSignedQuantityFormat4(SignedQuantityFormat4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkQuantity9Choice(Quantity9Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkProprietaryQuantity5(ProprietaryQuantity5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkQuantity8Choice(Quantity8Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkProprietaryQuantity4(ProprietaryQuantity4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkQuantity7Choice(Quantity7Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSignedQuantityFormat3(SignedQuantityFormat3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkQuantity11Choice(Quantity11Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkInstructedOrQuantityToReceive2Choice(InstructedOrQuantityToReceive2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSecuritiesOption7(SecuritiesOption7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkAmountPricePerFinancialInstrumentQuantity4(AmountPricePerFinancialInstrumentQuantity4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkPriceFormat18Choice(PriceFormat18Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkCorporateActionOption13(CorporateActionOption13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes18(FinancialInstrumentAttributes18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat21Choice(PriceFormat21Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption25(CorporateActionOption25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes22(FinancialInstrumentAttributes22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat24Choice(PriceFormat24Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption30(CorporateActionOption30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes32(FinancialInstrumentAttributes32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption38(CorporateActionOption38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes38(FinancialInstrumentAttributes38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption47(CorporateActionOption47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption57(CorporateActionOption57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption58(CorporateActionOption58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkStatusOrQuantityToReceive1Choice(StatusOrQuantityToReceive1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkStatusOrQuantityToReceive2Choice(StatusOrQuantityToReceive2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat7Choice(PriceFormat7Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat3Choice(RatioFormat3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountAndQuantityRatio2(AmountAndQuantityRatio2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat4Choice(RatioFormat4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption3(SecuritiesOption3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkPriceFormat13Choice(PriceFormat13Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRatioFormat7Choice(RatioFormat7Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkAmountAndQuantityRatio3(AmountAndQuantityRatio3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRatioFormat8Choice(RatioFormat8Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSecuritiesOption8(SecuritiesOption8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption18(SecuritiesOption18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption20(SecuritiesOption20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat15Choice(RatioFormat15Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption26(SecuritiesOption26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat16Choice(RatioFormat16Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption31(SecuritiesOption31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption35(SecuritiesOption35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption36(SecuritiesOption36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes7(FinancialInstrumentAttributes7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSolicitationFeeRateFormat1Choice(SolicitationFeeRateFormat1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption1(SecuritiesOption1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes5(FinancialInstrumentAttributes5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat5Choice(RatioFormat5Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat6Choice(RatioFormat6Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption4(SecuritiesOption4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat10Choice(PriceFormat10Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption10(CorporateActionOption10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkFinancialInstrumentAttributes11(FinancialInstrumentAttributes11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSolicitationFeeRateFormat2Choice(SolicitationFeeRateFormat2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSecuritiesOption9(SecuritiesOption9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkFinancialInstrumentAttributes10(FinancialInstrumentAttributes10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRatioFormat9Choice(RatioFormat9Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkRatioFormat10Choice(RatioFormat10Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSecuritiesOption10(SecuritiesOption10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkPriceFormat14Choice(PriceFormat14Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkCorporateActionOption15(CorporateActionOption15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes19(FinancialInstrumentAttributes19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat20Choice(PriceFormat20Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption15(SecuritiesOption15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes16(FinancialInstrumentAttributes16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat11Choice(RatioFormat11Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat12Choice(RatioFormat12Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption13(SecuritiesOption13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSolicitationFeeRateFormat3Choice(SolicitationFeeRateFormat3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat22Choice(PriceFormat22Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption20(CorporateActionOption20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes23(FinancialInstrumentAttributes23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat26Choice(PriceFormat26Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption16(SecuritiesOption16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes24(FinancialInstrumentAttributes24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat13Choice(RatioFormat13Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkRatioFormat14Choice(RatioFormat14Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption17(SecuritiesOption17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSolicitationFeeRateFormat4Choice(SolicitationFeeRateFormat4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat28Choice(PriceFormat28Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption32(CorporateActionOption32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes33(FinancialInstrumentAttributes33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption23(SecuritiesOption23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes34(FinancialInstrumentAttributes34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption24(SecuritiesOption24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption35(CorporateActionOption35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes39(FinancialInstrumentAttributes39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption28(SecuritiesOption28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes40(FinancialInstrumentAttributes40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption29(SecuritiesOption29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption44(CorporateActionOption44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes43(FinancialInstrumentAttributes43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption33(SecuritiesOption33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption38(SecuritiesOption38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSolicitationFeeRateFormat5Choice(SolicitationFeeRateFormat5Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption52(CorporateActionOption52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes45(FinancialInstrumentAttributes45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption37(SecuritiesOption37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption39(SecuritiesOption39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSolicitationFeeRateFormat6Choice(SolicitationFeeRateFormat6Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption55(CorporateActionOption55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption5(SecuritiesOption5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSecuritiesOption11(SecuritiesOption11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption19(SecuritiesOption19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption21(SecuritiesOption21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption27(SecuritiesOption27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption32(SecuritiesOption32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes3(FinancialInstrumentAttributes3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionQuantity1(CorporateActionQuantity1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateAction3(CorporateAction3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption6(SecuritiesOption6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption3(CorporateActionOption3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkFinancialInstrumentAttributes12(FinancialInstrumentAttributes12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkCorporateActionQuantity2(CorporateActionQuantity2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkCorporateAction4(CorporateAction4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSecuritiesOption12(SecuritiesOption12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkCorporateActionOption17(CorporateActionOption17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes17(FinancialInstrumentAttributes17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionQuantity3(CorporateActionQuantity3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateAction5(CorporateAction5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption14(SecuritiesOption14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption19(CorporateActionOption19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes25(FinancialInstrumentAttributes25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionQuantity4(CorporateActionQuantity4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateAction6(CorporateAction6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption22(SecuritiesOption22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption34(CorporateActionOption34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionQuantity5(CorporateActionQuantity5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateAction7(CorporateAction7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption25(SecuritiesOption25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption36(CorporateActionOption36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionQuantity6(CorporateActionQuantity6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateAction8(CorporateAction8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption30(SecuritiesOption30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption45(CorporateActionOption45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes46(FinancialInstrumentAttributes46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateAction10(CorporateAction10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption51(CorporateActionOption51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes47(FinancialInstrumentAttributes47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateAction11(CorporateAction11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption56(CorporateActionOption56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormatSD1Choice(PriceFormatSD1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown5(QuantityBreakdown5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes4(FinancialInstrumentAttributes4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionDetails2(IntraPositionDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkQuantityBreakdown6(QuantityBreakdown6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkFinancialInstrumentAttributes13(FinancialInstrumentAttributes13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkIntraPositionDetails8(IntraPositionDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes21(FinancialInstrumentAttributes21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionDetails12(IntraPositionDetails12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes26(FinancialInstrumentAttributes26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionDetails13(IntraPositionDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown15(QuantityBreakdown15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes36(FinancialInstrumentAttributes36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown9(QuantityBreakdown9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown12(QuantityBreakdown12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionDetails22(IntraPositionDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown20(QuantityBreakdown20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes42(FinancialInstrumentAttributes42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown17(QuantityBreakdown17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionDetails26(IntraPositionDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionDetails27(IntraPositionDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionDetails29(IntraPositionDetails29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionMovementDetails1(IntraPositionMovementDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkIntraPositionMovementDetails2(IntraPositionMovementDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionMovementDetails5(IntraPositionMovementDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes27(FinancialInstrumentAttributes27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkIntraPositionMovementDetails6(IntraPositionMovementDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionMovementDetails7(IntraPositionMovementDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionMovementDetails8(IntraPositionMovementDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionMovementDetails9(IntraPositionMovementDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionMovementDetails10(IntraPositionMovementDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkBalanceQuantity4Choice(BalanceQuantity4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkBalance1(Balance1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown4(QuantityBreakdown4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSubBalanceQuantity3Choice(SubBalanceQuantity3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAdditionalBalanceInformation6(AdditionalBalanceInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSubBalanceInformation6(SubBalanceInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkFinancialInstrumentAttributes14(FinancialInstrumentAttributes14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkBalanceQuantity6Choice(BalanceQuantity6Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkBalance2(Balance2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkQuantityBreakdown8(QuantityBreakdown8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSubBalanceQuantity4Choice(SubBalanceQuantity4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkAdditionalBalanceInformation7(AdditionalBalanceInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSubBalanceInformation7(SubBalanceInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes30(FinancialInstrumentAttributes30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown14(QuantityBreakdown14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown19(QuantityBreakdown19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkBalance4(Balance4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown24(QuantityBreakdown24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkBalance5(Balance5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown25(QuantityBreakdown25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkBalanceQuantity5Choice(BalanceQuantity5Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAdditionalBalanceInformation5(AdditionalBalanceInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSubBalanceInformation5(SubBalanceInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkBalanceQuantity7Choice(BalanceQuantity7Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkQuantityBreakdown7(QuantityBreakdown7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkAdditionalBalanceInformation8(AdditionalBalanceInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSubBalanceInformation8(SubBalanceInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAdditionalBalanceInformation9(AdditionalBalanceInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSubBalanceInformation9(SubBalanceInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAdditionalBalanceInformation10(AdditionalBalanceInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSubBalanceInformation10(SubBalanceInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown23(QuantityBreakdown23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAdditionalBalanceInformation11(AdditionalBalanceInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSubBalanceInformation11(SubBalanceInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown26(QuantityBreakdown26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAdditionalBalanceInformation12(AdditionalBalanceInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSubBalanceInformation12(SubBalanceInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount6(QuantityAndAccount6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkQuantityAndAccount11(QuantityAndAccount11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount18(QuantityAndAccount18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes28(FinancialInstrumentAttributes28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount19(QuantityAndAccount19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount1(QuantityAndAccount1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkQuantityAndAccount5(QuantityAndAccount5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkLinkages9(Linkages9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount17(QuantityAndAccount17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkLinkages14(Linkages14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount24(QuantityAndAccount24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkLinkages17(Linkages17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount25(QuantityAndAccount25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkLinkages24(Linkages24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount34(QuantityAndAccount34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAdditionalInformation3(AdditionalInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkAdditionalInformation4(AdditionalInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAdditionalInformation7(AdditionalInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAdditionalInformation8(AdditionalInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount2(QuantityAndAccount2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkQuantityAndAccount12(QuantityAndAccount12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount15(QuantityAndAccount15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown10(QuantityBreakdown10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount20(QuantityAndAccount20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown16(QuantityBreakdown16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount28(QuantityAndAccount28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown21(QuantityBreakdown21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount37(QuantityAndAccount37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkLinkages7(Linkages7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkLinkages12(Linkages12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails5(TransactionDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkTransactionDetails9(TransactionDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails22(TransactionDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails23(TransactionDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails36(TransactionDetails36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails47(TransactionDetails47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails53(TransactionDetails53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails58(TransactionDetails58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails7(TransactionDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails8(TransactionDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkTransactionDetails16(TransactionDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkTransactionDetails17(TransactionDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails26(TransactionDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails25(TransactionDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails27(TransactionDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails33(TransactionDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails39(TransactionDetails39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails50(TransactionDetails50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails56(TransactionDetails56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails59(TransactionDetails59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails6(TransactionDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkTransactionDetails18(TransactionDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails24(TransactionDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails34(TransactionDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails37(TransactionDetails37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails48(TransactionDetails48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails57(TransactionDetails57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails60(TransactionDetails60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionDetails1(IntraPositionDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionDetails11(IntraPositionDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionDetails4(IntraPositionDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionDetails9(IntraPositionDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantity5(Quantity5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount7(QuantityAndAccount7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount16(QuantityAndAccount16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails2(SecuritiesFinancingTransactionDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails8(SecuritiesFinancingTransactionDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount3(QuantityAndAccount3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes15(FinancialInstrumentAttributes15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount13(QuantityAndAccount13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount8(QuantityAndAccount8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount14(QuantityAndAccount14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails4(TransactionDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails30(TransactionDetails30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkQuantityAndAccount10(QuantityAndAccount10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount21(QuantityAndAccount21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSecuritiesFinancingTransactionDetails6(SecuritiesFinancingTransactionDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails10(SecuritiesFinancingTransactionDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails17(SecuritiesFinancingTransactionDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails18(SecuritiesFinancingTransactionDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkTransactionDetails20(TransactionDetails20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkQuantityAndAccount4(QuantityAndAccount4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes29(FinancialInstrumentAttributes29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount22(QuantityAndAccount22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount27(QuantityAndAccount27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount36(QuantityAndAccount36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkQuantityAndAccount9(QuantityAndAccount9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount23(QuantityAndAccount23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount26(QuantityAndAccount26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityAndAccount35(QuantityAndAccount35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails40(TransactionDetails40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails42(TransactionDetails42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails46(TransactionDetails46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails32(TransactionDetails32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkTransactionDetails14(TransactionDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails35(TransactionDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkIntraPositionDetails7(IntraPositionDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionDetails16(IntraPositionDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionDetails21(IntraPositionDetails21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionDetails25(IntraPositionDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkIntraPositionDetails5(IntraPositionDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionDetails15(IntraPositionDetails15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionDetails19(IntraPositionDetails19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionDetails23(IntraPositionDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkQuantity6(Quantity6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantity7(Quantity7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantity8(Quantity8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails45(TransactionDetails45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionMovementDetails3(IntraPositionMovementDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPositionMovementDetails4(IntraPositionMovementDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantityBreakdown22(QuantityBreakdown22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAmountPricePerFinancialInstrumentQuantity5(AmountPricePerFinancialInstrumentQuantity5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails51(TransactionDetails51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkIntraPosition4(IntraPosition4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails52(TransactionDetails52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails61(TransactionDetails61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails21(SecuritiesFinancingTransactionDetails21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails62(TransactionDetails62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails63(TransactionDetails63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption103(CorporateActionOption103 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption100(CorporateActionOption100 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption101(CorporateActionOption101 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateAction12(CorporateAction12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat33Choice(PriceFormat33Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes48(FinancialInstrumentAttributes48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption42(SecuritiesOption42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes50(FinancialInstrumentAttributes50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat32Choice(PriceFormat32Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat34Choice(PriceFormat34Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes49(FinancialInstrumentAttributes49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption40(SecuritiesOption40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAdditionalInformation9(AdditionalInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption108(CorporateActionOption108 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption107(CorporateActionOption107 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateActionOption106(CorporateActionOption106 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkCorporateAction17(CorporateAction17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkPriceFormat43Choice(PriceFormat43Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantity15Choice(Quantity15Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSignedQuantityFormat5(SignedQuantityFormat5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkProprietaryQuantity6(ProprietaryQuantity6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkQuantity16Choice(Quantity16Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes55(FinancialInstrumentAttributes55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes57(FinancialInstrumentAttributes57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat40Choice(PriceFormat40Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption48(SecuritiesOption48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormat39Choice(PriceFormat39Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkFinancialInstrumentAttributes56(FinancialInstrumentAttributes56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesOption45(SecuritiesOption45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails22(SecuritiesFinancingTransactionDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails66(TransactionDetails66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkAdditionalInformation10(AdditionalInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails67(TransactionDetails67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails68(TransactionDetails68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails24(SecuritiesFinancingTransactionDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails70(TransactionDetails70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails69(TransactionDetails69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails71(TransactionDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkSecuritiesFinancingTransactionDetails25(SecuritiesFinancingTransactionDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkTransactionDetails72(TransactionDetails72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Quantity length must not be greater
	 * than 15, including the decimal point.
	 */
	public static void checkPriceFormatSD2Choice(PriceFormatSD2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}