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
import java.util.Arrays;

/**
 * IssuerAgent must be used only in the communication between a CSD and local
 * custodians.
 */
public class ConstraintIssuerAgentGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV09
	 * CorporateActionMovementReversalAdviceV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementReversalAdviceV08
	 * ConstraintIssuerAgentGuideline.
	 * forCorporateActionMovementReversalAdviceV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV09> forCorporateActionMovementReversalAdviceV09 = new MMConstraint<CorporateActionMovementReversalAdviceV09>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementReversalAdviceV09;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementReversalAdviceV08;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV09.mmObject();
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
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionNotificationV07
	 * ConstraintIssuerAgentGuideline.forCorporateActionNotificationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV08> forCorporateActionNotificationV08 = new MMConstraint<CorporateActionNotificationV08>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionNotificationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionNotificationV07;
			owner_lazy = () -> CorporateActionNotificationV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV09
	 * CorporateActionMovementConfirmationV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementConfirmationV08
	 * ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV08}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV09> forCorporateActionMovementConfirmationV09 = new MMConstraint<CorporateActionMovementConfirmationV09>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementConfirmationV09;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV08;
			owner_lazy = () -> CorporateActionMovementConfirmationV09.mmObject();
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
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionNotificationV08
	 * ConstraintIssuerAgentGuideline.forCorporateActionNotificationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionNotificationV06
	 * ConstraintIssuerAgentGuideline.forCorporateActionNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV07> forCorporateActionNotificationV07 = new MMConstraint<CorporateActionNotificationV07>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionNotificationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionNotificationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionNotificationV06;
			owner_lazy = () -> CorporateActionNotificationV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08
	 * CorporateActionMovementConfirmationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementConfirmationV09
	 * ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV09}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementConfirmationV07
	 * ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV07}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV08> forCorporateActionMovementConfirmationV08 = new MMConstraint<CorporateActionMovementConfirmationV08>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementConfirmationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV07;
			owner_lazy = () -> CorporateActionMovementConfirmationV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08
	 * CorporateActionMovementReversalAdviceV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementReversalAdviceV09
	 * ConstraintIssuerAgentGuideline.
	 * forCorporateActionMovementReversalAdviceV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementReversalAdviceV07
	 * ConstraintIssuerAgentGuideline.
	 * forCorporateActionMovementReversalAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV08> forCorporateActionMovementReversalAdviceV08 = new MMConstraint<CorporateActionMovementReversalAdviceV08>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementReversalAdviceV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementReversalAdviceV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementReversalAdviceV07;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08
	 * CorporateActionMovementReversalAdvice002V08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdvice002V08> forCorporateActionMovementReversalAdvice002V08 = new MMConstraint<CorporateActionMovementReversalAdvice002V08>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementReversalAdvice002V08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			owner_lazy = () -> CorporateActionMovementReversalAdvice002V08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07
	 * CorporateActionNotification002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification002V07> forCorporateActionNotification002V07 = new MMConstraint<CorporateActionNotification002V07>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionNotification002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			owner_lazy = () -> CorporateActionNotification002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V08
	 * CorporateActionMovementConfirmation002V08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmation002V08> forCorporateActionMovementConfirmation002V08 = new MMConstraint<CorporateActionMovementConfirmation002V08>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementConfirmation002V08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			owner_lazy = () -> CorporateActionMovementConfirmation002V08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01
	 * CorporateActionMovementConfirmationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV01> forCorporateActionMovementConfirmationV01 = new MMConstraint<CorporateActionMovementConfirmationV01>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementConfirmationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			owner_lazy = () -> CorporateActionMovementConfirmationV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02
	 * CorporateActionMovementConfirmationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV02> forCorporateActionMovementConfirmationV02 = new MMConstraint<CorporateActionMovementConfirmationV02>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			owner_lazy = () -> CorporateActionMovementConfirmationV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03
	 * CorporateActionMovementConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV03> forCorporateActionMovementConfirmationV03 = new MMConstraint<CorporateActionMovementConfirmationV03>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			owner_lazy = () -> CorporateActionMovementConfirmationV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04
	 * CorporateActionMovementConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementConfirmationV05
	 * ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV05}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV04> forCorporateActionMovementConfirmationV04 = new MMConstraint<CorporateActionMovementConfirmationV04>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV05);
			owner_lazy = () -> CorporateActionMovementConfirmationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01
	 * CorporateActionMovementReversalAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV01> forCorporateActionMovementReversalAdviceV01 = new MMConstraint<CorporateActionMovementReversalAdviceV01>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementReversalAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02
	 * CorporateActionMovementReversalAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV02> forCorporateActionMovementReversalAdviceV02 = new MMConstraint<CorporateActionMovementReversalAdviceV02>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementReversalAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03
	 * CorporateActionMovementReversalAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV03> forCorporateActionMovementReversalAdviceV03 = new MMConstraint<CorporateActionMovementReversalAdviceV03>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementReversalAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04
	 * CorporateActionMovementReversalAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementReversalAdviceV05
	 * ConstraintIssuerAgentGuideline.
	 * forCorporateActionMovementReversalAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV04> forCorporateActionMovementReversalAdviceV04 = new MMConstraint<CorporateActionMovementReversalAdviceV04>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementReversalAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementReversalAdviceV05);
			owner_lazy = () -> CorporateActionMovementReversalAdviceV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01
	 * CorporateActionNotificationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV01> forCorporateActionNotificationV01 = new MMConstraint<CorporateActionNotificationV01>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionNotificationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			owner_lazy = () -> CorporateActionNotificationV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02
	 * CorporateActionNotificationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV02> forCorporateActionNotificationV02 = new MMConstraint<CorporateActionNotificationV02>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionNotificationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			owner_lazy = () -> CorporateActionNotificationV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03
	 * CorporateActionNotificationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV03> forCorporateActionNotificationV03 = new MMConstraint<CorporateActionNotificationV03>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			owner_lazy = () -> CorporateActionNotificationV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04
	 * CorporateActionNotificationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionNotificationV05
	 * ConstraintIssuerAgentGuideline.forCorporateActionNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV04> forCorporateActionNotificationV04 = new MMConstraint<CorporateActionNotificationV04>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionNotificationV05);
			owner_lazy = () -> CorporateActionNotificationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05
	 * CorporateActionMovementConfirmationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementConfirmationV06
	 * ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV06}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementConfirmationV04
	 * ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV04}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV05> forCorporateActionMovementConfirmationV05 = new MMConstraint<CorporateActionMovementConfirmationV05>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV04;
			owner_lazy = () -> CorporateActionMovementConfirmationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05
	 * CorporateActionNotificationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionNotificationV06
	 * ConstraintIssuerAgentGuideline.forCorporateActionNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionNotificationV04
	 * ConstraintIssuerAgentGuideline.forCorporateActionNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV05> forCorporateActionNotificationV05 = new MMConstraint<CorporateActionNotificationV05>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionNotificationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionNotificationV04;
			owner_lazy = () -> CorporateActionNotificationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05
	 * CorporateActionMovementReversalAdviceV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementReversalAdviceV06
	 * ConstraintIssuerAgentGuideline.
	 * forCorporateActionMovementReversalAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementReversalAdviceV04
	 * ConstraintIssuerAgentGuideline.
	 * forCorporateActionMovementReversalAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV05> forCorporateActionMovementReversalAdviceV05 = new MMConstraint<CorporateActionMovementReversalAdviceV05>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementReversalAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementReversalAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementReversalAdviceV04;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06
	 * CorporateActionMovementConfirmationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementConfirmationV07
	 * ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV07}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementConfirmationV05
	 * ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV05}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV06> forCorporateActionMovementConfirmationV06 = new MMConstraint<CorporateActionMovementConfirmationV06>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementConfirmationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV05;
			owner_lazy = () -> CorporateActionMovementConfirmationV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06
	 * CorporateActionMovementReversalAdviceV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementReversalAdviceV07
	 * ConstraintIssuerAgentGuideline.
	 * forCorporateActionMovementReversalAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementReversalAdviceV05
	 * ConstraintIssuerAgentGuideline.
	 * forCorporateActionMovementReversalAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV06> forCorporateActionMovementReversalAdviceV06 = new MMConstraint<CorporateActionMovementReversalAdviceV06>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementReversalAdviceV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementReversalAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementReversalAdviceV05;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07
	 * CorporateActionMovementConfirmationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementConfirmationV08
	 * ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV08}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementConfirmationV06
	 * ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV06}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV07> forCorporateActionMovementConfirmationV07 = new MMConstraint<CorporateActionMovementConfirmationV07>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementConfirmationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementConfirmationV06;
			owner_lazy = () -> CorporateActionMovementConfirmationV07.mmObject();
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
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionNotificationV07
	 * ConstraintIssuerAgentGuideline.forCorporateActionNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionNotificationV05
	 * ConstraintIssuerAgentGuideline.forCorporateActionNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV06> forCorporateActionNotificationV06 = new MMConstraint<CorporateActionNotificationV06>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionNotificationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionNotificationV05;
			owner_lazy = () -> CorporateActionNotificationV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07
	 * CorporateActionMovementReversalAdviceV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgentGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "IssuerAgent must be used only in the communication between a CSD and local custodians."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementReversalAdviceV08
	 * ConstraintIssuerAgentGuideline.
	 * forCorporateActionMovementReversalAdviceV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline#forCorporateActionMovementReversalAdviceV06
	 * ConstraintIssuerAgentGuideline.
	 * forCorporateActionMovementReversalAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV07> forCorporateActionMovementReversalAdviceV07 = new MMConstraint<CorporateActionMovementReversalAdviceV07>() {
		{
			validator = ConstraintIssuerAgentGuideline::checkCorporateActionMovementReversalAdviceV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgentGuideline";
			definition = "IssuerAgent must be used only in the communication between a CSD and local custodians.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementReversalAdviceV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerAgentGuideline.forCorporateActionMovementReversalAdviceV06;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV07.mmObject();
		}
	};

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementReversalAdviceV09(CorporateActionMovementReversalAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionNotificationV08(CorporateActionNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementConfirmationV09(CorporateActionMovementConfirmationV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionNotificationV07(CorporateActionNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementConfirmationV08(CorporateActionMovementConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementReversalAdviceV08(CorporateActionMovementReversalAdviceV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementReversalAdvice002V08(CorporateActionMovementReversalAdvice002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionNotification002V07(CorporateActionNotification002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementConfirmation002V08(CorporateActionMovementConfirmation002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementConfirmationV01(CorporateActionMovementConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementConfirmationV02(CorporateActionMovementConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementConfirmationV03(CorporateActionMovementConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementConfirmationV04(CorporateActionMovementConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementReversalAdviceV01(CorporateActionMovementReversalAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementReversalAdviceV02(CorporateActionMovementReversalAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementReversalAdviceV03(CorporateActionMovementReversalAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementReversalAdviceV04(CorporateActionMovementReversalAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionNotificationV01(CorporateActionNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionNotificationV02(CorporateActionNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionNotificationV03(CorporateActionNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionNotificationV04(CorporateActionNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementConfirmationV05(CorporateActionMovementConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionNotificationV05(CorporateActionNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementReversalAdviceV05(CorporateActionMovementReversalAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementConfirmationV06(CorporateActionMovementConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementReversalAdviceV06(CorporateActionMovementReversalAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementConfirmationV07(CorporateActionMovementConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionNotificationV06(CorporateActionNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * IssuerAgent must be used only in the communication between a CSD and
	 * local custodians.
	 */
	public static void checkCorporateActionMovementReversalAdviceV07(CorporateActionMovementReversalAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}