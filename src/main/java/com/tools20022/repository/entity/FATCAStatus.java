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
import com.tools20022.repository.choice.CRSSource1Choice;
import com.tools20022.repository.choice.FATCASource1Choice;
import com.tools20022.repository.choice.FATCAStatus1Choice;
import com.tools20022.repository.choice.FATCAStatus2Choice;
import com.tools20022.repository.codeset.FATCASourceStatusCode;
import com.tools20022.repository.codeset.FATCAStatusCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.msg.FATCAStatus1;
import com.tools20022.repository.msg.FATCAStatus2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Foreign Account Tax Compliance Act (FATCA) status and the status source of
 * the investor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="FATCAStatus" src="doc-files/FATCAStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.FATCAStatus#mmFATCAStatus
 * FATCAStatus.mmFATCAStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FATCAStatus#mmFATCASourceStatus
 * FATCAStatus.mmFATCASourceStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FATCAStatus#mmInvestmentAccountParty
 * FATCAStatus.mmInvestmentAccountParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FATCAStatus#mmFATCAReportingDate
 * FATCAStatus.mmFATCAReportingDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmFATCAStatus
 * InvestmentAccountPartyRole.mmFATCAStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FATCAStatus1 FATCAStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FATCASource1Choice
 * FATCASource1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FATCAStatus1Choice
 * FATCAStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FATCAStatus2 FATCAStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FATCAStatus2Choice
 * FATCAStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CRSSource1Choice
 * CRSSource1Choice}</li>
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
 * "FATCAStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Foreign Account Tax Compliance Act (FATCA) status and the status source of the investor."
 * </li>
 * </ul>
 */
public class FATCAStatus {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected FATCAStatusCode fATCAStatus;
	/**
	 * Foreign Account Tax Compliance Act (FATCA) status of the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatusCode
	 * FATCAStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FATCAStatus FATCAStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.FATCAStatus1#mmType
	 * FATCAStatus1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FATCAStatus1Choice#mmCode
	 * FATCAStatus1Choice.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FATCAStatus2#mmType
	 * FATCAStatus2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FATCAStatus2Choice#mmCode
	 * FATCAStatus2Choice.mmCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign Account Tax Compliance Act (FATCA) status of the investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFATCAStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FATCAStatus1.mmType, com.tools20022.repository.choice.FATCAStatus1Choice.mmCode, com.tools20022.repository.msg.FATCAStatus2.mmType,
					com.tools20022.repository.choice.FATCAStatus2Choice.mmCode);
			elementContext_lazy = () -> FATCAStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FATCAStatus";
			definition = "Foreign Account Tax Compliance Act (FATCA) status of the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FATCAStatusCode.mmObject();
		}
	};
	protected FATCASourceStatusCode fATCASourceStatus;
	/**
	 * Source of the Foreign Account Tax Compliance Act (FATCA) status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FATCASourceStatusCode
	 * FATCASourceStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FATCAStatus FATCAStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.FATCAStatus1#mmSource
	 * FATCAStatus1.mmSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FATCASource1Choice#mmCode
	 * FATCASource1Choice.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FATCAStatus2#mmSource
	 * FATCAStatus2.mmSource}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.CRSSource1Choice#mmCode
	 * CRSSource1Choice.mmCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCASourceStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Source of the Foreign Account Tax Compliance Act (FATCA) status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFATCASourceStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FATCAStatus1.mmSource, com.tools20022.repository.choice.FATCASource1Choice.mmCode, com.tools20022.repository.msg.FATCAStatus2.mmSource,
					com.tools20022.repository.choice.CRSSource1Choice.mmCode);
			elementContext_lazy = () -> FATCAStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FATCASourceStatus";
			definition = "Source of the Foreign Account Tax Compliance Act (FATCA) status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FATCASourceStatusCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccountPartyRole> investmentAccountParty;
	/**
	 * Foreign Account Tax Compliance Act (FATCA) status linked to an investment
	 * account and played by a party in that context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmFATCAStatus
	 * InvestmentAccountPartyRole.mmFATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FATCAStatus FATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign Account Tax Compliance Act (FATCA) status linked to an investment account and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentAccountParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FATCAStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountParty";
			definition = "Foreign Account Tax Compliance Act (FATCA) status linked to an investment account and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmFATCAStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmObject();
		}
	};
	protected ISODate fATCAReportingDate;
	/**
	 * Date provided by the account owner to inform the account servicer of the
	 * date on which the holdings must be reported before the account is
	 * subsequently closed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FATCAStatus FATCAStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmFATCAReportingDate
	 * AccountManagementStatusAndReason5.mmFATCAReportingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmFATCAReportingDate
	 * InvestmentAccountOwnershipInformation15.mmFATCAReportingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmFATCAReportingDate
	 * InvestmentAccountOwnershipInformation14.mmFATCAReportingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAReportingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFATCAReportingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmFATCAReportingDate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmFATCAReportingDate,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmFATCAReportingDate);
			elementContext_lazy = () -> FATCAStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FATCAReportingDate";
			definition = "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FATCAStatus";
				definition = "Foreign Account Tax Compliance Act (FATCA) status and the status source of the investor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountPartyRole.mmFATCAStatus);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FATCAStatus.mmFATCAStatus, com.tools20022.repository.entity.FATCAStatus.mmFATCASourceStatus,
						com.tools20022.repository.entity.FATCAStatus.mmInvestmentAccountParty, com.tools20022.repository.entity.FATCAStatus.mmFATCAReportingDate);
				derivationComponent_lazy = () -> Arrays.asList(FATCAStatus1.mmObject(), FATCASource1Choice.mmObject(), FATCAStatus1Choice.mmObject(), FATCAStatus2.mmObject(), FATCAStatus2Choice.mmObject(), CRSSource1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public FATCAStatusCode getFATCAStatus() {
		return fATCAStatus;
	}

	public void setFATCAStatus(FATCAStatusCode fATCAStatus) {
		this.fATCAStatus = fATCAStatus;
	}

	public FATCASourceStatusCode getFATCASourceStatus() {
		return fATCASourceStatus;
	}

	public void setFATCASourceStatus(FATCASourceStatusCode fATCASourceStatus) {
		this.fATCASourceStatus = fATCASourceStatus;
	}

	public List<InvestmentAccountPartyRole> getInvestmentAccountParty() {
		return investmentAccountParty;
	}

	public void setInvestmentAccountParty(List<com.tools20022.repository.entity.InvestmentAccountPartyRole> investmentAccountParty) {
		this.investmentAccountParty = investmentAccountParty;
	}

	public ISODate getFATCAReportingDate() {
		return fATCAReportingDate;
	}

	public void setFATCAReportingDate(ISODate fATCAReportingDate) {
		this.fATCAReportingDate = fATCAReportingDate;
	}
}