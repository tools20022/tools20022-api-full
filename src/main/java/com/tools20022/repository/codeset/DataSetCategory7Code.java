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
import com.tools20022.repository.codeset.DataSetCategory7Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of an ATM configuration.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory7Code#ATMConfiguration
 * DataSetCategory7Code.ATMConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory7Code#ATMProtocol
 * DataSetCategory7Code.ATMProtocol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory7Code#ApplicationParameters
 * DataSetCategory7Code.ApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory7Code#CardApplication
 * DataSetCategory7Code.CardApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory7Code#CardConfiguration
 * DataSetCategory7Code.CardConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory7Code#OfflineExchangeRate
 * DataSetCategory7Code.OfflineExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory7Code#PreDefinedAmount
 * DataSetCategory7Code.PreDefinedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory7Code#LocationConfiguration
 * DataSetCategory7Code.LocationConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory7Code#MobileOperator
 * DataSetCategory7Code.MobileOperator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
 * DataSetCategoryCode}</li>
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
 * "DataSetCategory7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of an ATM configuration."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DataSetCategory7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory7Code
	 * DataSetCategory7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMConfiguration"</li>
	 * </ul>
	 */
	public static final DataSetCategory7Code ATMConfiguration = new DataSetCategory7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMConfiguration";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory7Code.mmObject();
			codeName = DataSetCategoryCode.ATMConfiguration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory7Code
	 * DataSetCategory7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMProtocol"</li>
	 * </ul>
	 */
	public static final DataSetCategory7Code ATMProtocol = new DataSetCategory7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMProtocol";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory7Code.mmObject();
			codeName = DataSetCategoryCode.ATMProtocol.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory7Code
	 * DataSetCategory7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * </ul>
	 */
	public static final DataSetCategory7Code ApplicationParameters = new DataSetCategory7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParameters";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory7Code.mmObject();
			codeName = DataSetCategoryCode.ApplicationParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory7Code
	 * DataSetCategory7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardApplication"</li>
	 * </ul>
	 */
	public static final DataSetCategory7Code CardApplication = new DataSetCategory7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardApplication";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory7Code.mmObject();
			codeName = DataSetCategoryCode.CardApplication.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory7Code
	 * DataSetCategory7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardConfiguration"</li>
	 * </ul>
	 */
	public static final DataSetCategory7Code CardConfiguration = new DataSetCategory7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardConfiguration";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory7Code.mmObject();
			codeName = DataSetCategoryCode.CardConfiguration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory7Code
	 * DataSetCategory7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineExchangeRate"</li>
	 * </ul>
	 */
	public static final DataSetCategory7Code OfflineExchangeRate = new DataSetCategory7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineExchangeRate";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory7Code.mmObject();
			codeName = DataSetCategoryCode.OfflineExchangeRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory7Code
	 * DataSetCategory7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreDefinedAmount"</li>
	 * </ul>
	 */
	public static final DataSetCategory7Code PreDefinedAmount = new DataSetCategory7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreDefinedAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory7Code.mmObject();
			codeName = DataSetCategoryCode.PreDefinedAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory7Code
	 * DataSetCategory7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocationConfiguration"</li>
	 * </ul>
	 */
	public static final DataSetCategory7Code LocationConfiguration = new DataSetCategory7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocationConfiguration";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory7Code.mmObject();
			codeName = DataSetCategoryCode.LocationConfiguration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory7Code
	 * DataSetCategory7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobileOperator"</li>
	 * </ul>
	 */
	public static final DataSetCategory7Code MobileOperator = new DataSetCategory7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobileOperator";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory7Code.mmObject();
			codeName = DataSetCategoryCode.MobileOperator.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DataSetCategory7Code> codesByName = new LinkedHashMap<>();

	protected DataSetCategory7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataSetCategory7Code";
				definition = "Type of an ATM configuration.";
				trace_lazy = () -> DataSetCategoryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory7Code.ATMConfiguration, com.tools20022.repository.codeset.DataSetCategory7Code.ATMProtocol,
						com.tools20022.repository.codeset.DataSetCategory7Code.ApplicationParameters, com.tools20022.repository.codeset.DataSetCategory7Code.CardApplication,
						com.tools20022.repository.codeset.DataSetCategory7Code.CardConfiguration, com.tools20022.repository.codeset.DataSetCategory7Code.OfflineExchangeRate,
						com.tools20022.repository.codeset.DataSetCategory7Code.PreDefinedAmount, com.tools20022.repository.codeset.DataSetCategory7Code.LocationConfiguration,
						com.tools20022.repository.codeset.DataSetCategory7Code.MobileOperator);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ATMConfiguration.getCodeName().get(), ATMConfiguration);
		codesByName.put(ATMProtocol.getCodeName().get(), ATMProtocol);
		codesByName.put(ApplicationParameters.getCodeName().get(), ApplicationParameters);
		codesByName.put(CardApplication.getCodeName().get(), CardApplication);
		codesByName.put(CardConfiguration.getCodeName().get(), CardConfiguration);
		codesByName.put(OfflineExchangeRate.getCodeName().get(), OfflineExchangeRate);
		codesByName.put(PreDefinedAmount.getCodeName().get(), PreDefinedAmount);
		codesByName.put(LocationConfiguration.getCodeName().get(), LocationConfiguration);
		codesByName.put(MobileOperator.getCodeName().get(), MobileOperator);
	}

	public static DataSetCategory7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DataSetCategory7Code[] values() {
		DataSetCategory7Code[] values = new DataSetCategory7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DataSetCategory7Code> {
		@Override
		public DataSetCategory7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DataSetCategory7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}