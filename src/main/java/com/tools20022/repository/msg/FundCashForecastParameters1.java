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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.CashForecastMessage1Code;
import com.tools20022.repository.codeset.NoCriteria1Code;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Parameters for which a fund cash forecast report is requested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1#mmParametersOrNoCriteria
 * FundCashForecastParameters1.mmParametersOrNoCriteria}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1#mmCashForecastType
 * FundCashForecastParameters1.mmCashForecastType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1#mmParameters
 * FundCashForecastParameters1.mmParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1#mmNoCriteria
 * FundCashForecastParameters1.mmNoCriteria}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundCashForecastParameters1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters for which a fund cash forecast report is requested."</li>
 * </ul>
 */
public class FundCashForecastParameters1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CashForecastMessage1Code cashForecastType;
	/**
	 * Specifes the fund cash forecast message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashForecastMessage1Code
	 * CashForecastMessage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1
	 * FundCashForecastParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshFcstTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashForecastType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifes the fund cash forecast message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashForecastType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FundCashForecastParameters1.mmObject();
			isDerived = false;
			xmlTag = "CshFcstTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashForecastType";
			definition = "Specifes the fund cash forecast message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashForecastMessage1Code.mmObject();
		}
	};
	protected FundCashForecastParameters2 parameters;
	/**
	 * Report parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters2
	 * FundCashForecastParameters2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1
	 * FundCashForecastParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Params"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report parameters."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParameters = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FundCashForecastParameters1.mmObject();
			isDerived = false;
			xmlTag = "Params";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parameters";
			definition = "Report parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FundCashForecastParameters2.mmObject();
		}
	};
	protected NoCriteria1Code noCriteria;
	/**
	 * Specifies that there is no criteria for the report. The request is a
	 * request for all reports, rather than reports attributed to a specific
	 * financial instrument or date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NoCriteria1Code
	 * NoCriteria1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1
	 * FundCashForecastParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NoCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that there is no criteria for the report. The request is a request for all reports, rather than reports attributed to a specific financial instrument or date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNoCriteria = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FundCashForecastParameters1.mmObject();
			isDerived = false;
			xmlTag = "NoCrit";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCriteria";
			definition = "Specifies that there is no criteria for the report. The request is a request for all reports, rather than reports attributed to a specific financial instrument or date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoCriteria1Code.mmObject();
		}
	};
	/**
	 * Either Parameters or NoCriteria must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1#mmParameters
	 * FundCashForecastParameters1.mmParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1#mmNoCriteria
	 * FundCashForecastParameters1.mmNoCriteria}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1
	 * FundCashForecastParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParametersOrNoCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Either Parameters or NoCriteria must be present."</li>
	 * </ul>
	 */
	public static final MMXor mmParametersOrNoCriteria = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParametersOrNoCriteria";
			definition = "Either Parameters or NoCriteria must be present.";
			messageComponent_lazy = () -> FundCashForecastParameters1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashForecastParameters1.mmParameters, com.tools20022.repository.msg.FundCashForecastParameters1.mmNoCriteria);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashForecastParameters1.mmCashForecastType, com.tools20022.repository.msg.FundCashForecastParameters1.mmParameters,
						com.tools20022.repository.msg.FundCashForecastParameters1.mmNoCriteria);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "FundCashForecastParameters1";
				definition = "Parameters for which a fund cash forecast report is requested.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashForecastParameters1.mmParametersOrNoCriteria);
			}
		});
		return mmObject_lazy.get();
	}

	public CashForecastMessage1Code getCashForecastType() {
		return cashForecastType;
	}

	public void setCashForecastType(CashForecastMessage1Code cashForecastType) {
		this.cashForecastType = cashForecastType;
	}

	public FundCashForecastParameters2 getParameters() {
		return parameters;
	}

	public void setParameters(com.tools20022.repository.msg.FundCashForecastParameters2 parameters) {
		this.parameters = parameters;
	}

	public NoCriteria1Code getNoCriteria() {
		return noCriteria;
	}

	public void setNoCriteria(NoCriteria1Code noCriteria) {
		this.noCriteria = noCriteria;
	}
}