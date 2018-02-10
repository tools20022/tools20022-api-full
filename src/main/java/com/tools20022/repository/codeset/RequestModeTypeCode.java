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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.RequestModeTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the combination of mode and type of the query information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestModeTypeCode#OnDemandDayInformation
 * RequestModeTypeCode.OnDemandDayInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestModeTypeCode#OnDemandFutureInformation
 * RequestModeTypeCode.OnDemandFutureInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestModeTypeCode#ScheduledDayInformation
 * RequestModeTypeCode.ScheduledDayInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestModeTypeCode#ScheduledFutureInformation
 * RequestModeTypeCode.ScheduledFutureInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestModeTypeCode#Forecast
 * RequestModeTypeCode.Forecast}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RequestModeType1Code
 * RequestModeType1Code}</li>
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
 * "RequestModeTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the combination of mode and type of the query information."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RequestModeTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Day information query type, in on-demand mode.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestModeTypeCode
	 * RequestModeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONDD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnDemandDayInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Day information query type, in on-demand mode."</li>
	 * </ul>
	 */
	public static final RequestModeTypeCode OnDemandDayInformation = new RequestModeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnDemandDayInformation";
			definition = "Day information query type, in on-demand mode.";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestModeTypeCode.mmObject();
			codeName = "ONDD";
		}
	};
	/**
	 * Future information query type, in on-demand mode.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestModeTypeCode
	 * RequestModeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONDF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnDemandFutureInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Future information query type, in on-demand mode."</li>
	 * </ul>
	 */
	public static final RequestModeTypeCode OnDemandFutureInformation = new RequestModeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnDemandFutureInformation";
			definition = "Future information query type, in on-demand mode.";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestModeTypeCode.mmObject();
			codeName = "ONDF";
		}
	};
	/**
	 * Day information query type, in scheduled mode.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestModeTypeCode
	 * RequestModeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCHD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScheduledDayInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Day information query type, in scheduled mode."</li>
	 * </ul>
	 */
	public static final RequestModeTypeCode ScheduledDayInformation = new RequestModeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScheduledDayInformation";
			definition = "Day information query type, in scheduled mode.";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestModeTypeCode.mmObject();
			codeName = "SCHD";
		}
	};
	/**
	 * Future information query type, in scheduled mode.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestModeTypeCode
	 * RequestModeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCHF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScheduledFutureInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Future information query type, in scheduled mode."</li>
	 * </ul>
	 */
	public static final RequestModeTypeCode ScheduledFutureInformation = new RequestModeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScheduledFutureInformation";
			definition = "Future information query type, in scheduled mode.";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestModeTypeCode.mmObject();
			codeName = "SCHF";
		}
	};
	/**
	 * Forecast query type and mode.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestModeTypeCode
	 * RequestModeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Forecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Forecast query type and mode."</li>
	 * </ul>
	 */
	public static final RequestModeTypeCode Forecast = new RequestModeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Forecast";
			definition = "Forecast query type and mode.";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestModeTypeCode.mmObject();
			codeName = "FCST";
		}
	};
	final static private LinkedHashMap<String, RequestModeTypeCode> codesByName = new LinkedHashMap<>();

	protected RequestModeTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestModeTypeCode";
				definition = "Specifies the combination of mode and type of the query information.";
				derivation_lazy = () -> Arrays.asList(RequestModeType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RequestModeTypeCode.OnDemandDayInformation, com.tools20022.repository.codeset.RequestModeTypeCode.OnDemandFutureInformation,
						com.tools20022.repository.codeset.RequestModeTypeCode.ScheduledDayInformation, com.tools20022.repository.codeset.RequestModeTypeCode.ScheduledFutureInformation,
						com.tools20022.repository.codeset.RequestModeTypeCode.Forecast);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OnDemandDayInformation.getCodeName().get(), OnDemandDayInformation);
		codesByName.put(OnDemandFutureInformation.getCodeName().get(), OnDemandFutureInformation);
		codesByName.put(ScheduledDayInformation.getCodeName().get(), ScheduledDayInformation);
		codesByName.put(ScheduledFutureInformation.getCodeName().get(), ScheduledFutureInformation);
		codesByName.put(Forecast.getCodeName().get(), Forecast);
	}

	public static RequestModeTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RequestModeTypeCode[] values() {
		RequestModeTypeCode[] values = new RequestModeTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RequestModeTypeCode> {
		@Override
		public RequestModeTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RequestModeTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}