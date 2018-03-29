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
import com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1;

/**
 * When a signature is created for a message component that contains IDREFs or
 * IDs, a manifest must be used to include the referenced data.
 */
public class ConstraintManifestRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1
	 * QualifiedPartyAndXMLSignature1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMConstraint#getExpressionLanguage
	 * expressionLanguage} = " "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManifestRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When a signature is created for a message component that contains IDREFs or IDs, a manifest must be used to include the referenced data."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<QualifiedPartyAndXMLSignature1> forQualifiedPartyAndXMLSignature1 = new MMConstraint<QualifiedPartyAndXMLSignature1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManifestRule";
			definition = "When a signature is created for a message component that contains IDREFs or IDs, a manifest must be used to include the referenced data.";
			owner_lazy = () -> QualifiedPartyAndXMLSignature1.mmObject();
			expressionLanguage = " ";
		}

		@Override
		public void executeValidator(QualifiedPartyAndXMLSignature1 obj) throws Exception {
			checkQualifiedPartyAndXMLSignature1(obj);
		}
	};

	/**
	 * When a signature is created for a message component that contains IDREFs
	 * or IDs, a manifest must be used to include the referenced data.
	 */
	public static void checkQualifiedPartyAndXMLSignature1(QualifiedPartyAndXMLSignature1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}