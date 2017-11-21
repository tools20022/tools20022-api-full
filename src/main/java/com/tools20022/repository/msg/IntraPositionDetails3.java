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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice;
import com.tools20022.repository.choice.SecuritiesBalanceType3Choice;
import com.tools20022.repository.entity.IntraPositionTransfer;
import com.tools20022.repository.entity.SafekeepingPlace;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the intra-position movement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails3#mmSafekeepingPlace
 * IntraPositionDetails3.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails3#mmBalanceFrom
 * IntraPositionDetails3.mmBalanceFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails3#mmIntraPositionMovement
 * IntraPositionDetails3.mmIntraPositionMovement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
 * IntraPositionTransfer}</li>
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
 * "IntraPositionDetails3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the intra-position movement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "IntraPositionDetails3", propOrder = {"safekeepingPlace", "balanceFrom", "intraPositionMovement"})
public class IntraPositionDetails3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SafekeepingPlaceFormat3Choice safekeepingPlace;
	/**
	 * Place where the securities are safe-kept, physically or notionally. This
	 * place can be, for example, a local custodian, a Central Securities
	 * Depository (CSD) or an International Central Securities Depository
	 * (ICSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice
	 * SafekeepingPlaceFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails3
	 * IntraPositionDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSafekeepingPlace = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> IntraPositionDetails3.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SafekeepingPlaceFormat3Choice.mmObject();
		}
	};
	protected SecuritiesBalanceType3Choice balanceFrom;
	/**
	 * Balance from which the securities were moved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType3Choice
	 * SecuritiesBalanceType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesBalanceType
	 * SecuritiesBalance.mmSecuritiesBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails3
	 * IntraPositionDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance from which the securities were moved."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBalanceFrom = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesBalanceType;
			componentContext_lazy = () -> IntraPositionDetails3.mmObject();
			isDerived = false;
			xmlTag = "BalFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFrom";
			definition = "Balance from which the securities were moved.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesBalanceType3Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.IntraPositionMovementDetails1> intraPositionMovement;
	/**
	 * Intra-position movement(s) having been performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1
	 * IntraPositionMovementDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
	 * IntraPositionTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails3
	 * IntraPositionDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntraPosMvmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraPositionMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Intra-position movement(s) having been performed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntraPositionMovement = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> IntraPositionTransfer.mmObject();
			componentContext_lazy = () -> IntraPositionDetails3.mmObject();
			isDerived = false;
			xmlTag = "IntraPosMvmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraPositionMovement";
			definition = "Intra-position movement(s) having been performed.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IntraPositionMovementDetails1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IntraPositionDetails3.mmSafekeepingPlace, IntraPositionDetails3.mmBalanceFrom, IntraPositionDetails3.mmIntraPositionMovement);
				trace_lazy = () -> IntraPositionTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IntraPositionDetails3";
				definition = "Details of the intra-position movement.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SfkpgPlc")
	public SafekeepingPlaceFormat3Choice getSafekeepingPlace() {
		return safekeepingPlace;
	}

	public void setSafekeepingPlace(SafekeepingPlaceFormat3Choice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
	}

	@XmlElement(name = "BalFr", required = true)
	public SecuritiesBalanceType3Choice getBalanceFrom() {
		return balanceFrom;
	}

	public void setBalanceFrom(SecuritiesBalanceType3Choice balanceFrom) {
		this.balanceFrom = balanceFrom;
	}

	@XmlElement(name = "IntraPosMvmnt", required = true)
	public List<IntraPositionMovementDetails1> getIntraPositionMovement() {
		return intraPositionMovement;
	}

	public void setIntraPositionMovement(List<com.tools20022.repository.msg.IntraPositionMovementDetails1> intraPositionMovement) {
		this.intraPositionMovement = intraPositionMovement;
	}
}