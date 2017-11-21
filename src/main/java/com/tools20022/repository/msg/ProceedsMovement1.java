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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ProceedsMovement1", propOrder = {"cashProceedsMovementDetails", "securitiesProceedsMovementDetails", "taxDetails"})
public class ProceedsMovement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.CashProceeds1> cashProceedsMovementDetails;
	/**
	 * Provides information about the movement of the cash proceeds.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCashProceedsMovementDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ProceedsMovement1.mmObject();
			isDerived = false;
			xmlTag = "CshPrcdsMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashProceedsMovementDetails";
			definition = "Provides information about the movement of the cash proceeds.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashProceeds1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecuritiesProceeds1> securitiesProceedsMovementDetails;
	/**
	 * Provides information about the movement of the securities proceeds.
	 * <p>
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
	public static final MMMessageAssociationEnd mmSecuritiesProceedsMovementDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ProceedsMovement1.mmObject();
			isDerived = false;
			xmlTag = "SctiesPrcdsMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesProceedsMovementDetails";
			definition = "Provides information about the movement of the securities proceeds.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesProceeds1.mmObject();
		}
	};
	protected TaxVoucher1 taxDetails;
	/**
	 * Provides information about the tax voucher.
	 * <p>
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
	public static final MMMessageAssociationEnd mmTaxDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferTax;
			componentContext_lazy = () -> ProceedsMovement1.mmObject();
			isDerived = false;
			xmlTag = "TaxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDetails";
			definition = "Provides information about the tax voucher.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ProceedsMovement1.mmCashProceedsMovementDetails, ProceedsMovement1.mmSecuritiesProceedsMovementDetails, ProceedsMovement1.mmTaxDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAMovementInstructionV01.mmProceedsMovementDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProceedsMovement1";
				definition = "Details of the proceeds movements.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CshPrcdsMvmntDtls")
	public List<CashProceeds1> getCashProceedsMovementDetails() {
		return cashProceedsMovementDetails;
	}

	public void setCashProceedsMovementDetails(List<com.tools20022.repository.msg.CashProceeds1> cashProceedsMovementDetails) {
		this.cashProceedsMovementDetails = cashProceedsMovementDetails;
	}

	@XmlElement(name = "SctiesPrcdsMvmntDtls")
	public List<SecuritiesProceeds1> getSecuritiesProceedsMovementDetails() {
		return securitiesProceedsMovementDetails;
	}

	public void setSecuritiesProceedsMovementDetails(List<com.tools20022.repository.msg.SecuritiesProceeds1> securitiesProceedsMovementDetails) {
		this.securitiesProceedsMovementDetails = securitiesProceedsMovementDetails;
	}

	@XmlElement(name = "TaxDtls")
	public TaxVoucher1 getTaxDetails() {
		return taxDetails;
	}

	public void setTaxDetails(com.tools20022.repository.msg.TaxVoucher1 taxDetails) {
		this.taxDetails = taxDetails;
	}
}