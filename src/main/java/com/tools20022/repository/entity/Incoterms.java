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
 * <li>{@linkplain com.tools20022.repository.entity.Incoterms#mmTransport
 * Incoterms.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Incoterms#mmCode
 * Incoterms.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Incoterms#mmLocation
 * Incoterms.mmLocation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmIncoterms
 * Location.mmIncoterms}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmIncoterms
 * Transport.mmIncoterms}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShipmentAttribute1#mmConditions
 * ShipmentAttribute1.mmConditions}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected Transport transport;
	/**
	 * Specifies the transport information to which the incoterms apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmIncoterms
	 * Transport.mmIncoterms}</li>
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
	public static final MMBusinessAssociationEnd mmTransport = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Incoterms.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Specifies the transport information to which the incoterms apply.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.mmIncoterms;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
		}
	};
	protected IncotermsCode code;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Incoterms
	 * Incoterms}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.Incoterms4Choice#mmCode
	 * Incoterms4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Incoterms4Choice#mmProprietary
	 * Incoterms4Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms3#mmIncotermsCode
	 * Incoterms3.mmIncotermsCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms1#mmCode
	 * Incoterms1.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms1#mmOther
	 * Incoterms1.mmOther}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms2#mmCode
	 * Incoterms2.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms2#mmOther
	 * Incoterms2.mmOther}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms4#mmIncotermsCode
	 * Incoterms4.mmIncotermsCode}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Incoterms4Choice.mmCode, com.tools20022.repository.choice.Incoterms4Choice.mmProprietary, com.tools20022.repository.msg.Incoterms3.mmIncotermsCode,
					com.tools20022.repository.msg.Incoterms1.mmCode, com.tools20022.repository.msg.Incoterms1.mmOther, com.tools20022.repository.msg.Incoterms2.mmCode, com.tools20022.repository.msg.Incoterms2.mmOther,
					com.tools20022.repository.msg.Incoterms4.mmIncotermsCode);
			elementContext_lazy = () -> Incoterms.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Specifies the applicable Incoterm by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IncotermsCode.mmObject();
		}
	};
	protected Location location;
	/**
	 * Location where the Incoterms are actioned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmIncoterms
	 * Location.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Incoterms
	 * Incoterms}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms3#mmLocation
	 * Incoterms3.mmLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms1#mmLocation
	 * Incoterms1.mmLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms2#mmLocation
	 * Incoterms2.mmLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Incoterms4#mmLocation
	 * Incoterms4.mmLocation}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmLocation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Incoterms3.mmLocation, com.tools20022.repository.msg.Incoterms1.mmLocation, com.tools20022.repository.msg.Incoterms2.mmLocation,
					com.tools20022.repository.msg.Incoterms4.mmLocation);
			elementContext_lazy = () -> Incoterms.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location where the Incoterms are actioned.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmIncoterms;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Incoterms";
				definition = "International commerce terms are a series of international sales terms, published by International Chamber of Commerce (ICC) and widely used in international commercial transactions. These are accepted by governments, legal authorities and practitioners worldwide for the interpretation of most commonly used terms in international trade. Scope of this is limited to matters relating to rights and obligations of the parties to the contract of sale with respect to the delivery of goods sold. They are used to divide transaction costs and responsibilities between buyer and seller and reflect state-of-the-art transportation practices.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Location.mmIncoterms, com.tools20022.repository.entity.Transport.mmIncoterms);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ShipmentAttribute1.mmConditions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Incoterms.mmTransport, com.tools20022.repository.entity.Incoterms.mmCode, com.tools20022.repository.entity.Incoterms.mmLocation);
				derivationComponent_lazy = () -> Arrays.asList(Incoterms4Choice.mmObject(), Incoterms3.mmObject(), Incoterms1.mmObject(), Incoterms2.mmObject(), Incoterms4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(com.tools20022.repository.entity.Transport transport) {
		this.transport = transport;
	}

	public IncotermsCode getCode() {
		return code;
	}

	public void setCode(IncotermsCode code) {
		this.code = code;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(com.tools20022.repository.entity.Location location) {
		this.location = location;
	}
}