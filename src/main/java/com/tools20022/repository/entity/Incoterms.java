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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.Incoterms4Choice;
import com.tools20022.repository.codeset.IncotermsCode;
import com.tools20022.repository.msg.Incoterms1;
import com.tools20022.repository.msg.Incoterms2;
import com.tools20022.repository.msg.Incoterms3;
import com.tools20022.repository.msg.Incoterms4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * International commerce terms are a series of international sales terms,
 * published by International Chamber of Commerce (ICC) and widely used in
 * international commercial transactions. These are accepted by governments,
 * legal authorities and practitioners worldwide for the interpretation of most
 * commonly used terms in international trade. Scope of this is limited to
 * matters relating to rights and obligations of the parties to the contract of
 * sale with respect to the delivery of goods sold. They are used to divide
 * transaction costs and responsibilities between buyer and seller and reflect
 * state-of-the-art transportation practices.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Incoterms" src="doc-files/Incoterms.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Incoterms#Transport
 * Incoterms.Transport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Incoterms#Code
 * Incoterms.Code}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Incoterms#Location
 * Incoterms.Location}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Location#Incoterms
 * Location.Incoterms}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#Incoterms
 * Transport.Incoterms}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ShipmentAttribute1#Conditions
 * ShipmentAttribute1.Conditions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Incoterms4Choice
 * Incoterms4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Incoterms3 Incoterms3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Incoterms1 Incoterms1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Incoterms2 Incoterms2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Incoterms4 Incoterms4}</li>
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
 * "Incoterms"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "International commerce terms are a series of international sales terms, published by International Chamber of Commerce (ICC) and widely used in international commercial transactions. These are accepted by governments, legal authorities and practitioners worldwide for the interpretation of most commonly used terms in international trade. Scope of this is limited to matters relating to rights and obligations of the parties to the contract of sale with respect to the delivery of goods sold. They are used to divide transaction costs and responsibilities between buyer and seller and reflect state-of-the-art transportation practices."
 * </li>
 * </ul>
 */
public class Incoterms {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the transport information to which the incoterms apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#Incoterms
	 * Transport.Incoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Transport Transport}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Incoterms
	 * Incoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the transport information to which the incoterms apply."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Transport = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Incoterms.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Specifies the transport information to which the incoterms apply.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.Incoterms;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the applicable Incoterm by means of a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IncotermsCode
	 * IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.Incoterms4Choice#Code
	 * Incoterms4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Incoterms4Choice#Proprietary
	 * Incoterms4Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms3#IncotermsCode
	 * Incoterms3.IncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms1#Code
	 * Incoterms1.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms1#Other
	 * Incoterms1.Other}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms2#Code
	 * Incoterms2.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms2#Other
	 * Incoterms2.Other}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms4#IncotermsCode
	 * Incoterms4.IncotermsCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Incoterms
	 * Incoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the applicable Incoterm by means of a code."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Code = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Incoterms4Choice.Code, com.tools20022.repository.choice.Incoterms4Choice.Proprietary, com.tools20022.repository.msg.Incoterms3.IncotermsCode,
					com.tools20022.repository.msg.Incoterms1.Code, com.tools20022.repository.msg.Incoterms1.Other, com.tools20022.repository.msg.Incoterms2.Code, com.tools20022.repository.msg.Incoterms2.Other,
					com.tools20022.repository.msg.Incoterms4.IncotermsCode);
			elementContext_lazy = () -> Incoterms.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Specifies the applicable Incoterm by means of a code.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> IncotermsCode.mmObject();
		}
	};
	/**
	 * Location where the Incoterms are actioned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#Incoterms
	 * Location.Incoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms3#Location
	 * Incoterms3.Location}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms1#Location
	 * Incoterms1.Location}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms2#Location
	 * Incoterms2.Location}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms4#Location
	 * Incoterms4.Location}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Incoterms
	 * Incoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location where the Incoterms are actioned."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Location = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Incoterms3.Location, com.tools20022.repository.msg.Incoterms1.Location, com.tools20022.repository.msg.Incoterms2.Location,
					com.tools20022.repository.msg.Incoterms4.Location);
			elementContext_lazy = () -> Incoterms.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location where the Incoterms are actioned.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.Incoterms;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Incoterms";
				definition = "International commerce terms are a series of international sales terms, published by International Chamber of Commerce (ICC) and widely used in international commercial transactions. These are accepted by governments, legal authorities and practitioners worldwide for the interpretation of most commonly used terms in international trade. Scope of this is limited to matters relating to rights and obligations of the parties to the contract of sale with respect to the delivery of goods sold. They are used to divide transaction costs and responsibilities between buyer and seller and reflect state-of-the-art transportation practices.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Location.Incoterms, com.tools20022.repository.entity.Transport.Incoterms);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ShipmentAttribute1.Conditions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Incoterms.Transport, com.tools20022.repository.entity.Incoterms.Code, com.tools20022.repository.entity.Incoterms.Location);
				derivationComponent_lazy = () -> Arrays.asList(Incoterms4Choice.mmObject(), Incoterms3.mmObject(), Incoterms1.mmObject(), Incoterms2.mmObject(), Incoterms4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}