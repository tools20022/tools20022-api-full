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
 * If code is present, the code OTHR must only be used in case no other
 * corporate action event code is appropriate.
 * 
 * If code is present, the code CHAN must only be used in case no other
 * corporate action event code is appropriate and only for an event which
 * relates to a change.
 * 
 * If code is present, the code REDM must only be used when the redemption is
 * decided by the issuer and not by the securities holders.
 */
public class ConstraintEventTypeRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType3Choice
	 * CorporateActionEventType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType3Choice> forCorporateActionEventType3Choice = new MMConstraint<CorporateActionEventType3Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType3Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType3Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType4Choice
	 * CorporateActionEventType4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType4Choice> forCorporateActionEventType4Choice = new MMConstraint<CorporateActionEventType4Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType4Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType4Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType7Choice
	 * CorporateActionEventType7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType7Choice> forCorporateActionEventType7Choice = new MMConstraint<CorporateActionEventType7Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType7Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType7Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType9Choice
	 * CorporateActionEventType9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType9Choice> forCorporateActionEventType9Choice = new MMConstraint<CorporateActionEventType9Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType9Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType9Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType11Choice
	 * CorporateActionEventType11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType32Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType32Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType11Choice> forCorporateActionEventType11Choice = new MMConstraint<CorporateActionEventType11Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType11Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType32Choice);
			owner_lazy = () -> CorporateActionEventType11Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType14Choice
	 * CorporateActionEventType14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType34Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType34Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType14Choice> forCorporateActionEventType14Choice = new MMConstraint<CorporateActionEventType14Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType14Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType34Choice);
			owner_lazy = () -> CorporateActionEventType14Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType13Choice
	 * CorporateActionEventType13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType33Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType33Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType13Choice> forCorporateActionEventType13Choice = new MMConstraint<CorporateActionEventType13Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType13Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType33Choice);
			owner_lazy = () -> CorporateActionEventType13Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType21Choice
	 * CorporateActionEventType21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType21Choice> forCorporateActionEventType21Choice = new MMConstraint<CorporateActionEventType21Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType21Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType21Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation9
	 * CorporateActionGeneralInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation9> forCorporateActionGeneralInformation9 = new MMConstraint<CorporateActionGeneralInformation9>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation13
	 * CorporateActionGeneralInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation13> forCorporateActionGeneralInformation13 = new MMConstraint<CorporateActionGeneralInformation13>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation34
	 * CorporateActionGeneralInformation34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation34> forCorporateActionGeneralInformation34 = new MMConstraint<CorporateActionGeneralInformation34>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation42
	 * CorporateActionGeneralInformation42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation42> forCorporateActionGeneralInformation42 = new MMConstraint<CorporateActionGeneralInformation42>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation42;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation42.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation52
	 * CorporateActionGeneralInformation52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation91
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation91}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation52> forCorporateActionGeneralInformation52 = new MMConstraint<CorporateActionGeneralInformation52>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation52;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation91);
			owner_lazy = () -> CorporateActionGeneralInformation52.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType22Choice
	 * CorporateActionEventType22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType22Choice> forCorporateActionEventType22Choice = new MMConstraint<CorporateActionEventType22Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType22Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType22Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation58
	 * CorporateActionGeneralInformation58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation58> forCorporateActionGeneralInformation58 = new MMConstraint<CorporateActionGeneralInformation58>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation58;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation58.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation6
	 * CorporateActionGeneralInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation6> forCorporateActionGeneralInformation6 = new MMConstraint<CorporateActionGeneralInformation6>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation15
	 * CorporateActionGeneralInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation15> forCorporateActionGeneralInformation15 = new MMConstraint<CorporateActionGeneralInformation15>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation21
	 * CorporateActionGeneralInformation21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation21> forCorporateActionGeneralInformation21 = new MMConstraint<CorporateActionGeneralInformation21>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation28
	 * CorporateActionGeneralInformation28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation28> forCorporateActionGeneralInformation28 = new MMConstraint<CorporateActionGeneralInformation28>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation36
	 * CorporateActionGeneralInformation36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation36> forCorporateActionGeneralInformation36 = new MMConstraint<CorporateActionGeneralInformation36>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation44
	 * CorporateActionGeneralInformation44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation44> forCorporateActionGeneralInformation44 = new MMConstraint<CorporateActionGeneralInformation44>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation44.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation55
	 * CorporateActionGeneralInformation55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation71
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation71}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation55> forCorporateActionGeneralInformation55 = new MMConstraint<CorporateActionGeneralInformation55>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation55;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation71);
			owner_lazy = () -> CorporateActionGeneralInformation55.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation61
	 * CorporateActionGeneralInformation61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation61> forCorporateActionGeneralInformation61 = new MMConstraint<CorporateActionGeneralInformation61>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation61;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation61.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation7
	 * CorporateActionGeneralInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation7> forCorporateActionGeneralInformation7 = new MMConstraint<CorporateActionGeneralInformation7>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation26
	 * CorporateActionGeneralInformation26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation26> forCorporateActionGeneralInformation26 = new MMConstraint<CorporateActionGeneralInformation26>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation33
	 * CorporateActionGeneralInformation33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation33> forCorporateActionGeneralInformation33 = new MMConstraint<CorporateActionGeneralInformation33>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation27
	 * CorporateActionGeneralInformation27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation27> forCorporateActionGeneralInformation27 = new MMConstraint<CorporateActionGeneralInformation27>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation41
	 * CorporateActionGeneralInformation41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation41> forCorporateActionGeneralInformation41 = new MMConstraint<CorporateActionGeneralInformation41>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation41;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation41.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation49
	 * CorporateActionGeneralInformation49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation90
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation90}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation49> forCorporateActionGeneralInformation49 = new MMConstraint<CorporateActionGeneralInformation49>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation49;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation90);
			owner_lazy = () -> CorporateActionGeneralInformation49.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation68
	 * CorporateActionGeneralInformation68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation68> forCorporateActionGeneralInformation68 = new MMConstraint<CorporateActionGeneralInformation68>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation68;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation68.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation4
	 * CorporateActionGeneralInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation4> forCorporateActionGeneralInformation4 = new MMConstraint<CorporateActionGeneralInformation4>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation16
	 * CorporateActionGeneralInformation16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation16> forCorporateActionGeneralInformation16 = new MMConstraint<CorporateActionGeneralInformation16>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType5Choice
	 * CorporateActionEventType5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType5Choice> forCorporateActionEventType5Choice = new MMConstraint<CorporateActionEventType5Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType5Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType5Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation24
	 * CorporateActionGeneralInformation24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation24> forCorporateActionGeneralInformation24 = new MMConstraint<CorporateActionGeneralInformation24>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType6Choice
	 * CorporateActionEventType6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType6Choice> forCorporateActionEventType6Choice = new MMConstraint<CorporateActionEventType6Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType6Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType6Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation29
	 * CorporateActionGeneralInformation29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation29> forCorporateActionGeneralInformation29 = new MMConstraint<CorporateActionGeneralInformation29>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType8Choice
	 * CorporateActionEventType8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType8Choice> forCorporateActionEventType8Choice = new MMConstraint<CorporateActionEventType8Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType8Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType8Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation39
	 * CorporateActionGeneralInformation39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation39> forCorporateActionGeneralInformation39 = new MMConstraint<CorporateActionGeneralInformation39>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation39.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType10Choice
	 * CorporateActionEventType10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType10Choice> forCorporateActionEventType10Choice = new MMConstraint<CorporateActionEventType10Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType10Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType10Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation47
	 * CorporateActionGeneralInformation47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation47> forCorporateActionGeneralInformation47 = new MMConstraint<CorporateActionGeneralInformation47>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation47.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType12Choice
	 * CorporateActionEventType12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType31Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType31Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType12Choice> forCorporateActionEventType12Choice = new MMConstraint<CorporateActionEventType12Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType12Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType31Choice);
			owner_lazy = () -> CorporateActionEventType12Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation50
	 * CorporateActionGeneralInformation50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation79
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation79}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation50> forCorporateActionGeneralInformation50 = new MMConstraint<CorporateActionGeneralInformation50>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation50;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation79);
			owner_lazy = () -> CorporateActionGeneralInformation50.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType27Choice
	 * CorporateActionEventType27Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType27Choice> forCorporateActionEventType27Choice = new MMConstraint<CorporateActionEventType27Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType27Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType27Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation62
	 * CorporateActionGeneralInformation62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation62> forCorporateActionGeneralInformation62 = new MMConstraint<CorporateActionGeneralInformation62>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation62;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation62.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType28Choice
	 * CorporateActionEventType28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType28Choice> forCorporateActionEventType28Choice = new MMConstraint<CorporateActionEventType28Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType28Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType28Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation11
	 * CorporateActionGeneralInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation11> forCorporateActionGeneralInformation11 = new MMConstraint<CorporateActionGeneralInformation11>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation19
	 * CorporateActionGeneralInformation19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation19> forCorporateActionGeneralInformation19 = new MMConstraint<CorporateActionGeneralInformation19>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation22
	 * CorporateActionGeneralInformation22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation22> forCorporateActionGeneralInformation22 = new MMConstraint<CorporateActionGeneralInformation22>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation31
	 * CorporateActionGeneralInformation31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation31> forCorporateActionGeneralInformation31 = new MMConstraint<CorporateActionGeneralInformation31>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation37
	 * CorporateActionGeneralInformation37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation37> forCorporateActionGeneralInformation37 = new MMConstraint<CorporateActionGeneralInformation37>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation37.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation45
	 * CorporateActionGeneralInformation45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation45> forCorporateActionGeneralInformation45 = new MMConstraint<CorporateActionGeneralInformation45>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation45;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation45.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation51
	 * CorporateActionGeneralInformation51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation70
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation70}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation51> forCorporateActionGeneralInformation51 = new MMConstraint<CorporateActionGeneralInformation51>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation70);
			owner_lazy = () -> CorporateActionGeneralInformation51.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation67
	 * CorporateActionGeneralInformation67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation67> forCorporateActionGeneralInformation67 = new MMConstraint<CorporateActionGeneralInformation67>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation67.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType16Choice
	 * CorporateActionEventType16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType29Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType29Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType16Choice> forCorporateActionEventType16Choice = new MMConstraint<CorporateActionEventType16Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType16Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType29Choice);
			owner_lazy = () -> CorporateActionEventType16Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType17Choice
	 * CorporateActionEventType17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType17Choice> forCorporateActionEventType17Choice = new MMConstraint<CorporateActionEventType17Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType17Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType17Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType15Choice
	 * CorporateActionEventType15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType30Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType30Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType15Choice> forCorporateActionEventType15Choice = new MMConstraint<CorporateActionEventType15Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType15Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType30Choice);
			owner_lazy = () -> CorporateActionEventType15Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType19Choice
	 * CorporateActionEventType19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType19Choice> forCorporateActionEventType19Choice = new MMConstraint<CorporateActionEventType19Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType19Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders.";
			owner_lazy = () -> CorporateActionEventType19Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation14
	 * CorporateActionGeneralInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation14> forCorporateActionGeneralInformation14 = new MMConstraint<CorporateActionGeneralInformation14>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation12
	 * CorporateActionGeneralInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation12> forCorporateActionGeneralInformation12 = new MMConstraint<CorporateActionGeneralInformation12>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation71
	 * CorporateActionGeneralInformation71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation88
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation88}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation55
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation55}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation71> forCorporateActionGeneralInformation71 = new MMConstraint<CorporateActionGeneralInformation71>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation71;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation88);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation55;
			owner_lazy = () -> CorporateActionGeneralInformation71.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation70
	 * CorporateActionGeneralInformation70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation85
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation85}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation51
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation51}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation70> forCorporateActionGeneralInformation70 = new MMConstraint<CorporateActionGeneralInformation70>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation70;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation85);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation51;
			owner_lazy = () -> CorporateActionGeneralInformation70.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation77
	 * CorporateActionGeneralInformation77}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation77> forCorporateActionGeneralInformation77 = new MMConstraint<CorporateActionGeneralInformation77>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation77;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation77.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation76
	 * CorporateActionGeneralInformation76}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation76> forCorporateActionGeneralInformation76 = new MMConstraint<CorporateActionGeneralInformation76>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation76;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation76.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation79
	 * CorporateActionGeneralInformation79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation89
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation89}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation50
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation50}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation79> forCorporateActionGeneralInformation79 = new MMConstraint<CorporateActionGeneralInformation79>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation79;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation89);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation50;
			owner_lazy = () -> CorporateActionGeneralInformation79.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation83
	 * CorporateActionGeneralInformation83}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation83> forCorporateActionGeneralInformation83 = new MMConstraint<CorporateActionGeneralInformation83>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation83;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation83.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation82
	 * CorporateActionGeneralInformation82}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation82> forCorporateActionGeneralInformation82 = new MMConstraint<CorporateActionGeneralInformation82>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation82;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation82.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType30Choice
	 * CorporateActionEventType30Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType56Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType56Choice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType15Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType15Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType30Choice> forCorporateActionEventType30Choice = new MMConstraint<CorporateActionEventType30Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType30Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType56Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType15Choice;
			owner_lazy = () -> CorporateActionEventType30Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType29Choice
	 * CorporateActionEventType29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType16Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType16Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType29Choice> forCorporateActionEventType29Choice = new MMConstraint<CorporateActionEventType29Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType29Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType16Choice;
			owner_lazy = () -> CorporateActionEventType29Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation89
	 * CorporateActionGeneralInformation89}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation111
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation111}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation79
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation79}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation89> forCorporateActionGeneralInformation89 = new MMConstraint<CorporateActionGeneralInformation89>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation89;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation111);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation79;
			owner_lazy = () -> CorporateActionGeneralInformation89.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation88
	 * CorporateActionGeneralInformation88}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation107
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation107}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation71
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation71}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation88> forCorporateActionGeneralInformation88 = new MMConstraint<CorporateActionGeneralInformation88>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation88;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation107);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation71;
			owner_lazy = () -> CorporateActionGeneralInformation88.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91
	 * CorporateActionGeneralInformation91}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation109
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation109}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation52
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation52}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation91> forCorporateActionGeneralInformation91 = new MMConstraint<CorporateActionGeneralInformation91>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation91;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation109);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation52;
			owner_lazy = () -> CorporateActionGeneralInformation91.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation85
	 * CorporateActionGeneralInformation85}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation105
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation105}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation70
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation70}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation85> forCorporateActionGeneralInformation85 = new MMConstraint<CorporateActionGeneralInformation85>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation85;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation105);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation70;
			owner_lazy = () -> CorporateActionGeneralInformation85.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation90
	 * CorporateActionGeneralInformation90}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation110
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation110}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation49
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation49}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation90> forCorporateActionGeneralInformation90 = new MMConstraint<CorporateActionGeneralInformation90>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation90;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation110);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation49;
			owner_lazy = () -> CorporateActionGeneralInformation90.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType33Choice
	 * CorporateActionEventType33Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType51Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType51Choice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType13Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType13Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType33Choice> forCorporateActionEventType33Choice = new MMConstraint<CorporateActionEventType33Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType33Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType51Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType13Choice;
			owner_lazy = () -> CorporateActionEventType33Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType32Choice
	 * CorporateActionEventType32Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType52Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType52Choice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType11Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType11Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType32Choice> forCorporateActionEventType32Choice = new MMConstraint<CorporateActionEventType32Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType32Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType52Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType11Choice;
			owner_lazy = () -> CorporateActionEventType32Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType34Choice
	 * CorporateActionEventType34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType54Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType54Choice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType14Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType14Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType34Choice> forCorporateActionEventType34Choice = new MMConstraint<CorporateActionEventType34Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType34Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType54Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType14Choice;
			owner_lazy = () -> CorporateActionEventType34Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType31Choice
	 * CorporateActionEventType31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType53Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType53Choice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType12Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType12Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType31Choice> forCorporateActionEventType31Choice = new MMConstraint<CorporateActionEventType31Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType31Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType53Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType12Choice;
			owner_lazy = () -> CorporateActionEventType31Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98
	 * CorporateActionGeneralInformation98}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation98> forCorporateActionGeneralInformation98 = new MMConstraint<CorporateActionGeneralInformation98>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation98;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation98.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation97
	 * CorporateActionGeneralInformation97}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation97> forCorporateActionGeneralInformation97 = new MMConstraint<CorporateActionGeneralInformation97>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation97;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation97.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation94
	 * CorporateActionGeneralInformation94}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation94> forCorporateActionGeneralInformation94 = new MMConstraint<CorporateActionGeneralInformation94>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation94;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation94.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation103
	 * CorporateActionGeneralInformation103}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation103> forCorporateActionGeneralInformation103 = new MMConstraint<CorporateActionGeneralInformation103>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation103;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation103.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType42Choice
	 * CorporateActionEventType42Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType42Choice> forCorporateActionEventType42Choice = new MMConstraint<CorporateActionEventType42Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType42Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType42Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType35Choice
	 * CorporateActionEventType35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType35Choice> forCorporateActionEventType35Choice = new MMConstraint<CorporateActionEventType35Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType35Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType35Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType41Choice
	 * CorporateActionEventType41Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType41Choice> forCorporateActionEventType41Choice = new MMConstraint<CorporateActionEventType41Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType41Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType41Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType36Choice
	 * CorporateActionEventType36Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType36Choice> forCorporateActionEventType36Choice = new MMConstraint<CorporateActionEventType36Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType36Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType36Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType46Choice
	 * CorporateActionEventType46Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType46Choice> forCorporateActionEventType46Choice = new MMConstraint<CorporateActionEventType46Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType46Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType46Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType48Choice
	 * CorporateActionEventType48Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType48Choice> forCorporateActionEventType48Choice = new MMConstraint<CorporateActionEventType48Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType48Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders.";
			owner_lazy = () -> CorporateActionEventType48Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation104
	 * CorporateActionGeneralInformation104}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation104> forCorporateActionGeneralInformation104 = new MMConstraint<CorporateActionGeneralInformation104>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation104;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation104.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType50Choice
	 * CorporateActionEventType50Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType50Choice> forCorporateActionEventType50Choice = new MMConstraint<CorporateActionEventType50Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType50Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType50Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109
	 * CorporateActionGeneralInformation109}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation91
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation91}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation109> forCorporateActionGeneralInformation109 = new MMConstraint<CorporateActionGeneralInformation109>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation109;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation91;
			owner_lazy = () -> CorporateActionGeneralInformation109.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111
	 * CorporateActionGeneralInformation111}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation89
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation89}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation111> forCorporateActionGeneralInformation111 = new MMConstraint<CorporateActionGeneralInformation111>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation111;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation89;
			owner_lazy = () -> CorporateActionGeneralInformation111.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110
	 * CorporateActionGeneralInformation110}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation90
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation90}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation110> forCorporateActionGeneralInformation110 = new MMConstraint<CorporateActionGeneralInformation110>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation110;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation90;
			owner_lazy = () -> CorporateActionGeneralInformation110.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105
	 * CorporateActionGeneralInformation105}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation85
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation85}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation105> forCorporateActionGeneralInformation105 = new MMConstraint<CorporateActionGeneralInformation105>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation105;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation85;
			owner_lazy = () -> CorporateActionGeneralInformation105.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107
	 * CorporateActionGeneralInformation107}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionGeneralInformation88
	 * ConstraintEventTypeRule.forCorporateActionGeneralInformation88}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation107> forCorporateActionGeneralInformation107 = new MMConstraint<CorporateActionGeneralInformation107>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation107;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation88;
			owner_lazy = () -> CorporateActionGeneralInformation107.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType51Choice
	 * CorporateActionEventType51Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType76Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType76Choice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType33Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType33Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType51Choice> forCorporateActionEventType51Choice = new MMConstraint<CorporateActionEventType51Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType51Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType76Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType33Choice;
			owner_lazy = () -> CorporateActionEventType51Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType52Choice
	 * CorporateActionEventType52Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType32Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType32Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType52Choice> forCorporateActionEventType52Choice = new MMConstraint<CorporateActionEventType52Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType52Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType32Choice;
			owner_lazy = () -> CorporateActionEventType52Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType54Choice
	 * CorporateActionEventType54Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType75Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType75Choice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType34Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType34Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType54Choice> forCorporateActionEventType54Choice = new MMConstraint<CorporateActionEventType54Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType54Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType75Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType34Choice;
			owner_lazy = () -> CorporateActionEventType54Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType53Choice
	 * CorporateActionEventType53Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType74Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType74Choice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType31Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType31Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType53Choice> forCorporateActionEventType53Choice = new MMConstraint<CorporateActionEventType53Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType53Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType74Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType31Choice;
			owner_lazy = () -> CorporateActionEventType53Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType56Choice
	 * CorporateActionEventType56Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType73Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType73Choice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType30Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType30Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType56Choice> forCorporateActionEventType56Choice = new MMConstraint<CorporateActionEventType56Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType56Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType73Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType30Choice;
			owner_lazy = () -> CorporateActionEventType56Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation114
	 * CorporateActionGeneralInformation114}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation114> forCorporateActionGeneralInformation114 = new MMConstraint<CorporateActionGeneralInformation114>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation114;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation114.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation115
	 * CorporateActionGeneralInformation115}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation115> forCorporateActionGeneralInformation115 = new MMConstraint<CorporateActionGeneralInformation115>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation115;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation115.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation118
	 * CorporateActionGeneralInformation118}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation118> forCorporateActionGeneralInformation118 = new MMConstraint<CorporateActionGeneralInformation118>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation118;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation118.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation121
	 * CorporateActionGeneralInformation121}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation121> forCorporateActionGeneralInformation121 = new MMConstraint<CorporateActionGeneralInformation121>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation121;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation121.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation113
	 * CorporateActionGeneralInformation113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionGeneralInformation113> forCorporateActionGeneralInformation113 = new MMConstraint<CorporateActionGeneralInformation113>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionGeneralInformation113;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation113.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType62Choice
	 * CorporateActionEventType62Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType62Choice> forCorporateActionEventType62Choice = new MMConstraint<CorporateActionEventType62Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType62Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType62Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType61Choice
	 * CorporateActionEventType61Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType61Choice> forCorporateActionEventType61Choice = new MMConstraint<CorporateActionEventType61Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType61Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType61Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType71Choice
	 * CorporateActionEventType71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType71Choice> forCorporateActionEventType71Choice = new MMConstraint<CorporateActionEventType71Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType71Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders.";
			owner_lazy = () -> CorporateActionEventType71Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType69Choice
	 * CorporateActionEventType69Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType69Choice> forCorporateActionEventType69Choice = new MMConstraint<CorporateActionEventType69Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType69Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType69Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType57Choice
	 * CorporateActionEventType57Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType57Choice> forCorporateActionEventType57Choice = new MMConstraint<CorporateActionEventType57Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType57Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType57Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType58Choice
	 * CorporateActionEventType58Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType58Choice> forCorporateActionEventType58Choice = new MMConstraint<CorporateActionEventType58Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType58Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType58Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType73Choice
	 * CorporateActionEventType73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType56Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType56Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType73Choice> forCorporateActionEventType73Choice = new MMConstraint<CorporateActionEventType73Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType73Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType56Choice;
			owner_lazy = () -> CorporateActionEventType73Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType74Choice
	 * CorporateActionEventType74Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR (Other) must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType53Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType53Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType74Choice> forCorporateActionEventType74Choice = new MMConstraint<CorporateActionEventType74Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType74Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR (Other) must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used when the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType53Choice;
			owner_lazy = () -> CorporateActionEventType74Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType75Choice
	 * CorporateActionEventType75Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR (Other) must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType54Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType54Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType75Choice> forCorporateActionEventType75Choice = new MMConstraint<CorporateActionEventType75Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType75Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR (Other) must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used when the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType54Choice;
			owner_lazy = () -> CorporateActionEventType75Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType76Choice
	 * CorporateActionEventType76Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR (Other) must only be used if no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used if no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used if the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEventTypeRule#forCorporateActionEventType51Choice
	 * ConstraintEventTypeRule.forCorporateActionEventType51Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType76Choice> forCorporateActionEventType76Choice = new MMConstraint<CorporateActionEventType76Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType76Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR (Other) must only be used if no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used if no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used if the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType51Choice;
			owner_lazy = () -> CorporateActionEventType76Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType77Choice
	 * CorporateActionEventType77Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR (Other) must only be used if no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used if no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used if the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType77Choice> forCorporateActionEventType77Choice = new MMConstraint<CorporateActionEventType77Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType77Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR (Other) must only be used if no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used if no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used if the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType77Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType78Choice
	 * CorporateActionEventType78Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR (Other) must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType78Choice> forCorporateActionEventType78Choice = new MMConstraint<CorporateActionEventType78Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType78Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR (Other) must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType78Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType79Choice
	 * CorporateActionEventType79Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Code is present, the code OTHR (Other) must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used when the redemption is decided by the issuer and not by the securities holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType79Choice> forCorporateActionEventType79Choice = new MMConstraint<CorporateActionEventType79Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType79Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR (Other) must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType79Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType83Choice
	 * CorporateActionEventType83Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\n\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\n\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\n\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionEventType83Choice> forCorporateActionEventType83Choice = new MMConstraint<CorporateActionEventType83Choice>() {
		{
			validator = ConstraintEventTypeRule::checkCorporateActionEventType83Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\n\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\n\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\n\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders.";
			owner_lazy = () -> CorporateActionEventType83Choice.mmObject();
		}
	};

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType3Choice(CorporateActionEventType3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType4Choice(CorporateActionEventType4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType7Choice(CorporateActionEventType7Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType9Choice(CorporateActionEventType9Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType11Choice(CorporateActionEventType11Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType14Choice(CorporateActionEventType14Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType13Choice(CorporateActionEventType13Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType21Choice(CorporateActionEventType21Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation9(CorporateActionGeneralInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation13(CorporateActionGeneralInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation34(CorporateActionGeneralInformation34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation42(CorporateActionGeneralInformation42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation52(CorporateActionGeneralInformation52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType22Choice(CorporateActionEventType22Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation58(CorporateActionGeneralInformation58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation6(CorporateActionGeneralInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation15(CorporateActionGeneralInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation21(CorporateActionGeneralInformation21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation28(CorporateActionGeneralInformation28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation36(CorporateActionGeneralInformation36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation44(CorporateActionGeneralInformation44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation55(CorporateActionGeneralInformation55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation61(CorporateActionGeneralInformation61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation7(CorporateActionGeneralInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation26(CorporateActionGeneralInformation26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation33(CorporateActionGeneralInformation33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation27(CorporateActionGeneralInformation27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation41(CorporateActionGeneralInformation41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation49(CorporateActionGeneralInformation49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation68(CorporateActionGeneralInformation68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation4(CorporateActionGeneralInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation16(CorporateActionGeneralInformation16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType5Choice(CorporateActionEventType5Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation24(CorporateActionGeneralInformation24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType6Choice(CorporateActionEventType6Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation29(CorporateActionGeneralInformation29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType8Choice(CorporateActionEventType8Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation39(CorporateActionGeneralInformation39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType10Choice(CorporateActionEventType10Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation47(CorporateActionGeneralInformation47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType12Choice(CorporateActionEventType12Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation50(CorporateActionGeneralInformation50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType27Choice(CorporateActionEventType27Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation62(CorporateActionGeneralInformation62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType28Choice(CorporateActionEventType28Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation11(CorporateActionGeneralInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation19(CorporateActionGeneralInformation19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation22(CorporateActionGeneralInformation22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation31(CorporateActionGeneralInformation31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation37(CorporateActionGeneralInformation37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation45(CorporateActionGeneralInformation45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation51(CorporateActionGeneralInformation51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation67(CorporateActionGeneralInformation67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType16Choice(CorporateActionEventType16Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType17Choice(CorporateActionEventType17Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The use of a specific corporate action event type code is allowed only if
	 * this specific event triggers a securities movement as per the Event
	 * Interpretation Grid published by the Securities Market Practice Group
	 * (SMPG).<br>
	 * The corporate action event indicator code OTHR must only be used in case
	 * no other corporate action event code is appropriate.<br>
	 * The corporate action event indicator code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change.<br>
	 * The corporate action event indicator code REDM must only be used when the
	 * redemption is decided by the issuer and not by the holders.
	 */
	public static void checkCorporateActionEventType15Choice(CorporateActionEventType15Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The use of a specific corporate action event type code is allowed only if
	 * this specific event triggers a securities movement as per the Event
	 * Interpretation Grid published by the Securities Market Practice Group
	 * (SMPG).<br>
	 * The corporate action event indicator code OTHR must only be used in case
	 * no other corporate action event code is appropriate.<br>
	 * The corporate action event indicator code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change.<br>
	 * The corporate action event indicator code REDM must only be used when the
	 * redemption is decided by the issuer and not by the holders.
	 */
	public static void checkCorporateActionEventType19Choice(CorporateActionEventType19Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation14(CorporateActionGeneralInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation12(CorporateActionGeneralInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation71(CorporateActionGeneralInformation71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation70(CorporateActionGeneralInformation70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation77(CorporateActionGeneralInformation77 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation76(CorporateActionGeneralInformation76 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation79(CorporateActionGeneralInformation79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation83(CorporateActionGeneralInformation83 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation82(CorporateActionGeneralInformation82 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The use of a specific corporate action event type code is allowed only if
	 * this specific event triggers a securities movement as per the Event
	 * Interpretation Grid published by the Securities Market Practice Group
	 * (SMPG).<br>
	 * The corporate action event indicator code OTHR must only be used in case
	 * no other corporate action event code is appropriate.<br>
	 * The corporate action event indicator code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change.<br>
	 * The corporate action event indicator code REDM must only be used when the
	 * redemption is decided by the issuer and not by the holders.
	 */
	public static void checkCorporateActionEventType30Choice(CorporateActionEventType30Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType29Choice(CorporateActionEventType29Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation89(CorporateActionGeneralInformation89 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation88(CorporateActionGeneralInformation88 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation91(CorporateActionGeneralInformation91 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation85(CorporateActionGeneralInformation85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation90(CorporateActionGeneralInformation90 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType33Choice(CorporateActionEventType33Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType32Choice(CorporateActionEventType32Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType34Choice(CorporateActionEventType34Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType31Choice(CorporateActionEventType31Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation98(CorporateActionGeneralInformation98 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation97(CorporateActionGeneralInformation97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation94(CorporateActionGeneralInformation94 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation103(CorporateActionGeneralInformation103 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType42Choice(CorporateActionEventType42Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType35Choice(CorporateActionEventType35Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType41Choice(CorporateActionEventType41Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType36Choice(CorporateActionEventType36Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType46Choice(CorporateActionEventType46Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The use of a specific corporate action event type code is allowed only if
	 * this specific event triggers a securities movement as per the Event
	 * Interpretation Grid published by the Securities Market Practice Group
	 * (SMPG).<br>
	 * The corporate action event indicator code OTHR must only be used in case
	 * no other corporate action event code is appropriate.<br>
	 * The corporate action event indicator code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change.<br>
	 * The corporate action event indicator code REDM must only be used when the
	 * redemption is decided by the issuer and not by the holders.
	 */
	public static void checkCorporateActionEventType48Choice(CorporateActionEventType48Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation104(CorporateActionGeneralInformation104 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType50Choice(CorporateActionEventType50Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation109(CorporateActionGeneralInformation109 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation111(CorporateActionGeneralInformation111 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation110(CorporateActionGeneralInformation110 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation105(CorporateActionGeneralInformation105 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation107(CorporateActionGeneralInformation107 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType51Choice(CorporateActionEventType51Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType52Choice(CorporateActionEventType52Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType54Choice(CorporateActionEventType54Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType53Choice(CorporateActionEventType53Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The use of a specific corporate action event type code is allowed only if
	 * this specific event triggers a securities movement as per the Event
	 * Interpretation Grid published by the Securities Market Practice Group
	 * (SMPG).<br>
	 * The corporate action event indicator code OTHR must only be used in case
	 * no other corporate action event code is appropriate.<br>
	 * The corporate action event indicator code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change.<br>
	 * The corporate action event indicator code REDM must only be used when the
	 * redemption is decided by the issuer and not by the holders.
	 */
	public static void checkCorporateActionEventType56Choice(CorporateActionEventType56Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation114(CorporateActionGeneralInformation114 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation115(CorporateActionGeneralInformation115 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation118(CorporateActionGeneralInformation118 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation121(CorporateActionGeneralInformation121 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * EventType/Code OTHR must only be used in case no other corporate action
	 * event code is appropriate. EventType/Code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change. EventType/Code REDM must only be used when the
	 * redemption is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionGeneralInformation113(CorporateActionGeneralInformation113 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType62Choice(CorporateActionEventType62Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType61Choice(CorporateActionEventType61Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The use of a specific corporate action event type code is allowed only if
	 * this specific event triggers a securities movement as per the Event
	 * Interpretation Grid published by the Securities Market Practice Group
	 * (SMPG).<br>
	 * The corporate action event indicator code OTHR must only be used in case
	 * no other corporate action event code is appropriate.<br>
	 * The corporate action event indicator code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change.<br>
	 * The corporate action event indicator code REDM must only be used when the
	 * redemption is decided by the issuer and not by the holders.
	 */
	public static void checkCorporateActionEventType71Choice(CorporateActionEventType71Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate.
	 * 
	 * If code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change.
	 * 
	 * If code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType69Choice(CorporateActionEventType69Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType57Choice(CorporateActionEventType57Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR must only be used in case no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN must only be used in case no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM must only be used when the redemption
	 * is decided by the issuer and not by the securities holders.
	 */
	public static void checkCorporateActionEventType58Choice(CorporateActionEventType58Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The use of a specific corporate action event type code is allowed only if
	 * this specific event triggers a securities movement as per the Event
	 * Interpretation Grid published by the Securities Market Practice Group
	 * (SMPG).<br>
	 * The corporate action event indicator code OTHR must only be used in case
	 * no other corporate action event code is appropriate.<br>
	 * The corporate action event indicator code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change.<br>
	 * The corporate action event indicator code REDM must only be used when the
	 * redemption is decided by the issuer and not by the holders.
	 */
	public static void checkCorporateActionEventType73Choice(CorporateActionEventType73Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR (Other) must only be used in case no
	 * other corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN (Change) must only be used in case no
	 * other corporate action event code is appropriate and only for an event
	 * which relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM (Final Maturity) must only be used when
	 * the redemption is decided by the issuer and not by the securities
	 * holders.
	 */
	public static void checkCorporateActionEventType74Choice(CorporateActionEventType74Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR (Other) must only be used in case no
	 * other corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN (Change) must only be used in case no
	 * other corporate action event code is appropriate and only for an event
	 * which relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM (Final Maturity) must only be used when
	 * the redemption is decided by the issuer and not by the securities
	 * holders.
	 */
	public static void checkCorporateActionEventType75Choice(CorporateActionEventType75Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR (Other) must only be used if no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN (Change) must only be used if no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM (Final Maturity) must only be used if
	 * the redemption is decided by the issuer and not by the securities
	 * holders.
	 */
	public static void checkCorporateActionEventType76Choice(CorporateActionEventType76Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR (Other) must only be used if no other
	 * corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN (Change) must only be used if no other
	 * corporate action event code is appropriate and only for an event which
	 * relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM (Final Maturity) must only be used if
	 * the redemption is decided by the issuer and not by the securities
	 * holders.
	 */
	public static void checkCorporateActionEventType77Choice(CorporateActionEventType77Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR (Other) must only be used in case no
	 * other corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN (Change) must only be used in case no
	 * other corporate action event code is appropriate and only for an event
	 * which relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM (Final Maturity) must only be used when
	 * the redemption is decided by the issuer and not by the securities
	 * holders.
	 */
	public static void checkCorporateActionEventType78Choice(CorporateActionEventType78Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Code is present, the code OTHR (Other) must only be used in case no
	 * other corporate action event code is appropriate. <br>
	 * <br>
	 * If Code is present, the code CHAN (Change) must only be used in case no
	 * other corporate action event code is appropriate and only for an event
	 * which relates to a change. <br>
	 * <br>
	 * If Code is present, the code REDM (Final Maturity) must only be used when
	 * the redemption is decided by the issuer and not by the securities
	 * holders.
	 */
	public static void checkCorporateActionEventType79Choice(CorporateActionEventType79Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The use of a specific corporate action event type code is allowed only if
	 * this specific event triggers a securities movement as per the Event
	 * Interpretation Grid published by the Securities Market Practice Group
	 * (SMPG).<br>
	 * <br>
	 * The corporate action event indicator code OTHR must only be used in case
	 * no other corporate action event code is appropriate.<br>
	 * <br>
	 * The corporate action event indicator code CHAN must only be used in case
	 * no other corporate action event code is appropriate and only for an event
	 * which relates to a change.<br>
	 * <br>
	 * The corporate action event indicator code REDM must only be used when the
	 * redemption is decided by the issuer and not by the holders.
	 */
	public static void checkCorporateActionEventType83Choice(CorporateActionEventType83Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}