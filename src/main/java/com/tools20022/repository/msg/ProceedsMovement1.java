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
import com.tools20022.repository.area.seev.AgentCAMovementInstructionV01;
import com.tools20022.repository.entity.SecuritiesTransfer;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashProceeds1;
import com.tools20022.repository.msg.SecuritiesProceeds1;
import com.tools20022.repository.msg.TaxVoucher1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the proceeds movements.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProceedsMovement1#mmCashProceedsMovementDetails
 * ProceedsMovement1.mmCashProceedsMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProceedsMovement1#mmSecuritiesProceedsMovementDetails
 * ProceedsMovement1.mmSecuritiesProceedsMovementDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProceedsMovement1#mmTaxDetails
 * ProceedsMovement1.mmTaxDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementInstructionV01#mmProceedsMovementDetails
 * AgentCAMovementInstructionV01.mmProceedsMovementDetails}</li>
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
 * "ProceedsMovement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the proceeds movements."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ProceedsMovement1", propOrder = {"cashProceedsMovementDetails", "securitiesProceedsMovementDetails", "taxDetails"})
public class ProceedsMovement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CshPrcdsMvmntDtls")
	protected List<CashProceeds1> cashProceedsMovementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashProceeds1
	 * CashProceeds1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProceedsMovement1
	 * ProceedsMovement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPrcdsMvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashProceedsMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the movement of the cash proceeds."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProceedsMovement1, List<CashProceeds1>> mmCashProceedsMovementDetails = new MMMessageAssociationEnd<ProceedsMovement1, List<CashProceeds1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProceedsMovement1.mmObject();
			isDerived = false;
			xmlTag = "CshPrcdsMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashProceedsMovementDetails";
			definition = "Provides information about the movement of the cash proceeds.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashProceeds1.mmObject();
		}

		@Override
		public List<CashProceeds1> getValue(ProceedsMovement1 obj) {
			return obj.getCashProceedsMovementDetails();
		}

		@Override
		public void setValue(ProceedsMovement1 obj, List<CashProceeds1> value) {
			obj.setCashProceedsMovementDetails(value);
		}
	};
	@XmlElement(name = "SctiesPrcdsMvmntDtls")
	protected List<SecuritiesProceeds1> securitiesProceedsMovementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesProceeds1
	 * SecuritiesProceeds1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProceedsMovement1
	 * ProceedsMovement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesPrcdsMvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesProceedsMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the movement of the securities proceeds."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProceedsMovement1, List<SecuritiesProceeds1>> mmSecuritiesProceedsMovementDetails = new MMMessageAssociationEnd<ProceedsMovement1, List<SecuritiesProceeds1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProceedsMovement1.mmObject();
			isDerived = false;
			xmlTag = "SctiesPrcdsMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesProceedsMovementDetails";
			definition = "Provides information about the movement of the securities proceeds.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesProceeds1.mmObject();
		}

		@Override
		public List<SecuritiesProceeds1> getValue(ProceedsMovement1 obj) {
			return obj.getSecuritiesProceedsMovementDetails();
		}

		@Override
		public void setValue(ProceedsMovement1 obj, List<SecuritiesProceeds1> value) {
			obj.setSecuritiesProceedsMovementDetails(value);
		}
	};
	@XmlElement(name = "TaxDtls")
	protected TaxVoucher1 taxDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxVoucher1
	 * TaxVoucher1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferTax
	 * SecuritiesTransfer.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProceedsMovement1
	 * ProceedsMovement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the tax voucher."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProceedsMovement1, Optional<TaxVoucher1>> mmTaxDetails = new MMMessageAssociationEnd<ProceedsMovement1, Optional<TaxVoucher1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProceedsMovement1.mmObject();
			isDerived = false;
			xmlTag = "TaxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDetails";
			definition = "Provides information about the tax voucher.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxVoucher1.mmObject();
		}

		@Override
		public Optional<TaxVoucher1> getValue(ProceedsMovement1 obj) {
			return obj.getTaxDetails();
		}

		@Override
		public void setValue(ProceedsMovement1 obj, Optional<TaxVoucher1> value) {
			obj.setTaxDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProceedsMovement1.mmCashProceedsMovementDetails, com.tools20022.repository.msg.ProceedsMovement1.mmSecuritiesProceedsMovementDetails,
						com.tools20022.repository.msg.ProceedsMovement1.mmTaxDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAMovementInstructionV01.mmProceedsMovementDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProceedsMovement1";
				definition = "Details of the proceeds movements.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashProceeds1> getCashProceedsMovementDetails() {
		return cashProceedsMovementDetails == null ? cashProceedsMovementDetails = new ArrayList<>() : cashProceedsMovementDetails;
	}

	public ProceedsMovement1 setCashProceedsMovementDetails(List<CashProceeds1> cashProceedsMovementDetails) {
		this.cashProceedsMovementDetails = Objects.requireNonNull(cashProceedsMovementDetails);
		return this;
	}

	public List<SecuritiesProceeds1> getSecuritiesProceedsMovementDetails() {
		return securitiesProceedsMovementDetails == null ? securitiesProceedsMovementDetails = new ArrayList<>() : securitiesProceedsMovementDetails;
	}

	public ProceedsMovement1 setSecuritiesProceedsMovementDetails(List<SecuritiesProceeds1> securitiesProceedsMovementDetails) {
		this.securitiesProceedsMovementDetails = Objects.requireNonNull(securitiesProceedsMovementDetails);
		return this;
	}

	public Optional<TaxVoucher1> getTaxDetails() {
		return taxDetails == null ? Optional.empty() : Optional.of(taxDetails);
	}

	public ProceedsMovement1 setTaxDetails(TaxVoucher1 taxDetails) {
		this.taxDetails = taxDetails;
		return this;
	}
}