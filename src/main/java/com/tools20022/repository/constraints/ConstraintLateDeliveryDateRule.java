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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25
	 * SecuritiesTradeDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
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
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails32);
			owner_lazy = () -> SecuritiesTradeDetails25.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
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
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails34);
			owner_lazy = () -> SecuritiesTradeDetails26.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails27> forSecuritiesTradeDetails27 = new MMConstraint<SecuritiesTradeDetails27>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails27.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails28> forSecuritiesTradeDetails28 = new MMConstraint<SecuritiesTradeDetails28>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails28.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
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
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails33);
			owner_lazy = () -> SecuritiesTradeDetails1.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails15> forSecuritiesTradeDetails15 = new MMConstraint<SecuritiesTradeDetails15>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails15.mmObject();
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
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails7> forTransactionDetails7 = new MMConstraint<TransactionDetails7>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails7.mmObject();
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
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails8> forTransactionDetails8 = new MMConstraint<TransactionDetails8>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails8.mmObject();
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
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails16> forTransactionDetails16 = new MMConstraint<TransactionDetails16>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails16.mmObject();
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
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails17> forTransactionDetails17 = new MMConstraint<TransactionDetails17>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails17.mmObject();
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
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails26> forTransactionDetails26 = new MMConstraint<TransactionDetails26>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails26.mmObject();
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
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails25> forTransactionDetails25 = new MMConstraint<TransactionDetails25>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails25.mmObject();
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
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails27> forTransactionDetails27 = new MMConstraint<TransactionDetails27>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails27.mmObject();
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
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails33> forTransactionDetails33 = new MMConstraint<TransactionDetails33>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails33.mmObject();
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
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails39> forTransactionDetails39 = new MMConstraint<TransactionDetails39>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails39.mmObject();
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
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails50> forTransactionDetails50 = new MMConstraint<TransactionDetails50>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails50;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails50.mmObject();
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
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
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
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forTransactionDetails62);
			owner_lazy = () -> TransactionDetails56.mmObject();
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
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails59> forTransactionDetails59 = new MMConstraint<TransactionDetails59>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails59;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails59.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails8> forSecuritiesTradeDetails8 = new MMConstraint<SecuritiesTradeDetails8>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails8.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
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
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails36);
			owner_lazy = () -> SecuritiesTradeDetails18.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails4> forSecuritiesTradeDetails4 = new MMConstraint<SecuritiesTradeDetails4>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails4.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails17> forSecuritiesTradeDetails17 = new MMConstraint<SecuritiesTradeDetails17>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails17.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails9> forSecuritiesTradeDetails9 = new MMConstraint<SecuritiesTradeDetails9>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails9.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails21> forSecuritiesTradeDetails21 = new MMConstraint<SecuritiesTradeDetails21>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails21.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails10> forSecuritiesTradeDetails10 = new MMConstraint<SecuritiesTradeDetails10>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails10.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails22> forSecuritiesTradeDetails22 = new MMConstraint<SecuritiesTradeDetails22>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails22.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
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
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails35);
			owner_lazy = () -> SecuritiesTradeDetails23.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails29> forSecuritiesTradeDetails29 = new MMConstraint<SecuritiesTradeDetails29>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails29.mmObject();
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
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
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
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails62;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forTransactionDetails69);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forTransactionDetails56;
			owner_lazy = () -> TransactionDetails62.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
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
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails51);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails1;
			owner_lazy = () -> SecuritiesTradeDetails33.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
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
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails49);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails23;
			owner_lazy = () -> SecuritiesTradeDetails35.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
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
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails54);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails18;
			owner_lazy = () -> SecuritiesTradeDetails36.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
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
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails52);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails26;
			owner_lazy = () -> SecuritiesTradeDetails34.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
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
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails50);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails25;
			owner_lazy = () -> SecuritiesTradeDetails32.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails44> forSecuritiesTradeDetails44 = new MMConstraint<SecuritiesTradeDetails44>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails44.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails41> forSecuritiesTradeDetails41 = new MMConstraint<SecuritiesTradeDetails41>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails41;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails41.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails42> forSecuritiesTradeDetails42 = new MMConstraint<SecuritiesTradeDetails42>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails42;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails42.mmObject();
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
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails67> forTransactionDetails67 = new MMConstraint<TransactionDetails67>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails67.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails46> forSecuritiesTradeDetails46 = new MMConstraint<SecuritiesTradeDetails46>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails46;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails46.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails47> forSecuritiesTradeDetails47 = new MMConstraint<SecuritiesTradeDetails47>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails47.mmObject();
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
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
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
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails69;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forTransactionDetails75);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forTransactionDetails62;
			owner_lazy = () -> TransactionDetails69.mmObject();
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
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails72> forTransactionDetails72 = new MMConstraint<TransactionDetails72>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails72;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails72.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
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
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails49;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails68);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails35;
			owner_lazy = () -> SecuritiesTradeDetails49.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
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
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails75;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forTransactionDetails96);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forTransactionDetails69;
			owner_lazy = () -> TransactionDetails75.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails67
	 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails67}</li>
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
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails67);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails33;
			owner_lazy = () -> SecuritiesTradeDetails51.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
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
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails54;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails36;
			owner_lazy = () -> SecuritiesTradeDetails54.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
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
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails52;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails34;
			owner_lazy = () -> SecuritiesTradeDetails52.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
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
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails50;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails32;
			owner_lazy = () -> SecuritiesTradeDetails50.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails61> forSecuritiesTradeDetails61 = new MMConstraint<SecuritiesTradeDetails61>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails61;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails61.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails63> forSecuritiesTradeDetails63 = new MMConstraint<SecuritiesTradeDetails63>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails63;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails63.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails60> forSecuritiesTradeDetails60 = new MMConstraint<SecuritiesTradeDetails60>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails60;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails60.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails90> forTransactionDetails90 = new MMConstraint<TransactionDetails90>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails90;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails90.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails65> forSecuritiesTradeDetails65 = new MMConstraint<SecuritiesTradeDetails65>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails65;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails65.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails66> forSecuritiesTradeDetails66 = new MMConstraint<SecuritiesTradeDetails66>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails66;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails66.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is present, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
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
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is present, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails51;
			owner_lazy = () -> SecuritiesTradeDetails67.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is present then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
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
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails68;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is present then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails49;
			owner_lazy = () -> SecuritiesTradeDetails68.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is present then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
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
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails96;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is present then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forTransactionDetails75;
			owner_lazy = () -> TransactionDetails96.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails69> forSecuritiesTradeDetails69 = new MMConstraint<SecuritiesTradeDetails69>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails69;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails69.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails70> forSecuritiesTradeDetails70 = new MMConstraint<SecuritiesTradeDetails70>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkSecuritiesTradeDetails70;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> SecuritiesTradeDetails70.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails99> forTransactionDetails99 = new MMConstraint<TransactionDetails99>() {
		{
			validator = ConstraintLateDeliveryDateRule::checkTransactionDetails99;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDateRule";
			definition = "If LateDeliveryDate is used, then the transaction must be a pool trades that result from the original TBA (To Be Announced). The original TBA would be offset by an opposite transaction and replaced by buys or sells of individual pools. It is a date greater than the settlement date stated in the trade, for pools designed as settling late.";
			owner_lazy = () -> TransactionDetails99.mmObject();
		}
	};

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
	public static void checkTransactionDetails7(TransactionDetails7 obj) throws Exception {
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
	public static void checkTransactionDetails90(TransactionDetails90 obj) throws Exception {
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
	public static void checkSecuritiesTradeDetails66(SecuritiesTradeDetails66 obj) throws Exception {
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
	public static void checkTransactionDetails99(TransactionDetails99 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}