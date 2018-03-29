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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.positiveInteger;
import com.tools20022.repository.entity.GuaranteePartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GuaranteeDetails1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Legal entity, other than the issuer, who gives a guarantee. The guarantor
 * becomes liable in case of default.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="GuarantorRole" src="doc-files/GuarantorRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.GuaranteePartyRole
 * GuaranteePartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.GuarantorRole#mmPosition
 * GuarantorRole.mmPosition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GuarantorRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Legal entity, other than the issuer, who gives a guarantee. The guarantor becomes liable in case of default."
 * </li>
 * </ul>
 */
public class GuarantorRole extends GuaranteePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected positiveInteger position;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.positiveInteger
	 * positiveInteger}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1#mmPosition
	 * GuaranteeDetails1.mmPosition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GuarantorRole GuarantorRole}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Position"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rank of this guarantor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<GuarantorRole, positiveInteger> mmPosition = new MMBusinessAttribute<GuarantorRole, positiveInteger>() {
		{
			derivation_lazy = () -> Arrays.asList(GuaranteeDetails1.mmPosition);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GuarantorRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Position";
			definition = "Rank of this guarantor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> positiveInteger.mmObject();
		}

		@Override
		public positiveInteger getValue(GuarantorRole obj) {
			return obj.getPosition();
		}

		@Override
		public void setValue(GuarantorRole obj, positiveInteger value) {
			obj.setPosition(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GuarantorRole";
				definition = "Legal entity, other than the issuer, who gives a guarantee. The guarantor becomes liable in case of default.";
				superType_lazy = () -> GuaranteePartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GuarantorRole.mmPosition);
			}

			@Override
			public Class<?> getInstanceClass() {
				return GuarantorRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public positiveInteger getPosition() {
		return position;
	}

	public GuarantorRole setPosition(positiveInteger position) {
		this.position = Objects.requireNonNull(position);
		return this;
	}
}