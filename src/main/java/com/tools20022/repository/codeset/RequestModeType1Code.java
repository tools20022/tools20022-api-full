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
import com.tools20022.repository.codeset.RequestModeType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.RequestModeType1Code#Forecast
 * RequestModeType1Code.Forecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestModeType1Code#OnDemandDayInformation
 * RequestModeType1Code.OnDemandDayInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestModeType1Code#OnDemandFutureInformation
 * RequestModeType1Code.OnDemandFutureInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestModeType1Code#ScheduledDayInformation
 * RequestModeType1Code.ScheduledDayInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestModeType1Code#ScheduledFutureInformation
 * RequestModeType1Code.ScheduledFutureInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RequestModeTypeCode
 * RequestModeTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestModeType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the combination of mode and type of the query information."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RequestModeType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestModeType1Code
	 * RequestModeType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Forecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RequestModeType1Code Forecast = new RequestModeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Forecast";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestModeType1Code.mmObject();
			codeName = RequestModeTypeCode.Forecast.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestModeType1Code
	 * RequestModeType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnDemandDayInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RequestModeType1Code OnDemandDayInformation = new RequestModeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnDemandDayInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestModeType1Code.mmObject();
			codeName = RequestModeTypeCode.OnDemandDayInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestModeType1Code
	 * RequestModeType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnDemandFutureInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RequestModeType1Code OnDemandFutureInformation = new RequestModeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnDemandFutureInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestModeType1Code.mmObject();
			codeName = RequestModeTypeCode.OnDemandFutureInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestModeType1Code
	 * RequestModeType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScheduledDayInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RequestModeType1Code ScheduledDayInformation = new RequestModeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScheduledDayInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestModeType1Code.mmObject();
			codeName = RequestModeTypeCode.ScheduledDayInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestModeType1Code
	 * RequestModeType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScheduledFutureInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RequestModeType1Code ScheduledFutureInformation = new RequestModeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScheduledFutureInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestModeType1Code.mmObject();
			codeName = RequestModeTypeCode.ScheduledFutureInformation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RequestModeType1Code> codesByName = new LinkedHashMap<>();

	protected RequestModeType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestModeType1Code";
				definition = "Specifies the combination of mode and type of the query information.";
				trace_lazy = () -> RequestModeTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RequestModeType1Code.Forecast, com.tools20022.repository.codeset.RequestModeType1Code.OnDemandDayInformation,
						com.tools20022.repository.codeset.RequestModeType1Code.OnDemandFutureInformation, com.tools20022.repository.codeset.RequestModeType1Code.ScheduledDayInformation,
						com.tools20022.repository.codeset.RequestModeType1Code.ScheduledFutureInformation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Forecast.getCodeName().get(), Forecast);
		codesByName.put(OnDemandDayInformation.getCodeName().get(), OnDemandDayInformation);
		codesByName.put(OnDemandFutureInformation.getCodeName().get(), OnDemandFutureInformation);
		codesByName.put(ScheduledDayInformation.getCodeName().get(), ScheduledDayInformation);
		codesByName.put(ScheduledFutureInformation.getCodeName().get(), ScheduledFutureInformation);
	}

	public static RequestModeType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RequestModeType1Code[] values() {
		RequestModeType1Code[] values = new RequestModeType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RequestModeType1Code> {
		@Override
		public RequestModeType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RequestModeType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}