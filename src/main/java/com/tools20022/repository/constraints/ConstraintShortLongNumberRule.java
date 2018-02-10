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
import java.util.Arrays;

/**
 * ShortNumber must contain the FIN message type number of the linked message.
 * LongNumber must contain the XML message identifier of the linked message.
 */
public class ConstraintShortLongNumberRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber1Choice
	 * DocumentNumber1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ShortNumber must contain the FIN message type number of the linked message. LongNumber must contain the XML message identifier of the linked message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintShortLongNumberRule#forDocumentNumber5Choice
	 * ConstraintShortLongNumberRule.forDocumentNumber5Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber1Choice> forDocumentNumber1Choice = new MMConstraint<DocumentNumber1Choice>() {
		{
			validator = ConstraintShortLongNumberRule::checkDocumentNumber1Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongNumberRule";
			definition = "ShortNumber must contain the FIN message type number of the linked message. LongNumber must contain the XML message identifier of the linked message.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintShortLongNumberRule.forDocumentNumber5Choice);
			owner_lazy = () -> DocumentNumber1Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber2Choice
	 * DocumentNumber2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ShortNumber must contain the FIN message type number of the linked message. LongNumber must contain the XML message identifier of the linked message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber2Choice> forDocumentNumber2Choice = new MMConstraint<DocumentNumber2Choice>() {
		{
			validator = ConstraintShortLongNumberRule::checkDocumentNumber2Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongNumberRule";
			definition = "ShortNumber must contain the FIN message type number of the linked message. LongNumber must contain the XML message identifier of the linked message.";
			owner_lazy = () -> DocumentNumber2Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber3Choice
	 * DocumentNumber3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ShortNumber must contain the FIN message type number of the linked message. LongNumber must contain the XML message identifier of the linked message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber3Choice> forDocumentNumber3Choice = new MMConstraint<DocumentNumber3Choice>() {
		{
			validator = ConstraintShortLongNumberRule::checkDocumentNumber3Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongNumberRule";
			definition = "ShortNumber must contain the FIN message type number of the linked message. LongNumber must contain the XML message identifier of the linked message.";
			owner_lazy = () -> DocumentNumber3Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber4Choice
	 * DocumentNumber4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ShortNumber must contain the FIN message type number of the linked message. LongNumber must contain the XML message identifier of the linked message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber4Choice> forDocumentNumber4Choice = new MMConstraint<DocumentNumber4Choice>() {
		{
			validator = ConstraintShortLongNumberRule::checkDocumentNumber4Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongNumberRule";
			definition = "ShortNumber must contain the FIN message type number of the linked message. LongNumber must contain the XML message identifier of the linked message.";
			owner_lazy = () -> DocumentNumber4Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber5Choice
	 * DocumentNumber5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ShortNumber must contain the FIN message type number of the linked message. LongNumber must contain the XML message identifier of the linked message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintShortLongNumberRule#forDocumentNumber1Choice
	 * ConstraintShortLongNumberRule.forDocumentNumber1Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber5Choice> forDocumentNumber5Choice = new MMConstraint<DocumentNumber5Choice>() {
		{
			validator = ConstraintShortLongNumberRule::checkDocumentNumber5Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongNumberRule";
			definition = "ShortNumber must contain the FIN message type number of the linked message. LongNumber must contain the XML message identifier of the linked message.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintShortLongNumberRule.forDocumentNumber1Choice;
			owner_lazy = () -> DocumentNumber5Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber6Choice
	 * DocumentNumber6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ShortNumber must contain the FIN message type number of the linked message. LongNumber must contain the XML message identifier of the linked message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber6Choice> forDocumentNumber6Choice = new MMConstraint<DocumentNumber6Choice>() {
		{
			validator = ConstraintShortLongNumberRule::checkDocumentNumber6Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongNumberRule";
			definition = "ShortNumber must contain the FIN message type number of the linked message. LongNumber must contain the XML message identifier of the linked message.";
			owner_lazy = () -> DocumentNumber6Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber16Choice
	 * DocumentNumber16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ShortNumber must contain the FIN message type number of the linked message. LongNumber must contain the XML message identifier of the linked message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DocumentNumber16Choice> forDocumentNumber16Choice = new MMConstraint<DocumentNumber16Choice>() {
		{
			validator = ConstraintShortLongNumberRule::checkDocumentNumber16Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongNumberRule";
			definition = "ShortNumber must contain the FIN message type number of the linked message. LongNumber must contain the XML message identifier of the linked message.";
			owner_lazy = () -> DocumentNumber16Choice.mmObject();
		}
	};

	/**
	 * ShortNumber must contain the FIN message type number of the linked
	 * message. LongNumber must contain the XML message identifier of the linked
	 * message.
	 */
	public static void checkDocumentNumber1Choice(DocumentNumber1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ShortNumber must contain the FIN message type number of the linked
	 * message. LongNumber must contain the XML message identifier of the linked
	 * message.
	 */
	public static void checkDocumentNumber2Choice(DocumentNumber2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ShortNumber must contain the FIN message type number of the linked
	 * message. LongNumber must contain the XML message identifier of the linked
	 * message.
	 */
	public static void checkDocumentNumber3Choice(DocumentNumber3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ShortNumber must contain the FIN message type number of the linked
	 * message. LongNumber must contain the XML message identifier of the linked
	 * message.
	 */
	public static void checkDocumentNumber4Choice(DocumentNumber4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ShortNumber must contain the FIN message type number of the linked
	 * message. LongNumber must contain the XML message identifier of the linked
	 * message.
	 */
	public static void checkDocumentNumber5Choice(DocumentNumber5Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ShortNumber must contain the FIN message type number of the linked
	 * message. LongNumber must contain the XML message identifier of the linked
	 * message.
	 */
	public static void checkDocumentNumber6Choice(DocumentNumber6Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ShortNumber must contain the FIN message type number of the linked
	 * message. LongNumber must contain the XML message identifier of the linked
	 * message.
	 */
	public static void checkDocumentNumber16Choice(DocumentNumber16Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}