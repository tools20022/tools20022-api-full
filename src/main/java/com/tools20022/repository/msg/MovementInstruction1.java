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
import com.tools20022.repository.msg.CashMovement2;
import com.tools20022.repository.msg.CorporateActionMovement1;
import com.tools20022.repository.msg.ProceedsMovement1;
import com.tools20022.repository.msg.UnderlyingSecurityMovement1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MovementInstruction1", propOrder = {"movementGeneralInformation", "underlyingSecuritiesMovementDetails", "underlyingCashMovementDetails", "proceedsMovementDetails"})
public class MovementInstruction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MvmntGnlInf", required = true)
	protected CorporateActionMovement1 movementGeneralInformation;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<MovementInstruction1, CorporateActionMovement1> mmMovementGeneralInformation = new MMMessageAssociationEnd<MovementInstruction1, CorporateActionMovement1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MovementInstruction1.mmObject();
			isDerived = false;
			xmlTag = "MvmntGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementGeneralInformation";
			definition = "Provides general information about the movement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionMovement1.mmObject();
		}

		@Override
		public CorporateActionMovement1 getValue(MovementInstruction1 obj) {
			return obj.getMovementGeneralInformation();
		}

		@Override
		public void setValue(MovementInstruction1 obj, CorporateActionMovement1 value) {
			obj.setMovementGeneralInformation(value);
		}
	};
	@XmlElement(name = "UndrlygSctiesMvmntDtls")
	protected List<UnderlyingSecurityMovement1> underlyingSecuritiesMovementDetails;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<MovementInstruction1, List<UnderlyingSecurityMovement1>> mmUnderlyingSecuritiesMovementDetails = new MMMessageAssociationEnd<MovementInstruction1, List<UnderlyingSecurityMovement1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MovementInstruction1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygSctiesMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingSecuritiesMovementDetails";
			definition = "Provides information about the underlying securities movement.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnderlyingSecurityMovement1.mmObject();
		}

		@Override
		public List<UnderlyingSecurityMovement1> getValue(MovementInstruction1 obj) {
			return obj.getUnderlyingSecuritiesMovementDetails();
		}

		@Override
		public void setValue(MovementInstruction1 obj, List<UnderlyingSecurityMovement1> value) {
			obj.setUnderlyingSecuritiesMovementDetails(value);
		}
	};
	@XmlElement(name = "UndrlygCshMvmntDtls")
	protected List<CashMovement2> underlyingCashMovementDetails;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<MovementInstruction1, List<CashMovement2>> mmUnderlyingCashMovementDetails = new MMMessageAssociationEnd<MovementInstruction1, List<CashMovement2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MovementInstruction1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygCshMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingCashMovementDetails";
			definition = "Provides information about the underlying cash movement.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashMovement2.mmObject();
		}

		@Override
		public List<CashMovement2> getValue(MovementInstruction1 obj) {
			return obj.getUnderlyingCashMovementDetails();
		}

		@Override
		public void setValue(MovementInstruction1 obj, List<CashMovement2> value) {
			obj.setUnderlyingCashMovementDetails(value);
		}
	};
	@XmlElement(name = "PrcdsMvmntDtls")
	protected List<ProceedsMovement1> proceedsMovementDetails;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<MovementInstruction1, List<ProceedsMovement1>> mmProceedsMovementDetails = new MMMessageAssociationEnd<MovementInstruction1, List<ProceedsMovement1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MovementInstruction1.mmObject();
			isDerived = false;
			xmlTag = "PrcdsMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProceedsMovementDetails";
			definition = "Provides information about the proceeds, ie, outturned resources.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProceedsMovement1.mmObject();
		}

		@Override
		public List<ProceedsMovement1> getValue(MovementInstruction1 obj) {
			return obj.getProceedsMovementDetails();
		}

		@Override
		public void setValue(MovementInstruction1 obj, List<ProceedsMovement1> value) {
			obj.setProceedsMovementDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MovementInstruction1.mmMovementGeneralInformation, com.tools20022.repository.msg.MovementInstruction1.mmUnderlyingSecuritiesMovementDetails,
						com.tools20022.repository.msg.MovementInstruction1.mmUnderlyingCashMovementDetails, com.tools20022.repository.msg.MovementInstruction1.mmProceedsMovementDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAMovementCancellationRequestV01.mmMovementDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MovementInstruction1";
				definition = "Details of the movement instructions.";
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionMovement1 getMovementGeneralInformation() {
		return movementGeneralInformation;
	}

	public MovementInstruction1 setMovementGeneralInformation(CorporateActionMovement1 movementGeneralInformation) {
		this.movementGeneralInformation = Objects.requireNonNull(movementGeneralInformation);
		return this;
	}

	public List<UnderlyingSecurityMovement1> getUnderlyingSecuritiesMovementDetails() {
		return underlyingSecuritiesMovementDetails == null ? underlyingSecuritiesMovementDetails = new ArrayList<>() : underlyingSecuritiesMovementDetails;
	}

	public MovementInstruction1 setUnderlyingSecuritiesMovementDetails(List<UnderlyingSecurityMovement1> underlyingSecuritiesMovementDetails) {
		this.underlyingSecuritiesMovementDetails = Objects.requireNonNull(underlyingSecuritiesMovementDetails);
		return this;
	}

	public List<CashMovement2> getUnderlyingCashMovementDetails() {
		return underlyingCashMovementDetails == null ? underlyingCashMovementDetails = new ArrayList<>() : underlyingCashMovementDetails;
	}

	public MovementInstruction1 setUnderlyingCashMovementDetails(List<CashMovement2> underlyingCashMovementDetails) {
		this.underlyingCashMovementDetails = Objects.requireNonNull(underlyingCashMovementDetails);
		return this;
	}

	public List<ProceedsMovement1> getProceedsMovementDetails() {
		return proceedsMovementDetails == null ? proceedsMovementDetails = new ArrayList<>() : proceedsMovementDetails;
	}

	public MovementInstruction1 setProceedsMovementDetails(List<ProceedsMovement1> proceedsMovementDetails) {
		this.proceedsMovementDetails = Objects.requireNonNull(proceedsMovementDetails);
		return this;
	}
}