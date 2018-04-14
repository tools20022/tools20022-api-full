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
 * If LateDeliveryDate is used, then the transaction must be a pool trades that
 * result from the original TBA (To Be Announced). The original TBA would be
 * offset by an opposite transaction and replaced by buys or sells of individual
 * pools. It is a date greater than the settlement date stated in the trade, for
 * pools designed as settling late.
 */
public class ConstraintLateDeliveryDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26
	 * TransactionDetails26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails26> forTransactionDetails26 = new MMConstraint<TransactionDetails26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73
	 * SecuritiesTradeDetails73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails51
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails51}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails73> forSecuritiesTradeDetails73 = new MMConstraint<SecuritiesTradeDetails73>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails51;
			owner_lazy = () -> SecuritiesTradeDetails73.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails73 obj) throws Exception {
			checkSecuritiesTradeDetails73(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails88
	 * SecuritiesTradeDetails88}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails88> forSecuritiesTradeDetails88 = new MMConstraint<SecuritiesTradeDetails88>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails88.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails88 obj) throws Exception {
			checkSecuritiesTradeDetails88(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90
	 * TransactionDetails90}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails90> forTransactionDetails90 = new MMConstraint<TransactionDetails90>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails90.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails90 obj) throws Exception {
			checkTransactionDetails90(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71
	 * SecuritiesTradeDetails71}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is present then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails68
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails68}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails71> forSecuritiesTradeDetails71 = new MMConstraint<SecuritiesTradeDetails71>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is present then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails68;
			owner_lazy = () -> SecuritiesTradeDetails71.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails71 obj) throws Exception {
			checkSecuritiesTradeDetails71(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96
	 * TransactionDetails96}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is present then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forTransactionDetails104
	 * ConstraintLateDeliveryDateRule.forTransactionDetails104}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forTransactionDetails75
	 * ConstraintLateDeliveryDateRule.forTransactionDetails75}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails96> forTransactionDetails96 = new MMConstraint<TransactionDetails96>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is present then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forTransactionDetails104);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forTransactionDetails75;
			owner_lazy = () -> TransactionDetails96.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails96 obj) throws Exception {
			checkTransactionDetails96(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67
	 * SecuritiesTradeDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is present, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails75
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails75}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails51
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails51}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails67> forSecuritiesTradeDetails67 = new MMConstraint<SecuritiesTradeDetails67>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is present, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails75);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails51;
			owner_lazy = () -> SecuritiesTradeDetails67.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails67 obj) throws Exception {
			checkSecuritiesTradeDetails67(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails8> forTransactionDetails8 = new MMConstraint<TransactionDetails8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104
	 * TransactionDetails104}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is present then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forTransactionDetails96
	 * ConstraintLateDeliveryDateRule.forTransactionDetails96}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails104> forTransactionDetails104 = new MMConstraint<TransactionDetails104>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is present then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forTransactionDetails96;
			owner_lazy = () -> TransactionDetails104.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails104 obj) throws Exception {
			checkTransactionDetails104(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42
	 * SecuritiesTradeDetails42}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails42> forSecuritiesTradeDetails42 = new MMConstraint<SecuritiesTradeDetails42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails42.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails42 obj) throws Exception {
			checkSecuritiesTradeDetails42(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65
	 * SecuritiesTradeDetails65}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails65> forSecuritiesTradeDetails65 = new MMConstraint<SecuritiesTradeDetails65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails65.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails65 obj) throws Exception {
			checkSecuritiesTradeDetails65(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26
	 * SecuritiesTradeDetails26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails34
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails34}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails26> forSecuritiesTradeDetails26 = new MMConstraint<SecuritiesTradeDetails26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails34);
			owner_lazy = () -> SecuritiesTradeDetails26.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails26 obj) throws Exception {
			checkSecuritiesTradeDetails26(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails27> forTransactionDetails27 = new MMConstraint<TransactionDetails27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22
	 * SecuritiesTradeDetails22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails22> forSecuritiesTradeDetails22 = new MMConstraint<SecuritiesTradeDetails22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails22.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails22 obj) throws Exception {
			checkSecuritiesTradeDetails22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47
	 * SecuritiesTradeDetails47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails47> forSecuritiesTradeDetails47 = new MMConstraint<SecuritiesTradeDetails47>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails47.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails47 obj) throws Exception {
			checkSecuritiesTradeDetails47(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails25> forTransactionDetails25 = new MMConstraint<TransactionDetails25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72
	 * TransactionDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails72> forTransactionDetails72 = new MMConstraint<TransactionDetails72>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36
	 * SecuritiesTradeDetails36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails54
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails54}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails18
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails18}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails36> forSecuritiesTradeDetails36 = new MMConstraint<SecuritiesTradeDetails36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails54);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails18;
			owner_lazy = () -> SecuritiesTradeDetails36.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails36 obj) throws Exception {
			checkSecuritiesTradeDetails36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails111
	 * TransactionDetails111}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails111> forTransactionDetails111 = new MMConstraint<TransactionDetails111>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails111.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails111 obj) throws Exception {
			checkTransactionDetails111(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34
	 * SecuritiesTradeDetails34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails52
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails52}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails26
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails26}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails34> forSecuritiesTradeDetails34 = new MMConstraint<SecuritiesTradeDetails34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails52);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails26;
			owner_lazy = () -> SecuritiesTradeDetails34.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails34 obj) throws Exception {
			checkSecuritiesTradeDetails34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails87
	 * SecuritiesTradeDetails87}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails87> forSecuritiesTradeDetails87 = new MMConstraint<SecuritiesTradeDetails87>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails87.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails87 obj) throws Exception {
			checkSecuritiesTradeDetails87(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails84
	 * SecuritiesTradeDetails84}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails84> forSecuritiesTradeDetails84 = new MMConstraint<SecuritiesTradeDetails84>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails84.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails84 obj) throws Exception {
			checkSecuritiesTradeDetails84(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68
	 * SecuritiesTradeDetails68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is present then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails71
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails71}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails49
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails49}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails68> forSecuritiesTradeDetails68 = new MMConstraint<SecuritiesTradeDetails68>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is present then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails71);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails49;
			owner_lazy = () -> SecuritiesTradeDetails68.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails68 obj) throws Exception {
			checkSecuritiesTradeDetails68(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51
	 * SecuritiesTradeDetails51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails67
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails67}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails73
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails73}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails33
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails33}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails51> forSecuritiesTradeDetails51 = new MMConstraint<SecuritiesTradeDetails51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails67,
					com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails73);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails33;
			owner_lazy = () -> SecuritiesTradeDetails51.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails51 obj) throws Exception {
			checkSecuritiesTradeDetails51(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85
	 * SecuritiesTradeDetails85}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails85> forSecuritiesTradeDetails85 = new MMConstraint<SecuritiesTradeDetails85>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails85.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails85 obj) throws Exception {
			checkSecuritiesTradeDetails85(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails16> forTransactionDetails16 = new MMConstraint<TransactionDetails16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69
	 * SecuritiesTradeDetails69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails69> forSecuritiesTradeDetails69 = new MMConstraint<SecuritiesTradeDetails69>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails69.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails69 obj) throws Exception {
			checkSecuritiesTradeDetails69(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25
	 * SecuritiesTradeDetails25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails32
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails32}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails25> forSecuritiesTradeDetails25 = new MMConstraint<SecuritiesTradeDetails25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails32);
			owner_lazy = () -> SecuritiesTradeDetails25.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails25 obj) throws Exception {
			checkSecuritiesTradeDetails25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4
	 * SecuritiesTradeDetails4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails4> forSecuritiesTradeDetails4 = new MMConstraint<SecuritiesTradeDetails4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails4.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails4 obj) throws Exception {
			checkSecuritiesTradeDetails4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23
	 * SecuritiesTradeDetails23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails35
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails35}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails23> forSecuritiesTradeDetails23 = new MMConstraint<SecuritiesTradeDetails23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails35);
			owner_lazy = () -> SecuritiesTradeDetails23.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails23 obj) throws Exception {
			checkSecuritiesTradeDetails23(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails17> forTransactionDetails17 = new MMConstraint<TransactionDetails17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8
	 * SecuritiesTradeDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails8> forSecuritiesTradeDetails8 = new MMConstraint<SecuritiesTradeDetails8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails8.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails8 obj) throws Exception {
			checkSecuritiesTradeDetails8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66
	 * SecuritiesTradeDetails66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails66> forSecuritiesTradeDetails66 = new MMConstraint<SecuritiesTradeDetails66>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails66.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails66 obj) throws Exception {
			checkSecuritiesTradeDetails66(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15
	 * SecuritiesTradeDetails15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails15> forSecuritiesTradeDetails15 = new MMConstraint<SecuritiesTradeDetails15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails15.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails15 obj) throws Exception {
			checkSecuritiesTradeDetails15(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails33> forTransactionDetails33 = new MMConstraint<TransactionDetails33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50
	 * SecuritiesTradeDetails50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails78
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails78}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails32
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails32}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails50> forSecuritiesTradeDetails50 = new MMConstraint<SecuritiesTradeDetails50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails78);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails32;
			owner_lazy = () -> SecuritiesTradeDetails50.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails50 obj) throws Exception {
			checkSecuritiesTradeDetails50(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44
	 * SecuritiesTradeDetails44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails44> forSecuritiesTradeDetails44 = new MMConstraint<SecuritiesTradeDetails44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails44.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails44 obj) throws Exception {
			checkSecuritiesTradeDetails44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46
	 * SecuritiesTradeDetails46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails46> forSecuritiesTradeDetails46 = new MMConstraint<SecuritiesTradeDetails46>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails46.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails46 obj) throws Exception {
			checkSecuritiesTradeDetails46(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49
	 * SecuritiesTradeDetails49}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails68
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails68}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails35
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails35}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails49> forSecuritiesTradeDetails49 = new MMConstraint<SecuritiesTradeDetails49>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails68);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails35;
			owner_lazy = () -> SecuritiesTradeDetails49.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails49 obj) throws Exception {
			checkSecuritiesTradeDetails49(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52
	 * SecuritiesTradeDetails52}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails79
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails79}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails34
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails34}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails52> forSecuritiesTradeDetails52 = new MMConstraint<SecuritiesTradeDetails52>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails79);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails34;
			owner_lazy = () -> SecuritiesTradeDetails52.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails52 obj) throws Exception {
			checkSecuritiesTradeDetails52(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails89
	 * SecuritiesTradeDetails89}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails89> forSecuritiesTradeDetails89 = new MMConstraint<SecuritiesTradeDetails89>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails89.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails89 obj) throws Exception {
			checkSecuritiesTradeDetails89(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1
	 * SecuritiesTradeDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails33
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails33}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails1> forSecuritiesTradeDetails1 = new MMConstraint<SecuritiesTradeDetails1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails33);
			owner_lazy = () -> SecuritiesTradeDetails1.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails1 obj) throws Exception {
			checkSecuritiesTradeDetails1(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails59> forTransactionDetails59 = new MMConstraint<TransactionDetails59>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99
	 * TransactionDetails99}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails99> forTransactionDetails99 = new MMConstraint<TransactionDetails99>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails99.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails99 obj) throws Exception {
			checkTransactionDetails99(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9
	 * SecuritiesTradeDetails9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails9> forSecuritiesTradeDetails9 = new MMConstraint<SecuritiesTradeDetails9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails9.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails9 obj) throws Exception {
			checkSecuritiesTradeDetails9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54
	 * SecuritiesTradeDetails54}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails80
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails80}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails36
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails36}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails54> forSecuritiesTradeDetails54 = new MMConstraint<SecuritiesTradeDetails54>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails80);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails36;
			owner_lazy = () -> SecuritiesTradeDetails54.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails54 obj) throws Exception {
			checkSecuritiesTradeDetails54(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79
	 * SecuritiesTradeDetails79}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails52
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails52}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails79> forSecuritiesTradeDetails79 = new MMConstraint<SecuritiesTradeDetails79>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails52;
			owner_lazy = () -> SecuritiesTradeDetails79.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails79 obj) throws Exception {
			checkSecuritiesTradeDetails79(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails7> forTransactionDetails7 = new MMConstraint<TransactionDetails7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75
	 * SecuritiesTradeDetails75}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is present, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails67
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails67}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails75> forSecuritiesTradeDetails75 = new MMConstraint<SecuritiesTradeDetails75>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is present, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails67;
			owner_lazy = () -> SecuritiesTradeDetails75.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails75 obj) throws Exception {
			checkSecuritiesTradeDetails75(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails80
	 * SecuritiesTradeDetails80}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails54
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails54}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails80> forSecuritiesTradeDetails80 = new MMConstraint<SecuritiesTradeDetails80>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails54;
			owner_lazy = () -> SecuritiesTradeDetails80.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails80 obj) throws Exception {
			checkSecuritiesTradeDetails80(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29
	 * SecuritiesTradeDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails29> forSecuritiesTradeDetails29 = new MMConstraint<SecuritiesTradeDetails29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails29.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails29 obj) throws Exception {
			checkSecuritiesTradeDetails29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10
	 * SecuritiesTradeDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails10> forSecuritiesTradeDetails10 = new MMConstraint<SecuritiesTradeDetails10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails10.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails10 obj) throws Exception {
			checkSecuritiesTradeDetails10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails63> forSecuritiesTradeDetails63 = new MMConstraint<SecuritiesTradeDetails63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails63.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails63 obj) throws Exception {
			checkSecuritiesTradeDetails63(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails39> forTransactionDetails39 = new MMConstraint<TransactionDetails39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61
	 * SecuritiesTradeDetails61}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails61> forSecuritiesTradeDetails61 = new MMConstraint<SecuritiesTradeDetails61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails61.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails61 obj) throws Exception {
			checkSecuritiesTradeDetails61(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forTransactionDetails62
	 * ConstraintLateDeliveryDateRule.forTransactionDetails62}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails56> forTransactionDetails56 = new MMConstraint<TransactionDetails56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forTransactionDetails62);
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70
	 * SecuritiesTradeDetails70}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails70> forSecuritiesTradeDetails70 = new MMConstraint<SecuritiesTradeDetails70>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails70.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails70 obj) throws Exception {
			checkSecuritiesTradeDetails70(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78
	 * SecuritiesTradeDetails78}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails50
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails50}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails78> forSecuritiesTradeDetails78 = new MMConstraint<SecuritiesTradeDetails78>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails50;
			owner_lazy = () -> SecuritiesTradeDetails78.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails78 obj) throws Exception {
			checkSecuritiesTradeDetails78(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27
	 * SecuritiesTradeDetails27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails27> forSecuritiesTradeDetails27 = new MMConstraint<SecuritiesTradeDetails27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails27.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails27 obj) throws Exception {
			checkSecuritiesTradeDetails27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28
	 * SecuritiesTradeDetails28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails28> forSecuritiesTradeDetails28 = new MMConstraint<SecuritiesTradeDetails28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails28.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails28 obj) throws Exception {
			checkSecuritiesTradeDetails28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17
	 * SecuritiesTradeDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails17> forSecuritiesTradeDetails17 = new MMConstraint<SecuritiesTradeDetails17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails17.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails17 obj) throws Exception {
			checkSecuritiesTradeDetails17(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails67> forTransactionDetails67 = new MMConstraint<TransactionDetails67>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41
	 * SecuritiesTradeDetails41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails41> forSecuritiesTradeDetails41 = new MMConstraint<SecuritiesTradeDetails41>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails41.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails41 obj) throws Exception {
			checkSecuritiesTradeDetails41(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18
	 * SecuritiesTradeDetails18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails36
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails36}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails18> forSecuritiesTradeDetails18 = new MMConstraint<SecuritiesTradeDetails18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails36);
			owner_lazy = () -> SecuritiesTradeDetails18.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails18 obj) throws Exception {
			checkSecuritiesTradeDetails18(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails50> forTransactionDetails50 = new MMConstraint<TransactionDetails50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21
	 * SecuritiesTradeDetails21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails21> forSecuritiesTradeDetails21 = new MMConstraint<SecuritiesTradeDetails21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails21.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails21 obj) throws Exception {
			checkSecuritiesTradeDetails21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35
	 * SecuritiesTradeDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails49
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails49}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails23
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails23}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails35> forSecuritiesTradeDetails35 = new MMConstraint<SecuritiesTradeDetails35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails49);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails23;
			owner_lazy = () -> SecuritiesTradeDetails35.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails35 obj) throws Exception {
			checkSecuritiesTradeDetails35(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forTransactionDetails69
	 * ConstraintLateDeliveryDateRule.forTransactionDetails69}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forTransactionDetails56
	 * ConstraintLateDeliveryDateRule.forTransactionDetails56}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails62> forTransactionDetails62 = new MMConstraint<TransactionDetails62>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forTransactionDetails69);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forTransactionDetails56;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails51
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails51}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails1
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails1}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails33> forSecuritiesTradeDetails33 = new MMConstraint<SecuritiesTradeDetails33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails51);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails1;
			owner_lazy = () -> SecuritiesTradeDetails33.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails33 obj) throws Exception {
			checkSecuritiesTradeDetails33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75
	 * TransactionDetails75}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forTransactionDetails96
	 * ConstraintLateDeliveryDateRule.forTransactionDetails96}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forTransactionDetails69
	 * ConstraintLateDeliveryDateRule.forTransactionDetails69}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails75> forTransactionDetails75 = new MMConstraint<TransactionDetails75>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forTransactionDetails96);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forTransactionDetails69;
			owner_lazy = () -> TransactionDetails75.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails75 obj) throws Exception {
			checkTransactionDetails75(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32
	 * SecuritiesTradeDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails50
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails50}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails25
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails25}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails32> forSecuritiesTradeDetails32 = new MMConstraint<SecuritiesTradeDetails32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails50);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails25;
			owner_lazy = () -> SecuritiesTradeDetails32.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails32 obj) throws Exception {
			checkSecuritiesTradeDetails32(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forTransactionDetails75
	 * ConstraintLateDeliveryDateRule.forTransactionDetails75}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forTransactionDetails62
	 * ConstraintLateDeliveryDateRule.forTransactionDetails62}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails69> forTransactionDetails69 = new MMConstraint<TransactionDetails69>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forTransactionDetails75);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forTransactionDetails62;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60
	 * SecuritiesTradeDetails60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails60> forSecuritiesTradeDetails60 = new MMConstraint<SecuritiesTradeDetails60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails60.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails60 obj) throws Exception {
			checkSecuritiesTradeDetails60(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails90
	 * SecuritiesTradeDetails90}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails90> forSecuritiesTradeDetails90 = new MMConstraint<SecuritiesTradeDetails90>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails90.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails90 obj) throws Exception {
			checkSecuritiesTradeDetails90(obj);
		}
	};

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails26(TransactionDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails73(SecuritiesTradeDetails73 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails88(SecuritiesTradeDetails88 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails90(TransactionDetails90 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is present then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails71(SecuritiesTradeDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is present then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails96(TransactionDetails96 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is present, then the transaction must be a pool
	 * trades that result from the original TBA (To Be Announced). The original
	 * TBA would be offset by an opposite transaction and replaced by buys or
	 * sells of individual pools. It is a date greater than the settlement date
	 * stated in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails67(SecuritiesTradeDetails67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails8(TransactionDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is present then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails104(TransactionDetails104 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails42(SecuritiesTradeDetails42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails65(SecuritiesTradeDetails65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails26(SecuritiesTradeDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails27(TransactionDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails22(SecuritiesTradeDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails47(SecuritiesTradeDetails47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails25(TransactionDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails72(TransactionDetails72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails36(SecuritiesTradeDetails36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails111(TransactionDetails111 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails34(SecuritiesTradeDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails87(SecuritiesTradeDetails87 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails84(SecuritiesTradeDetails84 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is present then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails68(SecuritiesTradeDetails68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails51(SecuritiesTradeDetails51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails85(SecuritiesTradeDetails85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails16(TransactionDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails69(SecuritiesTradeDetails69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails25(SecuritiesTradeDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails4(SecuritiesTradeDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails23(SecuritiesTradeDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails17(TransactionDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails8(SecuritiesTradeDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails66(SecuritiesTradeDetails66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails15(SecuritiesTradeDetails15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails33(TransactionDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails50(SecuritiesTradeDetails50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails44(SecuritiesTradeDetails44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails46(SecuritiesTradeDetails46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails49(SecuritiesTradeDetails49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails52(SecuritiesTradeDetails52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails89(SecuritiesTradeDetails89 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails1(SecuritiesTradeDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails59(TransactionDetails59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails99(TransactionDetails99 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails9(SecuritiesTradeDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails54(SecuritiesTradeDetails54 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails79(SecuritiesTradeDetails79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails7(TransactionDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is present, then the transaction must be a pool
	 * trades that result from the original TBA (To Be Announced). The original
	 * TBA would be offset by an opposite transaction and replaced by buys or
	 * sells of individual pools. It is a date greater than the settlement date
	 * stated in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails75(SecuritiesTradeDetails75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails80(SecuritiesTradeDetails80 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails29(SecuritiesTradeDetails29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails10(SecuritiesTradeDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails63(SecuritiesTradeDetails63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails39(TransactionDetails39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails61(SecuritiesTradeDetails61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails56(TransactionDetails56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails70(SecuritiesTradeDetails70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails78(SecuritiesTradeDetails78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails27(SecuritiesTradeDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails28(SecuritiesTradeDetails28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails17(SecuritiesTradeDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails67(TransactionDetails67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails41(SecuritiesTradeDetails41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails18(SecuritiesTradeDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails50(TransactionDetails50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails21(SecuritiesTradeDetails21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails35(SecuritiesTradeDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails62(TransactionDetails62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails33(SecuritiesTradeDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails75(TransactionDetails75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails32(SecuritiesTradeDetails32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkTransactionDetails69(TransactionDetails69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails60(SecuritiesTradeDetails60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If LateDeliveryDate is used, then the transaction must be a pool trades
	 * that result from the original TBA (To Be Announced). The original TBA
	 * would be offset by an opposite transaction and replaced by buys or sells
	 * of individual pools. It is a date greater than the settlement date stated
	 * in the trade, for pools designed as settling late.
	 */
	public static void checkSecuritiesTradeDetails90(SecuritiesTradeDetails90 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}