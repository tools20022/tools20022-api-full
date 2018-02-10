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
 * In a delivery, the receiving depository is to be understood as the requested
 * depository of the receiving counterparty. <br>
 * In a receive, the delivering depository is to be understood as the requested
 * depository of the delivering counterparty.<br>
 * The field must be populated with the BIC of a national or international CSD.
 * When no CSD exists in a particular market, the stock exchange BIC will be
 * used.<br>
 * Country code should be used for settlement taking place outside of an
 * institution published in the PSET's BIC list. This includes physical
 * deliveries and investment funds not settling at a CSD. <br>
 * The format and content of the settlement party sequences will comply with the
 * market practices published for the counterparty depository included in the
 * message.<br>
 * For more details, see the relevant market practice document on www.smpg.info.
 */
public class ConstraintDepositoryGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties5
	 * SettlementParties5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties5> forSettlementParties5 = new MMConstraint<SettlementParties5>() {
		{
			validator = ConstraintDepositoryGuideline::checkSettlementParties5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties11
	 * SettlementParties11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties11> forSettlementParties11 = new MMConstraint<SettlementParties11>() {
		{
			validator = ConstraintDepositoryGuideline::checkSettlementParties11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties26
	 * SettlementParties26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties26> forSettlementParties26 = new MMConstraint<SettlementParties26>() {
		{
			validator = ConstraintDepositoryGuideline::checkSettlementParties26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties18
	 * SettlementParties18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties18> forSettlementParties18 = new MMConstraint<SettlementParties18>() {
		{
			validator = ConstraintDepositoryGuideline::checkSettlementParties18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties27
	 * SettlementParties27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties27> forSettlementParties27 = new MMConstraint<SettlementParties27>() {
		{
			validator = ConstraintDepositoryGuideline::checkSettlementParties27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties7
	 * SettlementParties7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties7> forSettlementParties7 = new MMConstraint<SettlementParties7>() {
		{
			validator = ConstraintDepositoryGuideline::checkSettlementParties7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties10
	 * SettlementParties10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forSettlementParties36
	 * ConstraintDepositoryGuideline.forSettlementParties36}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties10> forSettlementParties10 = new MMConstraint<SettlementParties10>() {
		{
			validator = ConstraintDepositoryGuideline::checkSettlementParties10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forSettlementParties36);
			owner_lazy = () -> SettlementParties10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties17
	 * SettlementParties17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties17> forSettlementParties17 = new MMConstraint<SettlementParties17>() {
		{
			validator = ConstraintDepositoryGuideline::checkSettlementParties17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23
	 * SettlementParties23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties23> forSettlementParties23 = new MMConstraint<SettlementParties23>() {
		{
			validator = ConstraintDepositoryGuideline::checkSettlementParties23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties14
	 * SettlementParties14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties14> forSettlementParties14 = new MMConstraint<SettlementParties14>() {
		{
			validator = ConstraintDepositoryGuideline::checkSettlementParties14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties20
	 * SettlementParties20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties20> forSettlementParties20 = new MMConstraint<SettlementParties20>() {
		{
			validator = ConstraintDepositoryGuideline::checkSettlementParties20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount7
	 * DeliveringPartiesAndAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forDeliveringPartiesAndAccount10
	 * ConstraintDepositoryGuideline.forDeliveringPartiesAndAccount10}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forDeliveringPartiesAndAccount11
	 * ConstraintDepositoryGuideline.forDeliveringPartiesAndAccount11}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount7> forDeliveringPartiesAndAccount7 = new MMConstraint<DeliveringPartiesAndAccount7>() {
		{
			validator = ConstraintDepositoryGuideline::checkDeliveringPartiesAndAccount7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forDeliveringPartiesAndAccount10,
					com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forDeliveringPartiesAndAccount11);
			owner_lazy = () -> DeliveringPartiesAndAccount7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount7
	 * ReceivingPartiesAndAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forReceivingPartiesAndAccount10
	 * ConstraintDepositoryGuideline.forReceivingPartiesAndAccount10}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forReceivingPartiesAndAccount11
	 * ConstraintDepositoryGuideline.forReceivingPartiesAndAccount11}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount7> forReceivingPartiesAndAccount7 = new MMConstraint<ReceivingPartiesAndAccount7>() {
		{
			validator = ConstraintDepositoryGuideline::checkReceivingPartiesAndAccount7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forReceivingPartiesAndAccount10,
					com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forReceivingPartiesAndAccount11);
			owner_lazy = () -> ReceivingPartiesAndAccount7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount10
	 * DeliveringPartiesAndAccount10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forDeliveringPartiesAndAccount15
	 * ConstraintDepositoryGuideline.forDeliveringPartiesAndAccount15}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forDeliveringPartiesAndAccount7
	 * ConstraintDepositoryGuideline.forDeliveringPartiesAndAccount7}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount10> forDeliveringPartiesAndAccount10 = new MMConstraint<DeliveringPartiesAndAccount10>() {
		{
			validator = ConstraintDepositoryGuideline::checkDeliveringPartiesAndAccount10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forDeliveringPartiesAndAccount15);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forDeliveringPartiesAndAccount7;
			owner_lazy = () -> DeliveringPartiesAndAccount10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount10
	 * ReceivingPartiesAndAccount10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forReceivingPartiesAndAccount15
	 * ConstraintDepositoryGuideline.forReceivingPartiesAndAccount15}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forReceivingPartiesAndAccount7
	 * ConstraintDepositoryGuideline.forReceivingPartiesAndAccount7}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount10> forReceivingPartiesAndAccount10 = new MMConstraint<ReceivingPartiesAndAccount10>() {
		{
			validator = ConstraintDepositoryGuideline::checkReceivingPartiesAndAccount10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forReceivingPartiesAndAccount15);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forReceivingPartiesAndAccount7;
			owner_lazy = () -> ReceivingPartiesAndAccount10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount11
	 * ReceivingPartiesAndAccount11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forReceivingPartiesAndAccount7
	 * ConstraintDepositoryGuideline.forReceivingPartiesAndAccount7}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount11> forReceivingPartiesAndAccount11 = new MMConstraint<ReceivingPartiesAndAccount11>() {
		{
			validator = ConstraintDepositoryGuideline::checkReceivingPartiesAndAccount11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forReceivingPartiesAndAccount7;
			owner_lazy = () -> ReceivingPartiesAndAccount11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount11
	 * DeliveringPartiesAndAccount11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forDeliveringPartiesAndAccount7
	 * ConstraintDepositoryGuideline.forDeliveringPartiesAndAccount7}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount11> forDeliveringPartiesAndAccount11 = new MMConstraint<DeliveringPartiesAndAccount11>() {
		{
			validator = ConstraintDepositoryGuideline::checkDeliveringPartiesAndAccount11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forDeliveringPartiesAndAccount7;
			owner_lazy = () -> DeliveringPartiesAndAccount11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36
	 * SettlementParties36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forSettlementParties62
	 * ConstraintDepositoryGuideline.forSettlementParties62}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forSettlementParties10
	 * ConstraintDepositoryGuideline.forSettlementParties10}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties36> forSettlementParties36 = new MMConstraint<SettlementParties36>() {
		{
			validator = ConstraintDepositoryGuideline::checkSettlementParties36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forSettlementParties62);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forSettlementParties10;
			owner_lazy = () -> SettlementParties36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount15
	 * ReceivingPartiesAndAccount15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forReceivingPartiesAndAccount10
	 * ConstraintDepositoryGuideline.forReceivingPartiesAndAccount10}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount15> forReceivingPartiesAndAccount15 = new MMConstraint<ReceivingPartiesAndAccount15>() {
		{
			validator = ConstraintDepositoryGuideline::checkReceivingPartiesAndAccount15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forReceivingPartiesAndAccount10;
			owner_lazy = () -> ReceivingPartiesAndAccount15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount15
	 * DeliveringPartiesAndAccount15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forDeliveringPartiesAndAccount10
	 * ConstraintDepositoryGuideline.forDeliveringPartiesAndAccount10}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount15> forDeliveringPartiesAndAccount15 = new MMConstraint<DeliveringPartiesAndAccount15>() {
		{
			validator = ConstraintDepositoryGuideline::checkDeliveringPartiesAndAccount15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forDeliveringPartiesAndAccount10;
			owner_lazy = () -> DeliveringPartiesAndAccount15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties44
	 * SettlementParties44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties44> forSettlementParties44 = new MMConstraint<SettlementParties44>() {
		{
			validator = ConstraintDepositoryGuideline::checkSettlementParties44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties44.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties62
	 * SettlementParties62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forSettlementParties36
	 * ConstraintDepositoryGuideline.forSettlementParties36}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties62> forSettlementParties62 = new MMConstraint<SettlementParties62>() {
		{
			validator = ConstraintDepositoryGuideline::checkSettlementParties62;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forSettlementParties36;
			owner_lazy = () -> SettlementParties62.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties64
	 * SettlementParties64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties64> forSettlementParties64 = new MMConstraint<SettlementParties64>() {
		{
			validator = ConstraintDepositoryGuideline::checkSettlementParties64;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryGuideline";
			definition = "In a delivery, the receiving depository is to be understood as the requested depository of the receiving counterparty. \r\nIn a receive, the delivering depository is to be understood as the requested depository of the delivering counterparty.\r\nThe field must be populated with the BIC of a national or international CSD. When no CSD exists in a particular market, the stock exchange BIC will be used.\r\nCountry code should be used for settlement taking place outside of an institution published in the PSET's BIC list. This includes physical deliveries and investment funds not settling at a CSD. \r\nThe format and content of the settlement party sequences will comply with the market practices published for the counterparty depository included in the message.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties64.mmObject();
		}
	};

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.<br>
	 * Country code should be used for settlement taking place outside of an
	 * institution published in the PSET's BIC list. This includes physical
	 * deliveries and investment funds not settling at a CSD. <br>
	 * The format and content of the settlement party sequences will comply with
	 * the market practices published for the counterparty depository included
	 * in the message.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties5(SettlementParties5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.<br>
	 * Country code should be used for settlement taking place outside of an
	 * institution published in the PSET's BIC list. This includes physical
	 * deliveries and investment funds not settling at a CSD. <br>
	 * The format and content of the settlement party sequences will comply with
	 * the market practices published for the counterparty depository included
	 * in the message.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties11(SettlementParties11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.<br>
	 * Country code should be used for settlement taking place outside of an
	 * institution published in the PSET's BIC list. This includes physical
	 * deliveries and investment funds not settling at a CSD. <br>
	 * The format and content of the settlement party sequences will comply with
	 * the market practices published for the counterparty depository included
	 * in the message.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties26(SettlementParties26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.<br>
	 * Country code should be used for settlement taking place outside of an
	 * institution published in the PSET's BIC list. This includes physical
	 * deliveries and investment funds not settling at a CSD. <br>
	 * The format and content of the settlement party sequences will comply with
	 * the market practices published for the counterparty depository included
	 * in the message.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties18(SettlementParties18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.<br>
	 * Country code should be used for settlement taking place outside of an
	 * institution published in the PSET's BIC list. This includes physical
	 * deliveries and investment funds not settling at a CSD. <br>
	 * The format and content of the settlement party sequences will comply with
	 * the market practices published for the counterparty depository included
	 * in the message.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties27(SettlementParties27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.<br>
	 * Country code should be used for settlement taking place outside of an
	 * institution published in the PSET's BIC list. This includes physical
	 * deliveries and investment funds not settling at a CSD. <br>
	 * The format and content of the settlement party sequences will comply with
	 * the market practices published for the counterparty depository included
	 * in the message.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties7(SettlementParties7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.<br>
	 * Country code should be used for settlement taking place outside of an
	 * institution published in the PSET's BIC list. This includes physical
	 * deliveries and investment funds not settling at a CSD. <br>
	 * The format and content of the settlement party sequences will comply with
	 * the market practices published for the counterparty depository included
	 * in the message.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties10(SettlementParties10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.<br>
	 * Country code should be used for settlement taking place outside of an
	 * institution published in the PSET's BIC list. This includes physical
	 * deliveries and investment funds not settling at a CSD. <br>
	 * The format and content of the settlement party sequences will comply with
	 * the market practices published for the counterparty depository included
	 * in the message.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties17(SettlementParties17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.<br>
	 * Country code should be used for settlement taking place outside of an
	 * institution published in the PSET's BIC list. This includes physical
	 * deliveries and investment funds not settling at a CSD. <br>
	 * The format and content of the settlement party sequences will comply with
	 * the market practices published for the counterparty depository included
	 * in the message.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties23(SettlementParties23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.<br>
	 * Country code should be used for settlement taking place outside of an
	 * institution published in the PSET's BIC list. This includes physical
	 * deliveries and investment funds not settling at a CSD. <br>
	 * The format and content of the settlement party sequences will comply with
	 * the market practices published for the counterparty depository included
	 * in the message.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties14(SettlementParties14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.<br>
	 * Country code should be used for settlement taking place outside of an
	 * institution published in the PSET's BIC list. This includes physical
	 * deliveries and investment funds not settling at a CSD. <br>
	 * The format and content of the settlement party sequences will comply with
	 * the market practices published for the counterparty depository included
	 * in the message.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties20(SettlementParties20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.
	 */
	public static void checkDeliveringPartiesAndAccount7(DeliveringPartiesAndAccount7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.
	 */
	public static void checkReceivingPartiesAndAccount7(ReceivingPartiesAndAccount7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.
	 */
	public static void checkDeliveringPartiesAndAccount10(DeliveringPartiesAndAccount10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.
	 */
	public static void checkReceivingPartiesAndAccount10(ReceivingPartiesAndAccount10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.
	 */
	public static void checkReceivingPartiesAndAccount11(ReceivingPartiesAndAccount11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.
	 */
	public static void checkDeliveringPartiesAndAccount11(DeliveringPartiesAndAccount11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.<br>
	 * Country code should be used for settlement taking place outside of an
	 * institution published in the PSET's BIC list. This includes physical
	 * deliveries and investment funds not settling at a CSD. <br>
	 * The format and content of the settlement party sequences will comply with
	 * the market practices published for the counterparty depository included
	 * in the message.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties36(SettlementParties36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.
	 */
	public static void checkReceivingPartiesAndAccount15(ReceivingPartiesAndAccount15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.
	 */
	public static void checkDeliveringPartiesAndAccount15(DeliveringPartiesAndAccount15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.<br>
	 * Country code should be used for settlement taking place outside of an
	 * institution published in the PSET's BIC list. This includes physical
	 * deliveries and investment funds not settling at a CSD. <br>
	 * The format and content of the settlement party sequences will comply with
	 * the market practices published for the counterparty depository included
	 * in the message.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties44(SettlementParties44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.<br>
	 * Country code should be used for settlement taking place outside of an
	 * institution published in the PSET's BIC list. This includes physical
	 * deliveries and investment funds not settling at a CSD. <br>
	 * The format and content of the settlement party sequences will comply with
	 * the market practices published for the counterparty depository included
	 * in the message.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties62(SettlementParties62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In a delivery, the receiving depository is to be understood as the
	 * requested depository of the receiving counterparty. <br>
	 * In a receive, the delivering depository is to be understood as the
	 * requested depository of the delivering counterparty.<br>
	 * The field must be populated with the BIC of a national or international
	 * CSD. When no CSD exists in a particular market, the stock exchange BIC
	 * will be used.<br>
	 * Country code should be used for settlement taking place outside of an
	 * institution published in the PSET's BIC list. This includes physical
	 * deliveries and investment funds not settling at a CSD. <br>
	 * The format and content of the settlement party sequences will comply with
	 * the market practices published for the counterparty depository included
	 * in the message.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties64(SettlementParties64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}