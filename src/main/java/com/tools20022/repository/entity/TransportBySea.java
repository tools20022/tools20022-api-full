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
import com.tools20022.repository.choice.ShipmentDate1Choice;
import com.tools20022.repository.datatype.Exact7NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Information related for the transportation of goods by sea.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TransportBySea" src="doc-files/TransportBySea.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Transport
 * Transport}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TransportBySea#mmVesselName
 * TransportBySea.mmVesselName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransportBySea#mmVoyageNumber
 * TransportBySea.mmVoyageNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransportBySea#mmChartererName
 * TransportBySea.mmChartererName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportBySea#mmMasterName
 * TransportBySea.mmMasterName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportBySea#mmOwnerName
 * TransportBySea.mmOwnerName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportBySea#mmIMONumber
 * TransportBySea.mmIMONumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport1#mmTransportBySea
 * SingleTransport1.mmTransportBySea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport4#mmTransportBySea
 * SingleTransport4.mmTransportBySea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport2#mmTransportBySea
 * SingleTransport2.mmTransportBySea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport5#mmTransportBySea
 * SingleTransport5.mmTransportBySea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport3#mmTransportBySea
 * SingleTransport3.mmTransportBySea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport6#mmTransportBySea
 * SingleTransport6.mmTransportBySea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport7#mmTransportBySea
 * SingleTransport7.mmTransportBySea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport8#mmTransportBySea
 * SingleTransport8.mmTransportBySea}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea1
 * TransportBySea1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea3
 * TransportBySea3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea2
 * TransportBySea2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea4
 * TransportBySea4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea5
 * TransportBySea5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ShipmentDate1Choice
 * ShipmentDate1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea6
 * TransportBySea6}</li>
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
 * "TransportBySea"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related for the transportation of goods by sea."</li>
 * </ul>
 */
public class TransportBySea extends Transport {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text vesselName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea2#mmVesselName
	 * TransportBySea2.mmVesselName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmVesselName
	 * MultimodalTransport2.mmVesselName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea4#mmVesselName
	 * TransportBySea4.mmVesselName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmVesselName
	 * TransportBySea5.mmVesselName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmVesselName
	 * TransportBySea6.mmVesselName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea
	 * TransportBySea}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VesselName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a vessel."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmVesselName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransportBySea2.mmVesselName, MultimodalTransport2.mmVesselName, TransportBySea4.mmVesselName, TransportBySea5.mmVesselName, TransportBySea6.mmVesselName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TransportBySea.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VesselName";
			definition = "Name of a vessel.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransportBySea.class.getMethod("getVesselName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text voyageNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmVoyageNumber
	 * TransportBySea5.mmVoyageNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea
	 * TransportBySea}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoyageNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the voyage."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmVoyageNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransportBySea5.mmVoyageNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TransportBySea.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VoyageNumber";
			definition = "Identifies the voyage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransportBySea.class.getMethod("getVoyageNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max70Text chartererName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmChartererName
	 * TransportBySea5.mmChartererName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea
	 * TransportBySea}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChartererName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the company or individual that acts in the capacity of charterer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmChartererName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransportBySea5.mmChartererName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TransportBySea.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChartererName";
			definition = "Name of the company or individual that acts in the capacity of charterer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransportBySea.class.getMethod("getChartererName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max70Text masterName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmMasterName
	 * TransportBySea5.mmMasterName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea
	 * TransportBySea}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the master or captain of a vessel."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMasterName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransportBySea5.mmMasterName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TransportBySea.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MasterName";
			definition = "Name of the master or captain of a vessel.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransportBySea.class.getMethod("getMasterName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max70Text ownerName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmOwnerName
	 * TransportBySea5.mmOwnerName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea
	 * TransportBySea}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnerName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the company or individual that acts in the capacity of owner."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOwnerName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransportBySea5.mmOwnerName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TransportBySea.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OwnerName";
			definition = "Name of the company or individual that acts in the capacity of owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransportBySea.class.getMethod("getOwnerName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Exact7NumericText iMONumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact7NumericText
	 * Exact7NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmIMONumber
	 * TransportBySea5.mmIMONumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea
	 * TransportBySea}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IMONumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Maritime Organisation identification of a ship. This is a unique seven digit number that is assigned to vessels and aids banks in determining whether a vessel is subject to an order that would not permit a bank to handle a certain transaction under local or international laws."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIMONumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransportBySea5.mmIMONumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TransportBySea.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IMONumber";
			definition = "International Maritime Organisation identification of a ship. This is a unique seven digit number that is assigned to vessels and aids banks in determining whether a vessel is subject to an order that would not permit a bank to handle a certain transaction under local or international laws.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact7NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransportBySea.class.getMethod("getIMONumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransportBySea";
				definition = "Information related for the transportation of goods by sea.";
				derivationElement_lazy = () -> Arrays.asList(SingleTransport1.mmTransportBySea, SingleTransport4.mmTransportBySea, SingleTransport2.mmTransportBySea, SingleTransport5.mmTransportBySea, SingleTransport3.mmTransportBySea,
						SingleTransport6.mmTransportBySea, SingleTransport7.mmTransportBySea, SingleTransport8.mmTransportBySea);
				superType_lazy = () -> Transport.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TransportBySea.mmVesselName, com.tools20022.repository.entity.TransportBySea.mmVoyageNumber,
						com.tools20022.repository.entity.TransportBySea.mmChartererName, com.tools20022.repository.entity.TransportBySea.mmMasterName, com.tools20022.repository.entity.TransportBySea.mmOwnerName,
						com.tools20022.repository.entity.TransportBySea.mmIMONumber);
				derivationComponent_lazy = () -> Arrays.asList(TransportBySea1.mmObject(), TransportBySea3.mmObject(), TransportBySea2.mmObject(), TransportBySea4.mmObject(), TransportBySea5.mmObject(), ShipmentDate1Choice.mmObject(),
						TransportBySea6.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TransportBySea.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getVesselName() {
		return vesselName;
	}

	public TransportBySea setVesselName(Max35Text vesselName) {
		this.vesselName = Objects.requireNonNull(vesselName);
		return this;
	}

	public Max35Text getVoyageNumber() {
		return voyageNumber;
	}

	public TransportBySea setVoyageNumber(Max35Text voyageNumber) {
		this.voyageNumber = Objects.requireNonNull(voyageNumber);
		return this;
	}

	public Max70Text getChartererName() {
		return chartererName;
	}

	public TransportBySea setChartererName(Max70Text chartererName) {
		this.chartererName = Objects.requireNonNull(chartererName);
		return this;
	}

	public Max70Text getMasterName() {
		return masterName;
	}

	public TransportBySea setMasterName(Max70Text masterName) {
		this.masterName = Objects.requireNonNull(masterName);
		return this;
	}

	public Max70Text getOwnerName() {
		return ownerName;
	}

	public TransportBySea setOwnerName(Max70Text ownerName) {
		this.ownerName = Objects.requireNonNull(ownerName);
		return this;
	}

	public Exact7NumericText getIMONumber() {
		return iMONumber;
	}

	public TransportBySea setIMONumber(Exact7NumericText iMONumber) {
		this.iMONumber = Objects.requireNonNull(iMONumber);
		return this;
	}
}