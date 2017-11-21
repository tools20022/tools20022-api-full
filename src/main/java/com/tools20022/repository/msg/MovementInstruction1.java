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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.AgentCAMovementCancellationRequestV01;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the movement instructions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MovementInstruction1#mmMovementGeneralInformation
 * MovementInstruction1.mmMovementGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MovementInstruction1#mmUnderlyingSecuritiesMovementDetails
 * MovementInstruction1.mmUnderlyingSecuritiesMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MovementInstruction1#mmUnderlyingCashMovementDetails
 * MovementInstruction1.mmUnderlyingCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MovementInstruction1#mmProceedsMovementDetails
 * MovementInstruction1.mmProceedsMovementDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementCancellationRequestV01#mmMovementDetails
 * AgentCAMovementCancellationRequestV01.mmMovementDetails}</li>
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
 * "MovementInstruction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the movement instructions."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MovementInstruction1", propOrder = {"movementGeneralInformation", "underlyingSecuritiesMovementDetails", "underlyingCashMovementDetails", "proceedsMovementDetails"})
public class MovementInstruction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionMovement1 movementGeneralInformation;
	/**
	 * Provides general information about the movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1
	 * CorporateActionMovement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MovementInstruction1
	 * MovementInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MvmntGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides general information about the movement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMovementGeneralInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MovementInstruction1.mmObject();
			isDerived = false;
			xmlTag = "MvmntGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementGeneralInformation";
			definition = "Provides general information about the movement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionMovement1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.UnderlyingSecurityMovement1> underlyingSecuritiesMovementDetails;
	/**
	 * Provides information about the underlying securities movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityMovement1
	 * UnderlyingSecurityMovement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MovementInstruction1
	 * MovementInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygSctiesMvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingSecuritiesMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the underlying securities movement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingSecuritiesMovementDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MovementInstruction1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygSctiesMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingSecuritiesMovementDetails";
			definition = "Provides information about the underlying securities movement.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UnderlyingSecurityMovement1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashMovement2> underlyingCashMovementDetails;
	/**
	 * Provides information about the underlying cash movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashMovement2
	 * CashMovement2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MovementInstruction1
	 * MovementInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygCshMvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingCashMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the underlying cash movement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingCashMovementDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MovementInstruction1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygCshMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingCashMovementDetails";
			definition = "Provides information about the underlying cash movement.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashMovement2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ProceedsMovement1> proceedsMovementDetails;
	/**
	 * Provides information about the proceeds, ie, outturned resources.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProceedsMovement1
	 * ProceedsMovement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MovementInstruction1
	 * MovementInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcdsMvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the proceeds, ie, outturned resources."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProceedsMovementDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MovementInstruction1.mmObject();
			isDerived = false;
			xmlTag = "PrcdsMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProceedsMovementDetails";
			definition = "Provides information about the proceeds, ie, outturned resources.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProceedsMovement1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MovementInstruction1.mmMovementGeneralInformation, MovementInstruction1.mmUnderlyingSecuritiesMovementDetails, MovementInstruction1.mmUnderlyingCashMovementDetails,
						MovementInstruction1.mmProceedsMovementDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAMovementCancellationRequestV01.mmMovementDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MovementInstruction1";
				definition = "Details of the movement instructions.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MvmntGnlInf", required = true)
	public CorporateActionMovement1 getMovementGeneralInformation() {
		return movementGeneralInformation;
	}

	public void setMovementGeneralInformation(com.tools20022.repository.msg.CorporateActionMovement1 movementGeneralInformation) {
		this.movementGeneralInformation = movementGeneralInformation;
	}

	@XmlElement(name = "UndrlygSctiesMvmntDtls")
	public List<UnderlyingSecurityMovement1> getUnderlyingSecuritiesMovementDetails() {
		return underlyingSecuritiesMovementDetails;
	}

	public void setUnderlyingSecuritiesMovementDetails(List<com.tools20022.repository.msg.UnderlyingSecurityMovement1> underlyingSecuritiesMovementDetails) {
		this.underlyingSecuritiesMovementDetails = underlyingSecuritiesMovementDetails;
	}

	@XmlElement(name = "UndrlygCshMvmntDtls")
	public List<CashMovement2> getUnderlyingCashMovementDetails() {
		return underlyingCashMovementDetails;
	}

	public void setUnderlyingCashMovementDetails(List<com.tools20022.repository.msg.CashMovement2> underlyingCashMovementDetails) {
		this.underlyingCashMovementDetails = underlyingCashMovementDetails;
	}

	@XmlElement(name = "PrcdsMvmntDtls")
	public List<ProceedsMovement1> getProceedsMovementDetails() {
		return proceedsMovementDetails;
	}

	public void setProceedsMovementDetails(List<com.tools20022.repository.msg.ProceedsMovement1> proceedsMovementDetails) {
		this.proceedsMovementDetails = proceedsMovementDetails;
	}
}