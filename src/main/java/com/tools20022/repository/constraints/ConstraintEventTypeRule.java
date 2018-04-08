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
 * EventType/Code OTHR must only be used in case no other corporate action event
 * code is appropriate. EventType/Code CHAN must only be used in case no other
 * corporate action event code is appropriate and only for an event which
 * relates to a change. EventType/Code REDM must only be used when the
 * redemption is decided by the issuer and not by the securities holders.
 */
public class ConstraintEventTypeRule {

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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation16.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation16 obj) throws Exception {
			checkCorporateActionGeneralInformation16(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType75Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType34Choice;
			owner_lazy = () -> CorporateActionEventType54Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType54Choice obj) throws Exception {
			checkCorporateActionEventType54Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation21.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation21 obj) throws Exception {
			checkCorporateActionGeneralInformation21(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType22Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType22Choice obj) throws Exception {
			checkCorporateActionEventType22Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation34.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation34 obj) throws Exception {
			checkCorporateActionGeneralInformation34(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation31.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation31 obj) throws Exception {
			checkCorporateActionGeneralInformation31(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation85);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation51;
			owner_lazy = () -> CorporateActionGeneralInformation70.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation70 obj) throws Exception {
			checkCorporateActionGeneralInformation70(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation41.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation41 obj) throws Exception {
			checkCorporateActionGeneralInformation41(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType54Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType14Choice;
			owner_lazy = () -> CorporateActionEventType34Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType34Choice obj) throws Exception {
			checkCorporateActionEventType34Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation4.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation4 obj) throws Exception {
			checkCorporateActionGeneralInformation4(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation22.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation22 obj) throws Exception {
			checkCorporateActionGeneralInformation22(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType6Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType6Choice obj) throws Exception {
			checkCorporateActionEventType6Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation42.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation42 obj) throws Exception {
			checkCorporateActionGeneralInformation42(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders.";
			owner_lazy = () -> CorporateActionEventType71Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType71Choice obj) throws Exception {
			checkCorporateActionEventType71Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation47.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation47 obj) throws Exception {
			checkCorporateActionGeneralInformation47(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType57Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType57Choice obj) throws Exception {
			checkCorporateActionEventType57Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType16Choice;
			owner_lazy = () -> CorporateActionEventType29Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType29Choice obj) throws Exception {
			checkCorporateActionEventType29Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType36Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType36Choice obj) throws Exception {
			checkCorporateActionEventType36Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation83.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation83 obj) throws Exception {
			checkCorporateActionGeneralInformation83(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation70);
			owner_lazy = () -> CorporateActionGeneralInformation51.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation51 obj) throws Exception {
			checkCorporateActionGeneralInformation51(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR (Other) must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType79Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType79Choice obj) throws Exception {
			checkCorporateActionEventType79Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation121.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation121 obj) throws Exception {
			checkCorporateActionGeneralInformation121(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation103.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation103 obj) throws Exception {
			checkCorporateActionGeneralInformation103(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType74Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType31Choice;
			owner_lazy = () -> CorporateActionEventType53Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType53Choice obj) throws Exception {
			checkCorporateActionEventType53Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType27Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType27Choice obj) throws Exception {
			checkCorporateActionEventType27Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation109);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation52;
			owner_lazy = () -> CorporateActionGeneralInformation91.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation91 obj) throws Exception {
			checkCorporateActionGeneralInformation91(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR (Other) must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used when the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType53Choice;
			owner_lazy = () -> CorporateActionEventType74Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType74Choice obj) throws Exception {
			checkCorporateActionEventType74Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation76.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation76 obj) throws Exception {
			checkCorporateActionGeneralInformation76(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR (Other) must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used when the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType54Choice;
			owner_lazy = () -> CorporateActionEventType75Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType75Choice obj) throws Exception {
			checkCorporateActionEventType75Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation98.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation98 obj) throws Exception {
			checkCorporateActionGeneralInformation98(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation114.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation114 obj) throws Exception {
			checkCorporateActionGeneralInformation114(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation115.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation115 obj) throws Exception {
			checkCorporateActionGeneralInformation115(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType4Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType4Choice obj) throws Exception {
			checkCorporateActionEventType4Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType61Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType61Choice obj) throws Exception {
			checkCorporateActionEventType61Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType31Choice);
			owner_lazy = () -> CorporateActionEventType12Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType12Choice obj) throws Exception {
			checkCorporateActionEventType12Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation37.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation37 obj) throws Exception {
			checkCorporateActionGeneralInformation37(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation12.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation12 obj) throws Exception {
			checkCorporateActionGeneralInformation12(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation71);
			owner_lazy = () -> CorporateActionGeneralInformation55.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation55 obj) throws Exception {
			checkCorporateActionGeneralInformation55(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation88;
			owner_lazy = () -> CorporateActionGeneralInformation107.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation107 obj) throws Exception {
			checkCorporateActionGeneralInformation107(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation28.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation28 obj) throws Exception {
			checkCorporateActionGeneralInformation28(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation15.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation15 obj) throws Exception {
			checkCorporateActionGeneralInformation15(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType28Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType28Choice obj) throws Exception {
			checkCorporateActionEventType28Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType30Choice);
			owner_lazy = () -> CorporateActionEventType15Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType15Choice obj) throws Exception {
			checkCorporateActionEventType15Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation44.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation44 obj) throws Exception {
			checkCorporateActionGeneralInformation44(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders.";
			owner_lazy = () -> CorporateActionEventType19Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType19Choice obj) throws Exception {
			checkCorporateActionEventType19Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation24.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation24 obj) throws Exception {
			checkCorporateActionGeneralInformation24(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation36.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation36 obj) throws Exception {
			checkCorporateActionGeneralInformation36(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation6.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation6 obj) throws Exception {
			checkCorporateActionGeneralInformation6(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation26.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation26 obj) throws Exception {
			checkCorporateActionGeneralInformation26(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType58Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType58Choice obj) throws Exception {
			checkCorporateActionEventType58Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType53Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType12Choice;
			owner_lazy = () -> CorporateActionEventType31Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType31Choice obj) throws Exception {
			checkCorporateActionEventType31Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation77.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation77 obj) throws Exception {
			checkCorporateActionGeneralInformation77(obj);
		}
	};
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType3Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType3Choice obj) throws Exception {
			checkCorporateActionEventType3Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType69Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType69Choice obj) throws Exception {
			checkCorporateActionEventType69Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation90;
			owner_lazy = () -> CorporateActionGeneralInformation110.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation110 obj) throws Exception {
			checkCorporateActionGeneralInformation110(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType56Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType15Choice;
			owner_lazy = () -> CorporateActionEventType30Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType30Choice obj) throws Exception {
			checkCorporateActionEventType30Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation104.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation104 obj) throws Exception {
			checkCorporateActionGeneralInformation104(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation33.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation33 obj) throws Exception {
			checkCorporateActionGeneralInformation33(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType7Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType7Choice obj) throws Exception {
			checkCorporateActionEventType7Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType50Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType50Choice obj) throws Exception {
			checkCorporateActionEventType50Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType52Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType11Choice;
			owner_lazy = () -> CorporateActionEventType32Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType32Choice obj) throws Exception {
			checkCorporateActionEventType32Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType76Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType33Choice;
			owner_lazy = () -> CorporateActionEventType51Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType51Choice obj) throws Exception {
			checkCorporateActionEventType51Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation85;
			owner_lazy = () -> CorporateActionGeneralInformation105.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation105 obj) throws Exception {
			checkCorporateActionGeneralInformation105(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation89;
			owner_lazy = () -> CorporateActionGeneralInformation111.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation111 obj) throws Exception {
			checkCorporateActionGeneralInformation111(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType17Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType17Choice obj) throws Exception {
			checkCorporateActionEventType17Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation9.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation9 obj) throws Exception {
			checkCorporateActionGeneralInformation9(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation107);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation71;
			owner_lazy = () -> CorporateActionGeneralInformation88.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation88 obj) throws Exception {
			checkCorporateActionGeneralInformation88(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation91;
			owner_lazy = () -> CorporateActionGeneralInformation109.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation109 obj) throws Exception {
			checkCorporateActionGeneralInformation109(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation111);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation79;
			owner_lazy = () -> CorporateActionGeneralInformation89.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation89 obj) throws Exception {
			checkCorporateActionGeneralInformation89(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation110);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation49;
			owner_lazy = () -> CorporateActionGeneralInformation90.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation90 obj) throws Exception {
			checkCorporateActionGeneralInformation90(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation79);
			owner_lazy = () -> CorporateActionGeneralInformation50.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation50 obj) throws Exception {
			checkCorporateActionGeneralInformation50(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType35Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType35Choice obj) throws Exception {
			checkCorporateActionEventType35Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation91);
			owner_lazy = () -> CorporateActionGeneralInformation52.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation52 obj) throws Exception {
			checkCorporateActionGeneralInformation52(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType32Choice);
			owner_lazy = () -> CorporateActionEventType11Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType11Choice obj) throws Exception {
			checkCorporateActionEventType11Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation11.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation11 obj) throws Exception {
			checkCorporateActionGeneralInformation11(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation29.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation29 obj) throws Exception {
			checkCorporateActionGeneralInformation29(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\n\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\n\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\n\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders.";
			owner_lazy = () -> CorporateActionEventType83Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType83Choice obj) throws Exception {
			checkCorporateActionEventType83Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType56Choice;
			owner_lazy = () -> CorporateActionEventType73Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType73Choice obj) throws Exception {
			checkCorporateActionEventType73Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType62Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType62Choice obj) throws Exception {
			checkCorporateActionEventType62Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation39.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation39 obj) throws Exception {
			checkCorporateActionGeneralInformation39(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation27.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation27 obj) throws Exception {
			checkCorporateActionGeneralInformation27(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType41Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType41Choice obj) throws Exception {
			checkCorporateActionEventType41Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation61.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation61 obj) throws Exception {
			checkCorporateActionGeneralInformation61(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation68.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation68 obj) throws Exception {
			checkCorporateActionGeneralInformation68(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType42Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType42Choice obj) throws Exception {
			checkCorporateActionEventType42Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation90);
			owner_lazy = () -> CorporateActionGeneralInformation49.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation49 obj) throws Exception {
			checkCorporateActionGeneralInformation49(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType29Choice);
			owner_lazy = () -> CorporateActionEventType16Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType16Choice obj) throws Exception {
			checkCorporateActionEventType16Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation118.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation118 obj) throws Exception {
			checkCorporateActionGeneralInformation118(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation113.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation113 obj) throws Exception {
			checkCorporateActionGeneralInformation113(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR (Other) must only be used if no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used if no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used if the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType77Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType77Choice obj) throws Exception {
			checkCorporateActionEventType77Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation13.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation13 obj) throws Exception {
			checkCorporateActionGeneralInformation13(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType5Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType5Choice obj) throws Exception {
			checkCorporateActionEventType5Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType51Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType13Choice;
			owner_lazy = () -> CorporateActionEventType33Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType33Choice obj) throws Exception {
			checkCorporateActionEventType33Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType33Choice);
			owner_lazy = () -> CorporateActionEventType13Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType13Choice obj) throws Exception {
			checkCorporateActionEventType13Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType21Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType21Choice obj) throws Exception {
			checkCorporateActionEventType21Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR (Other) must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType78Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType78Choice obj) throws Exception {
			checkCorporateActionEventType78Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType9Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType9Choice obj) throws Exception {
			checkCorporateActionEventType9Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation7.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation7 obj) throws Exception {
			checkCorporateActionGeneralInformation7(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation89);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation50;
			owner_lazy = () -> CorporateActionGeneralInformation79.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation79 obj) throws Exception {
			checkCorporateActionGeneralInformation79(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation97.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation97 obj) throws Exception {
			checkCorporateActionGeneralInformation97(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation62.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation62 obj) throws Exception {
			checkCorporateActionGeneralInformation62(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType34Choice);
			owner_lazy = () -> CorporateActionEventType14Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType14Choice obj) throws Exception {
			checkCorporateActionEventType14Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType10Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType10Choice obj) throws Exception {
			checkCorporateActionEventType10Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation45.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation45 obj) throws Exception {
			checkCorporateActionGeneralInformation45(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation14.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation14 obj) throws Exception {
			checkCorporateActionGeneralInformation14(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation19.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation19 obj) throws Exception {
			checkCorporateActionGeneralInformation19(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation105);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation70;
			owner_lazy = () -> CorporateActionGeneralInformation85.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation85 obj) throws Exception {
			checkCorporateActionGeneralInformation85(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation58.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation58 obj) throws Exception {
			checkCorporateActionGeneralInformation58(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation82.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation82 obj) throws Exception {
			checkCorporateActionGeneralInformation82(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType73Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType30Choice;
			owner_lazy = () -> CorporateActionEventType56Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType56Choice obj) throws Exception {
			checkCorporateActionEventType56Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR (Other) must only be used if no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN (Change) must only be used if no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM (Final Maturity) must only be used if the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType51Choice;
			owner_lazy = () -> CorporateActionEventType76Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType76Choice obj) throws Exception {
			checkCorporateActionEventType76Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation88);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionGeneralInformation55;
			owner_lazy = () -> CorporateActionGeneralInformation71.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation71 obj) throws Exception {
			checkCorporateActionGeneralInformation71(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType46Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType46Choice obj) throws Exception {
			checkCorporateActionEventType46Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation94.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation94 obj) throws Exception {
			checkCorporateActionGeneralInformation94(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "The use of a specific corporate action event type code is allowed only if this specific event triggers a securities movement as per the Event Interpretation Grid published by the Securities Market Practice Group (SMPG).\r\nThe corporate action event indicator code OTHR must only be used in case no other corporate action event code is appropriate.\r\nThe corporate action event indicator code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change.\r\nThe corporate action event indicator code REDM must only be used when the redemption is decided by the issuer and not by the holders.";
			owner_lazy = () -> CorporateActionEventType48Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType48Choice obj) throws Exception {
			checkCorporateActionEventType48Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \n\nIf code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \n\nIf code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionEventType8Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType8Choice obj) throws Exception {
			checkCorporateActionEventType8Choice(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "EventType/Code OTHR must only be used in case no other corporate action event code is appropriate. \nEventType/Code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \nEventType/Code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			owner_lazy = () -> CorporateActionGeneralInformation67.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionGeneralInformation67 obj) throws Exception {
			checkCorporateActionGeneralInformation67(obj);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeRule";
			definition = "If Code is present, the code OTHR must only be used in case no other corporate action event code is appropriate. \r\n\r\nIf Code is present, the code CHAN must only be used in case no other corporate action event code is appropriate and only for an event which relates to a change. \r\n\r\nIf Code is present, the code REDM must only be used when the redemption is decided by the issuer and not by the securities holders.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEventTypeRule.forCorporateActionEventType32Choice;
			owner_lazy = () -> CorporateActionEventType52Choice.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionEventType52Choice obj) throws Exception {
			checkCorporateActionEventType52Choice(obj);
		}
	};

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
	public static void checkCorporateActionGeneralInformation41(CorporateActionGeneralInformation41 obj) throws Exception {
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
	public static void checkCorporateActionGeneralInformation22(CorporateActionGeneralInformation22 obj) throws Exception {
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
	public static void checkCorporateActionGeneralInformation42(CorporateActionGeneralInformation42 obj) throws Exception {
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
	public static void checkCorporateActionGeneralInformation51(CorporateActionGeneralInformation51 obj) throws Exception {
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
	public static void checkCorporateActionEventType53Choice(CorporateActionEventType53Choice obj) throws Exception {
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
	public static void checkCorporateActionGeneralInformation91(CorporateActionGeneralInformation91 obj) throws Exception {
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
	public static void checkCorporateActionGeneralInformation107(CorporateActionGeneralInformation107 obj) throws Exception {
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
	public static void checkCorporateActionGeneralInformation15(CorporateActionGeneralInformation15 obj) throws Exception {
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
	public static void checkCorporateActionGeneralInformation24(CorporateActionGeneralInformation24 obj) throws Exception {
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
	public static void checkCorporateActionGeneralInformation26(CorporateActionGeneralInformation26 obj) throws Exception {
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
	public static void checkCorporateActionGeneralInformation77(CorporateActionGeneralInformation77 obj) throws Exception {
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
	public static void checkCorporateActionEventType69Choice(CorporateActionEventType69Choice obj) throws Exception {
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
	public static void checkCorporateActionEventType51Choice(CorporateActionEventType51Choice obj) throws Exception {
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
	public static void checkCorporateActionGeneralInformation111(CorporateActionGeneralInformation111 obj) throws Exception {
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
	public static void checkCorporateActionGeneralInformation90(CorporateActionGeneralInformation90 obj) throws Exception {
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
	public static void checkCorporateActionEventType11Choice(CorporateActionEventType11Choice obj) throws Exception {
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
	public static void checkCorporateActionGeneralInformation29(CorporateActionGeneralInformation29 obj) throws Exception {
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
	public static void checkCorporateActionGeneralInformation68(CorporateActionGeneralInformation68 obj) throws Exception {
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
	public static void checkCorporateActionGeneralInformation113(CorporateActionGeneralInformation113 obj) throws Exception {
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
	public static void checkCorporateActionEventType56Choice(CorporateActionEventType56Choice obj) throws Exception {
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
	public static void checkCorporateActionGeneralInformation67(CorporateActionGeneralInformation67 obj) throws Exception {
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
}