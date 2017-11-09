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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CollateralPool1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.CFIIdentifier;
import com.tools20022.repository.datatype.SNA2008SectorIdentifier;
import com.tools20022.repository.entity.AssetClassification;
import com.tools20022.repository.entity.Collateral;
import com.tools20022.repository.entity.CollateralValuation;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the specification of the valuation of a collateral, based on the
 * sector and the asset classification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation4#mmPoolStatus
 * CollateralValuation4.mmPoolStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralValuation4#mmType
 * CollateralValuation4.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralValuation4#mmSector
 * CollateralValuation4.mmSector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation4#mmNominalAmount
 * CollateralValuation4.mmNominalAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralValuation
 * CollateralValuation}</li>
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
 * "CollateralValuation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the specification of the valuation of a collateral, based on the sector and the asset classification."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralValuation7
 * CollateralValuation7}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class CollateralValuation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CollateralPool1Code poolStatus;
	/**
	 * Specifies whether the collateral is a pool collateral or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralPool1Code
	 * CollateralPool1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation4
	 * CollateralValuation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the collateral is a pool collateral or not."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation7#mmPoolStatus
	 * CollateralValuation7.mmPoolStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPoolStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CollateralValuation4.mmObject();
			isDerived = false;
			xmlTag = "PoolSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolStatus";
			definition = "Specifies whether the collateral is a pool collateral or not.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation7.mmPoolStatus);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralPool1Code.mmObject();
		}
	};
	protected CFIIdentifier type;
	/**
	 * Identifies the asset class pledged as collateral, expressed as an ISO
	 * 10962 Classification of Financial Instrument (CFI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CFIIdentifier
	 * CFIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmClassificationType
	 * AssetClassification.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation4
	 * CollateralValuation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the asset class pledged as collateral, expressed as an ISO 10962 Classification of Financial Instrument (CFI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation7#mmType
	 * CollateralValuation7.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmClassificationType;
			componentContext_lazy = () -> CollateralValuation4.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Identifies the asset class pledged as collateral, expressed as an ISO 10962 Classification of Financial Instrument (CFI).";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation7.mmType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CFIIdentifier.mmObject();
		}
	};
	protected SNA2008SectorIdentifier sector;
	/**
	 * Provides the institutional sector, such as central government, central
	 * bank, etc. of the issuer of collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SNA2008SectorIdentifier
	 * SNA2008SectorIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmSector
	 * Organisation.mmSector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation4
	 * CollateralValuation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the institutional sector, such as central government, central bank, etc. of the issuer of collateral."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation7#mmSector
	 * CollateralValuation7.mmSector}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSector = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmSector;
			componentContext_lazy = () -> CollateralValuation4.mmObject();
			isDerived = false;
			xmlTag = "Sctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sector";
			definition = "Provides the institutional sector, such as central government, central bank, etc. of the issuer of collateral.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation7.mmSector);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SNA2008SectorIdentifier.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount nominalAmount;
	/**
	 * Nominal amount of money of the security pledged as collateral, when the
	 * collateral cannot be identified through an individual or basket ISIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAmount
	 * Collateral.mmCollateralAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation4
	 * CollateralValuation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmnlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NominalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Nominal amount of money of the security pledged as collateral, when the collateral cannot be identified through an individual or basket ISIN."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation7#mmNominalAmount
	 * CollateralValuation7.mmNominalAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNominalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralAmount;
			componentContext_lazy = () -> CollateralValuation4.mmObject();
			isDerived = false;
			xmlTag = "NmnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NominalAmount";
			definition = "Nominal amount of money of the security pledged as collateral, when the collateral cannot be identified through an individual or basket ISIN.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation7.mmNominalAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CollateralValuation4.mmPoolStatus, CollateralValuation4.mmType, CollateralValuation4.mmSector, CollateralValuation4.mmNominalAmount);
				trace_lazy = () -> CollateralValuation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralValuation4";
				definition = "Provides the specification of the valuation of a collateral, based on the sector and the asset classification.";
				nextVersions_lazy = () -> Arrays.asList(CollateralValuation7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CollateralPool1Code getPoolStatus() {
		return poolStatus;
	}

	public void setPoolStatus(CollateralPool1Code poolStatus) {
		this.poolStatus = poolStatus;
	}

	public CFIIdentifier getType() {
		return type;
	}

	public void setType(CFIIdentifier type) {
		this.type = type;
	}

	public SNA2008SectorIdentifier getSector() {
		return sector;
	}

	public void setSector(SNA2008SectorIdentifier sector) {
		this.sector = sector;
	}

	public ActiveCurrencyAndAmount getNominalAmount() {
		return nominalAmount;
	}

	public void setNominalAmount(ActiveCurrencyAndAmount nominalAmount) {
		this.nominalAmount = nominalAmount;
	}
}