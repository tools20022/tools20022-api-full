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
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present
 * and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must
 * not be '1' or 'true' (Yes).
 */
public class ConstraintAppliedOptionRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115
	 * CorporateActionOption115}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionOption129
	 * ConstraintAppliedOptionRule.forCorporateActionOption129}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption115> forCorporateActionOption115 = new MMConstraint<CorporateActionOption115>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionOption129);
			owner_lazy = () -> CorporateActionOption115.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption115 obj) throws Exception {
			checkCorporateActionOption115(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09
	 * CorporateActionMovementPreliminaryAdviceV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values must be REAC (RequiredAction)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#for_seev_CorporateActionMovementPreliminaryAdviceV08
	 * ConstraintAppliedOptionRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV09> for_seev_CorporateActionMovementPreliminaryAdviceV09 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values must be REAC (RequiredAction).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAppliedOptionRule.for_seev_CorporateActionMovementPreliminaryAdviceV08;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV09 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionOption138
	 * ConstraintAppliedOptionRule.forCorporateActionOption138}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionOption114
	 * ConstraintAppliedOptionRule.forCorporateActionOption114}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption130> forCorporateActionOption130 = new MMConstraint<CorporateActionOption130>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionOption138);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionOption114;
			owner_lazy = () -> CorporateActionOption130.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption130 obj) throws Exception {
			checkCorporateActionOption130(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135
	 * CorporateActionOption135}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption135> forCorporateActionOption135 = new MMConstraint<CorporateActionOption135>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			owner_lazy = () -> CorporateActionOption135.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption135 obj) throws Exception {
			checkCorporateActionOption135(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V06
	 * CorporateActionNotification002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification002V06> for_seev_CorporateActionNotification002V06 = new MMConstraint<CorporateActionNotification002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction).";
			owner_lazy = () -> CorporateActionNotification002V06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotification002V06 obj) throws Exception {
			check_seev_CorporateActionNotification002V06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08
	 * CorporateActionNotificationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values must be REAC (RequiredAction)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#for_seev_CorporateActionNotificationV07
	 * ConstraintAppliedOptionRule.for_seev_CorporateActionNotificationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV08> for_seev_CorporateActionNotificationV08 = new MMConstraint<CorporateActionNotificationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values must be REAC (RequiredAction).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAppliedOptionRule.for_seev_CorporateActionNotificationV07;
			owner_lazy = () -> CorporateActionNotificationV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV08 obj) throws Exception {
			check_seev_CorporateActionNotificationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V09
	 * CorporateActionMovementPreliminaryAdvice002V09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values must be REAC (RequiredAction)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdvice002V09> for_seev_CorporateActionMovementPreliminaryAdvice002V09 = new MMConstraint<CorporateActionMovementPreliminaryAdvice002V09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values must be REAC (RequiredAction).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdvice002V09.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdvice002V09 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdvice002V09(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114
	 * CorporateActionOption114}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionOption130
	 * ConstraintAppliedOptionRule.forCorporateActionOption130}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption114> forCorporateActionOption114 = new MMConstraint<CorporateActionOption114>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionOption130);
			owner_lazy = () -> CorporateActionOption114.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption114 obj) throws Exception {
			checkCorporateActionOption114(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148
	 * CorporateActionOption148}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption148> forCorporateActionOption148 = new MMConstraint<CorporateActionOption148>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			owner_lazy = () -> CorporateActionOption148.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption148 obj) throws Exception {
			checkCorporateActionOption148(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125
	 * CorporateActionOption125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption125> forCorporateActionOption125 = new MMConstraint<CorporateActionOption125>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			owner_lazy = () -> CorporateActionOption125.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption125 obj) throws Exception {
			checkCorporateActionOption125(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06
	 * CorporateActionNotificationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#for_seev_CorporateActionNotificationV07
	 * ConstraintAppliedOptionRule.for_seev_CorporateActionNotificationV07}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV06> for_seev_CorporateActionNotificationV06 = new MMConstraint<CorporateActionNotificationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAppliedOptionRule.for_seev_CorporateActionNotificationV07);
			owner_lazy = () -> CorporateActionNotificationV06.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV06 obj) throws Exception {
			check_seev_CorporateActionNotificationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139
	 * CorporateActionOption139}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionOption129
	 * ConstraintAppliedOptionRule.forCorporateActionOption129}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption139> forCorporateActionOption139 = new MMConstraint<CorporateActionOption139>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionOption129;
			owner_lazy = () -> CorporateActionOption139.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption139 obj) throws Exception {
			checkCorporateActionOption139(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07
	 * CorporateActionNotificationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#for_seev_CorporateActionNotificationV08
	 * ConstraintAppliedOptionRule.for_seev_CorporateActionNotificationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#for_seev_CorporateActionNotificationV06
	 * ConstraintAppliedOptionRule.for_seev_CorporateActionNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV07> for_seev_CorporateActionNotificationV07 = new MMConstraint<CorporateActionNotificationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAppliedOptionRule.for_seev_CorporateActionNotificationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAppliedOptionRule.for_seev_CorporateActionNotificationV06;
			owner_lazy = () -> CorporateActionNotificationV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotificationV07 obj) throws Exception {
			check_seev_CorporateActionNotificationV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07
	 * CorporateActionMovementPreliminaryAdviceV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#for_seev_CorporateActionMovementPreliminaryAdviceV08
	 * ConstraintAppliedOptionRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceV08}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV07> for_seev_CorporateActionMovementPreliminaryAdviceV07 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAppliedOptionRule.for_seev_CorporateActionMovementPreliminaryAdviceV08);
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV07 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138
	 * CorporateActionOption138}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionOption130
	 * ConstraintAppliedOptionRule.forCorporateActionOption130}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption138> forCorporateActionOption138 = new MMConstraint<CorporateActionOption138>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionOption130;
			owner_lazy = () -> CorporateActionOption138.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption138 obj) throws Exception {
			checkCorporateActionOption138(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08
	 * CorporateActionMovementPreliminaryAdviceV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#for_seev_CorporateActionMovementPreliminaryAdviceV09
	 * ConstraintAppliedOptionRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#for_seev_CorporateActionMovementPreliminaryAdviceV07
	 * ConstraintAppliedOptionRule.
	 * for_seev_CorporateActionMovementPreliminaryAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV08> for_seev_CorporateActionMovementPreliminaryAdviceV08 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAppliedOptionRule.for_seev_CorporateActionMovementPreliminaryAdviceV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAppliedOptionRule.for_seev_CorporateActionMovementPreliminaryAdviceV07;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV08 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08
	 * CorporateActionNotification002V08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values must be REAC (RequiredAction)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification002V08> for_seev_CorporateActionNotification002V08 = new MMConstraint<CorporateActionNotification002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values must be REAC (RequiredAction).";
			owner_lazy = () -> CorporateActionNotification002V08.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionNotification002V08 obj) throws Exception {
			check_seev_CorporateActionNotification002V08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150
	 * CorporateActionOption150}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption150> forCorporateActionOption150 = new MMConstraint<CorporateActionOption150>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			owner_lazy = () -> CorporateActionOption150.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption150 obj) throws Exception {
			checkCorporateActionOption150(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133
	 * CorporateActionOption133}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption133> forCorporateActionOption133 = new MMConstraint<CorporateActionOption133>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			owner_lazy = () -> CorporateActionOption133.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption133 obj) throws Exception {
			checkCorporateActionOption133(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129
	 * CorporateActionOption129}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionOption139
	 * ConstraintAppliedOptionRule.forCorporateActionOption139}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionOption115
	 * ConstraintAppliedOptionRule.forCorporateActionOption115}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption129> forCorporateActionOption129 = new MMConstraint<CorporateActionOption129>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionOption139);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionOption115;
			owner_lazy = () -> CorporateActionOption129.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption129 obj) throws Exception {
			checkCorporateActionOption129(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127
	 * CorporateActionOption127}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption127> forCorporateActionOption127 = new MMConstraint<CorporateActionOption127>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			owner_lazy = () -> CorporateActionOption127.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionOption127 obj) throws Exception {
			checkCorporateActionOption127(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V07
	 * CorporateActionMovementPreliminaryAdvice002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdvice002V07> for_seev_CorporateActionMovementPreliminaryAdvice002V07 = new MMConstraint<CorporateActionMovementPreliminaryAdvice002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdvice002V07.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdvice002V07 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdvice002V07(obj);
		}
	};

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption115(CorporateActionOption115 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true'
	 * or '1' (Yes) in one or more occurrences of
	 * CorporateActionMovementDetails, then
	 * CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value
	 * must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values
	 * must be REAC (RequiredAction).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV09(CorporateActionMovementPreliminaryAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption130(CorporateActionOption130 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption135(CorporateActionOption135 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or
	 * '1' (Yes) in one or more occurrences of CorporateActionOptionDetails,
	 * then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code
	 * value must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must
	 * be REAC (RequiredAction).
	 */
	public static void check_seev_CorporateActionNotification002V06(CorporateActionNotification002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or
	 * '1' (Yes) in one or more occurrences of CorporateActionOptionDetails,
	 * then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code
	 * value must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values
	 * must be REAC (RequiredAction).
	 */
	public static void check_seev_CorporateActionNotificationV08(CorporateActionNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true'
	 * or '1' (Yes) in one or more occurrences of
	 * CorporateActionMovementDetails, then
	 * CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value
	 * must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values
	 * must be REAC (RequiredAction).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdvice002V09(CorporateActionMovementPreliminaryAdvice002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption114(CorporateActionOption114 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption148(CorporateActionOption148 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption125(CorporateActionOption125 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or
	 * '1' (Yes) in one or more occurrences of CorporateActionOptionDetails,
	 * then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code
	 * value must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must
	 * be REAC (RequiredAction).
	 */
	public static void check_seev_CorporateActionNotificationV06(CorporateActionNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption139(CorporateActionOption139 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or
	 * '1' (Yes) in one or more occurrences of CorporateActionOptionDetails,
	 * then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code
	 * value must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must
	 * be REAC (RequiredAction).
	 */
	public static void check_seev_CorporateActionNotificationV07(CorporateActionNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true'
	 * or '1' (Yes) in one or more occurrences of
	 * CorporateActionMovementDetails, then
	 * CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value
	 * must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must
	 * be REAC (RequiredAction).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV07(CorporateActionMovementPreliminaryAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption138(CorporateActionOption138 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true'
	 * or '1' (Yes) in one or more occurrences of
	 * CorporateActionMovementDetails, then
	 * CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value
	 * must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must
	 * be REAC (RequiredAction).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV08(CorporateActionMovementPreliminaryAdviceV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or
	 * '1' (Yes) in one or more occurrences of CorporateActionOptionDetails,
	 * then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code
	 * value must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values
	 * must be REAC (RequiredAction).
	 */
	public static void check_seev_CorporateActionNotification002V08(CorporateActionNotification002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption150(CorporateActionOption150 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption133(CorporateActionOption133 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption129(CorporateActionOption129 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption127(CorporateActionOption127 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true'
	 * or '1' (Yes) in one or more occurrences of
	 * CorporateActionMovementDetails, then
	 * CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value
	 * must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must
	 * be REAC (RequiredAction).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdvice002V07(CorporateActionMovementPreliminaryAdvice002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}