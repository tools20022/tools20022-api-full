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
import com.tools20022.repository.codeset.LocationCategory2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Location category of the place where the transaction is actually performed. <br>
 * It correspond partially to the ISO 8583:1993, field number 22-4.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategory2Code#Aboard
 * LocationCategory2Code.Aboard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategory2Code#Fixed
 * LocationCategory2Code.Fixed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LocationCategory2Code#Home
 * LocationCategory2Code.Home}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LocationCategory2Code#Nomadic
 * LocationCategory2Code.Nomadic}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.LocationCategoryCode
 * LocationCategoryCode}</li>
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
 * "LocationCategory2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Location category of the place where the transaction is actually performed. \r\nIt correspond partially to the ISO 8583:1993, field number 22-4."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LocationCategory2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory2Code
	 * LocationCategory2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aboard"</li>
	 * </ul>
	 */
	public static final LocationCategory2Code Aboard = new LocationCategory2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Aboard";
			owner_lazy = () -> com.tools20022.repository.codeset.LocationCategory2Code.mmObject();
			codeName = LocationCategoryCode.Aboard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory2Code
	 * LocationCategory2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fixed"</li>
	 * </ul>
	 */
	public static final LocationCategory2Code Fixed = new LocationCategory2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fixed";
			owner_lazy = () -> com.tools20022.repository.codeset.LocationCategory2Code.mmObject();
			codeName = LocationCategoryCode.Fixed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory2Code
	 * LocationCategory2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Home"</li>
	 * </ul>
	 */
	public static final LocationCategory2Code Home = new LocationCategory2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Home";
			owner_lazy = () -> com.tools20022.repository.codeset.LocationCategory2Code.mmObject();
			codeName = LocationCategoryCode.Home.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory2Code
	 * LocationCategory2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nomadic"</li>
	 * </ul>
	 */
	public static final LocationCategory2Code Nomadic = new LocationCategory2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nomadic";
			owner_lazy = () -> com.tools20022.repository.codeset.LocationCategory2Code.mmObject();
			codeName = LocationCategoryCode.Nomadic.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, LocationCategory2Code> codesByName = new LinkedHashMap<>();

	protected LocationCategory2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LocationCategory2Code";
				definition = "Location category of the place where the transaction is actually performed. \r\nIt correspond partially to the ISO 8583:1993, field number 22-4.";
				trace_lazy = () -> LocationCategoryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LocationCategory2Code.Aboard, com.tools20022.repository.codeset.LocationCategory2Code.Fixed, com.tools20022.repository.codeset.LocationCategory2Code.Home,
						com.tools20022.repository.codeset.LocationCategory2Code.Nomadic);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Aboard.getCodeName().get(), Aboard);
		codesByName.put(Fixed.getCodeName().get(), Fixed);
		codesByName.put(Home.getCodeName().get(), Home);
		codesByName.put(Nomadic.getCodeName().get(), Nomadic);
	}

	public static LocationCategory2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LocationCategory2Code[] values() {
		LocationCategory2Code[] values = new LocationCategory2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LocationCategory2Code> {
		@Override
		public LocationCategory2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LocationCategory2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}