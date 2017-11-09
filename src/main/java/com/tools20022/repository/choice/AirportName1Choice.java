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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max6Text;
import com.tools20022.repository.entity.TransportByAir;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AirportDescription1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies an airport by its code or by its name and the town where it is
 * located.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AirportName1Choice#mmAirportCode
 * AirportName1Choice.mmAirportCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AirportName1Choice#mmOtherAirportDescription
 * AirportName1Choice.mmOtherAirportDescription}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TransportByAir
 * TransportByAir}</li>
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
 * "AirportName1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies an airport by its code or by its name and the town where it is located."
 * </li>
 * </ul>
 */
public class AirportName1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Max6Text airportCode;
	/**
	 * Identifies an airport by means of its IATA identification code. Example:
	 * LHR.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max6Text
	 * Max6Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportByAir#mmAirportName
	 * TransportByAir.mmAirportName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AirportName1Choice
	 * AirportName1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AirprtCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AirportCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an airport by means of its IATA identification code. Example: LHR."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAirportCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TransportByAir.mmAirportName;
			componentContext_lazy = () -> AirportName1Choice.mmObject();
			isDerived = false;
			xmlTag = "AirprtCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AirportCode";
			definition = "Identifies an airport by means of its IATA identification code. Example: LHR.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max6Text.mmObject();
		}
	};
	protected AirportDescription1 otherAirportDescription;
	/**
	 * Identifies an airport by its location and by its name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AirportDescription1
	 * AirportDescription1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportByAir#mmAirportName
	 * TransportByAir.mmAirportName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AirportName1Choice
	 * AirportName1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAirprtDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAirportDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies an airport by its location and by its name."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherAirportDescription = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TransportByAir.mmAirportName;
			componentContext_lazy = () -> AirportName1Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrAirprtDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAirportDescription";
			definition = "Identifies an airport by its location and by its name.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AirportDescription1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AirportName1Choice.mmAirportCode, AirportName1Choice.mmOtherAirportDescription);
				trace_lazy = () -> TransportByAir.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AirportName1Choice";
				definition = "Identifies an airport by its code or by its name and the town where it is located.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max6Text getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(Max6Text airportCode) {
		this.airportCode = airportCode;
	}

	public AirportDescription1 getOtherAirportDescription() {
		return otherAirportDescription;
	}

	public void setOtherAirportDescription(AirportDescription1 otherAirportDescription) {
		this.otherAirportDescription = otherAirportDescription;
	}
}