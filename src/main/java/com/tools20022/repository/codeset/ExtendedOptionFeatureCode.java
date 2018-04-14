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
import com.tools20022.repository.codeset.ExtendedOptionFeatureCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies DTCC (The Depository Trust and Clearing Corporation) specific
 * options.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#ForeignTaxUnfavorable
 * ExtendedOptionFeatureCode.ForeignTaxUnfavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#ForeignTaxFavorable
 * ExtendedOptionFeatureCode.ForeignTaxFavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#ForeignTaxExempt
 * ExtendedOptionFeatureCode.ForeignTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#DRIPUnfavorable
 * ExtendedOptionFeatureCode.DRIPUnfavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#DRIPFavorable
 * ExtendedOptionFeatureCode.DRIPFavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#DRIPExempt
 * ExtendedOptionFeatureCode.DRIPExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#ForeignCurrencyPayment
 * ExtendedOptionFeatureCode.ForeignCurrencyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#ForeignCurrencyPaymentUnfavorable
 * ExtendedOptionFeatureCode.ForeignCurrencyPaymentUnfavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#ForeignCurrencyPaymentFavorable
 * ExtendedOptionFeatureCode.ForeignCurrencyPaymentFavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#ForeignCurrencyPaymentExempt
 * ExtendedOptionFeatureCode.ForeignCurrencyPaymentExempt}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code
 * ExtendedOptionFeature1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExtendedOptionFeatureCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) specific options."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FORU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExtendedOptionFeatureCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for the Foreign Tax Relief service at DTC. Option to select
	 * unfavourable tax rate. The Foreign Tax Unfavourable option is the default
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxUnfavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for the Foreign Tax Relief service at DTC. Option to select unfavourable tax rate. The Foreign Tax Unfavourable option is the default option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeatureCode ForeignTaxUnfavorable = new ExtendedOptionFeatureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxUnfavorable";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for the Foreign Tax Relief service at DTC. Option to select unfavourable tax rate. The Foreign Tax Unfavourable option is the default option.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmObject();
			codeName = "FORU";
		}
	};
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for the Foreign Tax Relief service at DTC. An election into
	 * this option ensures the participant receives their payment at a
	 * favourable tax withholding rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxFavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for the Foreign Tax Relief service at DTC. An election into this option ensures the participant receives their payment at a favourable tax withholding rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeatureCode ForeignTaxFavorable = new ExtendedOptionFeatureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxFavorable";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for the Foreign Tax Relief service at DTC. An election into this option ensures the participant receives their payment at a favourable tax withholding rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmObject();
			codeName = "FORF";
		}
	};
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for the Foreign Tax Relief service at DTC. An election into
	 * this option ensures the participant is exempt from any tax withholding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORX"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for the Foreign Tax Relief service at DTC. An election into this option ensures the participant is exempt from any tax withholding."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeatureCode ForeignTaxExempt = new ExtendedOptionFeatureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxExempt";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for the Foreign Tax Relief service at DTC. An election into this option ensures the participant is exempt from any tax withholding.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmObject();
			codeName = "FORX";
		}
	};
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for both the Dividend Reinvestment and Foreign Tax services
	 * at DTC. Participants electing this option will receive additional shares
	 * and the tax withholding on those shares will be at the unfavourable tax
	 * rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRPU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DRIPUnfavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Dividend Reinvestment and Foreign Tax services at DTC. Participants electing this option will receive additional shares and the tax withholding on those shares will be at the unfavourable tax rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeatureCode DRIPUnfavorable = new ExtendedOptionFeatureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DRIPUnfavorable";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Dividend Reinvestment and Foreign Tax services at DTC. Participants electing this option will receive additional shares and the tax withholding on those shares will be at the unfavourable tax rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmObject();
			codeName = "DRPU";
		}
	};
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for both the Dividend Reinvestment and Foreign Tax Relief
	 * services at DTC. Participants electing this option will receive
	 * additional shares and the tax withholding on those shares will be at the
	 * favourable tax rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRPF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DRIPFavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Dividend Reinvestment and Foreign Tax Relief services at DTC. Participants electing this option will receive additional shares and the tax withholding on those shares will be at the favourable tax rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeatureCode DRIPFavorable = new ExtendedOptionFeatureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DRIPFavorable";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Dividend Reinvestment and Foreign Tax Relief services at DTC. Participants electing this option will receive additional shares and the tax withholding on those shares will be at the favourable tax rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmObject();
			codeName = "DRPF";
		}
	};
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for both the Dividend Reinvestment and the Foreign Tax
	 * Relief services at DTC. Participants electing this option will receive
	 * additional shares and will be exempt from any tax withholding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRPX"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DRIPExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Dividend Reinvestment and the Foreign Tax Relief services at DTC. Participants electing this option will receive additional shares and will be exempt from any tax withholding."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeatureCode DRIPExempt = new ExtendedOptionFeatureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DRIPExempt";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Dividend Reinvestment and the Foreign Tax Relief services at DTC. Participants electing this option will receive additional shares and will be exempt from any tax withholding.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmObject();
			codeName = "DRPX";
		}
	};
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for Foreign Currency Payment service at DTC. Participants
	 * electing this option will receive their distribution in the foreign
	 * currency instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCPP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCurrencyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for Foreign Currency Payment service at DTC. Participants electing this option will receive their distribution in the foreign currency instructed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeatureCode ForeignCurrencyPayment = new ExtendedOptionFeatureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrencyPayment";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for Foreign Currency Payment service at DTC. Participants electing this option will receive their distribution in the foreign currency instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmObject();
			codeName = "FCPP";
		}
	};
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for both the Foreign Currency and Foreign Tax services at
	 * DTC. Participants electing this option will receive their distribution in
	 * a foreign currency and the tax withholding on that distribution will be
	 * subject to unfavourable tax withholding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCPU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCurrencyPaymentUnfavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Foreign Currency and Foreign Tax services at DTC. Participants electing this option will receive their distribution in a foreign currency and the tax withholding on that distribution will be subject to unfavourable tax withholding."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeatureCode ForeignCurrencyPaymentUnfavorable = new ExtendedOptionFeatureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrencyPaymentUnfavorable";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Foreign Currency and Foreign Tax services at DTC. Participants electing this option will receive their distribution in a foreign currency and the tax withholding on that distribution will be subject to unfavourable tax withholding.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmObject();
			codeName = "FCPU";
		}
	};
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for both the Foreign Currency and Foreign Tax services at
	 * DTC. Participants electing the option will receive their distribution in
	 * foreign currency and the tax withholding on that distribution will be
	 * subject to favourable tax withholding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCPF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCurrencyPaymentFavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Foreign Currency and Foreign Tax services at DTC. Participants electing the option will receive their distribution in foreign currency and the tax withholding on that distribution will be subject to favourable tax withholding."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeatureCode ForeignCurrencyPaymentFavorable = new ExtendedOptionFeatureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrencyPaymentFavorable";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Foreign Currency and Foreign Tax services at DTC. Participants electing the option will receive their distribution in foreign currency and the tax withholding on that distribution will be subject to favourable tax withholding.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmObject();
			codeName = "FCPF";
		}
	};
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for both the Foreign Currency and Foreign Tax services at
	 * DTC. Participants electing this option will receive their distribution in
	 * a foreign currency and will be exempt from any tax withholding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCPX"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCurrencyPaymentExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Foreign Currency and Foreign Tax services at DTC. Participants electing this option will receive their distribution in a foreign currency and will be exempt from any tax withholding."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ExtendedOptionFeatureCode ForeignCurrencyPaymentExempt = new ExtendedOptionFeatureCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrencyPaymentExempt";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Foreign Currency and Foreign Tax services at DTC. Participants electing this option will receive their distribution in a foreign currency and will be exempt from any tax withholding.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmObject();
			codeName = "FCPX";
		}
	};
	final static private LinkedHashMap<String, ExtendedOptionFeatureCode> codesByName = new LinkedHashMap<>();

	protected ExtendedOptionFeatureCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FORU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExtendedOptionFeatureCode";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) specific options.";
				derivation_lazy = () -> Arrays.asList(ExtendedOptionFeature1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExtendedOptionFeatureCode.ForeignTaxUnfavorable, com.tools20022.repository.codeset.ExtendedOptionFeatureCode.ForeignTaxFavorable,
						com.tools20022.repository.codeset.ExtendedOptionFeatureCode.ForeignTaxExempt, com.tools20022.repository.codeset.ExtendedOptionFeatureCode.DRIPUnfavorable,
						com.tools20022.repository.codeset.ExtendedOptionFeatureCode.DRIPFavorable, com.tools20022.repository.codeset.ExtendedOptionFeatureCode.DRIPExempt,
						com.tools20022.repository.codeset.ExtendedOptionFeatureCode.ForeignCurrencyPayment, com.tools20022.repository.codeset.ExtendedOptionFeatureCode.ForeignCurrencyPaymentUnfavorable,
						com.tools20022.repository.codeset.ExtendedOptionFeatureCode.ForeignCurrencyPaymentFavorable, com.tools20022.repository.codeset.ExtendedOptionFeatureCode.ForeignCurrencyPaymentExempt);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ForeignTaxUnfavorable.getCodeName().get(), ForeignTaxUnfavorable);
		codesByName.put(ForeignTaxFavorable.getCodeName().get(), ForeignTaxFavorable);
		codesByName.put(ForeignTaxExempt.getCodeName().get(), ForeignTaxExempt);
		codesByName.put(DRIPUnfavorable.getCodeName().get(), DRIPUnfavorable);
		codesByName.put(DRIPFavorable.getCodeName().get(), DRIPFavorable);
		codesByName.put(DRIPExempt.getCodeName().get(), DRIPExempt);
		codesByName.put(ForeignCurrencyPayment.getCodeName().get(), ForeignCurrencyPayment);
		codesByName.put(ForeignCurrencyPaymentUnfavorable.getCodeName().get(), ForeignCurrencyPaymentUnfavorable);
		codesByName.put(ForeignCurrencyPaymentFavorable.getCodeName().get(), ForeignCurrencyPaymentFavorable);
		codesByName.put(ForeignCurrencyPaymentExempt.getCodeName().get(), ForeignCurrencyPaymentExempt);
	}

	public static ExtendedOptionFeatureCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExtendedOptionFeatureCode[] values() {
		ExtendedOptionFeatureCode[] values = new ExtendedOptionFeatureCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExtendedOptionFeatureCode> {
		@Override
		public ExtendedOptionFeatureCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExtendedOptionFeatureCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}