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
 * If Investor is used with a country code, then the country code specifies the
 * nationality of the investor, for example for the settlement of certain
 * securities (that is airlines, defence manufacturers) under the EU
 * legislation.
 */
public class ConstraintInvestorCountryCodeRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties6 OtherParties6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties6> forOtherParties6 = new MMConstraint<OtherParties6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties6.mmObject();
		}

		@Override
		public void executeValidator(OtherParties6 obj) throws Exception {
			checkOtherParties6(obj);
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
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails5> forTransactionDetails5 = new MMConstraint<TransactionDetails5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
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
	 * {@linkplain com.tools20022.repository.msg.OtherParties12 OtherParties12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties12> forOtherParties12 = new MMConstraint<OtherParties12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties12.mmObject();
		}

		@Override
		public void executeValidator(OtherParties12 obj) throws Exception {
			checkOtherParties12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties13 OtherParties13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties13> forOtherParties13 = new MMConstraint<OtherParties13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties13.mmObject();
		}

		@Override
		public void executeValidator(OtherParties13 obj) throws Exception {
			checkOtherParties13(obj);
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
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails66> forTransactionDetails66 = new MMConstraint<TransactionDetails66>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
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
	 * {@linkplain com.tools20022.repository.msg.OtherParties5 OtherParties5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties5> forOtherParties5 = new MMConstraint<OtherParties5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties5.mmObject();
		}

		@Override
		public void executeValidator(OtherParties5 obj) throws Exception {
			checkOtherParties5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties30 OtherParties30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forOtherParties26
	 * ConstraintInvestorCountryCodeRule.forOtherParties26}</li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties30> forOtherParties30 = new MMConstraint<OtherParties30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forOtherParties26;
			owner_lazy = () -> OtherParties30.mmObject();
		}

		@Override
		public void executeValidator(OtherParties30 obj) throws Exception {
			checkOtherParties30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105
	 * TransactionDetails105}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is present with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forTransactionDetails97
	 * ConstraintInvestorCountryCodeRule.forTransactionDetails97}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails105> forTransactionDetails105 = new MMConstraint<TransactionDetails105>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is present with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forTransactionDetails97;
			owner_lazy = () -> TransactionDetails105.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails105 obj) throws Exception {
			checkTransactionDetails105(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties7 OtherParties7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties7> forOtherParties7 = new MMConstraint<OtherParties7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties7.mmObject();
		}

		@Override
		public void executeValidator(OtherParties7 obj) throws Exception {
			checkOtherParties7(obj);
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
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails58> forTransactionDetails58 = new MMConstraint<TransactionDetails58>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
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
	 * {@linkplain com.tools20022.repository.msg.OtherParties26 OtherParties26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forOtherParties30
	 * ConstraintInvestorCountryCodeRule.forOtherParties30}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forOtherParties10
	 * ConstraintInvestorCountryCodeRule.forOtherParties10}</li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties26> forOtherParties26 = new MMConstraint<OtherParties26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forOtherParties30);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forOtherParties10;
			owner_lazy = () -> OtherParties26.mmObject();
		}

		@Override
		public void executeValidator(OtherParties26 obj) throws Exception {
			checkOtherParties26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties29 OtherParties29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties29> forOtherParties29 = new MMConstraint<OtherParties29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties29.mmObject();
		}

		@Override
		public void executeValidator(OtherParties29 obj) throws Exception {
			checkOtherParties29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties15 OtherParties15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties15> forOtherParties15 = new MMConstraint<OtherParties15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties15.mmObject();
		}

		@Override
		public void executeValidator(OtherParties15 obj) throws Exception {
			checkOtherParties15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails110
	 * TransactionDetails110}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails110> forTransactionDetails110 = new MMConstraint<TransactionDetails110>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> TransactionDetails110.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails110 obj) throws Exception {
			checkTransactionDetails110(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties24 OtherParties24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties24> forOtherParties24 = new MMConstraint<OtherParties24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties24.mmObject();
		}

		@Override
		public void executeValidator(OtherParties24 obj) throws Exception {
			checkOtherParties24(obj);
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
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forTransactionDetails79
	 * ConstraintInvestorCountryCodeRule.forTransactionDetails79}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forTransactionDetails61
	 * ConstraintInvestorCountryCodeRule.forTransactionDetails61}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails70> forTransactionDetails70 = new MMConstraint<TransactionDetails70>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forTransactionDetails79);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forTransactionDetails61;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23
	 * TransactionDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails23> forTransactionDetails23 = new MMConstraint<TransactionDetails23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71
	 * TransactionDetails71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails71> forTransactionDetails71 = new MMConstraint<TransactionDetails71>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100
	 * TransactionDetails100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails100> forTransactionDetails100 = new MMConstraint<TransactionDetails100>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> TransactionDetails100.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails100 obj) throws Exception {
			checkTransactionDetails100(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties16 OtherParties16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties16> forOtherParties16 = new MMConstraint<OtherParties16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties16.mmObject();
		}

		@Override
		public void executeValidator(OtherParties16 obj) throws Exception {
			checkOtherParties16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties9 OtherParties9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties9> forOtherParties9 = new MMConstraint<OtherParties9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties9.mmObject();
		}

		@Override
		public void executeValidator(OtherParties9 obj) throws Exception {
			checkOtherParties9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties8 OtherParties8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties8> forOtherParties8 = new MMConstraint<OtherParties8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties8.mmObject();
		}

		@Override
		public void executeValidator(OtherParties8 obj) throws Exception {
			checkOtherParties8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties31 OtherParties31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forOtherParties28
	 * ConstraintInvestorCountryCodeRule.forOtherParties28}</li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties31> forOtherParties31 = new MMConstraint<OtherParties31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forOtherParties28;
			owner_lazy = () -> OtherParties31.mmObject();
		}

		@Override
		public void executeValidator(OtherParties31 obj) throws Exception {
			checkOtherParties31(obj);
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
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forTransactionDetails70
	 * ConstraintInvestorCountryCodeRule.forTransactionDetails70}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forTransactionDetails53
	 * ConstraintInvestorCountryCodeRule.forTransactionDetails53}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails61> forTransactionDetails61 = new MMConstraint<TransactionDetails61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forTransactionDetails70);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forTransactionDetails53;
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
	 * {@linkplain com.tools20022.repository.msg.OtherParties28 OtherParties28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forOtherParties31
	 * ConstraintInvestorCountryCodeRule.forOtherParties31}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forOtherParties11
	 * ConstraintInvestorCountryCodeRule.forOtherParties11}</li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties28> forOtherParties28 = new MMConstraint<OtherParties28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forOtherParties31);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forOtherParties11;
			owner_lazy = () -> OtherParties28.mmObject();
		}

		@Override
		public void executeValidator(OtherParties28 obj) throws Exception {
			checkOtherParties28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties17 OtherParties17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties17> forOtherParties17 = new MMConstraint<OtherParties17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties17.mmObject();
		}

		@Override
		public void executeValidator(OtherParties17 obj) throws Exception {
			checkOtherParties17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties19 OtherParties19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forOtherParties27
	 * ConstraintInvestorCountryCodeRule.forOtherParties27}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties19> forOtherParties19 = new MMConstraint<OtherParties19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forOtherParties27);
			owner_lazy = () -> OtherParties19.mmObject();
		}

		@Override
		public void executeValidator(OtherParties19 obj) throws Exception {
			checkOtherParties19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties4 OtherParties4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties4> forOtherParties4 = new MMConstraint<OtherParties4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties4.mmObject();
		}

		@Override
		public void executeValidator(OtherParties4 obj) throws Exception {
			checkOtherParties4(obj);
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
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forTransactionDetails61
	 * ConstraintInvestorCountryCodeRule.forTransactionDetails61}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails53> forTransactionDetails53 = new MMConstraint<TransactionDetails53>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forTransactionDetails61);
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97
	 * TransactionDetails97}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is present with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forTransactionDetails105
	 * ConstraintInvestorCountryCodeRule.forTransactionDetails105}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forTransactionDetails79
	 * ConstraintInvestorCountryCodeRule.forTransactionDetails79}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails97> forTransactionDetails97 = new MMConstraint<TransactionDetails97>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is present with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forTransactionDetails105);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forTransactionDetails79;
			owner_lazy = () -> TransactionDetails97.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails97 obj) throws Exception {
			checkTransactionDetails97(obj);
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
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails47> forTransactionDetails47 = new MMConstraint<TransactionDetails47>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22
	 * TransactionDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails22> forTransactionDetails22 = new MMConstraint<TransactionDetails22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
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
	 * {@linkplain com.tools20022.repository.msg.OtherParties27 OtherParties27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forOtherParties19
	 * ConstraintInvestorCountryCodeRule.forOtherParties19}</li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties27> forOtherParties27 = new MMConstraint<OtherParties27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forOtherParties19;
			owner_lazy = () -> OtherParties27.mmObject();
		}

		@Override
		public void executeValidator(OtherParties27 obj) throws Exception {
			checkOtherParties27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79
	 * TransactionDetails79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forTransactionDetails97
	 * ConstraintInvestorCountryCodeRule.forTransactionDetails97}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forTransactionDetails70
	 * ConstraintInvestorCountryCodeRule.forTransactionDetails70}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails79> forTransactionDetails79 = new MMConstraint<TransactionDetails79>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forTransactionDetails97);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forTransactionDetails70;
			owner_lazy = () -> TransactionDetails79.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails79 obj) throws Exception {
			checkTransactionDetails79(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties10 OtherParties10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forOtherParties26
	 * ConstraintInvestorCountryCodeRule.forOtherParties26}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties10> forOtherParties10 = new MMConstraint<OtherParties10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forOtherParties26);
			owner_lazy = () -> OtherParties10.mmObject();
		}

		@Override
		public void executeValidator(OtherParties10 obj) throws Exception {
			checkOtherParties10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties3 OtherParties3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties3> forOtherParties3 = new MMConstraint<OtherParties3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties3.mmObject();
		}

		@Override
		public void executeValidator(OtherParties3 obj) throws Exception {
			checkOtherParties3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties11 OtherParties11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forOtherParties28
	 * ConstraintInvestorCountryCodeRule.forOtherParties28}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties11> forOtherParties11 = new MMConstraint<OtherParties11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forOtherParties28);
			owner_lazy = () -> OtherParties11.mmObject();
		}

		@Override
		public void executeValidator(OtherParties11 obj) throws Exception {
			checkOtherParties11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties14 OtherParties14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties14> forOtherParties14 = new MMConstraint<OtherParties14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties14.mmObject();
		}

		@Override
		public void executeValidator(OtherParties14 obj) throws Exception {
			checkOtherParties14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties2 OtherParties2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OtherParties2> forOtherParties2 = new MMConstraint<OtherParties2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> OtherParties2.mmObject();
		}

		@Override
		public void executeValidator(OtherParties2 obj) throws Exception {
			checkOtherParties2(obj);
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
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails36> forTransactionDetails36 = new MMConstraint<TransactionDetails36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87
	 * TransactionDetails87}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails87> forTransactionDetails87 = new MMConstraint<TransactionDetails87>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> TransactionDetails87.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails87 obj) throws Exception {
			checkTransactionDetails87(obj);
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
	 * name} = "InvestorCountryCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails9> forTransactionDetails9 = new MMConstraint<TransactionDetails9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCountryCodeRule";
			definition = "If Investor is used with a country code, then the country code specifies the nationality of the investor, for example for the settlement of certain securities (that is airlines, defence manufacturers) under the EU legislation.";
			owner_lazy = () -> TransactionDetails9.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails9 obj) throws Exception {
			checkTransactionDetails9(obj);
		}
	};

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties6(OtherParties6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkTransactionDetails5(TransactionDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties12(OtherParties12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties13(OtherParties13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkTransactionDetails66(TransactionDetails66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties5(OtherParties5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties30(OtherParties30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is present with a country code, then the country code
	 * specifies the nationality of the investor, for example for the settlement
	 * of certain securities (that is airlines, defence manufacturers) under the
	 * EU legislation.
	 */
	public static void checkTransactionDetails105(TransactionDetails105 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties7(OtherParties7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkTransactionDetails58(TransactionDetails58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties26(OtherParties26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties29(OtherParties29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties15(OtherParties15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkTransactionDetails110(TransactionDetails110 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties24(OtherParties24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkTransactionDetails70(TransactionDetails70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkTransactionDetails23(TransactionDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkTransactionDetails71(TransactionDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkTransactionDetails100(TransactionDetails100 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties16(OtherParties16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties9(OtherParties9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties8(OtherParties8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties31(OtherParties31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkTransactionDetails61(TransactionDetails61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties28(OtherParties28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties17(OtherParties17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties19(OtherParties19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties4(OtherParties4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkTransactionDetails53(TransactionDetails53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is present with a country code, then the country code
	 * specifies the nationality of the investor, for example for the settlement
	 * of certain securities (that is airlines, defence manufacturers) under the
	 * EU legislation.
	 */
	public static void checkTransactionDetails97(TransactionDetails97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkTransactionDetails47(TransactionDetails47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkTransactionDetails22(TransactionDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties27(OtherParties27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkTransactionDetails79(TransactionDetails79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties10(OtherParties10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties3(OtherParties3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties11(OtherParties11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties14(OtherParties14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkOtherParties2(OtherParties2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkTransactionDetails36(TransactionDetails36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkTransactionDetails87(TransactionDetails87 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Investor is used with a country code, then the country code specifies
	 * the nationality of the investor, for example for the settlement of
	 * certain securities (that is airlines, defence manufacturers) under the EU
	 * legislation.
	 */
	public static void checkTransactionDetails9(TransactionDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}